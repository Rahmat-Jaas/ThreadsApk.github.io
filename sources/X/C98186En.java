package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape50S0200000_I2;

/* renamed from: X.6En  reason: invalid class name and case insensitive filesystem */
public final class C98186En {
    public static final Modifier A00(Modifier modifier, C146088lc r4, NestedScrollDispatcher nestedScrollDispatcher) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1N(modifier, r4);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86164wN.A11(nestedScrollDispatcher, r4, 9);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new KtLambdaShape50S0200000_I2(13, nestedScrollDispatcher, r4));
    }
}
