package ch.boye.httpclientandroidlib.protocol;

public interface HttpRequestHandlerResolver {
    HttpRequestHandler lookup(String str);
}
