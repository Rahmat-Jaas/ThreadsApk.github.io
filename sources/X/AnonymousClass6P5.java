package X;

import com.instagram.common.api.base.IDxACallbackShape36S0200000_2_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.6P5  reason: invalid class name */
public final class AnonymousClass6P5 {
    public static final Object A00(AnonymousClass601 r3, String str, AnonymousClass0ZU r5, AnonymousClass0YY r6) {
        C04220Ms.A0B(str, 1);
        UserSession A0Y = C86104wH.A0Y(r3);
        if (!C04220Ms.A0I(A0Y.getUserId(), str)) {
            r5.invoke();
            return null;
        }
        C145538kf A0H = C63913ic.A0H(r3);
        H1T A0O = AnonymousClass0wJ.A0O(A0Y);
        A0O.A0J("fxcal/get_native_linking_auth_blob/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C94005tb.class, C1183970t.class);
        A0T.A00 = new IDxACallbackShape36S0200000_2_I2(3, r5, r6);
        A0H.schedule(A0T);
        return null;
    }
}
