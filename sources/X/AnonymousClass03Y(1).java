package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.03Y  reason: invalid class name */
public final class AnonymousClass03Y {
    public static final AnonymousClass03Y A01;
    public final AnonymousClass03V A00;

    static {
        AnonymousClass03Y r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = C001800u.A00;
        } else {
            r0 = AnonymousClass03V.A01;
        }
        A01 = r0;
    }

    public static AnonymousClass01T A00(AnonymousClass01T r5, int i, int i2, int i3, int i4) {
        int max = Math.max(0, r5.A01 - i);
        int max2 = Math.max(0, r5.A03 - i2);
        int max3 = Math.max(0, r5.A02 - i3);
        int max4 = Math.max(0, r5.A00 - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return r5;
        }
        return AnonymousClass01T.A00(max, max2, max3, max4);
    }

    public final int A02() {
        return this.A00.A04().A00;
    }

    public final int A03() {
        return this.A00.A04().A03;
    }

    public final WindowInsets A04() {
        AnonymousClass03V r1 = this.A00;
        if (r1 instanceof C005102h) {
            return ((C005102h) r1).A04;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass03Y)) {
            return false;
        }
        return C002401c.A00(this.A00, ((AnonymousClass03Y) obj).A00);
    }

    public final int hashCode() {
        AnonymousClass03V r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    public AnonymousClass03Y(WindowInsets windowInsets) {
        AnonymousClass03V r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new C001800u(this, windowInsets);
        } else if (i >= 29) {
            r0 = new AnonymousClass020(this, windowInsets);
        } else {
            r0 = new AnonymousClass09X(this, windowInsets);
        }
        this.A00 = r0;
    }

    public static AnonymousClass03Y A01(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        AnonymousClass03Y r2 = new AnonymousClass03Y(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            AnonymousClass03Y A002 = C006102s.A00(view);
            AnonymousClass03V r1 = r2.A00;
            r1.A0E(A002);
            r1.A0C(view.getRootView());
        }
        return r2;
    }

    public AnonymousClass03Y() {
        this.A00 = new AnonymousClass03V(this);
    }
}
