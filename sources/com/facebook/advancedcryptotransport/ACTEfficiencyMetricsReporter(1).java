package com.facebook.advancedcryptotransport;

import X.AnonymousClass0DR;
import X.C02170Ac;

public class ACTEfficiencyMetricsReporter {
    public static void addBytesReadCount(int i) {
        AnonymousClass0DR r7 = AnonymousClass0DR.A01;
        long j = (long) i;
        synchronized (r7) {
            C02170Ac r4 = r7.A00;
            r4.A07 += j;
            r4.A08++;
            long now = AnonymousClass0DR.A03.now();
            AnonymousClass0DR.A02.A00(now - 5, now);
        }
    }

    public static void addBytesWrittenCount(int i) {
        AnonymousClass0DR r7 = AnonymousClass0DR.A01;
        long j = (long) i;
        synchronized (r7) {
            C02170Ac r4 = r7.A00;
            r4.A09 += j;
            r4.A0A++;
            long now = AnonymousClass0DR.A03.now();
            AnonymousClass0DR.A02.A00(now - 5, now);
        }
    }
}
