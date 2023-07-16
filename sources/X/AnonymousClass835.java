package X;

/* renamed from: X.835  reason: invalid class name */
public final class AnonymousClass835 implements Runnable {
    public final /* synthetic */ C1197276p A00;
    public final /* synthetic */ C105016ck A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Throwable A04;

    public AnonymousClass835(C1197276p r1, C105016ck r2, Object obj, String str, Throwable th) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = th;
    }

    public final void run() {
        AnonymousClass7EC A012;
        C105016ck r0 = this.A01;
        Object obj = this.A02;
        Throwable th = this.A04;
        C92925kF r2 = r0.A00;
        if (obj != null) {
            A012 = AnonymousClass7EC.A00(new C107446gl(obj, th));
        } else {
            A012 = AnonymousClass7EC.A01(th);
        }
        r2.A03.set(A012);
        r2.A01(A012);
    }
}
