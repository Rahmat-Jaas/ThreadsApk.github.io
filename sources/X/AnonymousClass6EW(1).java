package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape0S0110201_I2;

/* renamed from: X.6EW  reason: invalid class name */
public final class AnonymousClass6EW {
    public static final Modifier A00(Modifier modifier, C142918fo r15, float f, long j, long j2, boolean z) {
        AnonymousClass0YY r2;
        Modifier modifier2 = modifier;
        C142918fo r3 = r15;
        AnonymousClass0wJ.A1M(modifier2, 0, r15);
        float f2 = f;
        boolean z2 = z;
        if (Float.compare(f2, (float) 0) <= 0 && !z) {
            return modifier2;
        }
        long j3 = j;
        long j4 = j2;
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r2 = new KtLambdaShape0S0110201_I2(r3, f2, 1, j3, j4, z2);
        } else {
            r2 = InspectableValueKt.A00;
        }
        return InspectableValueKt.A00(modifier2, C115876w3.A01(Modifier.A00, new KtLambdaShape0S0110201_I2(r15, f2, 0, j3, j4, z2)), r2);
    }
}
