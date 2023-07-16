package X;

/* renamed from: X.0va  reason: invalid class name and case insensitive filesystem */
public final class C17810va {
    public final C09740gb A00;
    public final C09740gb A01;
    public final C09740gb A02;
    public final C09740gb A03;
    public final C09740gb A04;
    public final boolean A05;

    public C17810va(AnonymousClass0v1 r4) {
        r4.getClass();
        C12760mR r2 = new C12760mR(r4);
        C12730mO r1 = C12730mO.A00;
        this.A05 = false;
        this.A04 = r2;
        this.A01 = r1;
        this.A00 = r1;
        this.A02 = r1;
        this.A03 = r1;
    }

    public C17810va(C12350lk r5, C13030mt r6) {
        C09740gb r0;
        C09740gb r3 = C12730mO.A00;
        C09740gb r2 = r3;
        r3 = !r5.equals(C12350lk.A00) ? new C12760mR(r5) : r3;
        if (C13030mt.A01.equals(r6)) {
            r0 = r2;
        } else {
            r0 = new C12760mR(r6);
        }
        this.A05 = true;
        this.A04 = r2;
        this.A01 = r2;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r0;
    }

    public C17810va(AnonymousClass0v1 r5, byte b) {
        r5.getClass();
        C12760mR r3 = new C12760mR(r5);
        C12730mO r2 = C12730mO.A00;
        Byte valueOf = Byte.valueOf(b);
        valueOf.getClass();
        C12760mR r1 = new C12760mR(valueOf);
        this.A05 = false;
        this.A04 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r2;
    }

    public C17810va(AnonymousClass0v1 r5, Exception exc) {
        r5.getClass();
        C12760mR r3 = new C12760mR(r5);
        C12760mR r2 = new C12760mR(exc);
        C12730mO r1 = C12730mO.A00;
        this.A05 = false;
        this.A04 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r1;
        this.A03 = r1;
    }
}
