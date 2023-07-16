package X;

import java.util.Arrays;

/* renamed from: X.3H8  reason: invalid class name */
public final class AnonymousClass3H8 {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H8 r5 = (AnonymousClass3H8) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02.equals(r5.A02))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02});
    }

    public AnonymousClass3H8(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
