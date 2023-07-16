package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.0gB  reason: invalid class name */
public final class AnonymousClass0gB implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        AnonymousClass0gN.A00().AKp((AnonymousClass0gG) message.obj);
        return true;
    }
}
