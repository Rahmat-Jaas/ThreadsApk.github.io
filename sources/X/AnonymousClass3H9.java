package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.3H9  reason: invalid class name */
public final class AnonymousClass3H9 {
    public final long A00;
    public final String A01;
    public final Set A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H9 r7 = (AnonymousClass3H9) obj;
            if (this.A00 != r7.A00 || !C35322Mz.A00(this.A01, r7.A01) || !C35322Mz.A00(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01, this.A02});
    }

    public AnonymousClass3H9(String str, Set set, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = set;
    }
}
