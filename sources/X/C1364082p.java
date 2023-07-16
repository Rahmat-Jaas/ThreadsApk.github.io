package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82p  reason: invalid class name and case insensitive filesystem */
public final class C1364082p implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7AT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C1364082p(AnonymousClass7AT r1, String str, Map map, long j) {
        this.A02 = str;
        this.A01 = r1;
        this.A03 = map;
        this.A00 = j;
    }

    public final void run() {
        Map map = AnonymousClass7AT.A03;
        String str = this.A02;
        Number A0j = C86124wJ.A0j(str, map);
        AnonymousClass7JC r5 = AnonymousClass7JC.A00;
        AnonymousClass7AT r2 = this.A01;
        int hashCode = r2.A00.hashCode();
        int A002 = AnonymousClass7JC.A00(str, 906037831, hashCode);
        if (A0j == null || A002 < A0j.intValue()) {
            Map map2 = this.A03;
            if (map2 == null) {
                AnonymousClass7JC.A01(r2.A01, str, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
                return;
            }
            C91245ft r7 = new C91245ft(str, map2);
            r5.A04(r2.A01, r7, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
        }
    }
}
