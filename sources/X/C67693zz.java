package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.3zz  reason: invalid class name and case insensitive filesystem */
public abstract class C67693zz implements C85764vj {
    public final AnonymousClass0TK A00;
    public final C84594tV A01;

    public abstract double A03(double d, long j, boolean z);

    public abstract long A04(long j, long j2, boolean z);

    public abstract AnonymousClass0TO A05(long j);

    public abstract String A06(String str, long j, boolean z);

    public abstract boolean A07(long j, boolean z, boolean z2);

    public synchronized void A5n(AnonymousClass0TG r2) {
        AnonymousClass0TX.A00((ExecutorService) null).A00(r2, this);
    }

    public final boolean ATs(long j, boolean z) {
        return ATw(AnonymousClass0TJ.A05, j, false);
    }

    public final double Adv(AnonymousClass0TJ r8, long j) {
        return Adu(r8, this.A01.Adq(j), j);
    }

    public abstract String Asv(long j);

    public abstract int Asz(long j);

    public final long AtA(AnonymousClass0TJ r8, long j) {
        return At9(r8, j, this.A01.At4(j));
    }

    public final int BID() {
        return 0;
    }

    public abstract void Bc8(AnonymousClass0TF r1, long j);

    public static void A02(AnonymousClass0TJ r2) {
        if (r2.A02) {
            r2.A00 = new AnonymousClass0TO(AnonymousClass0TN.OVERRIDE);
        }
    }

    public final boolean ATr(long j) {
        return ATv(AnonymousClass0TJ.A05, j);
    }

    public final boolean ATv(AnonymousClass0TJ r2, long j) {
        return ATw(r2, j, this.A01.ATq(j));
    }

    public final boolean ATw(AnonymousClass0TJ r3, long j, boolean z) {
        AnonymousClass0TK r1;
        if (!C67653zu.A0A || (r1 = this.A00) == null || !r1.hasBoolOverrideForParam(j)) {
            if (r3.A02) {
                AnonymousClass0TO A05 = A05(j);
                r3.A00 = A05;
                AnonymousClass0TN r12 = A05.A00;
                if (!(r12 == AnonymousClass0TN.SERVER || r12 == AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL)) {
                    return z;
                }
            }
            return A07(j, z, r3.A03);
        }
        A02(r3);
        return r1.boolOverrideForParam(j, z);
    }

    public final double Adp(long j) {
        return Adv(AnonymousClass0TJ.A05, j);
    }

    public final double Adu(AnonymousClass0TJ r9, double d, long j) {
        AnonymousClass0TK r1;
        double d2 = d;
        long j2 = j;
        if (!C67653zu.A0A || (r1 = this.A00) == null || !r1.hasDoubleOverrideForParam(j)) {
            if (r9.A02) {
                AnonymousClass0TO A05 = A05(j);
                r9.A00 = A05;
                AnonymousClass0TN r12 = A05.A00;
                if (!(r12 == AnonymousClass0TN.SERVER || r12 == AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL)) {
                    return d;
                }
            }
            return A03(d2, j2, r9.A03);
        }
        A02(r9);
        return r1.doubleOverrideForParam(j, d);
    }

    public final long At2(long j) {
        return AtA(AnonymousClass0TJ.A05, j);
    }

    public final long At9(AnonymousClass0TJ r9, long j, long j2) {
        AnonymousClass0TK r1;
        long j3 = j;
        long j4 = j2;
        if (!C67653zu.A0A || (r1 = this.A00) == null || !r1.hasIntOverrideForParam(j)) {
            if (r9.A02) {
                AnonymousClass0TO A05 = A05(j);
                r9.A00 = A05;
                AnonymousClass0TN r12 = A05.A00;
                if (!(r12 == AnonymousClass0TN.SERVER || r12 == AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL)) {
                    return j2;
                }
            }
            return A04(j3, j4, r9.A03);
        }
        A02(r9);
        return r1.intOverrideForParam(j, j2);
    }

    public final long B7Z() {
        if (!(this instanceof C211919k)) {
            return 0;
        }
        try {
            C211419b r5 = ((C211919k) this).A02;
            if (r5 == null) {
                return -1;
            }
            int A04 = r5.A04(36);
            if (A04 != 0) {
                return r5.A01.getLong(A04 + r5.A00);
            }
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            return -1;
        }
    }

    public final String BEN(long j) {
        return BET(AnonymousClass0TJ.A05, j);
    }

    public final String BET(AnonymousClass0TJ r2, long j) {
        return BEU(r2, this.A01.BEO(j), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1 != X.AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String BEU(X.AnonymousClass0TJ r3, java.lang.String r4, long r5) {
        /*
            r2 = this;
            boolean r0 = X.C67653zu.A0A
            if (r0 == 0) goto L_0x001e
            X.0TK r1 = r2.A00
            if (r1 == 0) goto L_0x001e
            boolean r0 = r1.hasStringOverrideForParam(r5)
            if (r0 == 0) goto L_0x001e
            A02(r3)
            java.lang.String r1 = r1.stringOverrideForParam(r5, r4)
            java.lang.String r0 = "__fbt_null__"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0039
            return r1
        L_0x001e:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0032
            X.0TO r0 = r2.A05(r5)
            r3.A00 = r0
            X.0TN r1 = r0.A00
            X.0TN r0 = X.AnonymousClass0TN.SERVER
            if (r1 == r0) goto L_0x0032
            X.0TN r0 = X.AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL
            if (r1 != r0) goto L_0x0039
        L_0x0032:
            boolean r0 = r3.A03
            java.lang.String r0 = r2.A06(r4, r5, r0)
            return r0
        L_0x0039:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67693zz.BEU(X.0TJ, java.lang.String, long):java.lang.String");
    }

    public final List BJO() {
        if (this instanceof C211919k) {
            return (List) ((C211919k) this).A03.get();
        }
        return AnonymousClass0wJ.A0v();
    }

    public final void Bc7(long j) {
        Bc8(AnonymousClass0TF.MANUAL_EXPOSURE, j);
    }

    public C67693zz(AnonymousClass0TK r1, C84594tV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final long At3(long j, long j2) {
        return At9(AnonymousClass0TJ.A05, j, SandboxRepository.CACHE_TTL);
    }
}
