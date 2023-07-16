package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.IDxLambdaShape13S0210000_2_I2;

/* renamed from: X.70U  reason: invalid class name */
public final class AnonymousClass70U {
    public static final AnonymousClass774 A01(C147188nY r14, AnonymousClass0ZU r15, float f, float f2, float f3, float f4, int i, boolean z) {
        C04220Ms.A0B(r15, 5);
        r14.Cvb(1428354550);
        if ((i & 1) != 0) {
            f = 0.9f;
        }
        float f5 = 400.0f;
        if ((i & 2) != 0) {
            f2 = 400.0f;
        }
        if ((i & 4) == 0) {
            f5 = f3;
        }
        if ((i & 8) != 0) {
            f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        boolean A1Z = C86154wM.A1Z(i & 16, z);
        int A00 = C147188nY.A00(r14);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r14;
        Object A13 = r2.A13();
        Object obj = AnonymousClass7GN.A00;
        C83224qz A01 = AnonymousClass7WN.A01(r2, C86104wH.A0b(r14, r2, A13, obj, A13));
        C81784oM A012 = C115806vw.A01(r14, Float.valueOf(f));
        C81784oM A013 = C115806vw.A01(r14, Float.valueOf(f2));
        C81784oM A014 = C115806vw.A01(r14, Float.valueOf(f5));
        C81784oM A015 = C115806vw.A01(r14, Float.valueOf(f4));
        C81784oM A016 = C115806vw.A01(r14, Boolean.valueOf(A1Z));
        C81784oM A017 = C115806vw.A01(r14, r15);
        Object A0r = C147188nY.A0r(r14, r2, A00);
        if (A0r == obj) {
            A0r = new AnonymousClass774(A012, A013, A014, A015, A016, A017, A01);
            r2.A14(A0r);
        }
        AnonymousClass7W3.A0w(r2, false);
        AnonymousClass774 r6 = (AnonymousClass774) A0r;
        AnonymousClass7W3.A0w(r2, false);
        return r6;
    }

    public static final Modifier A00(C147188nY r12, Modifier modifier, AnonymousClass799 r14, AnonymousClass0ZU r15, float f, float f2, float f3, float f4, int i, boolean z) {
        float f5 = f4;
        float f6 = f2;
        float f7 = f;
        AnonymousClass0ZU r6 = r15;
        C86114wI.A1I(modifier, 0, r15);
        C147188nY r5 = r12;
        r12.Cvb(-1997644438);
        int i2 = i;
        boolean A1Z = C86154wM.A1Z(i & 1, z);
        if ((i & 2) != 0) {
            f7 = 0.9f;
        }
        float f8 = 400.0f;
        if ((i & 4) != 0) {
            f6 = 400.0f;
        }
        if ((i & 8) == 0) {
            f8 = f3;
        }
        if ((i & 16) != 0) {
            f5 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        boolean A1V = C18180wK.A1V(i & 32);
        AnonymousClass799 r3 = null;
        if ((i2 & 128) == 0) {
            r3 = r14;
        }
        AnonymousClass774 A01 = A01(r5, r6, f7, f6, f8, f5, 0, A1V);
        C04220Ms.A0B(A01, 1);
        r5.Cvb(1739080125);
        Modifier A02 = C120417Am.A02(modifier, InspectableValueKt.A00, new IDxLambdaShape13S0210000_2_I2(2, A01, r3, A1Z));
        AnonymousClass7W3.A0w(AnonymousClass7W3.A04(r5, false), false);
        return A02;
    }
}
