package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Jp  reason: invalid class name and case insensitive filesystem */
public final class C71644Jp implements C84204sj {
    public final /* synthetic */ AtomicInteger A00;

    public C71644Jp(AtomicInteger atomicInteger) {
        this.A00 = atomicInteger;
    }

    public final int ARb() {
        return this.A00.get();
    }

    public final void AHK(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, AnonymousClass269 r4, C61763Vg r5) {
        uSLEBaseShape0S0000000.A0T("retry_strategy", AnonymousClass2TS.A00(C67283zI.A00()));
        uSLEBaseShape0S0000000.A0S("attempt_count", C18230wP.A0f(this.A00.get()));
    }

    public final String B85() {
        return AnonymousClass2TS.A00(C67283zI.A00());
    }
}
