package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6q2  reason: invalid class name and case insensitive filesystem */
public final class C112696q2 {
    public final C109326jp A00;
    public final C109326jp A01;
    public final WeakReference A02;
    public final WeakReference A03;

    public final void A00(boolean z) {
        C109326jp r2;
        C127397h3 r4 = (C127397h3) this.A03.get();
        AnonymousClass3HX r3 = (AnonymousClass3HX) this.A02.get();
        if (z) {
            r2 = this.A00;
        } else {
            r2 = this.A01;
        }
        if (r2 != null && r4 != null && r3 != null) {
            AnonymousClass3VO A0d = C86124wJ.A0d(r4);
            A0d.A03(r3, 1);
            C122047Jt.A07(r3, r4, A0d, r2);
        }
    }

    public C112696q2(AnonymousClass3HX r3, C127397h3 r4, C109326jp r5, C109326jp r6) {
        WeakReference A0w = C86144wL.A0w(r4);
        WeakReference A0w2 = C86144wL.A0w(r3);
        this.A03 = A0w;
        this.A02 = A0w2;
        this.A00 = r5;
        this.A01 = r6;
    }
}
