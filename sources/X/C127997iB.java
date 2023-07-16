package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Random;

/* renamed from: X.7iB  reason: invalid class name and case insensitive filesystem */
public final class C127997iB implements C14090on {
    public int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final Random A02;

    public final C14100oo ABJ(String str, int i) {
        return ABL(false, str, i, 0);
    }

    public final C14100oo ABK(Boolean bool, String str, int i) {
        return ABL(bool, str, i, 0);
    }

    public final C14100oo ABL(Boolean bool, String str, int i, int i2) {
        return new C127987iA(this.A01, str, i, this.A00, i2, C18180wK.A1V(this.A02.nextInt() % 1), bool.booleanValue());
    }

    public C127997iB(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Random random, int i) {
        this.A01 = lightweightQuickPerformanceLogger;
        this.A02 = random;
        this.A00 = i;
    }
}
