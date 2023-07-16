package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0nF  reason: invalid class name and case insensitive filesystem */
public final class C13210nF extends Handler {
    public final /* synthetic */ C12310lg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13210nF(Looper looper, C12310lg r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            C12310lg r2 = this.A00;
            r2.A03.set(false);
            C12310lg.A04.execute(new C12510m2(r2));
        }
    }
}
