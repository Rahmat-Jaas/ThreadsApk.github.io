package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;

/* renamed from: X.0IL  reason: invalid class name */
public final class AnonymousClass0IL {
    public static AnonymousClass08Z A00;
    public static boolean A01;
    public static boolean A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static String A0A;

    public static void A00() {
        C06180Xz r3 = C04520Nz.A00;
        if (r3 != null) {
            boolean z = A01;
            if (A02) {
                z |= true;
            }
            if (A03) {
                z |= true;
            }
            if (A07) {
                z |= true;
            }
            if (A04) {
                z |= true;
            }
            if (A09) {
                z |= true;
            }
            if (A06) {
                z |= true;
            }
            if (A08) {
                z |= true;
            }
            if (A05) {
                z |= true;
            }
            String valueOf = String.valueOf(z ? 1 : 0);
            if (!valueOf.equals(A0A)) {
                A0A = valueOf;
                r3.A00(AnonymousClass0MU.A6V, AnonymousClass0ND.CRITICAL_REPORT, valueOf);
            }
        }
    }

    public static synchronized void A01(int i, String str) {
        synchronized (AnonymousClass0IL.class) {
            AnonymousClass08Z r0 = A00;
            if (r0 != null) {
                EventBuilder markEventBuilder = r0.A00.markEventBuilder(21375349, "native_provider");
                if (markEventBuilder.isSampled()) {
                    markEventBuilder.annotate(TraceFieldType.ErrorCode, i);
                    if (str != null) {
                        markEventBuilder.annotate("error_message", str);
                    }
                    markEventBuilder.report();
                }
            }
            A09 = false;
            A06 = false;
            A00();
        }
    }
}
