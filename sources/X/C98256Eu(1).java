package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;

/* renamed from: X.6Eu  reason: invalid class name and case insensitive filesystem */
public final class C98256Eu {
    public static final Modifier A00(Modifier modifier, AnonymousClass0YY r3) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1N(modifier, r3);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86154wM.A10(r3, 32);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55E(r3, r0));
    }
}
