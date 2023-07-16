package X;

/* renamed from: X.7h0  reason: invalid class name and case insensitive filesystem */
public final class C127367h0 implements C41822MeD {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C41822MeD A06;
    public final M5L A07;
    public final Object A08;

    public C127367h0(C41822MeD meD, M5L m5l) {
        this(meD, m5l, (Object) null, meD.getWidth(), meD.getHeight(), meD.BMC(), meD.Aml(), 0, 0);
    }

    public final int AXU() {
        return 1;
    }

    public final int Azh() {
        return 0;
    }

    public final int Azi() {
        return 0;
    }

    public final int Azj() {
        return 0;
    }

    public final int Azk() {
        return 0;
    }

    public final int Aml() {
        return this.A03;
    }

    public final Object Are() {
        return this.A08;
    }

    public final M5L B6z() {
        return this.A07;
    }

    public final int BMC() {
        return this.A05;
    }

    public final int getHeight() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A04;
    }

    public final C41822MeD AXN(int i) {
        return this.A06;
    }

    public final int BMT(int i) {
        return this.A00;
    }

    public final int BMi(int i) {
        return this.A01;
    }

    public C127367h0(C41822MeD meD, M5L m5l, Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A07 = m5l;
        this.A06 = meD;
        this.A04 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A01 = i6;
        this.A08 = obj;
    }
}
