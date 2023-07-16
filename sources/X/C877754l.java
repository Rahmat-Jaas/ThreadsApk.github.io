package X;

import android.graphics.Paint;

/* renamed from: X.54l  reason: invalid class name and case insensitive filesystem */
public final class C877754l extends AnonymousClass54T {
    public static final C146398mB A02;
    public C147768ps A00;
    public C147758pr A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C877754l(C147768ps r3, AnonymousClass7Y3 r4) {
        super(r4);
        C147758pr r32;
        C04220Ms.A0B(r3, 2);
        this.A00 = r3;
        if ((((AnonymousClass7YG) r3).A03.A01 & 512) == 0 || !(r3 instanceof C147758pr)) {
            r32 = null;
        } else {
            r32 = (C147758pr) r3;
        }
        this.A01 = r32;
    }

    static {
        AnonymousClass7X0 r2 = new AnonymousClass7X0();
        r2.CjA(AnonymousClass7KE.A02);
        Paint paint = r2.A01;
        paint.setStrokeWidth(1.0f);
        C86134wK.A12(paint);
        A02 = r2;
    }

    public final int Bf8(int i) {
        C147768ps r1 = this.A00;
        AnonymousClass54T r0 = this.A06;
        C04220Ms.A0A(r0);
        return r1.BfA(r0, this, i);
    }

    public final int BfB(int i) {
        C147768ps r1 = this.A00;
        AnonymousClass54T r0 = this.A06;
        C04220Ms.A0A(r0);
        return r1.BfD(r0, this, i);
    }

    public final int BgJ(int i) {
        C147768ps r1 = this.A00;
        AnonymousClass54T r0 = this.A06;
        C04220Ms.A0A(r0);
        return r1.BgL(r0, this, i);
    }

    public final int BgM(int i) {
        C147768ps r1 = this.A00;
        AnonymousClass54T r0 = this.A06;
        C04220Ms.A0A(r0);
        return r1.BgO(r0, this, i);
    }

    public final void A0E(AnonymousClass0YY r7, float f, long j) {
        super.A0E(r7, f, j);
        if (!this.A01) {
            A0Q();
            int A07 = C86104wH.A07(this.A02);
            AnonymousClass69J r0 = this.A0H.A0D;
            C146508mM r5 = C122067Jz.A01;
            int i = C122067Jz.A00;
            AnonymousClass69J r3 = C122067Jz.A03;
            C113976sU r2 = C122067Jz.A02;
            C122067Jz.A00 = A07;
            C122067Jz.A03 = r0;
            boolean A05 = C122067Jz.A05(this);
            A0G().CWh();
            this.A00 = A05;
            C122067Jz.A00 = i;
            C122067Jz.A03 = r3;
            C122067Jz.A01 = r5;
            C122067Jz.A02 = r2;
        }
    }

    public final void A0N() {
        AnonymousClass54S r0;
        super.A0N();
        C147768ps r2 = this.A00;
        if ((((AnonymousClass7YG) r2).A03.A01 & 512) == 0 || !(r2 instanceof C147758pr)) {
            this.A01 = null;
            if (this.A05 != null) {
                r0 = new AnonymousClass54R(this);
            } else {
                return;
            }
        } else {
            C147758pr r22 = (C147758pr) r2;
            this.A01 = r22;
            if (this.A05 != null) {
                r0 = new AnonymousClass54U(r22, this);
            } else {
                return;
            }
        }
        this.A05 = r0;
    }

    public final C123657Xy Bg4(long j) {
        A0D(j);
        C147768ps r1 = this.A00;
        AnonymousClass54T r0 = this.A06;
        C04220Ms.A0A(r0);
        A0U(r1.Bg3(r0, this, j));
        C146648mb r2 = this.A08;
        if (r2 != null) {
            r2.Ceg(this.A02);
        }
        A0P();
        return this;
    }
}
