package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.07y  reason: invalid class name */
public final class AnonymousClass07y implements C14140os {
    public final void CPs() {
        if (Systrace.A0F(34359738368L)) {
            Systrace.A04(34359738368L, "CLASS_LOAD_TRACE", 0);
            ClassTracingLogger.sSystraceEnabled = true;
            ClassTracingLogger.initialize();
        }
    }

    public final void CPu() {
        if (Systrace.A0F(34359738368L)) {
            ClassTracingLogger.sSystraceEnabled = false;
            ClassTracingLogger.initialize();
            Systrace.A06(34359738368L, "CLASS_LOAD_TRACE", 0);
        }
    }
}
