package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;

/* renamed from: X.7DC  reason: invalid class name */
public final class AnonymousClass7DC {
    public static final C122777Tu A00 = new C122777Tu(C134847yT.A00(0.1f), 1.0f, 1500.0f);
    public static final C122777Tu A01 = new C122777Tu((Object) null, 1.0f, 1500.0f);
    public static final C122777Tu A02 = new C122777Tu(1, 1.0f, 1500.0f);
    public static final C122777Tu A03 = new C122777Tu(AnonymousClass7Hh.A03(), 1.0f, 1500.0f);
    public static final C122777Tu A04 = new C122777Tu(AnonymousClass7FV.A03(1), 1.0f, 1500.0f);
    public static final C122777Tu A05 = new C122777Tu(C86124wJ.A0O(C86104wH.A0C(0.5f, 0.5f)), 1.0f, 1500.0f);
    public static final C122777Tu A06 = new C122777Tu(AnonymousClass6ZH.A00, 1.0f, 1500.0f);
    public static final C122777Tu A07 = new C122777Tu(new AnonymousClass7JK(C86104wH.A0C(0.5f, 0.5f)), 1.0f, 1500.0f);

    public static final C81784oM A01(C142638fL r10, C147188nY r11, String str, float f, int i) {
        String str2 = str;
        C142638fL r4 = r10;
        C147188nY r6 = r11;
        r11.Cvb(668842840);
        if ((i & 2) != 0) {
            r4 = A01;
        }
        int i2 = i & 4;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i2 != 0) {
            f2 = 0.01f;
        }
        if ((i & 8) != 0) {
            str2 = "FloatAnimation";
        }
        r11.Cvb(841393662);
        if (r4 == A01) {
            Float valueOf = Float.valueOf(f2);
            boolean A0y = C147188nY.A0y(r11, valueOf);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r6;
            Object A13 = r1.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = C122777Tu.A00(valueOf);
                r1.A14(A13);
            }
            AnonymousClass7W3.A0w(r1, false);
            r4 = (C142638fL) A13;
        }
        AnonymousClass7W3 r12 = (AnonymousClass7W3) r6;
        AnonymousClass7W3.A0w(r12, false);
        C81784oM A002 = A00(r4, C103866ar.A02, r6, Float.valueOf(f), Float.valueOf(f2), str2, 0);
        AnonymousClass7W3.A0w(r12, false);
        return A002;
    }

    public static final C81784oM A00(C142638fL r15, AnonymousClass8cW r16, C147188nY r17, Object obj, Object obj2, String str, int i) {
        String str2 = str;
        Object obj3 = obj2;
        AnonymousClass8cW r10 = r16;
        C04220Ms.A0B(r10, 1);
        C147188nY r5 = r17;
        r5.Cvb(-1994373980);
        if ((i & 4) != 0) {
            AnonymousClass7W3 A0Z = C147188nY.A0Z(r5, -492369756);
            Object A13 = A0Z.A13();
            if (A13 == AnonymousClass7GN.A00) {
                A13 = C122777Tu.A00((Object) null);
                A0Z.A14(A13);
            }
            AnonymousClass7W3.A0w(A0Z, false);
            r15 = (C142638fL) A13;
        }
        if ((i & 8) != 0) {
            obj3 = null;
        }
        if ((i & 16) != 0) {
            str2 = "ValueAnimation";
        }
        AnonymousClass7W3 A0Z2 = C147188nY.A0Z(r5, -492369756);
        Object A132 = A0Z2.A13();
        Object obj4 = AnonymousClass7GN.A00;
        if (A132 == obj4) {
            A132 = AnonymousClass7WR.A00(A0Z2, (Object) null);
        }
        AnonymousClass7W3.A0w(A0Z2, false);
        C147368pE r6 = (C147368pE) A132;
        Object A0r = C147188nY.A0r(r5, A0Z2, -492369756);
        Object obj5 = obj;
        if (A0r == obj4) {
            A0r = new AnonymousClass7JH(r10, obj5, obj3, str2);
            A0Z2.A14(A0r);
        }
        AnonymousClass7W3.A0w(A0Z2, false);
        AnonymousClass7JH r11 = (AnonymousClass7JH) A0r;
        C81784oM A012 = C115806vw.A01(r5, (Object) null);
        if (obj3 != null && (r15 instanceof C122777Tu)) {
            C122777Tu r102 = (C122777Tu) r15;
            if (!C04220Ms.A0I(r102.A02, obj3)) {
                r15 = new C122777Tu(obj3, r102.A00, r102.A01);
            }
        }
        C81784oM A013 = C115806vw.A01(r5, r15);
        Object A0r2 = C147188nY.A0r(r5, A0Z2, -492369756);
        if (A0r2 == obj4) {
            A0r2 = new C27443EnZ();
            A0Z2.A14(A0r2);
        }
        AnonymousClass7W3.A0w(A0Z2, false);
        C86064wD r152 = (C86064wD) A0r2;
        AnonymousClass7K5.A06(r5, C86164wN.A0v(r152, obj5, 0));
        AnonymousClass7K5.A05(r5, r152, new KtSLambdaShape2S0601000_I2(r11, A013, A012, (C146958n9) null, r152));
        C81784oM r0 = (C81784oM) r6.getValue();
        if (r0 == null) {
            r0 = r11.A04;
        }
        AnonymousClass7W3.A0w(A0Z2, false);
        return r0;
    }
}
