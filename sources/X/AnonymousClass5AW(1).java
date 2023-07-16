package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AW  reason: invalid class name */
public final class AnonymousClass5AW extends C113246qz {
    public int A00 = -1;
    public boolean A01;
    public final C28283F7x A02;
    public final AnonymousClass3HX A03;
    public final C127397h3 A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass5AW r5 = (AnonymousClass5AW) obj;
            return this.A02 == r5.A02 && this.A04.A02 == r5.A04.A02;
        }
        return false;
    }

    public static void A00(AnonymousClass3HX r5, C127397h3 r6, int i, boolean z) {
        AnonymousClass3VO A002;
        C109326jp A0L = r6.A0L(97);
        if (A0L != null) {
            A002 = AnonymousClass3VO.A00();
            A002.A02(Integer.valueOf(i), 0);
            A002.A02(Boolean.valueOf(z), 1);
            A002.A02(r5, 2);
        } else {
            A0L = r6.A0L(51);
            if (A0L != null) {
                A002 = AnonymousClass3VO.A00();
                A002.A02(Integer.valueOf(i), 0);
                A002.A02(r5, 1);
            } else {
                return;
            }
        }
        C122047Jt.A07(r5, r6, A002, A0L);
    }

    public final int hashCode() {
        return C18210wN.A04(this.A02) + this.A04.A02;
    }

    public AnonymousClass5AW(C28283F7x f7x, AnonymousClass3HX r3, C127397h3 r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = f7x;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        M6x m6x;
        View A032;
        int A033;
        int A034 = C14030oh.A03(1921233795);
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (m6x = recyclerView.A0H) != null && (A032 = this.A02.A03(m6x)) != null && ((A033 = RecyclerView.A03(A032)) != this.A00 || this.A01)) {
                A00(this.A03, this.A04, A033, this.A01);
                this.A00 = A033;
                z = false;
            }
            C14030oh.A0A(-1988929211, A034);
        }
        this.A01 = z;
        C14030oh.A0A(-1988929211, A034);
    }
}
