package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.03H  reason: invalid class name */
public final class AnonymousClass03H {
    public final AnonymousClass01T A00;
    public final AnonymousClass01T A01;

    public static AnonymousClass03H A00(WindowInsetsAnimation.Bounds bounds) {
        return new AnonymousClass03H(bounds);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{lower=");
        sb.append(this.A00);
        sb.append(" upper=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass03H(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = C005602n.A02(bounds);
        this.A01 = C005602n.A01(bounds);
    }

    public final WindowInsetsAnimation.Bounds A01() {
        return C005602n.A00(this);
    }

    public AnonymousClass03H(AnonymousClass01T r1, AnonymousClass01T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
