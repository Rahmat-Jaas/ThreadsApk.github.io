package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.6MI  reason: invalid class name */
public final class AnonymousClass6MI {
    public static final C111216my A00(C142638fL r9, C147188nY r10, AnonymousClass0ZU r11, float f, int i, boolean z) {
        C142638fL r5 = r9;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        C04220Ms.A0B(r11, 1);
        r10.Cvb(1769918243);
        if ((i & 4) != 0) {
            f2 = C103506Zl.A00;
        }
        if ((i & 8) != 0) {
            f = C103506Zl.A01;
        }
        if ((i & 16) != 0) {
            r5 = new C122777Tu((Object) null, 1.0f, 1500.0f);
        }
        if (Float.compare(f2, (float) 0) > 0) {
            r10.Cvb(773894976);
            AnonymousClass7W3 A0Y = C147188nY.A0Y(r10);
            Object A13 = A0Y.A13();
            Object obj = AnonymousClass7GN.A00;
            C83224qz A00 = AnonymousClass7WN.A00(A0Y, C86104wH.A0b(r10, A0Y, A13, obj, A13));
            C81784oM A01 = C115806vw.A01(r10, r11);
            C147168nV A0j = C147188nY.A0j(r10);
            float CxL = A0j.CxL(f2);
            float CxL2 = A0j.CxL(f);
            boolean A0y = C147188nY.A0y(r10, A00);
            Object A132 = A0Y.A13();
            if (A0y || A132 == obj) {
                A132 = new C111216my(r5, A01, A00, CxL2, CxL);
                A0Y.A14(A132);
            }
            AnonymousClass7W3.A0w(A0Y, false);
            C111216my r4 = (C111216my) A132;
            AnonymousClass7K5.A06(r10, new KtLambdaShape4S0110000_I2(6, r4, z));
            AnonymousClass7W3.A0w(A0Y, false);
            return r4;
        }
        throw C18190wL.A0a("The refresh trigger must be greater than zero!");
    }
}
