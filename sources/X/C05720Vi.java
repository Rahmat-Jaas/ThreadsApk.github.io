package X;

import android.os.Process;
import android.util.Log;
import com.facebook.profilo.provider.stacktrace.CPUProfiler;
import com.facebook.profilo.provider.stacktrace.StackFrameThread;

/* renamed from: X.0Vi  reason: invalid class name and case insensitive filesystem */
public final class C05720Vi implements Runnable {
    public final /* synthetic */ StackFrameThread A00;

    public final void run() {
        Process.setThreadPriority(0);
        try {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeLoggerLoop();
            }
        } catch (Exception e) {
            Log.e("StackFrameThread", e.getMessage(), e);
        }
    }

    public C05720Vi(StackFrameThread stackFrameThread) {
        this.A00 = stackFrameThread;
    }
}
