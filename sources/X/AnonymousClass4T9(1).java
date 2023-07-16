package X;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: X.4T9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4T9 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Status A01;
    public final /* synthetic */ AnonymousClass3YF A02;
    public final /* synthetic */ C83634rj A03;
    public final /* synthetic */ AnonymousClass265 A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass4T9(Activity activity, Status status, AnonymousClass3YF r3, C83634rj r4, AnonymousClass265 r5, boolean z) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = z;
        this.A00 = activity;
        this.A01 = status;
    }

    public final void run() {
        AnonymousClass3YF r4 = this.A02;
        this.A03.CGo(new AnonymousClass4Dz(this.A00, this.A01, r4, this.A04, this.A05));
    }
}
