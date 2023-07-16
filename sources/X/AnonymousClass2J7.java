package X;

import android.util.SparseArray;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Map;

/* renamed from: X.2J7  reason: invalid class name */
public final class AnonymousClass2J7 {
    public static Object A00(AnonymousClass601 r25, C63893iY r26) {
        AnonymousClass3HX r1;
        C63893iY r0 = r26;
        C127397h3 A02 = C63893iY.A02(r0, 0);
        Map map = (Map) C63893iY.A09(r0);
        if (A02 == null) {
            C30967GcS.A02("bk.action.cds.PushCdsBottomSheet", "Error opening CDS Bottom Sheet with a null screen.");
            return null;
        }
        AnonymousClass601 r6 = r25;
        C130667qT A08 = C63913ic.A08(r6);
        String A07 = C63763iI.A07(A02);
        String A06 = C63763iI.A06(A02);
        C66843yQ r7 = new C66843yQ((SparseArray) null, (C83284r8) null, (C83284r8) null, (Object) null, A07, (String) null, C63913ic.A0N(map), AnonymousClass0wJ.A0v(), (Map) null, (Map) null, (Map) null, -1, C63763iI.A00(A02), -1, -1, false, false);
        if (r6 != null) {
            r1 = C63913ic.A0D(r6);
        } else {
            r1 = null;
        }
        C04220Ms.A0B(r6, 0);
        C62343Yl r3 = new C62343Yl(C63913ic.A0F(r6));
        IgBloksScreenConfig A00 = C62343Yl.A00(A08, r3, r1, A02);
        C127397h3 A022 = C63763iI.A02(A02);
        C121997Jj r02 = null;
        if (A022 != null) {
            r02 = C121997Jj.A00(r6, A022);
        }
        r3.A02(r02);
        r3.A03(A06);
        C63763iI.A0C(A00, A02);
        C66843yQ r4 = r7;
        C63123bZ.A02(C63913ic.A05(r6), r4, A00.A08, A00.A04(), (C82374pW) null, (Integer) null, C63763iI.A09(A02), 32);
        return null;
    }
}
