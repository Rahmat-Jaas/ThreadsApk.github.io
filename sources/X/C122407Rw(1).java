package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Rw  reason: invalid class name and case insensitive filesystem */
public final class C122407Rw implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ C126067eW A00;

    public C122407Rw(C126067eW r1) {
        this.A00 = r1;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            C126067eW r8 = this.A00;
            r8.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            r8.A01 += Math.min(((double) metric) / ((double) 16666666), 1000.0d);
        }
        C126067eW r6 = this.A00;
        if (metric >= 66666664) {
            r6.A00 += Math.min(((double) metric) / ((double) 66666664), 1000.0d);
        }
        r6.A02 += i;
    }
}
