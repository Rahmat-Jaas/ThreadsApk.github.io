package X;

import java.util.HashMap;

/* renamed from: X.3IQ  reason: invalid class name */
public abstract class AnonymousClass3IQ {
    public final String A00() {
        if (((C81174nH) this).A02 != null) {
            return "com.bloks.www.fxcal.link.async";
        }
        C04220Ms.A0E("unifiedLauncherFlowConfig");
        throw null;
    }

    public final String A01() {
        AnonymousClass3BR r0 = ((C81174nH) this).A02;
        if (r0 != null) {
            return r0.A02;
        }
        C04220Ms.A0E("unifiedLauncherFlowConfig");
        throw null;
    }

    public void A02() {
        C697149s r4 = ((C81154nF) this).A01;
        String A01 = A01();
        A00();
        HashMap A0y = AnonymousClass0wJ.A0y();
        C04220Ms.A0B(A01, 0);
        C697149s.A00(AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_SUCCESS, r4, "", A01, A0y);
    }

    public void A03(String str) {
        C04220Ms.A0B(str, 0);
        C697149s r3 = ((C81154nF) this).A01;
        String A01 = A01();
        String A00 = A00();
        HashMap A0y = AnonymousClass0wJ.A0y();
        AnonymousClass0wJ.A1O(A01, A00);
        C697149s.A00(AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_ERROR, r3, str, A01, A0y);
    }
}
