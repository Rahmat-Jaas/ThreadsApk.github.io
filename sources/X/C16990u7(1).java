package X;

import java.util.Locale;
import java.util.Random;

/* renamed from: X.0u7  reason: invalid class name and case insensitive filesystem */
public final class C16990u7 {
    public int A00;
    public final int A01;
    public final int A02;
    public final Random A03 = new Random();

    public final String toString() {
        return String.format((Locale) null, "ParameterizedRetryState (%d,%d): multiplier:%d, interval:%d", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A02), -2, Integer.valueOf(this.A00)});
    }

    public C16990u7(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i;
    }
}
