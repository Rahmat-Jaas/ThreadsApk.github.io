package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0dO  reason: invalid class name and case insensitive filesystem */
public final class C08430dO implements C03870Ld {
    public final /* synthetic */ C08440dP A00;

    public C08430dO(C08440dP r1) {
        this.A00 = r1;
    }

    public final void C05(long j) {
        long j2 = j;
        if (j > 0) {
            C08440dP r4 = this.A00;
            if (r4.A02.get() && r4.A0A != -1) {
                C03860Lc r5 = C03860Lc.A04;
                if (r5 == null) {
                    r5 = new C03860Lc();
                    C03860Lc.A04 = r5;
                }
                Runnable runnable = r4.A01;
                if (!r5.A03) {
                    Handler handler = r5.A00;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        r5.A00 = handler;
                    }
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, runnable));
                } else {
                    try {
                        r5.A02.invoke(r5.A01, new Object[]{3, runnable, null});
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                    }
                }
                long max = Math.max(1, j2);
                long round = Math.round((((double) max) * 1.0d) / ((double) r4.A0A)) - 1;
                r4.A08 = (int) (((long) r4.A08) + round);
                double d = (double) round;
                if (d >= 4.0d) {
                    r4.A07 += d / 4.0d;
                }
                r4.A09 += max;
                if (round >= 1) {
                    r4.A03().writeStandardEntry(6, 44, 0, 0, 8126498, 0, round);
                    r4.A08("ScrollPerf.FrameDropped");
                    if (d >= 4.0d) {
                        r4.A08("ScrollPerf.LargeFrameDropped");
                    }
                }
                r4.A08("ScrollPerf.FrameStarted");
            }
        }
    }
}
