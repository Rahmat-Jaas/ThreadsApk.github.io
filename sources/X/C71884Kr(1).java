package X;

import android.app.Activity;

/* renamed from: X.4Kr  reason: invalid class name and case insensitive filesystem */
public final class C71884Kr implements C84214sk {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C84214sk A01;
    public final /* synthetic */ C695248y A02;

    public C71884Kr(Activity activity, C84214sk r2, C695248y r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void BwY() {
        this.A01.BwY();
    }

    public final void onCancel() {
        this.A01.onCancel();
    }

    public final void BrC(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        this.A02.A00(new AnonymousClass4LX(this.A00, this.A01, str, str2));
    }
}
