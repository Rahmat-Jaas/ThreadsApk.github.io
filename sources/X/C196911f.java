package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11f  reason: invalid class name and case insensitive filesystem */
public final class C196911f extends C113246qz {
    public final AnonymousClass3HX A00;
    public final C127397h3 A01;
    public final C109326jp A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C196911f)) {
            return false;
        }
        C196911f r6 = (C196911f) obj;
        return r6.A02 == this.A02 && r6.A01.A0H(53, 0) == this.A01.A0H(53, 0);
    }

    public C196911f(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        String str;
        int A03 = C14030oh.A03(1092227795);
        C127397h3 r3 = this.A01;
        int A0H = r3.A0H(53, 0);
        if (A0H != 0) {
            if (recyclerView.canScrollVertically(A0H)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(str, 0);
            AnonymousClass3HX r2 = this.A00;
            C122047Jt.A03(r2, r3, C63893iY.A04(A002, r2, 1), this.A02);
        }
        C14030oh.A0A(731415925, A03);
    }
}
