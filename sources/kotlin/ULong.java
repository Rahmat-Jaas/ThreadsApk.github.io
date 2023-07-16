package kotlin;

import X.AnonymousClass7G2;
import X.C18190wL;

public final class ULong implements Comparable {
    public final long A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = ((ULong) obj).A00;
        long j2 = this.A00 ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        if (j2 == j3) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof ULong) || j != ((ULong) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return AnonymousClass7G2.A03(this.A00);
    }

    public /* synthetic */ ULong(long j) {
        this.A00 = j;
    }
}
