package X;

/* renamed from: X.0aT  reason: invalid class name and case insensitive filesystem */
public final class C06850aT implements AnonymousClass0N6 {
    public static C06850aT A03;
    public int A00 = -1;
    public AnonymousClass0N6 A01;
    public final AnonymousClass0Q4 A02;

    public final void CCh(int i) {
        AnonymousClass0N6 r0 = this.A01;
        if (r0 != null) {
            r0.CCh(i);
        }
        this.A00 = i;
        C06040Xk r1 = this.A02.A03;
        C002801h.A02(r1, "Did you call SessionManager.init()?");
        r1.A05(i);
    }

    public C06850aT(AnonymousClass0N6 r2, AnonymousClass0Q4 r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
