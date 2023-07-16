package X;

import java.nio.ByteBuffer;

/* renamed from: X.19j  reason: invalid class name and case insensitive filesystem */
public final class C211819j extends C211919k implements C07810cE {
    public final long[][] A00;

    public final void A5n(AnonymousClass0TG r1) {
    }

    public final double A03(double d, long j, boolean z) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return d;
        }
        return super.A03(d, A01, z);
    }

    public final long A04(long j, long j2, boolean z) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return j2;
        }
        return super.A04(A01, j2, z);
    }

    public final AnonymousClass0TO A05(long j) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return new AnonymousClass0TO(AnonymousClass0TN.DEFAULT__INVALID_CONFIG_PARAM_NAME);
        }
        return super.A05(A01);
    }

    public final String A06(String str, long j, boolean z) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return str;
        }
        return super.A06(str, A01, z);
    }

    public final boolean A07(long j, boolean z, boolean z2) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return z;
        }
        return super.A07(A01, z, z2);
    }

    public final String Asv(long j) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return null;
        }
        return super.Asv(A01);
    }

    public final int Asz(long j) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 == 0) {
            return 0;
        }
        return super.Asz(A01);
    }

    public final void Bc8(AnonymousClass0TF r6, long j) {
        long A01 = C05360Tg.A01(this.A00, j);
        if (A01 != 0) {
            super.Bc8(r6, A01);
        }
    }

    public C211819j(AnonymousClass3Iv r1, AnonymousClass0TK r2, C84594tV r3, ByteBuffer byteBuffer, long[][] jArr) {
        super(r1, r2, r3, byteBuffer);
        this.A00 = jArr;
    }
}
