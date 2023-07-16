package X;

import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2Hb  reason: invalid class name and case insensitive filesystem */
public final class C33792Hb {
    public static final Object A00(AnonymousClass601 r18, C63893iY r19) {
        AnonymousClass601 r4 = r18;
        C63893iY r0 = r19;
        boolean A1Z = AnonymousClass0wJ.A1Z(r0, r4);
        String A0D = C63893iY.A0D(r0, 0);
        C11630kW A0A = C63913ic.A0A(r4);
        if (C63913ic.A0F(r4) instanceof UserSession) {
            C37350Jpy A0Y = C18230wP.A0Y(C63913ic.A05(r4), C05030Qo.A02(C63913ic.A0F(r4)), C171209wF.A0H, A0D);
            A0Y.A07(A0A.getModuleName());
            A0Y.A04();
            return null;
        }
        SimpleWebViewActivity.A01.A02(C63913ic.A05(r4), C63913ic.A0F(r4), new SimpleWebViewConfig(A0D, (String) null, (String) null, (String) null, false, false, false, false, false, A1Z, false, A1Z, A1Z, false, false));
        return null;
    }
}
