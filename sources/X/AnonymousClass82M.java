package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82M  reason: invalid class name */
public final class AnonymousClass82M implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7EY A01;
    public final /* synthetic */ Map A02;

    public AnonymousClass82M(AnonymousClass7EY r1, Map map, long j) {
        this.A01 = r1;
        this.A02 = map;
        this.A00 = j;
    }

    public final void run() {
        Number A0j = C86124wJ.A0j("interaction_#", AnonymousClass7EY.A04);
        AnonymousClass7JC r4 = AnonymousClass7JC.A00;
        AnonymousClass7EY r2 = this.A01;
        int hashCode = r2.A00.hashCode();
        int A002 = AnonymousClass7JC.A00("interaction_#", 51511298, hashCode);
        if (A0j == null || A002 < A0j.intValue()) {
            C91255fu r6 = new C91255fu(this.A02);
            r4.A04(r2.A01, r6, TimeUnit.NANOSECONDS, 51511298, hashCode, this.A00);
        }
    }
}
