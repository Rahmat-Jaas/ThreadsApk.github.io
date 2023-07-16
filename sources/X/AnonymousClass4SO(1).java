package X;

import android.app.Activity;

/* renamed from: X.4SO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4SO implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C82664q4 A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ AnonymousClass4SO(Activity activity, C82664q4 r2, Object obj) {
        this.A00 = activity;
        this.A01 = r2;
        this.A02 = obj;
    }

    public final void run() {
        Activity activity = this.A00;
        C82664q4 r2 = this.A01;
        Object obj = this.A02;
        if (!activity.isFinishing()) {
            r2.BrJ(obj);
        }
    }
}
