package X;

import com.facebook.quicklog.EventBuilder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0kw  reason: invalid class name and case insensitive filesystem */
public final class C11870kw implements EventBuilder {
    public final int A00;
    public final int A01;
    public final String A02;
    public final ArrayList A03 = new ArrayList();
    public final C03250Fc A04;

    public final boolean isSampled() {
        return true;
    }

    public final void report() {
        C03250Fc.A01(this.A04, this, "", TimeUnit.MILLISECONDS, 14, 0, 0, 0);
    }

    public final EventBuilder setActionId(short s) {
        this.A03.add(new AnonymousClass0XI("", Short.valueOf(s), 1));
        return this;
    }

    public final EventBuilder setLevel(int i) {
        this.A03.add(new AnonymousClass0XI("", Integer.valueOf(i), 0));
        return this;
    }

    public C11870kw(C03250Fc r2, String str, int i, int i2) {
        this.A04 = r2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    public final EventBuilder annotate(String str, double d) {
        this.A03.add(new AnonymousClass0XI(str, Double.valueOf(d), 5));
        return this;
    }

    public final EventBuilder annotate(String str, int i) {
        this.A03.add(new AnonymousClass0XI(str, Integer.valueOf(i), 3));
        return this;
    }

    public final EventBuilder annotate(String str, long j) {
        this.A03.add(new AnonymousClass0XI(str, Long.valueOf(j), 4));
        return this;
    }

    public final EventBuilder annotate(String str, String str2) {
        this.A03.add(new AnonymousClass0XI(str, str2, 2));
        return this;
    }

    public final EventBuilder annotate(String str, boolean z) {
        this.A03.add(new AnonymousClass0XI(str, Boolean.valueOf(z), 6));
        return this;
    }

    public final EventBuilder annotate(String str, double[] dArr) {
        this.A03.add(new AnonymousClass0XI(str, dArr, 10));
        return this;
    }

    public final EventBuilder annotate(String str, int[] iArr) {
        this.A03.add(new AnonymousClass0XI(str, iArr, 8));
        return this;
    }

    public final EventBuilder annotate(String str, long[] jArr) {
        this.A03.add(new AnonymousClass0XI(str, jArr, 9));
        return this;
    }

    public final EventBuilder annotate(String str, String[] strArr) {
        this.A03.add(new AnonymousClass0XI(str, strArr, 7));
        return this;
    }

    public final EventBuilder annotate(String str, boolean[] zArr) {
        this.A03.add(new AnonymousClass0XI(str, zArr, 11));
        return this;
    }
}
