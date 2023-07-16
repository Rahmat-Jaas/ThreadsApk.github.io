package X;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.025  reason: invalid class name */
public final class AnonymousClass025 {
    public final DisplayCutout A00;

    public final AnonymousClass01T A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            return AnonymousClass01T.A01(AnonymousClass024.A00(this.A00));
        }
        return AnonymousClass01T.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C002401c.A00(this.A00, ((AnonymousClass025) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass025(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }
}
