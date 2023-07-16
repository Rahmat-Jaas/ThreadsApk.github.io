package X;

import android.os.Process;
import com.facebook.profilo.provider.perfevents.PerfEventsSession;

/* renamed from: X.0Vd  reason: invalid class name */
public final class AnonymousClass0Vd implements Runnable {
    public final /* synthetic */ PerfEventsSession A00;

    public final void run() {
        Process.setThreadPriority(5);
        PerfEventsSession.nativeRun(this.A00.mNativeHandle);
    }

    public AnonymousClass0Vd(PerfEventsSession perfEventsSession) {
        this.A00 = perfEventsSession;
    }
}
