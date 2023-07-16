package X;

/* renamed from: X.8A7  reason: invalid class name */
public final class AnonymousClass8A7 extends C73694Tl {
    public int A00;
    public int A01;
    public final /* synthetic */ AnonymousClass8AG A02;

    public AnonymousClass8A7(AnonymousClass8AG r2) {
        this.A02 = r2;
        this.A00 = r2.size();
        this.A01 = r2.A01;
    }

    public final void A00() {
        int i = this.A00;
        if (i == 0) {
            this.A00 = AnonymousClass006.A0C;
            return;
        }
        AnonymousClass8AG r2 = this.A02;
        Object[] objArr = r2.A03;
        int i2 = this.A01;
        this.A01 = objArr[i2];
        this.A00 = AnonymousClass006.A00;
        this.A01 = (i2 + 1) % r2.A02;
        this.A00 = i - 1;
    }
}
