package X;

import java.util.Map;

/* renamed from: X.54S  reason: invalid class name */
public abstract class AnonymousClass54S extends AnonymousClass54K implements C147578pZ {
    public long A00 = C121127Eg.A01;
    public C146098ld A01;
    public final AnonymousClass7XU A02 = new AnonymousClass7XU(this);
    public final AnonymousClass54T A03;
    public final Map A04 = C18220wO.A0y();

    public final void A0E(AnonymousClass0YY r7, float f, long j) {
        if (this.A00 != j) {
            this.A00 = j;
            AnonymousClass54K.A00(this.A03);
        }
        if (!this.A01) {
            int width = A0G().getWidth();
            AnonymousClass69J r0 = this.A03.A0H.A0D;
            C146508mM r5 = C122067Jz.A01;
            int i = C122067Jz.A00;
            AnonymousClass69J r3 = C122067Jz.A03;
            C113976sU r2 = C122067Jz.A02;
            C122067Jz.A00 = width;
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

    public final float Acr() {
        return this.A03.Acr();
    }

    public final float AjK() {
        return this.A03.AjK();
    }

    public final int Bf8(int i) {
        if (!(this instanceof AnonymousClass54R)) {
            return C123657Xy.A09(this.A03).Bf8(i);
        }
        AnonymousClass54R r2 = (AnonymousClass54R) this;
        C877754l r0 = r2.A00;
        return r0.A00.BfA(C123657Xy.A09(r0), r2, i);
    }

    public final int BfB(int i) {
        if (!(this instanceof AnonymousClass54R)) {
            return C123657Xy.A09(this.A03).BfB(i);
        }
        AnonymousClass54R r2 = (AnonymousClass54R) this;
        C877754l r0 = r2.A00;
        return r0.A00.BfD(C123657Xy.A09(r0), r2, i);
    }

    public final int BgJ(int i) {
        if (!(this instanceof AnonymousClass54R)) {
            return C123657Xy.A09(this.A03).BgJ(i);
        }
        AnonymousClass54R r2 = (AnonymousClass54R) this;
        C877754l r0 = r2.A00;
        return r0.A00.BgL(C123657Xy.A09(r0), r2, i);
    }

    public final int BgM(int i) {
        if (!(this instanceof AnonymousClass54R)) {
            return C123657Xy.A09(this.A03).BgM(i);
        }
        AnonymousClass54R r2 = (AnonymousClass54R) this;
        C877754l r0 = r2.A00;
        return r0.A00.BgO(C123657Xy.A09(r0), r2, i);
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A03.A0H.A0D;
    }

    public AnonymousClass54S(AnonymousClass54T r3) {
        this.A03 = r3;
    }
}
