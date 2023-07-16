package X;

import android.util.SparseArray;
import com.facebook.redex.IDxICallbackShape297S0200000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2J8  reason: invalid class name */
public final class AnonymousClass2J8 {
    public static final Object A00(AnonymousClass601 r29, C63893iY r30) {
        IDxICallbackShape297S0200000_1_I2 iDxICallbackShape297S0200000_1_I2;
        C109326jp A0L;
        AnonymousClass601 r4 = r29;
        C63893iY r2 = r30;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r4);
        Object A0B = C63893iY.A0B(r2, 0);
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C127397h3 r3 = (C127397h3) A0B;
        C127397h3 r5 = (C127397h3) C63893iY.A0C(r2, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel", A1Z ? 1 : 0);
        Object A09 = C63893iY.A09(r2);
        C04220Ms.A0C(A09, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        HashMap hashMap = (HashMap) A09;
        AnonymousClass3HX A01 = C131677sb.A01(r4, r2, 3);
        Map A0B2 = C63763iI.A0B(r4, r5, 38);
        C127397h3 A04 = C63763iI.A04(r3, 15932);
        if (A04 == null || (A0L = A04.A0L(40)) == null) {
            iDxICallbackShape297S0200000_1_I2 = null;
        } else {
            iDxICallbackShape297S0200000_1_I2 = new IDxICallbackShape297S0200000_1_I2(r4, A0L, 1);
        }
        C130667qT A08 = C63913ic.A08(r4);
        int A00 = AnonymousClass2BZ.A00(A04);
        String A07 = C63763iI.A07(r3);
        String A06 = C63763iI.A06(r3);
        Object A002 = AnonymousClass2C4.A00(hashMap);
        if (A002 == null) {
            A002 = AnonymousClass4To.A00();
        }
        C04220Ms.A0C(A002, I17.A00(121));
        C66843yQ r10 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, A07, (String) null, (HashMap) A002, AnonymousClass0wJ.A0v(), (Map) null, A0B2, A0B2, -1, C63763iI.A00(r3), -1, -1, false, false);
        C62343Yl r7 = new C62343Yl(C63913ic.A0F(r4));
        IgBloksScreenConfig A003 = C62343Yl.A00(A08, r7, A01, r3);
        C127397h3 A02 = C63763iI.A02(r3);
        C121997Jj r0 = null;
        if (A02 != null) {
            r0 = C121997Jj.A00(r4, A02);
        }
        r7.A02(r0);
        r7.A03(A06);
        C63763iI.A0C(A003, r3);
        Integer A004 = C32272Bb.A00(r5.A0O(36, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
        C04220Ms.A06(A004);
        C63123bZ.A02(C63913ic.A05(r4), r10, A003.A08, A003.A04(), iDxICallbackShape297S0200000_1_I2, A004, C63763iI.A09(r3), A00);
        return null;
    }
}
