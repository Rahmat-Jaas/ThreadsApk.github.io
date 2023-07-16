package X;

import android.view.WindowInsets;

/* renamed from: X.02k  reason: invalid class name and case insensitive filesystem */
public class C005402k extends AnonymousClass03U {
    public final WindowInsets.Builder A00;

    public final void A02(AnonymousClass01T r3) {
        this.A00.setMandatorySystemGestureInsets(r3.A03());
    }

    public final void A03(AnonymousClass01T r3) {
        this.A00.setSystemGestureInsets(r3.A03());
    }

    public final void A04(AnonymousClass01T r3) {
        this.A00.setTappableElementInsets(r3.A03());
    }

    public final void A05(AnonymousClass01T r3) {
        this.A00.setStableInsets(r3.A03());
    }

    public final void A06(AnonymousClass01T r3) {
        this.A00.setSystemWindowInsets(r3.A03());
    }

    public C005402k(AnonymousClass03Y r3) {
        super(r3);
        WindowInsets.Builder builder;
        WindowInsets A04 = r3.A04();
        if (A04 == null) {
            builder = new WindowInsets.Builder();
        }
        this.A00 = builder;
    }

    public final AnonymousClass03Y A00() {
        A01();
        WindowInsets build = this.A00.build();
        build.getClass();
        AnonymousClass03Y r2 = new AnonymousClass03Y(build);
        r2.A00.A0F(this.A00);
        return r2;
    }

    public C005402k() {
        this.A00 = new WindowInsets.Builder();
    }
}
