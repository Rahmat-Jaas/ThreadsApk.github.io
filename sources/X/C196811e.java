package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11e  reason: invalid class name and case insensitive filesystem */
public final class C196811e extends C113246qz {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;
    public final C109326jp A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C196811e)) {
            return false;
        }
        C196811e r4 = (C196811e) obj;
        return r4.A02 == this.A02 && r4.A01 == this.A01;
    }

    public C196811e(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A03 = C14030oh.A03(1474612238);
        if (i == 0 && i2 == 0) {
            i3 = 712836524;
        } else {
            C127397h3 r3 = this.A01;
            C109326jp r2 = this.A02;
            C122047Jt.A03(this.A00, r3, C63893iY.A04(AnonymousClass3VO.A00(), r3, 0), r2);
            i3 = 354126700;
        }
        C14030oh.A0A(i3, A03);
    }
}
