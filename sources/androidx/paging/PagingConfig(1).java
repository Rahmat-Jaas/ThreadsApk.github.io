package androidx.paging;

import X.AnonymousClass00U;
import X.C18190wL;
import X.C86154wM;
import com.facebook.forker.Process;

public final class PagingConfig {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public /* synthetic */ PagingConfig(int i, int i2, int i3, boolean z, int i4, int i5) {
        int i6 = i4;
        int i7 = i;
        int i8 = (i5 & 2) != 0 ? i : i2;
        boolean A1Z = C86154wM.A1Z(i5 & 4, z);
        i3 = (i5 & 8) != 0 ? i * 3 : i3;
        i6 = (i5 & 16) != 0 ? Integer.MAX_VALUE : i6;
        int i9 = (i5 & 32) != 0 ? Process.WAIT_RESULT_TIMEOUT : 0;
        this.A03 = i;
        this.A04 = i8;
        this.A05 = A1Z;
        this.A00 = i3;
        this.A02 = i6;
        this.A01 = i9;
        if (!A1Z && i8 == 0) {
            throw C18190wL.A0a("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        } else if (i6 != Integer.MAX_VALUE && i6 < (i8 << 1) + i) {
            throw C18190wL.A0a(AnonymousClass00U.A0b("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", ", prefetchDist=", ", maxSize=", i7, i8, i6));
        } else if (i9 != Integer.MIN_VALUE) {
            throw C18190wL.A0a("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }
}
