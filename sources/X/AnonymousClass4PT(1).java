package X;

import com.instagram.nux.activity.SignedOutFragmentActivity;

/* renamed from: X.4PT  reason: invalid class name */
public final class AnonymousClass4PT implements Runnable {
    public final /* synthetic */ C27471sZ A00;

    public AnonymousClass4PT(C27471sZ r1) {
        this.A00 = r1;
    }

    public final void run() {
        SignedOutFragmentActivity signedOutFragmentActivity = this.A00.A00;
        C18330wh r0 = signedOutFragmentActivity.A05;
        if (r0 == null) {
            return;
        }
        if (r0.getOwnerActivity() == null || !signedOutFragmentActivity.A05.getOwnerActivity().isDestroyed()) {
            signedOutFragmentActivity.A05.cancel();
        }
    }
}
