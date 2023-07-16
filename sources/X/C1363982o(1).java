package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.82o  reason: invalid class name and case insensitive filesystem */
public final class C1363982o implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass7AT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C1363982o(AnonymousClass7AT r1, String str, String str2, long j) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = str2;
        this.A00 = j;
    }

    public final void run() {
        Map map = AnonymousClass7AT.A03;
        String str = this.A03;
        Number A0j = C86124wJ.A0j(str, map);
        AnonymousClass7AT r2 = this.A01;
        int hashCode = r2.A00.hashCode();
        int A002 = AnonymousClass7JC.A00(str, 906037831, hashCode);
        if (A0j == null || A002 < A0j.intValue()) {
            String str2 = this.A02;
            if (str2 == null) {
                String str3 = str;
                AnonymousClass7JC.A01(r2.A01, str3, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
                return;
            }
            QuickPerformanceLogger quickPerformanceLogger = r2.A01;
            long j = this.A00;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            AnonymousClass0wJ.A1R(str, str2);
            Map map2 = (Map) AnonymousClass7JC.A01.get(new KtCSuperShape0S0002000_I2(906037831, hashCode, 0));
            if (map2 != null) {
                C86154wM.A1T(str, map2, C18210wN.A03(C86124wJ.A0j(str, map2)) + 1);
                quickPerformanceLogger.markerPoint(906037831, hashCode, str, str2, j, timeUnit);
            }
        }
    }
}
