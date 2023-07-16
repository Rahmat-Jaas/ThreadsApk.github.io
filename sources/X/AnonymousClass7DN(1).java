package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.7DN  reason: invalid class name */
public final class AnonymousClass7DN {
    public static AnonymousClass7DN A01;
    public static final RootTelemetryConfiguration A02 = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration A00;

    public static synchronized AnonymousClass7DN A00() {
        AnonymousClass7DN r0;
        synchronized (AnonymousClass7DN.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new AnonymousClass7DN();
                A01 = r0;
            }
        }
        return r0;
    }
}
