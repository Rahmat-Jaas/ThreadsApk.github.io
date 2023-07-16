package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape0S0000002_I2;
import kotlin.jvm.internal.KtLambdaShape1S0000001_I2;
import kotlin.jvm.internal.KtLambdaShape1S0000004_I2;

/* renamed from: X.7K4  reason: invalid class name */
public final class AnonymousClass7K4 {
    public static final Modifier A03(Modifier modifier, float f) {
        AnonymousClass0YY r2;
        float f2 = f;
        if (C86164wN.A1Q(0, modifier)) {
            r2 = new KtLambdaShape1S0000001_I2(f, 0);
        } else {
            r2 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass553(r2, f2, f, f, f));
    }

    public static final Modifier A05(Modifier modifier, float f, float f2, float f3, float f4) {
        AnonymousClass0YY r0;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        if (C86164wN.A1Q(0, modifier)) {
            r0 = new KtLambdaShape1S0000004_I2(f5, f6, f7, f8, 0);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass553(r0, f, f2, f3, f4));
    }

    public static Modifier A06(Modifier modifier, float f, int i) {
        return A04(modifier, f, (float) i);
    }

    public static Modifier A08(Modifier modifier, int i) {
        return A03(modifier, (float) i);
    }

    public static Modifier A07(Modifier modifier, int i) {
        return A04(modifier, (float) 16, (float) i);
    }

    public static final float A00(C145068jm r1, AnonymousClass69J r2) {
        AnonymousClass0wJ.A1N(r1, r2);
        if (r2 != AnonymousClass69J.Ltr) {
            return r1.ABa(r2);
        }
        C04220Ms.A0B(r2, 0);
        return ((AnonymousClass7V9) r1).A01;
    }

    public static final float A01(C145068jm r1, AnonymousClass69J r2) {
        AnonymousClass0wJ.A1N(r1, r2);
        if (r2 != AnonymousClass69J.Ltr) {
            return r1.ABe(r2);
        }
        C04220Ms.A0B(r2, 0);
        return ((AnonymousClass7V9) r1).A02;
    }

    public static final Modifier A02(C145068jm r2, Modifier modifier) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1N(modifier, r2);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(r2, 40);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass550(r2, r0));
    }

    public static final Modifier A04(Modifier modifier, float f, float f2) {
        AnonymousClass0YY r1;
        float f3 = f;
        float f4 = f2;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape0S0000002_I2(1, f, f2);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass553(r1, f3, f4, f, f2));
    }
}
