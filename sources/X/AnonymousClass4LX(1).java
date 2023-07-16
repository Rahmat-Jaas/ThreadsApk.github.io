package X;

import android.app.Activity;

/* renamed from: X.4LX  reason: invalid class name */
public final class AnonymousClass4LX implements C83854s6 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C84214sk A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass4LX(Activity activity, C84214sk r2, String str, String str2) {
        this.A00 = activity;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void Bxz(Throwable th) {
        AnonymousClass3WZ.A02(this.A00);
        this.A01.BwY();
    }

    public final void CNQ(boolean z) {
        if (!z) {
            AnonymousClass3WZ.A02(this.A00);
            this.A01.BwY();
            return;
        }
        this.A01.BrC(this.A02, this.A03);
    }
}
