package X;

import com.facebook.battery.metrics.threadcpu.ThreadCpuMetricsCollector;
import com.facebook.redex.IDxComparatorShape93S0000000_I2;
import java.util.Comparator;

/* renamed from: X.0BW  reason: invalid class name */
public final class AnonymousClass0BW {
    public static final Comparator A07 = new IDxComparatorShape93S0000000_I2(2);
    public double A00;
    public double A01;
    public int A02;
    public long A03 = 0;
    public boolean A04 = false;
    public final AnonymousClass0DV A05;
    public final AnonymousClass0DV A06;

    public AnonymousClass0BW() {
        AnonymousClass09I r5 = new AnonymousClass09I();
        ThreadCpuMetricsCollector threadCpuMetricsCollector = new ThreadCpuMetricsCollector();
        this.A06 = new AnonymousClass0DV(new AnonymousClass07Z(), new AnonymousClass07Z(), new AnonymousClass07Z(), threadCpuMetricsCollector);
        this.A05 = new AnonymousClass0DV(new AnonymousClass09R(), new AnonymousClass09R(), new AnonymousClass09R(), r5);
    }
}
