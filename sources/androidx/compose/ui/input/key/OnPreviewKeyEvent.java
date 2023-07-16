package androidx.compose.ui.input.key;

import X.AnonymousClass0YY;
import X.C04220Ms;
import X.C123307Wk;
import X.C18190wL;
import X.C86104wH;

public final class OnPreviewKeyEvent extends C123307Wk {
    public final AnonymousClass0YY A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnPreviewKeyEvent) && C04220Ms.A0I(this.A00, ((OnPreviewKeyEvent) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("OnPreviewKeyEvent(onPreviewKeyEvent="));
    }

    public OnPreviewKeyEvent(AnonymousClass0YY r1) {
        this.A00 = r1;
    }
}
