package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.redex.IDxICallbackShape141S0300000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2J3  reason: invalid class name */
public final class AnonymousClass2J3 {
    public static final Object A00(AnonymousClass601 r29, C63893iY r30) {
        IDxICallbackShape141S0300000_1_I2 iDxICallbackShape141S0300000_1_I2;
        AnonymousClass099 A00;
        C109326jp A0L;
        AnonymousClass601 r6 = r29;
        C63893iY r2 = r30;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r6);
        Object A0B = C63893iY.A0B(r2, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C127397h3 r4 = (C127397h3) A0B;
        String A0E = C63893iY.A0E(r2, A1Z ? 1 : 0);
        Object A0B2 = C63893iY.A0B(r2, 3);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HashMap hashMap = (HashMap) A0B2;
        AnonymousClass3HX A01 = C131677sb.A01(r6, r2, 4);
        Map A0B3 = C63763iI.A0B(r6, (C127397h3) C63893iY.A0C(r2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", 2), 36);
        C127397h3 A04 = C63763iI.A04(r4, 15932);
        if (A04 == null || (A0L = A04.A0L(40)) == null) {
            iDxICallbackShape141S0300000_1_I2 = null;
        } else {
            iDxICallbackShape141S0300000_1_I2 = new IDxICallbackShape141S0300000_1_I2(A01, r6, A0L, 0);
        }
        String A07 = C63763iI.A07(r4);
        String A06 = C63763iI.A06(r4);
        Object A002 = AnonymousClass2C4.A00(hashMap);
        if (A002 == null) {
            A002 = AnonymousClass4To.A00();
        }
        C04220Ms.A0C(A002, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        C66843yQ r11 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, A07, (String) null, (HashMap) A002, AnonymousClass0wJ.A0v(), (Map) null, A0B3, A0B3, -1, C63763iI.A00(r4), -1, -1, false, false);
        C130667qT A08 = C63913ic.A08(r6);
        int A003 = AnonymousClass2BZ.A00(A04);
        C04220Ms.A06(A01);
        C62343Yl r10 = new C62343Yl(C63913ic.A0E(A01));
        IgBloksScreenConfig A004 = C62343Yl.A00(A08, r10, A01, r4);
        C127397h3 A02 = C63763iI.A02(r4);
        C121997Jj r0 = null;
        if (A02 != null) {
            r0 = C121997Jj.A00(r6, A02);
        }
        r10.A02(r0);
        r10.A03(A06);
        C63763iI.A0C(A004, r4);
        String A09 = C63763iI.A09(r4);
        Context context = A01.A00;
        C210718u A042 = A004.A04();
        C121997Jj r15 = A004.A08;
        List A03 = AnonymousClass3ZR.A03(AnonymousClass3ZR.A00(context));
        if (A03 == null || A03.isEmpty() || (A00 = C63123bZ.A00(A0E, A03)) == null) {
            C30967GcS.A02("CDSBloksBottomSheetController", "Cannot insert a new Screen without a valid bottom sheet - no bottom sheet contains the screen ID");
            return A09;
        }
        AnonymousClass1Xb.A00((AnonymousClass1Xb) A00).A07(C63123bZ.A01(context, A00, r11, r15, A042, A09), iDxICallbackShape141S0300000_1_I2, A0E, A003);
        return A09;
    }
}
