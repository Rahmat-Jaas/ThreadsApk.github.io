package X;

/* renamed from: X.7Tj  reason: invalid class name and case insensitive filesystem */
public final class C122667Tj implements C146448mG {
    public final long A00;
    public final C1203479u A01;
    public final C1203479u A02;
    public final C1203479u A03;
    public final C1203479u A04;
    public final AnonymousClass8cW A05;
    public final C146248lu A06;
    public final Object A07;
    public final Object A08;

    public C122667Tj(C142638fL r7, C1203479u r8, AnonymousClass8cW r9, Object obj, Object obj2) {
        C1203479u A002;
        AnonymousClass0wJ.A1M(r7, 1, r9);
        C146248lu DAN = r7.DAN(r9);
        C04220Ms.A0B(DAN, 1);
        this.A06 = DAN;
        this.A05 = r9;
        this.A07 = obj;
        this.A08 = obj2;
        C1203479u A003 = AnonymousClass7U0.A00(r9, obj);
        this.A02 = A003;
        C1203479u r3 = (C1203479u) ((AnonymousClass7U0) this.A05).A01.invoke(this.A08);
        this.A04 = r3;
        if (r8 != null) {
            A002 = AnonymousClass6DX.A00(r8);
        } else {
            C1203479u A004 = AnonymousClass7U0.A00(this.A05, obj);
            C04220Ms.A0B(A004, 0);
            A002 = C1203479u.A00(A004);
        }
        this.A03 = A002;
        this.A00 = DAN.AeN(A003, r3, A002);
        this.A01 = DAN.Afu(A003, r3, A002);
    }

    public final Object BKK(long j) {
        long j2 = j;
        if (BUF(j)) {
            return this.A08;
        }
        C1203479u BKM = this.A06.BKM(this.A02, this.A04, this.A03, j2);
        int i = 0;
        int A022 = BKM.A02();
        while (i < A022) {
            if (!Float.isNaN(BKM.A01(i))) {
                i++;
            } else {
                StringBuilder A0s = C18190wL.A0s("AnimationVector cannot contain a NaN. ");
                A0s.append(BKM);
                A0s.append(". Animation: ");
                A0s.append(this);
                A0s.append(", playTimeNanos: ");
                throw C18180wK.A0a(C86154wM.A0n(A0s, j));
            }
        }
        return ((AnonymousClass7U0) this.A05).A00.invoke(BKM);
    }

    public final C1203479u BKY(long j) {
        long j2 = j;
        if (!BUF(j)) {
            return this.A06.BKW(this.A02, this.A04, this.A03, j2);
        }
        return this.A01;
    }

    public final long AeL() {
        return this.A00;
    }

    public final Object BFi() {
        return this.A08;
    }

    public final AnonymousClass8cW BJ4() {
        return this.A05;
    }

    public final boolean BV1() {
        return this.A06.BV1();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TargetBasedAnimation: ");
        A0s.append(this.A07);
        A0s.append(" -> ");
        A0s.append(this.A08);
        A0s.append(",initial velocity: ");
        A0s.append(this.A03);
        A0s.append(I17.A00(332));
        A0s.append(AeL() / 1000000);
        A0s.append(" ms,animationSpec: ");
        return C18200wM.A0m(this.A06, A0s);
    }

    public final /* synthetic */ boolean BUF(long j) {
        return C86114wI.A1S((j > AeL() ? 1 : (j == AeL() ? 0 : -1)));
    }
}
