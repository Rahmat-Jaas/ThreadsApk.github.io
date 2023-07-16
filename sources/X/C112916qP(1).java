package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6qP  reason: invalid class name and case insensitive filesystem */
public final class C112916qP {
    public final C109326jp A00;
    public final C109326jp A01;
    public final C109326jp A02;
    public final C109326jp A03;
    public final WeakReference A04;
    public final WeakReference A05;

    public final void A00(boolean z, boolean z2) {
        C109326jp r2;
        C127397h3 r4 = (C127397h3) this.A05.get();
        AnonymousClass3HX r3 = (AnonymousClass3HX) this.A04.get();
        if (z) {
            if (z2) {
                r2 = this.A01;
            } else {
                r2 = this.A00;
            }
        } else if (z2) {
            r2 = this.A03;
        } else {
            r2 = this.A02;
        }
        if (r2 != null && r4 != null && r3 != null) {
            AnonymousClass3VO A0d = C86124wJ.A0d(r4);
            A0d.A03(r3, 1);
            C122047Jt.A07(r3, r4, A0d, r2);
        }
    }

    public C112916qP(AnonymousClass3HX r3, C127397h3 r4, C109326jp r5, C109326jp r6, C109326jp r7, C109326jp r8) {
        WeakReference A0w = C86144wL.A0w(r4);
        WeakReference A0w2 = C86144wL.A0w(r3);
        this.A05 = A0w;
        this.A04 = A0w2;
        this.A01 = r5;
        this.A00 = r6;
        this.A03 = r7;
        this.A02 = r8;
    }
}
