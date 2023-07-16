package X;

/* renamed from: X.44j  reason: invalid class name and case insensitive filesystem */
public final class C685744j implements C144568ii {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C04180Mo A01;
    public final /* synthetic */ Integer[] A02;

    public C685744j(AnonymousClass3HX r1, C04180Mo r2, Integer[] numArr) {
        this.A02 = numArr;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean DAZ(C127397h3 r4) {
        C82354pU r0;
        if (AnonymousClass8AP.A0E(Integer.valueOf(r4.A03), this.A02) && (r0 = (C82354pU) AnonymousClass7K7.A04(this.A00, r4)) != null) {
            C04180Mo r2 = this.A01;
            r2.A00 = r0.isScrolledToTop() & r2.A00;
        }
        return !this.A01.A00;
    }
}
