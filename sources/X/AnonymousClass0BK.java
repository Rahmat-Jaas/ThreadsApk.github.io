package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0BK  reason: invalid class name */
public final class AnonymousClass0BK implements AnonymousClass0DH {
    public final QuickPerformanceLogger A00;
    public final long A01;
    public final Runnable A02 = new AnonymousClass0DN(this);
    public final ScheduledExecutorService A03;

    public final void Cd0(AnonymousClass0DJ r7, AnonymousClass0DM r8) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerStart(7209008);
        if (quickPerformanceLogger.isMarkerOn(7209008)) {
            quickPerformanceLogger.markerAnnotate(7209008, "CpuSpin", r8.toString());
            String str = r7.A03;
            quickPerformanceLogger.markerAnnotate(7209008, "is_backgrounded", AppStateModule.APP_STATE_BACKGROUND.equals(str));
            quickPerformanceLogger.markerAnnotate(7209008, "session_key", str);
            quickPerformanceLogger.markerAnnotate(7209008, "streak_count", r8.A04);
            quickPerformanceLogger.markerAnnotate(7209008, "process_triggered", r8.A07);
            quickPerformanceLogger.markerAnnotate(7209008, "process_pct_cpu", (int) r8.A01);
            String str2 = r8.A06;
            if (str2 != null) {
                quickPerformanceLogger.markerAnnotate(7209008, "thread1_name", str2);
                quickPerformanceLogger.markerAnnotate(7209008, "thread1_pct_cpu", (int) r8.A03);
            }
            String str3 = r8.A05;
            if (str3 != null) {
                quickPerformanceLogger.markerAnnotate(7209008, "thread2_name", str3);
                quickPerformanceLogger.markerAnnotate(7209008, "thread2_pct_cpu", (int) r8.A02);
            }
            this.A03.schedule(this.A02, this.A01, TimeUnit.MILLISECONDS);
        }
    }

    public AnonymousClass0BK(QuickPerformanceLogger quickPerformanceLogger, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A00 = quickPerformanceLogger;
        this.A03 = scheduledExecutorService;
        this.A01 = j;
    }
}
