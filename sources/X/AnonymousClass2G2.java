package X;

import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.2G2  reason: invalid class name */
public final class AnonymousClass2G2 {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        C109326jp r7;
        C109326jp r8;
        String str;
        AnonymousClass601 r6 = r10;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        String A0E = C63893iY.A0E(r11, 0);
        Object A0B = C63893iY.A0B(r11, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A0B;
        C127397h3 A02 = C63893iY.A02(r11, 2);
        if (A02 != null) {
            r7 = A02.A0L(36);
            r8 = C18230wP.A0V(A02);
        } else {
            r7 = null;
            r8 = null;
        }
        Map A0B2 = C63763iI.A0B(r10, A02, 40);
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        if (A02 == null || (str = A02.A0N(38)) == null) {
            str = "current-screen";
        }
        C63913ic.A0D(r6);
        boolean A1X = AnonymousClass0wJ.A1X(C63913ic.A0D(r6).A00(R.id.bloks_ig_precompile_async_actions));
        C145538kf A00 = C62053Wy.A00(C63913ic.A03(r6), C63913ic.A0H(r6), str, A0E);
        if (A00 == null) {
            return null;
        }
        AnonymousClass4A9 A002 = C63263h8.A00(C63913ic.A0F(r6), A0E, C63913ic.A0N(map));
        A002.A00 = new AnonymousClass1eL(r6, r7, r8, A0E, A0B2, A1X);
        A00.schedule(A002);
        return null;
    }
}
