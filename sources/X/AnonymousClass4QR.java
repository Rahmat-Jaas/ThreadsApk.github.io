package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4QR  reason: invalid class name */
public final class AnonymousClass4QR implements Runnable {
    public final /* synthetic */ C22871as A00;

    public AnonymousClass4QR(C22871as r1) {
        this.A00 = r1;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00.A00;
        if (fragmentActivity == null) {
            C04220Ms.A0E("activity");
            throw null;
        } else {
            fragmentActivity.onBackPressed();
        }
    }
}
