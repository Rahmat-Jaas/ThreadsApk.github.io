package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: X.4z6  reason: invalid class name */
public final class AnonymousClass4z6 extends Handler {
    public final /* synthetic */ C120907Db A00;

    public final void handleMessage(Message message) {
        try {
            if (AnonymousClass006.A00(1)[message.what].intValue() == 0 && ((MotionEvent) message.obj) != null) {
                SystemClock.elapsedRealtime();
                throw C18210wN.A0W("mContext");
            }
        } catch (Throwable th) {
            J5T.A00(th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4z6(Looper looper, C120907Db r2) {
        super(looper);
        this.A00 = r2;
    }
}
