package androidx.compose.ui.layout;

import X.C04220Ms;
import X.C123307Wk;
import X.C18190wL;
import X.C86104wH;

public final class LayoutIdModifierElement extends C123307Wk {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LayoutIdModifierElement) && C04220Ms.A0I(this.A00, ((LayoutIdModifierElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("LayoutIdModifierElement(layoutId="));
    }

    public LayoutIdModifierElement(Object obj) {
        this.A00 = obj;
    }
}
