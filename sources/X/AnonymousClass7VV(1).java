package X;

/* renamed from: X.7VV  reason: invalid class name */
public final class AnonymousClass7VV implements C142768fY {
    public int A00;
    public C108506iT A01;
    public final AnonymousClass84X A02 = AnonymousClass84X.A01(new C108506iT[16]);

    public static final void A00(AnonymousClass7VV r3, int i) {
        if (i < 0 || i >= r3.A00) {
            throw C86114wI.A0a("Index ", ", size ", i, r3.A00);
        }
    }

    public final void A01(int i, Object obj) {
        if (i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("size should be >=0, but was ", i));
        } else if (i != 0) {
            int i2 = this.A00;
            C108506iT r1 = new C108506iT(i2, i, obj);
            this.A00 = i2 + i;
            this.A02.A0C(r1);
        }
    }

    public final C108506iT ANr(int i) {
        A00(this, i);
        C108506iT r0 = this.A01;
        if (r0 != null) {
            int i2 = r0.A01;
            if (i < r0.A00 + i2 && i2 <= i) {
                return r0;
            }
        }
        AnonymousClass84X r02 = this.A02;
        C108506iT r03 = (C108506iT) r02.A01[C97976Dr.A00(r02, i)];
        this.A01 = r03;
        return r03;
    }
}
