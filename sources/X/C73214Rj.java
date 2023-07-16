package X;

import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.4Rj  reason: invalid class name and case insensitive filesystem */
public final class C73214Rj implements Runnable {
    public final /* synthetic */ AnonymousClass099 A00;
    public final /* synthetic */ AnonymousClass1hB A01;

    public C73214Rj(AnonymousClass099 r1, AnonymousClass1hB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        BaseFragmentActivity baseFragmentActivity = this.A01.A00.A01;
        if (!baseFragmentActivity.isFinishing()) {
            this.A00.A0A(baseFragmentActivity.getSupportFragmentManager(), "feedbackDialog");
        }
    }
}
