package X;

import java.util.Locale;

/* renamed from: X.0r0  reason: invalid class name and case insensitive filesystem */
public final class C15250r0 implements C17000u8 {
    public int A00 = 0;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean BON(boolean z) {
        int i;
        int i2 = this.A00;
        if (z) {
            i = this.A01;
        } else {
            i = this.A02;
        }
        return i2 < i;
    }

    public final String toString() {
        return String.format((Locale) null, "BackToBackRetryStrategy: attempt:%d/%d/%d, delay:%d seconds", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03)});
    }

    public C15250r0(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final C17010u9 BEG() {
        return C17010u9.BACK_TO_BACK;
    }

    public final int Bhp(boolean z) {
        if (!BON(z)) {
            return -1;
        }
        this.A00++;
        return this.A03;
    }
}
