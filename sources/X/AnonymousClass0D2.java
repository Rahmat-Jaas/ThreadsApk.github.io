package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder;

/* renamed from: X.0D2  reason: invalid class name */
public final class AnonymousClass0D2 extends AnonymousClass0e0 {
    public final String getName() {
        return "ig_dead_code";
    }

    public final C05830Wf getListenerMarkers() {
        if (ClassTracingLogger.sEnabled) {
            return new C05830Wf(new int[]{-1}, (int[]) null);
        }
        return C05830Wf.A05;
    }

    public final void onMarkerStart(C05800Wc r6) {
        int markerId = r6.getMarkerId();
        if (ClassTracingLogger.sNativeEnabled) {
            ClassTracingLoggerNativeHolder.classLoadStarted((String) null);
            ClassTracingLoggerNativeHolder.classLoaded((((long) markerId) << 32) | (((long) 1505373456) & 4294967295L));
        }
    }

    public final void onMarkerStop(C05800Wc r6) {
        int markerId = r6.getMarkerId();
        if (ClassTracingLogger.sNativeEnabled) {
            ClassTracingLoggerNativeHolder.classLoadStarted((String) null);
            ClassTracingLoggerNativeHolder.classLoaded((((long) markerId) << 32) | (((long) 1215735889) & 4294967295L));
        }
    }
}
