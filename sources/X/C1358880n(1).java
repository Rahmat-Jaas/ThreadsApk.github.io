package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.80n  reason: invalid class name and case insensitive filesystem */
public final class C1358880n implements Runnable {
    public final /* synthetic */ AnonymousClass7EY A00;
    public final /* synthetic */ boolean A01;

    public C1358880n(AnonymousClass7EY r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        AnonymousClass7EY r0 = this.A00;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        int hashCode = r0.A00.hashCode();
        Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p("parallel_downloads", Integer.valueOf(this.A01 ? 1 : 0)));
        if (AnonymousClass7JC.A01.containsKey(new KtCSuperShape0S0002000_I2(51511298, hashCode, 0))) {
            Iterator A0z = AnonymousClass0wJ.A0z(A0O);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                quickPerformanceLogger.markerAnnotate(51511298, hashCode, C18200wM.A0p(A0o), AnonymousClass0wJ.A04(A0o.getValue()));
            }
        }
    }
}
