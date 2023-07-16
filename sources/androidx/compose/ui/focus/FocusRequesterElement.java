package androidx.compose.ui.focus;

import X.AnonymousClass77X;
import X.C04220Ms;
import X.C123307Wk;
import X.C18190wL;
import X.C86104wH;

public final class FocusRequesterElement extends C123307Wk {
    public final AnonymousClass77X A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FocusRequesterElement) && C04220Ms.A0I(this.A00, ((FocusRequesterElement) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("FocusRequesterElement(focusRequester="));
    }

    public FocusRequesterElement(AnonymousClass77X r1) {
        this.A00 = r1;
    }
}
