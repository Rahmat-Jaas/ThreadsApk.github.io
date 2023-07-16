package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.List;
import java.util.Map;

/* renamed from: X.3zy  reason: invalid class name and case insensitive filesystem */
public final class C67683zy implements C85764vj {
    public final AnonymousClass32M A00;
    public final C85764vj A01;

    public final boolean ATs(long j, boolean z) {
        return this.A01.ATs(A00(this, j), false);
    }

    public final int BID() {
        int i = 0;
        int i2 = 0;
        for (C67683zy r0 = this; r0 != null; r0 = (C67683zy) r0.A01) {
            i |= 1 << i2;
            i2 += 3;
            if (!(r0.A01 instanceof C67683zy)) {
                break;
            }
        }
        return i;
    }

    public static long A00(C67683zy r0, long j) {
        return C05360Tg.A01(r0.A00.A00, j);
    }

    public final void A5n(AnonymousClass0TG r2) {
        this.A01.A5n(r2);
    }

    public final boolean ATr(long j) {
        return this.A01.ATr(A00(this, j));
    }

    public final boolean ATv(AnonymousClass0TJ r4, long j) {
        return this.A01.ATv(r4, A00(this, j));
    }

    public final boolean ATw(AnonymousClass0TJ r4, long j, boolean z) {
        return this.A01.ATw(r4, A00(this, j), z);
    }

    public final double Adp(long j) {
        return this.A01.Adp(A00(this, j));
    }

    public final double Adu(AnonymousClass0TJ r7, double d, long j) {
        return this.A01.Adu(r7, d, A00(this, j));
    }

    public final double Adv(AnonymousClass0TJ r4, long j) {
        return this.A01.Adv(r4, A00(this, j));
    }

    public final Map AfP() {
        return this.A01.AfP();
    }

    public final String Asv(long j) {
        return this.A01.Asv(A00(this, j));
    }

    public final int Asz(long j) {
        return this.A01.Asz(A00(this, j));
    }

    public final long At2(long j) {
        return this.A01.At2(A00(this, j));
    }

    public final long At9(AnonymousClass0TJ r7, long j, long j2) {
        return this.A01.At9(r7, A00(this, j), j2);
    }

    public final long AtA(AnonymousClass0TJ r4, long j) {
        return this.A01.AtA(r4, A00(this, j));
    }

    public final long B7Z() {
        return this.A01.B7Z();
    }

    public final String BEN(long j) {
        return this.A01.BEN(A00(this, j));
    }

    public final String BET(AnonymousClass0TJ r4, long j) {
        return this.A01.BET(r4, A00(this, j));
    }

    public final String BEU(AnonymousClass0TJ r4, String str, long j) {
        return this.A01.BEU(r4, str, A00(this, j));
    }

    public final List BJO() {
        return this.A01.BJO();
    }

    public final void Bc7(long j) {
        this.A01.Bc7(A00(this, j));
    }

    public final void Bc8(AnonymousClass0TF r4, long j) {
        this.A01.Bc8(r4, A00(this, j));
    }

    public C67683zy(AnonymousClass32M r1, C85764vj r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final long At3(long j, long j2) {
        return this.A01.At3(A00(this, j), SandboxRepository.CACHE_TTL);
    }
}
