package X;

import android.os.SystemClock;

/* renamed from: X.0M4  reason: invalid class name */
public final class AnonymousClass0M4 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C07070aq A07;
    public boolean A08;
    public boolean A09;
    public final Object A0A;

    public final synchronized long A00() {
        long j;
        j = 0;
        if (!this.A09 && !this.A08) {
            j = SystemClock.uptimeMillis() - this.A01;
        }
        return j;
    }

    public AnonymousClass0M4(long j) {
        this.A05 = 0;
        this.A0A = new Object();
        this.A09 = true;
    }

    public AnonymousClass0M4() {
        this(0);
    }
}
