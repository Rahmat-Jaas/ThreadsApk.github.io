package X;

import com.instagram.service.session.UserSession;
import java.net.HttpCookie;
import java.util.ArrayList;

/* renamed from: X.4Ve  reason: invalid class name and case insensitive filesystem */
public final class C73944Ve extends ArrayList<HttpCookie> {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ C61793Vp A01;

    public C73944Ve(C10300i6 r7, C61793Vp r8) {
        this.A01 = r8;
        this.A00 = r7;
        HttpCookie httpCookie = new HttpCookie("x-mid", r8.A01.A00);
        httpCookie.setPath("/");
        httpCookie.setDomain(".instagram.com");
        httpCookie.setSecure(true);
        httpCookie.setHttpOnly(true);
        add(httpCookie);
        if (r7 instanceof UserSession) {
            HttpCookie httpCookie2 = new HttpCookie(C28174Ezk.A00(165), r8.A04);
            httpCookie2.setPath("/");
            httpCookie2.setDomain(".instagram.com");
            httpCookie2.setSecure(true);
            httpCookie2.setHttpOnly(true);
            add(httpCookie2);
        }
    }
}
