package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;

/* renamed from: X.2HP  reason: invalid class name */
public final class AnonymousClass2HP {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        boolean A0E;
        AnonymousClass601 r8 = r9;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonymousClass3HX r1 = r9.A00;
        C109326jp A06 = C63893iY.A06(r10, A1Z ? 1 : 0);
        C109326jp A062 = C63893iY.A06(r10, 2);
        C10300i6 A0F = C63913ic.A0F(r8);
        C18200wM.A1R(A0F);
        C63893iY A05 = C63893iY.A05(AnonymousClass3VO.A00(), r1, 0);
        if (A0F == null) {
            A0E = false;
        } else {
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, A0F, 36316121741134808L);
        }
        if (!A0E) {
            C61043Rr.A00(r8, A05, A062);
            return null;
        }
        FragmentActivity A052 = C63913ic.A05(r8);
        AnonymousClass06E A00 = AnonymousClass06E.A00(A052);
        C04220Ms.A0B(A0F, 0);
        H1T A0O = AnonymousClass0wJ.A0O(A0F);
        A0O.A0J("age_platform/age_verification/resume/");
        C32165H8c A0S = AnonymousClass0wJ.A0S(A0O);
        A0S.A00 = new IDxACallbackShape5S0400000_1_I2(0, A05, r8, A06, A062);
        C31155GhB.A01(A052, A00, A0S);
        return null;
    }
}
