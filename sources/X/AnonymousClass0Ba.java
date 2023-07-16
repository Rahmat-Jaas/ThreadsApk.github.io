package X;

/* renamed from: X.0Ba  reason: invalid class name */
public final class AnonymousClass0Ba {
    public AnonymousClass0BV A00;
    public AnonymousClass0BV A01;
    public AnonymousClass0BV A02;
    public AnonymousClass0BV A03;
    public AnonymousClass0BV A04;
    public AnonymousClass0BV A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final AnonymousClass0AH A09;
    public final AnonymousClass0CG A0A;
    public final AnonymousClass0CG A0B;

    public final AnonymousClass0BV A00(long j) {
        if (j == -3) {
            throw new IllegalArgumentException("got unset latency for event when scheduling upload!");
        } else if (j == -2) {
            if (this.A09.AOB()) {
                AnonymousClass0BV r4 = this.A01;
                if (r4 != null) {
                    return r4;
                }
                AnonymousClass0CF ASj = this.A0A.ASj();
                AnonymousClass0BV r42 = new AnonymousClass0BV(ASj.A03, ASj.A01);
                this.A01 = r42;
                return r42;
            }
            AnonymousClass0BV r43 = this.A02;
            if (r43 != null) {
                return r43;
            }
            AnonymousClass0CF AjT = this.A0A.AjT();
            AnonymousClass0BV r44 = new AnonymousClass0BV(AjT.A03, AjT.A01);
            this.A02 = r44;
            return r44;
        } else if (j == -1) {
            if (this.A09.AOB()) {
                AnonymousClass0BV r45 = this.A03;
                if (r45 != null) {
                    return r45;
                }
                AnonymousClass0CF ASj2 = this.A0B.ASj();
                AnonymousClass0BV r46 = new AnonymousClass0BV(ASj2.A03, ASj2.A01);
                this.A03 = r46;
                return r46;
            }
            AnonymousClass0BV r47 = this.A04;
            if (r47 != null) {
                return r47;
            }
            AnonymousClass0CF AjT2 = this.A0B.AjT();
            AnonymousClass0BV r48 = new AnonymousClass0BV(AjT2.A03, AjT2.A01);
            this.A04 = r48;
            return r48;
        } else if (j == -4) {
            AnonymousClass0BV r49 = this.A05;
            if (r49 != null) {
                return r49;
            }
            long j2 = this.A08;
            AnonymousClass0BV r410 = new AnonymousClass0BV(j2, this.A07 * j2);
            this.A05 = r410;
            return r410;
        } else if (j != -5) {
            return new AnonymousClass0BV(j, this.A07 * j);
        } else {
            AnonymousClass0BV r411 = this.A00;
            if (r411 != null) {
                return r411;
            }
            long j3 = this.A06;
            AnonymousClass0BV r412 = new AnonymousClass0BV(j3, this.A07 * j3);
            this.A00 = r412;
            return r412;
        }
    }

    public AnonymousClass0Ba(AnonymousClass0AH r1, AnonymousClass0CG r2, AnonymousClass0CG r3, long j, long j2, long j3) {
        this.A09 = r1;
        this.A0B = r2;
        this.A0A = r3;
        this.A08 = j;
        this.A06 = j2;
        this.A07 = j3;
    }
}
