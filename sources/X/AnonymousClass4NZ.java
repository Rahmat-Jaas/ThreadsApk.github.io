package X;

import android.app.Activity;

/* renamed from: X.4NZ  reason: invalid class name */
public final class AnonymousClass4NZ implements C83964sH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C695248y A01;
    public final /* synthetic */ C83964sH A02;

    public AnonymousClass4NZ(Activity activity, C695248y r2, C83964sH r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final void onAuthorizeFail() {
        this.A02.onAuthorizeFail();
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A01.A00(new AnonymousClass4LY(this.A00, this.A02, str, str2));
    }
}
