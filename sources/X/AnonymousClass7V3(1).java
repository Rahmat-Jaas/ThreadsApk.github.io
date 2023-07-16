package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape2S0000000_I2;

/* renamed from: X.7V3  reason: invalid class name */
public final class AnonymousClass7V3 implements C142748fW {
    public static final AnonymousClass7V3 A00 = new AnonymousClass7V3();

    public final Modifier A00(Modifier modifier) {
        AnonymousClass0YY r0;
        Alignment alignment = AnonymousClass7KV.A09;
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape2S0000000_I2(1);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55I(alignment, r0, true));
    }

    public final Modifier A86(Alignment alignment, Modifier modifier) {
        AnonymousClass0YY r0;
        boolean A1Y = AnonymousClass0wJ.A1Y(modifier, alignment);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(alignment, 33);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55I(alignment, r0, A1Y));
    }
}
