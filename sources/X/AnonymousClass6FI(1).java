package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;

/* renamed from: X.6FI  reason: invalid class name */
public final class AnonymousClass6FI {
    public static final Modifier A00(Modifier modifier, AnonymousClass0YY r3, boolean z) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1M(modifier, 0, r3);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape5S0110000_I2(9, r3, z);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55K(r3, r0, z));
    }
}
