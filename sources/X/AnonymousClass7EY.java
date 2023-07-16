package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5001000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.7EY  reason: invalid class name */
public final class AnonymousClass7EY {
    public static final Map A04 = AnonymousClass4WJ.A0G(C18180wK.A0p("partially_enter_viewport", 1), C18180wK.A0p("fully_enter_viewport", 1));
    public final KtCSuperShape0S5001000_I2 A00;
    public final QuickPerformanceLogger A01;
    public final C110596lx A02;
    public final ExecutorService A03;

    public static final void A00(AnonymousClass7EY r6, String str, String str2) {
        AnonymousClass7EY r2 = r6;
        r2.A03.execute(new C1364182q(r2, str, str2, r6.A01.currentMonotonicTimestampNanos()));
    }

    public final void A01() {
        this.A03.execute(new C1359080p(this, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A02() {
        this.A03.execute(new C1359180q(this, this.A01.currentMonotonicTimestampNanos()));
    }

    public AnonymousClass7EY(KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2, QuickPerformanceLogger quickPerformanceLogger, C110596lx r3, ExecutorService executorService) {
        this.A00 = ktCSuperShape0S5001000_I2;
        this.A02 = r3;
        this.A01 = quickPerformanceLogger;
        this.A03 = executorService;
    }
}
