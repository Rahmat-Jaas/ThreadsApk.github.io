package X;

import android.app.Application;
import android.content.Context;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.8nY  reason: invalid class name and case insensitive filesystem */
public interface C147188nY {
    public static final AnonymousClass7GN A00 = AnonymousClass7GN.A01;

    static C146288ly A0h(C147188nY r2, Alignment alignment) {
        r2.Cvb(733328855);
        return C120767Cj.A00(r2, alignment, false);
    }

    static Integer A0l(C147188nY r2, Object obj, AnonymousClass0YM r4) {
        r4.invoke(obj, r2, 0);
        r2.Cvb(2058660585);
        return 0;
    }

    static void A0v(C147188nY r5, int i, int i2) {
        C147188nY r1 = r5;
        r5.Cvb(i);
        if (i2 > 0) {
            AnonymousClass70V.A01(r1, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 5, C120537Bh.A00(r5).A09);
        }
    }

    static void A0w(C147188nY r4, AnonymousClass7W3 r5, AnonymousClass0ZU r6) {
        AnonymousClass7W3 r3 = (AnonymousClass7W3) r4;
        AnonymousClass7W3.A0s(r3, (Object) null, (Object) null, 125, 2);
        r3.A0R = true;
        if (r5.A0P) {
            r4.AFy(r6);
        } else {
            r4.DA8();
        }
    }

    boolean ACV(float f);

    boolean ACW(int i);

    boolean ACX(long j);

    boolean ACY(Object obj);

    boolean ACZ(boolean z);

    boolean ACa(Object obj);

    Object AEA(C104046b9 r1);

    void AFy(AnonymousClass0ZU r1);

    void AJg();

    void AKA();

    C147178nW AKE();

    void AKH(int i);

    boolean Acj();

    boolean BCM();

    void CuJ();

    void CvD();

    void CvO(int i, Object obj);

    void Cvb(int i);

    C147188nY Cvd(int i);

    void Cve(int i, Object obj);

    void DA8();

    static int A08(C147188nY r2, Object obj) {
        return !r2.ACY(obj) ? 16 : 32;
    }

    static Application A0S(C147188nY r1) {
        Context applicationContext = ((Context) r1.AEA(AnonymousClass7DA.A01)).getApplicationContext();
        C04220Ms.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    static Context A0T(C147188nY r1) {
        return (Context) r1.AEA(AnonymousClass7DA.A01);
    }

    static AnonymousClass78O A0X(C147188nY r1) {
        return (AnonymousClass78O) r1.AEA(AnonymousClass72T.A00);
    }

    static C147168nV A0j(C147188nY r1) {
        return (C147168nV) r1.AEA(AnonymousClass7DE.A02);
    }

    static Object A0m(C147188nY r1) {
        return r1.AEA(AnonymousClass7DE.A0B);
    }

    static Object A0n(C147188nY r1) {
        return r1.AEA(AnonymousClass7DE.A07);
    }

    static Object A0o(C147188nY r1) {
        return r1.AEA(AnonymousClass7DA.A01);
    }

    static int A00(C147188nY r1) {
        r1.Cvb(773894976);
        r1.Cvb(-492369756);
        return -492369756;
    }

    static int A01(C147188nY r0, float f) {
        if (r0.ACV(f)) {
            return 32;
        }
        return 16;
    }

    static int A02(C147188nY r0, float f) {
        if (r0.ACV(f)) {
            return 2048;
        }
        return 1024;
    }

    static int A03(C147188nY r0, int i) {
        if (r0.ACW(i)) {
            return 4;
        }
        return 2;
    }

    static int A04(C147188nY r0, int i) {
        if (r0.ACW(i)) {
            return 32;
        }
        return 16;
    }

    static int A05(C147188nY r0, long j) {
        if (r0.ACX(j)) {
            return 4;
        }
        return 2;
    }

    static int A06(C147188nY r0, long j) {
        if (r0.ACX(j)) {
            return 2048;
        }
        return 1024;
    }

    static int A07(C147188nY r0, Enum enumR, int i) {
        r0.Cvb(i);
        return enumR.ordinal();
    }

    static int A09(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return 4;
        }
        return 2;
    }

    static int A0A(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return 32;
        }
        return 16;
    }

    static int A0B(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return 256;
        }
        return 128;
    }

    static int A0C(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return 2048;
        }
        return 1024;
    }

    static int A0D(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    static int A0E(C147188nY r0, Object obj) {
        if (r0.ACa(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    static int A0F(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return 4;
        }
        return 2;
    }

    static int A0G(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return 32;
        }
        return 16;
    }

    static int A0H(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return 256;
        }
        return 128;
    }

    static int A0I(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return 2048;
        }
        return 1024;
    }

    static int A0J(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    static int A0K(C147188nY r0, Object obj) {
        if (r0.ACY(obj)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    static int A0L(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return 4;
        }
        return 2;
    }

    static int A0M(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return 32;
        }
        return 16;
    }

    static int A0N(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return 256;
        }
        return 128;
    }

    static int A0O(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return 2048;
        }
        return 1024;
    }

    static int A0P(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        return 8192;
    }

    static int A0Q(C147188nY r0, boolean z) {
        if (r0.ACZ(z)) {
            return Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        }
        return Constants.LOAD_RESULT_PGO_ATTEMPTED;
    }

    static long A0R(C147188nY r0, C104046b9 r1) {
        return ((AnonymousClass7KE) r0.AEA(r1)).A00;
    }

    static C145048jk A0U(C147188nY r1) {
        r1.Cvb(693286680);
        return AnonymousClass7J3.A01;
    }

    static C145058jl A0V(C147188nY r1) {
        r1.Cvb(-483455358);
        return AnonymousClass7J3.A07;
    }

    static AnonymousClass7VA A0W(C147188nY r1) {
        r1.Cvb(2058660585);
        return AnonymousClass7VA.A00;
    }

    static AnonymousClass7W3 A0Y(C147188nY r1) {
        r1.Cvb(-492369756);
        return (AnonymousClass7W3) r1;
    }

    static AnonymousClass7W3 A0Z(C147188nY r0, int i) {
        r0.Cvb(i);
        return (AnonymousClass7W3) r0;
    }

    static AnonymousClass534 A0a(C147188nY r1) {
        r1.Cvb(-1323940314);
        return AnonymousClass7DE.A02;
    }

    static AnonymousClass534 A0b(C147188nY r0, int i) {
        r0.Cvb(i);
        return AnonymousClass7DE.A02;
    }

    static Modifier A0c(C147188nY r0, Modifier modifier, int i, int i2) {
        r0.Cvd(i);
        if ((i2 & 4) != 0) {
            return Modifier.A00;
        }
        return modifier;
    }

    static Modifier A0d(C147188nY r0, Modifier modifier, int i, int i2) {
        r0.Cvd(i);
        if ((i2 & 8) != 0) {
            return Modifier.A00;
        }
        return modifier;
    }

    static C146288ly A0e(C145048jk r1, C147188nY r2, C141758cu r3) {
        r2.Cvb(693286680);
        return AnonymousClass72N.A00(r1, r2, r3);
    }

    static C146288ly A0f(C145058jl r1, C147188nY r2, C142878fk r3) {
        r2.Cvb(-483455358);
        return AnonymousClass72M.A00(r1, r2, r3);
    }

    static C146288ly A0g(C147188nY r1, C141758cu r2) {
        r1.Cvb(693286680);
        return AnonymousClass72N.A00(AnonymousClass7J3.A01, r1, r2);
    }

    static C146288ly A0i(C147188nY r2, Alignment alignment) {
        r2.Cvb(733328855);
        return C120767Cj.A00(r2, alignment, false);
    }

    static C147168nV A0k(C147188nY r0, C104046b9 r1) {
        return (C147168nV) r0.AEA(r1);
    }

    static Object A0p(C147188nY r1) {
        r1.Cvb(-1323940314);
        return r1.AEA(AnonymousClass7DE.A02);
    }

    static Object A0q(C147188nY r1, int i) {
        r1.Cvb(i);
        return r1.AEA(AnonymousClass7DE.A02);
    }

    static Object A0r(C147188nY r0, AnonymousClass7W3 r1, int i) {
        r0.Cvb(i);
        return r1.A13();
    }

    static Object A0s(C147188nY r1, C104046b9 r2) {
        r1.Cvb(-1323940314);
        return r1.AEA(r2);
    }

    static Object A0t(C147188nY r0, C104046b9 r1, int i) {
        r0.Cvb(i);
        return r0.AEA(r1);
    }

    static Object A0u(C147188nY r0, C81784oM r1, int i) {
        r0.Cvb(i);
        return r1.getValue();
    }

    static void A0x(C147188nY r1, Object obj, AnonymousClass0YM r3, int i) {
        r3.invoke(obj, r1, Integer.valueOf(i));
        r1.Cvb(2058660585);
    }

    static boolean A0y(C147188nY r1, Object obj) {
        r1.Cvb(1157296644);
        return r1.ACY(obj);
    }

    static boolean A0z(C147188nY r0, Object obj, int i) {
        r0.Cvb(i);
        return r0.ACY(obj);
    }

    static boolean A10(C147188nY r0, Object obj, Object obj2, int i) {
        r0.Cvb(i);
        return r0.ACY(obj) | r0.ACY(obj2);
    }

    static boolean A11(C147188nY r0, Object obj, boolean z) {
        return r0.ACY(obj) | z;
    }

    static boolean A12(C147188nY r0, Object obj, boolean z) {
        return z | r0.ACY(obj);
    }

    static Object[] A13(C147188nY r2, Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {obj, obj2, obj3, obj4};
        r2.Cvb(-568225417);
        return objArr;
    }
}
