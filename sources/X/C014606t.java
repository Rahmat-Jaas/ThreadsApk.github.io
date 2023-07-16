package X;

import java.util.Arrays;

/* renamed from: X.06t  reason: invalid class name and case insensitive filesystem */
public final class C014606t {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C014606t)) {
                return false;
            }
            C014606t r7 = (C014606t) obj;
            if (!(this.A00 == r7.A00 && this.A03 == r7.A03 && this.A01 == r7.A01 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public C014606t(int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
