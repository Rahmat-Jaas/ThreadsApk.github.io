package X;

import com.facebook.redex.IDxICallbackShape141S0300000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2J6  reason: invalid class name */
public final class AnonymousClass2J6 {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        IDxICallbackShape141S0300000_1_I2 iDxICallbackShape141S0300000_1_I2;
        C109326jp A0L;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        Object A0B = C63893iY.A0B(r13, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C127397h3 r6 = (C127397h3) A0B;
        C127397h3 r4 = (C127397h3) C63893iY.A0C(r13, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", A1Z ? 1 : 0);
        Object A09 = C63893iY.A09(r13);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        HashMap hashMap = (HashMap) A09;
        AnonymousClass3HX A01 = C131677sb.A01(r12, r13, 3);
        C04220Ms.A06(A01);
        C130667qT A08 = C63913ic.A08(r12);
        Map A0B2 = C63763iI.A0B(r12, r4, 44);
        C127397h3 A04 = C63763iI.A04(r6, 15932);
        if (A04 == null || (A0L = A04.A0L(40)) == null) {
            iDxICallbackShape141S0300000_1_I2 = null;
        } else {
            iDxICallbackShape141S0300000_1_I2 = new IDxICallbackShape141S0300000_1_I2(A01, r12, A0L, 1);
        }
        C66883yU A02 = C66883yU.A02(A01, r4);
        int A00 = AnonymousClass2BZ.A00(A04);
        C62343Yl r2 = new C62343Yl(C63913ic.A0F(r12));
        IgBloksScreenConfig A002 = C62343Yl.A00(A08, r2, A01, r6);
        C127397h3 A022 = C63763iI.A02(r6);
        C121997Jj r0 = null;
        if (A022 != null) {
            r0 = C121997Jj.A00(r12, A022);
        }
        r2.A02(r0);
        r2.A03(C63763iI.A06(r6));
        A002.A01 = A02;
        if (r6 != null) {
            C63763iI.A0C(A002, r6);
        }
        String A07 = C63763iI.A07(r6);
        Map A003 = AnonymousClass2C4.A00(hashMap);
        if (A003 == null) {
            A003 = AnonymousClass4To.A00();
        }
        C63743iE r1 = new C63743iE(A003, A0B2, A07);
        r1.A00 = C63763iI.A00(r6);
        r1.A03 = r6;
        r1.A0G(C63763iI.A0A(r12, r6));
        r1.A05 = C63763iI.A08(r6);
        r1.A0F(C63913ic.A05(r12), A002, iDxICallbackShape141S0300000_1_I2, A00);
        return null;
    }
}
