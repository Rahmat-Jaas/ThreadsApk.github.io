package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.0e2  reason: invalid class name and case insensitive filesystem */
public final class C08660e2 implements EventBuilder {
    public static final ThreadLocal A03 = new ThreadLocal();
    public AnonymousClass0WA A00;
    public C09350fH A01;
    public AnonymousClass01V A02;

    public final boolean isSampled() {
        return true;
    }

    public final void report() {
        AnonymousClass01V r4 = this.A02;
        C09350fH r3 = this.A01;
        AnonymousClass0WA r2 = this.A00;
        if (!(r4.A0n == null || r2 == null)) {
            r2.A0F = r4.currentMonotonicTimestampNanos();
        }
        if (r4.A0k.BVp(r3.A03)) {
            r4.A09.A0C(r4.A0R(), r3.A03);
        } else {
            r4.A0R().A03(r2, r3);
            r4.A0k(r3, true);
            if (!(r4.A0n == null || r2 == null)) {
                r4.A0n.A02(r2);
            }
        }
        this.A01 = null;
        this.A02 = null;
        A03.set(this);
    }

    public final EventBuilder setActionId(short s) {
        this.A01.A0O = s;
        return this;
    }

    public final EventBuilder setLevel(int i) {
        this.A01.A00 = i;
        return this;
    }

    public final EventBuilder annotate(String str, double d) {
        this.A01.A02(str, d);
        return this;
    }

    public final EventBuilder annotate(String str, int i) {
        this.A01.A03(str, i);
        return this;
    }

    public final EventBuilder annotate(String str, long j) {
        this.A01.A04(str, j);
        return this;
    }

    public final EventBuilder annotate(String str, String str2) {
        this.A01.A8X(str, str2);
        return this;
    }

    public final EventBuilder annotate(String str, boolean z) {
        this.A01.A05(str, z);
        return this;
    }

    public final EventBuilder annotate(String str, double[] dArr) {
        this.A01.A06(str, dArr);
        return this;
    }

    public final EventBuilder annotate(String str, int[] iArr) {
        this.A01.A07(str, iArr);
        return this;
    }

    public final EventBuilder annotate(String str, long[] jArr) {
        this.A01.A08(str, jArr);
        return this;
    }

    public final EventBuilder annotate(String str, String[] strArr) {
        this.A01.A09(str, strArr);
        return this;
    }

    public final EventBuilder annotate(String str, boolean[] zArr) {
        this.A01.A0A(str, zArr);
        return this;
    }
}
