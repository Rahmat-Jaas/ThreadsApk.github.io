package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.00u  reason: invalid class name and case insensitive filesystem */
public final class C001800u extends AnonymousClass020 {
    public static final AnonymousClass03Y A00;

    public final void A0C(View view) {
    }

    static {
        WindowInsets windowInsets = WindowInsets.CONSUMED;
        windowInsets.getClass();
        A00 = new AnonymousClass03Y(windowInsets);
    }

    public final AnonymousClass01T A05(int i) {
        return AnonymousClass01T.A01(this.A04.getInsets(AnonymousClass03X.A00(i)));
    }

    public final AnonymousClass01T A06(int i) {
        return AnonymousClass01T.A01(this.A04.getInsetsIgnoringVisibility(AnonymousClass03X.A00(i)));
    }

    public final boolean A0I(int i) {
        return this.A04.isVisible(AnonymousClass03X.A00(i));
    }

    public C001800u(AnonymousClass03Y r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
