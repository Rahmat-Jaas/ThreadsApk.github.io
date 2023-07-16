package kotlin;

import X.C04220Ms;
import com.facebook.forker.Process;

public final class UInt implements Comparable {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C04220Ms.A00(this.A00 ^ Process.WAIT_RESULT_TIMEOUT, ((UInt) obj).A00 ^ Process.WAIT_RESULT_TIMEOUT);
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof UInt) || i != ((UInt) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(((long) this.A00) & 4294967295L);
    }

    public /* synthetic */ UInt(int i) {
        this.A00 = i;
    }
}
