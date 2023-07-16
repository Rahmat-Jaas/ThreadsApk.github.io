package X;

import android.view.WindowInsets;

/* renamed from: X.020  reason: invalid class name */
public class AnonymousClass020 extends AnonymousClass09X {
    public AnonymousClass01T A00 = null;
    public AnonymousClass01T A01 = null;
    public AnonymousClass01T A02 = null;

    public final void A0D(AnonymousClass01T r1) {
    }

    public final AnonymousClass01T A00() {
        AnonymousClass01T r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass01T A012 = AnonymousClass01T.A01(this.A04.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public final AnonymousClass01T A01() {
        AnonymousClass01T r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass01T A012 = AnonymousClass01T.A01(this.A04.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public final AnonymousClass01T A02() {
        AnonymousClass01T r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass01T A012 = AnonymousClass01T.A01(this.A04.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public final AnonymousClass03Y A0B(int i, int i2, int i3, int i4) {
        WindowInsets inset = this.A04.inset(i, i2, i3, i4);
        inset.getClass();
        return new AnonymousClass03Y(inset);
    }

    public AnonymousClass020(AnonymousClass03Y r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }
}
