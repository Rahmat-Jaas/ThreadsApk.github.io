package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.5ps  reason: invalid class name */
public final class AnonymousClass5ps extends C86854zE {
    public final /* synthetic */ C93285lJ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5ps(Looper looper, C93285lJ r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C93285lJ r2 = this.A00;
            Lock lock = r2.A0H;
            lock.lock();
            try {
                if (r2.A09()) {
                    C93285lJ.A00(r2);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", C86104wH.A10("Unknown message id: ", C86114wI.A0s(31), i));
        } else {
            C93285lJ.A01(this.A00);
        }
    }
}
