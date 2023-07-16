package X;

import android.graphics.Insets;

/* renamed from: X.01T  reason: invalid class name */
public final class AnonymousClass01T {
    public static final AnonymousClass01T A04 = new AnonymousClass01T(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass01T r5 = (AnonymousClass01T) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass01T A00(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return A04;
        }
        return new AnonymousClass01T(i, i2, i3, i4);
    }

    public static AnonymousClass01T A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static AnonymousClass01T A02(AnonymousClass01T r5, AnonymousClass01T r6) {
        return A00(Math.max(r5.A01, r6.A01), Math.max(r5.A03, r6.A03), Math.max(r5.A02, r6.A02), Math.max(r5.A00, r6.A00));
    }

    public final Insets A03() {
        return AnonymousClass01S.A00(this.A01, this.A03, this.A02, this.A00);
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass00U.A0f("Insets{left=", ", top=", ", right=", ", bottom=", '}', this.A01, this.A03, this.A02, this.A00);
    }

    public AnonymousClass01T(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
