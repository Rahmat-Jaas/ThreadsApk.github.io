package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.IDxLambdaShape2S0120000_2_I2;
import kotlin.jvm.internal.KtLambdaShape0S0230000_I2;

/* renamed from: X.7Ad  reason: invalid class name */
public final class AnonymousClass7Ad {
    public static Modifier A01(C122847Ub r2, Modifier modifier) {
        return A02(r2, modifier, 14, false);
    }

    public static /* synthetic */ Modifier A02(C122847Ub r6, Modifier modifier, int i, boolean z) {
        AnonymousClass0YY r1;
        boolean z2 = z;
        if ((i & 2) != 0) {
            z2 = true;
        }
        C122847Ub r2 = r6;
        boolean A1Z = AnonymousClass0wJ.A1Z(modifier, r6);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r1 = new KtLambdaShape0S0230000_I2(r2, (Object) null, 0, z2, A1Z);
        } else {
            r1 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r1, new IDxLambdaShape2S0120000_2_I2(r2, 0, A1Z, z2));
    }

    public static final C122847Ub A00(C147188nY r6) {
        r6.Cvb(-1464256199);
        Object[] objArr = new Object[0];
        C141738cs r3 = C122847Ub.A08;
        boolean A0y = C147188nY.A0y(r6, 0);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
        Object A13 = r2.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass8DY();
            r2.A14(A13);
        }
        C122847Ub r0 = (C122847Ub) AnonymousClass6EN.A00(r6, r3, AnonymousClass7W3.A08(r2, A13, false), objArr, 4);
        AnonymousClass7W3.A0w(r2, false);
        return r0;
    }
}
