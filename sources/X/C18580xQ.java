package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0xQ  reason: invalid class name and case insensitive filesystem */
public final class C18580xQ extends Handler {
    public final /* synthetic */ C23201cg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18580xQ(Looper looper, C23201cg r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 1) {
            C23201cg.A01(this.A00);
        }
    }
}
