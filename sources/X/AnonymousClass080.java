package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite;
import com.facebook.systrace.Systrace;

/* renamed from: X.080  reason: invalid class name */
public final class AnonymousClass080 implements C14140os {
    public final void CPs() {
        if (Systrace.A0F(34359738368L)) {
            Systrace.A04(34359738368L, "CLASS_LOAD_TRACE", 0);
            ClassTracingLoggerLite.A02 = true;
            boolean z = false;
            if (ClassTracingLoggerLite.A02) {
                z = true;
            }
            ClassTracingLoggerLite.A01 = z;
        }
    }

    public final void CPu() {
        if (Systrace.A0F(34359738368L)) {
            ClassTracingLoggerLite.A02 = false;
            boolean z = false;
            if (ClassTracingLoggerLite.A02) {
                z = true;
            }
            ClassTracingLoggerLite.A01 = z;
            Systrace.A06(34359738368L, "CLASS_LOAD_TRACE", 0);
        }
    }
}
