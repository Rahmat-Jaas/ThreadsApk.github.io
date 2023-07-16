package X;

import java.util.Locale;
import java.util.Random;

/* renamed from: X.0r1  reason: invalid class name and case insensitive filesystem */
public final class C15260r1 implements C17000u8 {
    public int A00;
    public int A01 = 0;
    public final int A02;
    public final int A03;
    public final Random A04 = new Random();

    public final boolean BON(boolean z) {
        if (this.A01 < Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final int Bhp(boolean z) {
        int i;
        this.A01++;
        int i2 = this.A00;
        if (!z && i2 < (i = this.A02)) {
            i2 = i;
        }
        int nextFloat = (int) ((((double) this.A04.nextFloat()) + 0.5d) * ((double) Math.min(i2 << 1, this.A03)));
        this.A00 = nextFloat;
        return nextFloat;
    }

    public final String toString() {
        return String.format((Locale) null, "BackoffRetryStrategy: attempt:%d/Infinite, delay:%d seconds", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public C15260r1(int i, int i2, int i3) {
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i;
    }

    public final C17010u9 BEG() {
        return C17010u9.BACK_OFF;
    }
}
