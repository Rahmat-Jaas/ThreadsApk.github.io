package X;

import java.net.HttpCookie;
import java.util.List;

/* renamed from: X.3OW  reason: invalid class name */
public final class AnonymousClass3OW {
    public static final HttpCookie A00(String str, String str2) {
        if (str.length() <= 0) {
            return null;
        }
        HttpCookie httpCookie = new HttpCookie(str2, str);
        httpCookie.setPath("/");
        httpCookie.setDomain(".instagram.com");
        httpCookie.setSecure(true);
        httpCookie.setHttpOnly(true);
        return httpCookie;
    }

    public static final List A01(C10300i6 r6) {
        AnonymousClass3G1 A00 = C48992qf.A00(r6);
        return AnonymousClass8AP.A0A(new HttpCookie[]{A00(A00.A00, "ig-u-ig-direct-region-hint"), A00(A00.A03, "ig-u-shbid"), A00(A00.A04, "ig-u-shbts"), A00(A00.A01, "ig-u-ds-user-id"), A00(A00.A02, "ig-u-rur")});
    }
}
