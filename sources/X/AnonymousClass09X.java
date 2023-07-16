package X;

import android.view.DisplayCutout;
import android.view.WindowInsets;

/* renamed from: X.09X  reason: invalid class name */
public class AnonymousClass09X extends C05170Rr {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09X)) {
            return false;
        }
        C005102h r4 = (C005102h) obj;
        return C002401c.A00(this.A04, r4.A04) && C002401c.A00(this.A00, r4.A00);
    }

    public final AnonymousClass025 A07() {
        DisplayCutout displayCutout = this.A04.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new AnonymousClass025(displayCutout);
    }

    public final AnonymousClass03Y A08() {
        WindowInsets consumeDisplayCutout = this.A04.consumeDisplayCutout();
        consumeDisplayCutout.getClass();
        return new AnonymousClass03Y(consumeDisplayCutout);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public AnonymousClass09X(AnonymousClass03Y r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
