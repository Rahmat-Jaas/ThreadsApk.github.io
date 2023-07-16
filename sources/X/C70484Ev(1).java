package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Ev  reason: invalid class name and case insensitive filesystem */
public final class C70484Ev implements C82794qH {
    public final /* synthetic */ AnonymousClass1cR A00;

    public C70484Ev(AnonymousClass1cR r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A8p(Object obj) {
        Boolean bool;
        ImageUrl imageUrl;
        Boolean bool2 = (Boolean) obj;
        AnonymousClass1cR r4 = this.A00;
        r4.A08 = bool2;
        C62313Yf A002 = C62313Yf.A00();
        synchronized (A002) {
            bool = A002.A05;
        }
        synchronized (A002) {
            imageUrl = A002.A02;
        }
        if (!Boolean.FALSE.equals(bool) || AnonymousClass3WG.A02(imageUrl)) {
            C59333Kk.A01(r4.getContext(), r4.A00, r4.A06, bool2.booleanValue());
            return;
        }
        Context context = r4.getContext();
        UserSession userSession = r4.A06;
        synchronized (A002) {
            if (A002.A07) {
                A002.A00 = context.getApplicationContext();
                A002.A04 = userSession;
                A002.A06 = bool2;
                A002.A08 = true;
                C62313Yf.A01(A002);
            }
        }
    }
}
