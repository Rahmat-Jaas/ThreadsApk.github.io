package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* renamed from: X.0Vn  reason: invalid class name and case insensitive filesystem */
public final class C05730Vn extends Handler {
    public final /* synthetic */ SystemCounterThread A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05730Vn(Looper looper, SystemCounterThread systemCounterThread) {
        super(looper);
        this.A00 = systemCounterThread;
    }

    public final void handleMessage(Message message) {
        SystemCounterThread systemCounterThread = this.A00;
        int i = message.what;
        int i2 = message.arg1;
        synchronized (systemCounterThread) {
            try {
                if (systemCounterThread.mEnabled) {
                    if (i == 1) {
                        systemCounterThread.mSystemCounterLogger.A02();
                        systemCounterThread.logCounters();
                    } else if (i == 2) {
                        systemCounterThread.logHighFrequencyThreadCounters();
                    } else if (i == 3) {
                        systemCounterThread.logExpensiveCounters();
                    } else {
                        th = new IllegalArgumentException("Unknown message type");
                        throw th;
                    }
                    systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i, i2, 0), (long) i2);
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }
}
