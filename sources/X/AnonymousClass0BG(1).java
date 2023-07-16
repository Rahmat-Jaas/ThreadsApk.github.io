package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import com.facebook.analytics2.logger.HighPriUploadRetryReceiver;

/* renamed from: X.0BG  reason: invalid class name */
public final class AnonymousClass0BG extends Thread {
    public final /* synthetic */ BroadcastReceiver.PendingResult A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ HighPriUploadRetryReceiver A03;

    public AnonymousClass0BG(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent, HighPriUploadRetryReceiver highPriUploadRetryReceiver) {
        this.A03 = highPriUploadRetryReceiver;
        this.A02 = intent;
        this.A01 = context;
        this.A00 = pendingResult;
    }

    public final void run() {
        try {
            Bundle extras = this.A02.getExtras();
            Context context = this.A01;
            AnonymousClass0CN A002 = AnonymousClass0CN.A00(context, extras);
            AnonymousClass0CP.A00(context).A05(new AnonymousClass0CN(context, (Bundle) null, (Messenger) null, A002.A06, new AnonymousClass0CJ(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", A002.A02), "com.facebook.analytics2.logger.UPLOAD_NOW");
            this.A00.finish();
        } catch (AnonymousClass0BI e) {
            AnonymousClass0LU.A0I("HighPriUploadRetryReceiver", "Exception when scheduling high pri upload via alarm", e);
        }
    }
}
