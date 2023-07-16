package X;

import android.net.Uri;
import android.webkit.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2qc  reason: invalid class name and case insensitive filesystem */
public final class C48962qc {
    public static final synchronized void A00(C10300i6 r6, List list) {
        String domain;
        synchronized (C48962qc.class) {
            C04220Ms.A0B(r6, 1);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.addAll(new C73944Ve(r6, C61793Vp.A00(r6)));
            A0v.addAll(AnonymousClass3OW.A01(r6));
            if (list != null) {
                A0v.addAll(list);
            }
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) it.next();
                C04220Ms.A04(httpCookie);
                String A00 = AnonymousClass2LC.A00(httpCookie);
                if (httpCookie.getSecure()) {
                    domain = new Uri.Builder().authority(httpCookie.getDomain()).scheme("https").build().toString();
                } else {
                    domain = httpCookie.getDomain();
                }
                C04220Ms.A06(domain);
                CookieManager.getInstance().setCookie(domain, A00);
            }
        }
    }
}
