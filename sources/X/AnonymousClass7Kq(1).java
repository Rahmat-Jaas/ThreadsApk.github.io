package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape0S0000002_I2;
import kotlin.jvm.internal.KtLambdaShape1S0000001_I2;
import kotlin.jvm.internal.KtLambdaShape1S0000004_I2;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;

/* renamed from: X.7Kq  reason: invalid class name */
public final class AnonymousClass7Kq {
    public static final AnonymousClass54z A00 = new AnonymousClass54z(AnonymousClass006.A00, new KtLambdaShape1S0000001_I2(1.0f, 1));
    public static final AnonymousClass54z A01 = new AnonymousClass54z(AnonymousClass006.A0C, new KtLambdaShape1S0000001_I2(1.0f, 2));
    public static final AnonymousClass54z A02 = new AnonymousClass54z(AnonymousClass006.A01, new KtLambdaShape1S0000001_I2(1.0f, 3));
    public static final AnonymousClass552 A03 = A01(AnonymousClass7KV.A04);
    public static final AnonymousClass552 A04 = A01(AnonymousClass7KV.A05);
    public static final AnonymousClass552 A05 = A02(AnonymousClass7KV.A09);
    public static final AnonymousClass552 A06 = A02(AnonymousClass7KV.A0E);
    public static final AnonymousClass552 A07 = A00(AnonymousClass7KV.A00);
    public static final AnonymousClass552 A08 = A00(AnonymousClass7KV.A02);

    public static final AnonymousClass552 A00(C142878fk r5) {
        return new AnonymousClass552(AnonymousClass006.A01, r5, new KtLambdaShape5S0110000_I2(6, r5, false), C86164wN.A0u(r5, 5));
    }

    public static final AnonymousClass552 A01(C141758cu r5) {
        return new AnonymousClass552(AnonymousClass006.A00, r5, new KtLambdaShape5S0110000_I2(4, r5, false), C86164wN.A0u(r5, 3));
    }

    public static final AnonymousClass552 A02(Alignment alignment) {
        return new AnonymousClass552(AnonymousClass006.A0C, alignment, new KtLambdaShape5S0110000_I2(5, alignment, false), C86164wN.A0u(alignment, 4));
    }

    public static Modifier A0F(Modifier modifier, int i) {
        return A09(modifier, (float) i);
    }

    public static /* synthetic */ Modifier A03(Alignment alignment, Modifier modifier, int i) {
        AnonymousClass552 A022;
        if ((i & 1) != 0) {
            alignment = AnonymousClass7KV.A09;
        }
        AnonymousClass0wJ.A1N(modifier, alignment);
        if (alignment.equals(AnonymousClass7KV.A09)) {
            A022 = A05;
        } else if (alignment.equals(AnonymousClass7KV.A0E)) {
            A022 = A06;
        } else {
            A022 = A02(alignment);
        }
        return modifier.Cx6(A022);
    }

    public static Modifier A04(Modifier modifier) {
        return A0A(modifier, C103106Xv.A00.A01);
    }

    public static /* synthetic */ Modifier A05(Modifier modifier) {
        AnonymousClass552 A012;
        C141758cu r1 = AnonymousClass7KV.A04;
        AnonymousClass0wJ.A1N(modifier, r1);
        if (r1.equals(r1)) {
            A012 = A03;
        } else if (r1.equals(AnonymousClass7KV.A05)) {
            A012 = A04;
        } else {
            A012 = A01(r1);
        }
        return modifier.Cx6(A012);
    }

    public static Modifier A06(Modifier modifier, float f) {
        return A0C(modifier, f, Float.NaN);
    }

    public static Modifier A07(Modifier modifier, float f) {
        return A0B(modifier, Float.NaN, f);
    }

    public static final Modifier A08(Modifier modifier, float f) {
        AnonymousClass0YY r1;
        float f2 = f;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape1S0000001_I2(f, 4);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, Float.NaN, f2, Float.NaN, f, true));
    }

    public static final Modifier A09(Modifier modifier, float f) {
        AnonymousClass0YY r1;
        float f2 = f;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape1S0000001_I2(f, 7);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, f2, f, f, f, true));
    }

    public static final Modifier A0A(Modifier modifier, float f) {
        AnonymousClass0YY r1;
        float f2 = f;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape1S0000001_I2(f, 8);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, f2, Float.NaN, f, Float.NaN, true));
    }

    public static final Modifier A0B(Modifier modifier, float f, float f2) {
        AnonymousClass0YY r0;
        if (C86134wK.A1Z(modifier)) {
            r0 = new KtLambdaShape0S0000002_I2(2, f, f2);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass559(r0, f, f2));
    }

    public static final Modifier A0C(Modifier modifier, float f, float f2) {
        AnonymousClass0YY r1;
        float f3 = f;
        float f4 = f2;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape0S0000002_I2(3, f, f2);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, Float.NaN, f3, Float.NaN, f4, true));
    }

    public static final Modifier A0D(Modifier modifier, float f, float f2) {
        AnonymousClass0YY r1;
        float f3 = f;
        float f4 = f2;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape0S0000002_I2(4, f, f2);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, f3, f4, f, f2, true));
    }

    public static final Modifier A0E(Modifier modifier, float f, float f2, float f3, float f4) {
        AnonymousClass0YY r1;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        if (C86134wK.A1Z(modifier)) {
            r1 = new KtLambdaShape1S0000004_I2(f5, f6, f7, f8, 1);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55A(r1, f5, f6, f7, f8, true));
    }
}
