package X;

import java.util.concurrent.Executor;

/* renamed from: X.7mF  reason: invalid class name and case insensitive filesystem */
public final class C129647mF implements C143868hR, C143888hT, C143898hU, C143908hV {
    public final C142238eQ A00;
    public final AnonymousClass7HU A01;
    public final Executor A02;

    public C129647mF(C142238eQ r1, AnonymousClass7HU r2, Executor executor) {
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
        this.A02.execute(new AnonymousClass81G(this, r3));
    }

    public final void onSuccess(Object obj) {
        this.A01.A0B(obj);
    }
}
