package X;

import java.util.Arrays;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public final class C58633Gn {
    public long A00;
    public long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58633Gn r7 = (C58633Gn) obj;
            if (!(this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Long.valueOf(this.A01)});
    }
}
