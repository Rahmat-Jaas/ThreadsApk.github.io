package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2J5  reason: invalid class name */
public final class AnonymousClass2J5 {
    public static Object A00(AnonymousClass601 r8, C63893iY r9) {
        AnonymousClass3HX r4;
        C127397h3 r5 = (C127397h3) C63893iY.A07(r9);
        C127397h3 r0 = (C127397h3) C63893iY.A08(r9);
        Map map = (Map) C63893iY.A09(r9);
        if (r8 != null) {
            r4 = C63913ic.A0D(r8);
        } else {
            r4 = null;
        }
        C66883yU A02 = C66883yU.A02(r4, r0);
        C130667qT A08 = C63913ic.A08(r8);
        C04220Ms.A0B(r8, 0);
        C62343Yl r2 = new C62343Yl(C63913ic.A0F(r8));
        IgBloksScreenConfig A00 = C62343Yl.A00(A08, r2, r4, r5);
        C127397h3 A022 = C63763iI.A02(r5);
        C121997Jj r02 = null;
        if (A022 != null) {
            r02 = C121997Jj.A00(r8, A022);
        }
        r2.A02(r02);
        r2.A03(C63763iI.A06(r5));
        A00.A01 = A02;
        if (r5 != null) {
            C63763iI.A0C(A00, r5);
        }
        C63743iE r1 = new C63743iE(C63913ic.A0N(map), Collections.EMPTY_MAP, C63763iI.A07(r5));
        r1.A00 = C63763iI.A00(r5);
        r1.A03 = r5;
        r1.A0G(C63763iI.A0A(r8, r5));
        r1.A05 = C63763iI.A08(r5);
        r1.A0E(C63913ic.A05(r8), A00);
        return null;
    }
}
