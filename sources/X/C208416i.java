package X;

import java.util.Arrays;

/* renamed from: X.16i  reason: invalid class name and case insensitive filesystem */
public final class C208416i extends AnonymousClass0Sf {
    public int A00;
    public long A01;
    public C307622v A02;

    public C208416i(C307622v r2, int i, long j) {
        C04220Ms.A0B(r2, 3);
        this.A01 = j;
        this.A00 = i;
        this.A02 = r2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208416i)) {
            return false;
        }
        C208416i r7 = (C208416i) obj;
        return this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
