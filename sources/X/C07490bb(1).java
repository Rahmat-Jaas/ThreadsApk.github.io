package X;

/* renamed from: X.0bb  reason: invalid class name and case insensitive filesystem */
public abstract class C07490bb {
    public final C05130Ra A00;

    public abstract String A09();

    public abstract void A0A();

    public final C05130Ra A03(Class cls) {
        C05130Ra r1 = this.A00;
        if (!cls.isInstance(r1)) {
            return null;
        }
        return r1;
    }

    public final C14100oo A04() {
        C07520be r0 = (C07520be) this.A00;
        C14090on r2 = r0.A00;
        if (r2 == null) {
            r2 = r0.A01();
            r0.A00 = r2;
        }
        return r2.ABJ(A09(), 817901561);
    }

    public final C14090on A05() {
        C07520be r1 = (C07520be) this.A00;
        C14090on r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        C14090on A01 = r1.A01();
        r1.A00 = A01;
        return A01;
    }

    public final void A06() {
        C07520be.A03.markerAnnotate(157825012, AnonymousClass00U.A0L(A09(), "_enabled"), true);
    }

    public final void A07(String str) {
        C07520be.A03.markerAnnotate(157825012, AnonymousClass00U.A0V(A09(), "_enabled_", str), true);
        A06();
    }

    public C07490bb(C05130Ra r1) {
        this.A00 = r1;
    }

    public final void A08(Throwable th) {
        C14100oo A04 = A04();
        A04.Ciu(th);
        A04.report();
    }
}
