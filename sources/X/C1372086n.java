package X;

/* renamed from: X.86n  reason: invalid class name and case insensitive filesystem */
public final class C1372086n implements C148778sA {
    public final Object A00;
    public final ThreadLocal A01;
    public final C142578fF A02;

    public final C148848sH AOA(C142578fF r3) {
        if (C04220Ms.A0I(this.A02, r3)) {
            return this;
        }
        return null;
    }

    public final C142578fF Aqq() {
        return this.A02;
    }

    public final C27952Ew2 BgS(C142578fF r2) {
        C27952Ew2 ew2;
        if (C04220Ms.A0I(this.A02, r2)) {
            ew2 = AnonymousClass869.A00;
        } else {
            ew2 = this;
        }
        return ew2;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ThreadLocal(value=");
        A0s.append(this.A00);
        A0s.append(", threadLocal = ");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C1372086n(Object obj, ThreadLocal threadLocal) {
        this.A00 = obj;
        this.A01 = threadLocal;
        this.A02 = new AnonymousClass862(threadLocal);
    }

    public final Object ANL(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C27952Ew2 CWl(C27952Ew2 ew2) {
        return C25235DiG.A01(this, ew2);
    }
}
