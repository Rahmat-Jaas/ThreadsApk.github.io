package X;

/* renamed from: X.7Xy  reason: invalid class name and case insensitive filesystem */
public abstract class C123657Xy implements C142968ft {
    public int A00;
    public int A01;
    public long A02 = AnonymousClass7FV.A00(0, 0);
    public long A03 = AnonymousClass6ZQ.A00;

    public abstract void A0E(AnonymousClass0YY r1, float f, long j);

    public static final /* synthetic */ long A08(C123657Xy r5) {
        int i = r5.A01;
        long j = r5.A02;
        return AnonymousClass7Hh.A00((i - C86104wH.A07(j)) >> 1, (r5.A00 - C86104wH.A08(j)) >> 1);
    }

    public static AnonymousClass54S A09(AnonymousClass54T r0) {
        AnonymousClass54T r02 = r0.A06;
        C04220Ms.A0A(r02);
        AnonymousClass54S r03 = r02.A05;
        C04220Ms.A0A(r03);
        return r03;
    }

    public final int A0A() {
        if (this instanceof AnonymousClass54J) {
            return ((AnonymousClass54J) this).A0B.A07.A0a.A04.A0A();
        }
        if (!(this instanceof AnonymousClass54I)) {
            return C86104wH.A08(this.A02);
        }
        throw new NullPointerException("layoutNode");
    }

    public final int A0B() {
        if (this instanceof AnonymousClass54J) {
            return ((AnonymousClass54J) this).A0B.A07.A0a.A04.A0B();
        }
        if (!(this instanceof AnonymousClass54I)) {
            return C86104wH.A07(this.A02);
        }
        throw new NullPointerException("layoutNode");
    }

    public final void A0C(long j) {
        if (this.A02 != j) {
            this.A02 = j;
            int A07 = C86104wH.A07(j);
            long j2 = this.A03;
            this.A01 = AnonymousClass8bI.A04(j2, A07);
            this.A00 = AnonymousClass8bI.A03(j2, C86104wH.A08(j));
        }
    }

    public final void A0D(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            long j2 = this.A02;
            int A07 = C86104wH.A07(j2);
            long j3 = this.A03;
            this.A01 = AnonymousClass8bI.A04(j3, A07);
            this.A00 = AnonymousClass8bI.A03(j3, C86104wH.A08(j2));
        }
    }

    public final /* synthetic */ Object B01() {
        if (this instanceof AnonymousClass54T) {
            AnonymousClass54T r0 = (AnonymousClass54T) this;
            Object obj = null;
            AnonymousClass7YG A0L = r0.A0L();
            AnonymousClass7Y3 r3 = r0.A0H;
            AnonymousClass7IW r2 = r3.A0a;
            if ((r2.A02.A00 & 64) == 0) {
                return null;
            }
            C147168nV r32 = r3.A0C;
            for (AnonymousClass7YG r22 = r2.A05; r22 != null; r22 = r22.A04) {
                if (!(r22 == A0L || (r22.A01 & 64) == 0 || !(r22 instanceof C147718pn))) {
                    obj = ((C147718pn) r22).BgW(r32, obj);
                }
            }
            return obj;
        } else if (this instanceof AnonymousClass54S) {
            return ((AnonymousClass54S) this).A03.B01();
        } else {
            if (this instanceof AnonymousClass54J) {
                return ((AnonymousClass54J) this).A02;
            }
            return null;
        }
    }
}
