package X;

import android.app.Activity;

/* renamed from: X.4Kv  reason: invalid class name and case insensitive filesystem */
public final class C71904Kv implements C83814s2 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C83814s2 A01;
    public final /* synthetic */ C695248y A02;

    public C71904Kv(Activity activity, C83814s2 r2, C695248y r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void Blp(AnonymousClass264 r5) {
        this.A02.A00(new AnonymousClass4LW(this.A00, this.A01, r5));
    }

    public final void onAuthorizeFail() {
        this.A01.onAuthorizeFail();
    }
}
