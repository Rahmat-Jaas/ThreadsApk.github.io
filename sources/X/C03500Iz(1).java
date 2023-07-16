package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;

/* renamed from: X.0Iz  reason: invalid class name and case insensitive filesystem */
public final class C03500Iz implements C03760Kq {
    public final void ACt(String str) {
        C04220Ms.A0B(str, 0);
        ClassTracingLogger.beginClassLoad(str);
    }

    public final void ACr(Class cls, String str) {
        C04220Ms.A0A(cls);
        ClassTracingLogger.classLoaded(cls);
    }

    public final void ACs(String str) {
        ClassTracingLogger.classNotFound();
    }
}
