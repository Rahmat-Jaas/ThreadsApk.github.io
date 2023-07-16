package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.0lm  reason: invalid class name and case insensitive filesystem */
public final class C12370lm implements C14140os {
    public static QuickPerformanceLogger A00;

    static {
        C14220p1.A02(new C12370lm());
    }

    public final void CPs() {
        if (A00 != null && Systrace.A0F(4)) {
            A00.updateListenerMarkers();
        }
    }

    public final void CPu() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }
}
