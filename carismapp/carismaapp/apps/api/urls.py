from django.conf.urls import patterns, url

urlpatterns = patterns('carismaapp.apps.api.views',
    url(r'^api/$', 'test_api_list'),
    url(r'^api/(?P<pk>[0-9]+)/$', 'test_api_detail'),
)
