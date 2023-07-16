package androidx.compose.ui.platform;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass54w;
import X.C77984hh;
import androidx.compose.ui.Modifier;

public final class InspectableValueKt {
    public static final AnonymousClass0YY A00 = C77984hh.A00;
    public static boolean isDebugInspectorInfoEnabled;

    public static final Modifier A00(Modifier modifier, Modifier modifier2, AnonymousClass0YY r3) {
        AnonymousClass0wJ.A1O(r3, modifier2);
        AnonymousClass54w r0 = new AnonymousClass54w(r3);
        return Modifier.A07(modifier, r0, modifier2).Cx6(r0.A00);
    }
}
