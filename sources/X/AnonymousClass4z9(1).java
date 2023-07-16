package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;

/* renamed from: X.4z9  reason: invalid class name */
public final class AnonymousClass4z9 extends Handler {
    public final /* synthetic */ C127887hs A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4z9(Looper looper, C127887hs r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 99) {
            C127887hs.A01(this.A00);
        } else if (i == 100) {
            C127887hs.A00((C143478go) null, this.A00, (Executor) null);
        } else {
            throw C18250wR.A0V(AnonymousClass00U.A0J("Unknown message: ", i));
        }
    }
}
