package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.platform.InspectableValueKt;

/* renamed from: X.6vz  reason: invalid class name and case insensitive filesystem */
public final class C115836vz {
    public static final Modifier A01(Modifier modifier, AnonymousClass0YY r3) {
        AnonymousClass0YY r0;
        if (C86164wN.A1Q(1, r3)) {
            r0 = C86154wM.A10(r3, 18);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A01(modifier, r3, r0, 18);
    }

    public static final Modifier A00(Modifier modifier, AnonymousClass0YY r2) {
        AnonymousClass0wJ.A1N(modifier, r2);
        return modifier.Cx6(new DrawBehindElement(r2));
    }
}
