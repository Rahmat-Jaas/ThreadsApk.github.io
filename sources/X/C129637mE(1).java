package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mE  reason: invalid class name and case insensitive filesystem */
public final class C129637mE implements C143868hR, C143888hT, C143898hU, C143908hV {
    public final C143858hQ A00;
    public final AnonymousClass7HU A01;
    public final Executor A02;

    public C129637mE(C143858hQ r1, AnonymousClass7HU r2, Executor executor) {
        this.A02 = executor;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Bnw() {
        this.A01.A06();
    }

    public final void ByD(Exception exc) {
        this.A01.A0A(exc);
    }

    public final void DC3(AnonymousClass7HU r3) {
        this.A02.execute(new AnonymousClass81C(this, r3));
    }

    public final void onSuccess(Object obj) {
        this.A01.A0B(obj);
    }
}
