from django.http import HttpResponse
from django.views.decorators.csrf import csrf_exempt
from rest_framework.renderers import JSONRenderer
from rest_framework.parsers import JSONParser
from carismaapp.apps.api.models import test_api
from carismaapp.apps.api.serializers import TestApiSerializer


def hola():
    return ''



class JSONResponse(HttpResponse):
    """
    """

    def __init__(self, data, **kwargs):
        content = JSONRenderer().render(data)
        kwargs['content_type'] = 'application/json'
        super(JSONResponse, self).__init__(content, **kwargs)


@csrf_exempt
def test_api_list(request):
    """
    """
    if request.method == 'GET':
        snippets = test_api.objects.all()
        serializer = TestApiSerializer(snippets, many=True)
        return JSONResponse(serializer.data)

    elif request.method == 'POST':
        data = JSONParser().parse(request)
        serializer = TestApiSerializer(data=data)
        if serializer.is_valid():
            serializer.save()
            return JSONResponse(serializer.data, status=201)
        else:
            return JSONResponse(serializer.errors, status=400)


@csrf_exempt
def test_api_detail(request, pk):
    """
    """
    try:
        snippet = test_api.objects.get(pk=pk)
    except test_api.DoesNotExist:
        return HttpResponse(status=404)

    if request.method == 'GET':
        serializer = TestApiSerializer(snippet)
        return JSONResponse(serializer.data)

    elif request.method == 'PUT':
        data = JSONParser().parse(request)
        serializer = TestApiSerializer(snippet, data=data)
        if serializer.is_valid():
            serializer.save()
            return JSONResponse(serializer.data)
        else:
            return JSONResponse(serializer.errors, status=400)

    elif request.method == 'DELETE':
        snippet.delete()
        return HttpResponse(status=204)
