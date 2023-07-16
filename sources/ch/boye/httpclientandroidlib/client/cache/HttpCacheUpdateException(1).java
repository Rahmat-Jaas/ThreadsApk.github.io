package ch.boye.httpclientandroidlib.client.cache;

public class HttpCacheUpdateException extends Exception {
    public static final long serialVersionUID = 823573584868632876L;

    public HttpCacheUpdateException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public HttpCacheUpdateException(String str) {
        super(str);
    }
}
