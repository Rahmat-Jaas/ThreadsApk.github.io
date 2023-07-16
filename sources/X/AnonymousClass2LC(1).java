package X;

import java.net.HttpCookie;

/* renamed from: X.2LC  reason: invalid class name */
public final class AnonymousClass2LC {
    public static final String A00(HttpCookie httpCookie) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(AnonymousClass00U.A0N(httpCookie.getName(), httpCookie.getValue(), '='));
        if (httpCookie.getMaxAge() >= 0) {
            A0r.append(AnonymousClass00U.A08(httpCookie.getMaxAge(), "; Max-Age="));
        }
        String domain = httpCookie.getDomain();
        if (domain != null) {
            C18240wQ.A1P("; Domain=", domain, A0r);
        }
        String path = httpCookie.getPath();
        if (path != null) {
            C18240wQ.A1P("; Path=", path, A0r);
        }
        if (httpCookie.getSecure()) {
            A0r.append("; Secure");
        }
        if (httpCookie.isHttpOnly()) {
            A0r.append("; HttpOnly");
        }
        return C18190wL.A0n(A0r);
    }
}
