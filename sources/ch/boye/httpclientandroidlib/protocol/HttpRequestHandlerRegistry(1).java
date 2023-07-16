package ch.boye.httpclientandroidlib.protocol;

import X.C18190wL;
import java.util.Map;

public class HttpRequestHandlerRegistry implements HttpRequestHandlerResolver {
    public final UriPatternMatcher matcher = new UriPatternMatcher();

    public HttpRequestHandler lookup(String str) {
        return (HttpRequestHandler) this.matcher.lookup(str);
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        return this.matcher.matchUriRequestPattern(str, str2);
    }

    public void register(String str, HttpRequestHandler httpRequestHandler) {
        if (str == null) {
            throw C18190wL.A0a("URI request pattern may not be null");
        } else if (httpRequestHandler != null) {
            this.matcher.register(str, httpRequestHandler);
        } else {
            throw C18190wL.A0a("Request handler may not be null");
        }
    }

    public void setHandlers(Map map) {
        this.matcher.setObjects(map);
    }

    public void unregister(String str) {
        this.matcher.unregister(str);
    }
}
