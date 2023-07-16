package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.7z9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135267z9 implements Runnable {
    public final /* synthetic */ C126067eW A00;

    public /* synthetic */ C135267z9(C126067eW r1) {
        this.A00 = r1;
    }

    public final void run() {
        C126067eW r4 = this.A00;
        long min = Math.min(r4.A05, C126067eW.A09);
        if (min < 0) {
            min = 0;
        }
        double min2 = Math.min(r4.A01, 10000.0d);
        double min3 = Math.min(r4.A00, 10000.0d);
        long min4 = Math.min(TimeUnit.NANOSECONDS.toMillis(r4.A03 - r4.A04), C126067eW.A0A);
        if (min4 < 0) {
            min4 = 0;
        }
        C145808l7 r2 = r4.A06;
        r2.CG7(new AnonymousClass5FG(min2, min3, r4.A02, min4, min));
        r2.Btu();
        r4.A05 = 0;
        r4.A01 = 0.0d;
        r4.A00 = 0.0d;
        r4.A02 = 0;
        r4.A04 = 0;
        r4.A03 = 0;
    }
}
