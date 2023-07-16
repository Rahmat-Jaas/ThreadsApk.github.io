package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;

/* renamed from: X.77v  reason: invalid class name and case insensitive filesystem */
public final class C1199677v {
    public final QuickPerformanceLogger A00;
    public final boolean A01;
    public final Map A02;

    public static final int A00(C1199677v r0, AnonymousClass68S r1) {
        Number A0j = C86124wJ.A0j(r1, r0.A02);
        if (A0j != null) {
            return A0j.intValue();
        }
        return 1011495295;
    }

    public C1199677v(QuickPerformanceLogger quickPerformanceLogger, Map map, boolean z) {
        this.A00 = quickPerformanceLogger;
        this.A01 = z;
        this.A02 = map;
    }

    public final void A01(AnonymousClass68S r6, String str, String str2) {
        boolean A1V = C18210wN.A1V(str);
        int A002 = A00(this, r6);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        quickPerformanceLogger.markerAnnotate(A00(this, r6), A1V ? 1 : 0, TraceFieldType.FailureReason, str);
        if (str2 != null) {
            quickPerformanceLogger.markerAnnotate(A00(this, r6), (int) A1V, C18170wI.A00(364), str2);
        }
        quickPerformanceLogger.markerEnd(A002, A1V, 3);
    }
}
