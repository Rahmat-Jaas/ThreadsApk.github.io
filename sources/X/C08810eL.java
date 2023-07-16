package X;

/* renamed from: X.0eL  reason: invalid class name and case insensitive filesystem */
public final class C08810eL {
    public long A00;
    public long A01 = -1;
    public float A02;

    public final long A00(long j) {
        long j2 = this.A01;
        if (j2 != -1) {
            return (this.A00 + j) - j2;
        }
        return this.A00;
    }

    public final boolean A01(float f, long j) {
        float f2 = this.A02;
        if (f >= f2 && this.A01 == -1) {
            this.A01 = j;
            return true;
        } else if (f >= f2) {
            return false;
        } else {
            long j2 = this.A01;
            if (j2 == -1) {
                return false;
            }
            this.A00 += j - j2;
            this.A01 = -1;
            return true;
        }
    }

    public final boolean A02(long j) {
        long j2 = this.A01;
        if (j2 == -1) {
            return false;
        }
        this.A00 += j - j2;
        this.A01 = -1;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r3 > 1.0f) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C08810eL(float r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A01 = r0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0013
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.AnonymousClass7Ko.A0B(r0)
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08810eL.<init>(float):void");
    }

    public C08810eL(C08810eL r3) {
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A00 = r3.A00;
    }
}
