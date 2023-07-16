package X;

import android.app.Activity;

/* renamed from: X.4LW  reason: invalid class name */
public final class AnonymousClass4LW implements C83854s6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C83814s2 A01;
    public final /* synthetic */ AnonymousClass264 A02;

    public AnonymousClass4LW(Activity activity, C83814s2 r2, AnonymousClass264 r3) {
        this.A00 = activity;
        this.A01 = r2;
        this.A02 = r3;
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
        this.A01.Blp(this.A02);
    }
}
