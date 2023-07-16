package X;

/* renamed from: X.7W2  reason: invalid class name */
public final class AnonymousClass7W2 implements C146498mL {
    public int A00;
    public final int A01;
    public final C146498mL A02;

    public final void AIY(Object obj) {
        this.A00++;
        this.A02.AIY(obj);
    }

    public final Object AbA() {
        return this.A02.AbA();
    }

    public final void BQW(int i, Object obj) {
        int i2;
        C146498mL r1 = this.A02;
        if (this.A00 == 0) {
            i2 = this.A01;
        } else {
            i2 = 0;
        }
        r1.BQW(i + i2, obj);
    }

    public final void BQd(int i, Object obj) {
        int i2;
        C146498mL r1 = this.A02;
        if (this.A00 == 0) {
            i2 = this.A01;
        } else {
            i2 = 0;
        }
        r1.BQd(i + i2, obj);
    }

    public final void Bgb(int i, int i2, int i3) {
        int i4;
        if (this.A00 == 0) {
            i4 = this.A01;
        } else {
            i4 = 0;
        }
        this.A02.Bgb(i + i4, i2 + i4, i3);
    }

    public final void CbJ(int i, int i2) {
        int i3;
        C146498mL r1 = this.A02;
        if (this.A00 == 0) {
            i3 = this.A01;
        } else {
            i3 = 0;
        }
        r1.CbJ(i + i3, i2);
    }

    public final void D8Y() {
        int i = this.A00;
        if (i > 0) {
            this.A00 = i - 1;
            this.A02.D8Y();
            return;
        }
        AnonymousClass7J4.A02("OffsetApplier up called with no corresponding down");
        throw null;
    }

    public final void clear() {
        AnonymousClass7J4.A02("Clear is not valid on OffsetApplier");
        throw null;
    }

    public AnonymousClass7W2(C146498mL r1, int i) {
        this.A02 = r1;
        this.A01 = i;
    }
}
