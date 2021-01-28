# quarkus-resteasy-reactive-jsonobject-issue project

This is simple reproducer for the issue [#14668](https://github.com/quarkusio/quarkus/issues/14668):


Quarkus RESTEasy Reactive resource, returning JsonObject produces response {"map":{"key":"value"},"empty":false} instead of just {"key":"value"}.

