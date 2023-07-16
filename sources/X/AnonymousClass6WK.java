package X;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierElement;

/* renamed from: X.6WK  reason: invalid class name */
public final class AnonymousClass6WK {
    public static final Modifier A00;

    static {
        int i = Build.VERSION.SDK_INT;
        Modifier modifier = Modifier.A00;
        if (i >= 31) {
            AnonymousClass8ZO r2 = AnonymousClass8ZO.A00;
            AnonymousClass0wJ.A1N(modifier, r2);
            Modifier Cx6 = modifier.Cx6(new LayoutModifierElement(r2));
            AnonymousClass8ZP r1 = AnonymousClass8ZP.A00;
            AnonymousClass0wJ.A1N(Cx6, r1);
            modifier = Cx6.Cx6(new LayoutModifierElement(r1));
        }
        A00 = modifier;
    }
}
