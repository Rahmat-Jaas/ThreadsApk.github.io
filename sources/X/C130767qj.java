package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.7qj  reason: invalid class name and case insensitive filesystem */
public final class C130767qj implements C82354pU {
    public static final ViewGroup.MarginLayoutParams A09;
    public AnonymousClass5A2 A00;
    public final C104756cK A01;
    public final C91085fZ A02;
    public final C111256n2 A03;
    public volatile IA1 A04;
    public volatile C28283F7x A05;
    public volatile AnonymousClass5AK A06;
    public volatile Integer A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public C130767qj(C104756cK r1, C91085fZ r2, C111256n2 r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void A00(int i, int i2, boolean z) {
        if (AnonymousClass7J1.A04()) {
            C111256n2 r1 = this.A03;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A01 = i;
                r1.A02 = i2;
                r1.A0B = z;
            } else if (z) {
                recyclerView.A0r(i, i2);
            } else {
                recyclerView.scrollBy(i, i2);
            }
        } else {
            throw C18250wR.A0V("Cannot doScrollBy off the main thread!");
        }
    }

    public final void A01(int i, boolean z) {
        if (AnonymousClass7J1.A04()) {
            C111256n2 r1 = this.A03;
            RecyclerView recyclerView = r1.A07;
            if (recyclerView == null) {
                r1.A00 = i;
                r1.A0A = z;
            } else if (z) {
                recyclerView.A0m(i);
            } else {
                recyclerView.A0l(i);
                C91085fZ r3 = this.A02;
                C127397h3 r2 = r3.A00;
                C109326jp A0L = r2.A0L(51);
                C109326jp A0L2 = r2.A0L(97);
                if (A0L != null || A0L2 != null) {
                    AnonymousClass5AW.A00(r3.A02, r2, i, false);
                }
            }
        } else {
            throw C18250wR.A0V("Cannot doScrollTo off the main thread!");
        }
    }

    public final boolean isScrolledToTop() {
        if (AnonymousClass7J1.A04()) {
            RecyclerView recyclerView = this.A03.A07;
            if (recyclerView != null) {
                return !recyclerView.canScrollVertically(-1);
            }
            return true;
        }
        throw C18250wR.A0V("Cannot isScrolledToTop off the main thread!");
    }
}
