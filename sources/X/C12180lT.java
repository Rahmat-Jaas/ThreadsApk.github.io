package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0lT  reason: invalid class name and case insensitive filesystem */
public final class C12180lT extends Handler {
    public final /* synthetic */ C12490m0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12180lT(Looper looper, C12490m0 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            C12490m0 r1 = this.A00;
            C12490m0.A01(r1, new C11600kT(r1));
            C12490m0.A01(r1, new C11470kG(r1));
        }
    }
}
