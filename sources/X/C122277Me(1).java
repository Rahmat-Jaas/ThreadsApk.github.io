package X;

import android.os.MessageQueue;

/* renamed from: X.7Me  reason: invalid class name and case insensitive filesystem */
public final class C122277Me implements MessageQueue.IdleHandler {
    public final /* synthetic */ C134457xj A00;

    public C122277Me(C134457xj r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        this.A00.A00();
        return false;
    }
}
