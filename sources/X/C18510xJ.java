package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.0xJ  reason: invalid class name and case insensitive filesystem */
public final class C18510xJ extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18510xJ(Looper looper, Handler.Callback callback) {
        super(looper, new C64453kV(callback));
        C04220Ms.A0B(looper, 1);
        this.A00 = callback;
    }

    public final void A00(Message message) {
        C04220Ms.A0B(message, 0);
        if (C04220Ms.A0I(Looper.myLooper(), getLooper())) {
            this.A00.handleMessage(message);
        } else {
            sendMessageAtFrontOfQueue(message);
        }
    }
}
