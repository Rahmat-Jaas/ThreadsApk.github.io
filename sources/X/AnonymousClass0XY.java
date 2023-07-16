package X;

import com.facebook.analytics.memory.AddressSpace;

/* renamed from: X.0XY  reason: invalid class name */
public final class AnonymousClass0XY implements C04050Mb {
    public final boolean A00;

    public AnonymousClass0XY(boolean z) {
        this.A00 = z;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0X;
    }

    public final void CWp(C04170Mn r8, AnonymousClass0ND r9) {
        AnonymousClass09o.A00();
        AnonymousClass0OO r2 = AnonymousClass0MU.A2v;
        long[] jArr = AnonymousClass09o.A01;
        r8.A02(r2, Long.valueOf(jArr[0]));
        r8.A02(AnonymousClass0MU.A2s, Long.valueOf(jArr[1]));
        r8.A02(AnonymousClass0MU.A2q, Long.valueOf(jArr[3]));
        r8.A02(AnonymousClass0MU.A2p, Long.valueOf(jArr[6]));
        r8.A02(AnonymousClass0MU.A2t, Long.valueOf(jArr[8] + jArr[9] + jArr[10] + jArr[11]));
        r8.A02(AnonymousClass0MU.A2r, Long.valueOf(jArr[2] + jArr[4] + jArr[5] + jArr[12]));
        r8.A02(AnonymousClass0MU.A2u, Long.valueOf(jArr[7]));
        if (this.A00) {
            r8.A01(AnonymousClass0MU.A1d, AddressSpace.getLargestChunkKb());
        }
        Runtime runtime = Runtime.getRuntime();
        r8.A02(AnonymousClass0MU.A1b, Long.valueOf(runtime.maxMemory()));
        r8.A02(AnonymousClass0MU.A1c, Long.valueOf(runtime.totalMemory()));
        r8.A02(AnonymousClass0MU.A1a, Long.valueOf(runtime.freeMemory()));
        if (!C020409m.A00) {
            int[] iArr = {8192};
            long[] jArr2 = new long[1];
            if (C03620Ka.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                long j = jArr2[0];
                if (C03620Ka.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                    long j2 = jArr2[0];
                    r8.A02(AnonymousClass0MU.A20, Long.valueOf(j));
                    r8.A02(AnonymousClass0MU.A1z, Long.valueOf(j2));
                    return;
                }
            }
            C020409m.A00 = true;
        }
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
