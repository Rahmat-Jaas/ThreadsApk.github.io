package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape2S0000000_I2;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0110000_I2;

/* renamed from: X.72L  reason: invalid class name */
public final class AnonymousClass72L {
    public static final AnonymousClass54w A00;

    public static final Modifier A00(C147258p3 r3, Modifier modifier, boolean z) {
        AnonymousClass0YY r0;
        if (C86164wN.A1Q(0, modifier)) {
            r0 = new KtLambdaShape5S0110000_I2(1, r3, z);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new KtLambdaShape6S0110000_I2(0, r3, z));
    }

    static {
        AnonymousClass0YY r0;
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape2S0000000_I2(0);
        } else {
            r0 = InspectableValueKt.A00;
        }
        A00 = new AnonymousClass54w(r0);
    }
}
