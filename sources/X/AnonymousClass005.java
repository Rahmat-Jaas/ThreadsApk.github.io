package X;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: X.005  reason: invalid class name */
public final class AnonymousClass005 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentSender.SendIntentException A01;
    public final /* synthetic */ AnonymousClass098 A02;

    public AnonymousClass005(IntentSender.SendIntentException sendIntentException, AnonymousClass098 r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = sendIntentException;
    }

    public final void run() {
        this.A02.A05(new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.A01), this.A00, 0);
    }
}
