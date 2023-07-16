package X;

import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import java.util.List;

/* renamed from: X.3iY  reason: invalid class name and case insensitive filesystem */
public final class C63893iY {
    public static final C63893iY A01 = new C63893iY(AnonymousClass3VO.A00().A00);
    public final List A00;

    public static Object A07(C63893iY r1) {
        return r1.A0H(0);
    }

    public static Object A08(C63893iY r1) {
        return r1.A0H(1);
    }

    public static Object A09(C63893iY r1) {
        return r1.A0H(2);
    }

    public static C127397h3 A02(C63893iY r0, int i) {
        return (C127397h3) r0.A00.get(i);
    }

    public static Object A0B(C63893iY r0, int i) {
        return r0.A00.get(i);
    }

    public static void A0G(AnonymousClass601 r1, C109326jp r2) {
        C61043Rr.A00(r1, A01, r2);
    }

    public C63893iY(List list) {
        this.A00 = list;
    }

    public static int A00(IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        C127397h3 r3 = (C127397h3) iDxCListenerShape41S0300000_1_I2.A01;
        AnonymousClass3VO r1 = new AnonymousClass3VO();
        r1.A02(r3, 0);
        C63893iY r12 = new C63893iY(r1.A00);
        C122047Jt.A03((AnonymousClass3HX) iDxCListenerShape41S0300000_1_I2.A00, r3, r12, (C109326jp) iDxCListenerShape41S0300000_1_I2.A02);
        return A05;
    }

    public static AnonymousClass3HX A01(C63893iY r0, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        return (AnonymousClass3HX) A0H;
    }

    public static C127397h3 A03(C63893iY r0, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        return (C127397h3) A0H;
    }

    public static C63893iY A04(AnonymousClass3VO r0, Object obj, int i) {
        r0.A03(obj, i);
        return new C63893iY(r0.A00);
    }

    public static C63893iY A05(AnonymousClass3VO r0, Object obj, int i) {
        r0.A02(obj, i);
        return new C63893iY(r0.A00);
    }

    public static C109326jp A06(C63893iY r0, int i) {
        return ((C105916eC) r0.A0H(i)).A00;
    }

    public static Object A0A(C63893iY r0, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type kotlin.Number");
        return A0H;
    }

    public static Object A0C(C63893iY r0, String str, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, str);
        return A0H;
    }

    public static String A0D(C63893iY r0, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type kotlin.String");
        return (String) A0H;
    }

    public static String A0E(C63893iY r0, int i) {
        Object A0H = r0.A0H(i);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type kotlin.String");
        return (String) A0H;
    }

    public static void A0F(AnonymousClass601 r2, AnonymousClass3VO r3, C109326jp r4, Object obj, int i) {
        r3.A02(obj, i);
        C61043Rr.A00(r2, new C63893iY(r3.A00), r4);
    }

    public final Object A0H(int i) {
        Object A0B = A0B(this, i);
        A0B.getClass();
        return A0B;
    }
}
