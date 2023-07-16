package X;

import android.view.WindowInsets;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public class C05170Rr extends C005102h {
    public AnonymousClass01T A00 = null;

    public final AnonymousClass01T A03() {
        AnonymousClass01T r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        AnonymousClass01T A002 = AnonymousClass01T.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.A00 = A002;
        return A002;
    }

    public final AnonymousClass03Y A09() {
        WindowInsets consumeStableInsets = this.A04.consumeStableInsets();
        consumeStableInsets.getClass();
        return new AnonymousClass03Y(consumeStableInsets);
    }

    public final AnonymousClass03Y A0A() {
        WindowInsets consumeSystemWindowInsets = this.A04.consumeSystemWindowInsets();
        consumeSystemWindowInsets.getClass();
        return new AnonymousClass03Y(consumeSystemWindowInsets);
    }

    public final boolean A0H() {
        return this.A04.isConsumed();
    }

    public C05170Rr(AnonymousClass03Y r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public void A0D(AnonymousClass01T r1) {
        this.A00 = r1;
    }
}
