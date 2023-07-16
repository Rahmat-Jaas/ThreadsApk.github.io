package X;

import android.app.Activity;

/* renamed from: X.4LY  reason: invalid class name */
public final class AnonymousClass4LY implements C83854s6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C83964sH A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass4LY(Activity activity, C83964sH r2, String str, String str2) {
        this.A00 = activity;
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void Bxz(Throwable th) {
        AnonymousClass3WZ.A02(this.A00);
        this.A01.onAuthorizeFail();
    }

    public final void CNQ(boolean z) {
        if (!z) {
            AnonymousClass3WZ.A02(this.A00);
            this.A01.onAuthorizeFail();
            return;
        }
        this.A01.onAuthorizeSuccess(this.A03, this.A02);
    }
}
