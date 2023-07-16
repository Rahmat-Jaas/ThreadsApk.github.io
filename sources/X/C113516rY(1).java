package X;

/* renamed from: X.6rY  reason: invalid class name and case insensitive filesystem */
public abstract class C113516rY {
    public int A00 = C122127Kl.A00().A04();
    public C113516rY A01;

    public final C113516rY A01() {
        if (this instanceof AnonymousClass53S) {
            return new AnonymousClass53S(((AnonymousClass53S) this).A01);
        }
        if (this instanceof AnonymousClass53T) {
            return new AnonymousClass53T(((AnonymousClass53T) this).A01);
        }
        if (this instanceof AnonymousClass53R) {
            return new AnonymousClass53R(((AnonymousClass53R) this).A00);
        }
        return new AnonymousClass53U();
    }

    public final void A02(C113516rY r4) {
        Object obj;
        if (this instanceof AnonymousClass53S) {
            AnonymousClass53S r2 = (AnonymousClass53S) this;
            AnonymousClass53S r42 = (AnonymousClass53S) r4;
            obj = C102706Wf.A00;
            synchronized (obj) {
                r2.A01 = r42.A01;
                r2.A00 = r42.A00;
            }
        } else if (this instanceof AnonymousClass53T) {
            AnonymousClass53T r22 = (AnonymousClass53T) this;
            obj = C1187272a.A00;
            synchronized (obj) {
                AnonymousClass53T r43 = (AnonymousClass53T) r4;
                r22.A01 = r43.A01;
                r22.A00 = r43.A00;
            }
        } else if (this instanceof AnonymousClass53R) {
            ((AnonymousClass53R) this).A00 = ((AnonymousClass53R) r4).A00;
            return;
        } else {
            AnonymousClass53U r1 = (AnonymousClass53U) this;
            AnonymousClass53U r44 = (AnonymousClass53U) r4;
            r1.A01 = r44.A01;
            r1.A02 = r44.A02;
            r1.A00 = r44.A00;
            return;
        }
    }
}
