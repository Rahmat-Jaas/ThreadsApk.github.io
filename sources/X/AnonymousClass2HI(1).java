package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.2HI  reason: invalid class name */
public final class AnonymousClass2HI {
    public static Object A00(AnonymousClass601 r11, C63893iY r12) {
        int i;
        String str;
        C127397h3 r3 = (C127397h3) C63893iY.A07(r12);
        HashMap A0N = C63913ic.A0N((HashMap) C63893iY.A08(r12));
        Object A0B = C63893iY.A0B(r12, 3);
        A0B.getClass();
        int A04 = AnonymousClass0wJ.A04(A0B);
        int i2 = r3.A03;
        if (AnonymousClass0wJ.A1T(i2, 13647)) {
            i = 45;
        } else if (AnonymousClass0wJ.A1T(i2, 13784)) {
            i = 46;
        } else {
            throw C18190wL.A0a("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        long max = Math.max(r3.A0I(i, 0), (long) A04);
        if (C63763iI.A0D(r3)) {
            str = C63763iI.A07(r3);
        } else {
            str = null;
        }
        Context A08 = C18230wP.A08();
        if (str != null) {
            String A082 = C63763iI.A08(r3);
            C04220Ms.A0B(r11, 0);
            M4x.A03(A08, new C210718u(C63913ic.A0F(r11)), str, A082, A0N, max);
        }
        return null;
    }
}
