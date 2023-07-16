package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hn  reason: invalid class name and case insensitive filesystem */
public final class C127837hn implements Mcm {
    public final C108086hn A00;
    public final C111256n2 A01;

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass5AP r0;
        RecyclerView recyclerView = (RecyclerView) obj;
        C111256n2 r5 = this.A01;
        C108086hn r1 = this.A00;
        if (r1.A00 == 1) {
            r0 = r1.A01.A02.ATb().A04;
        } else {
            r0 = null;
        }
        r5.A08 = r0;
        r5.A07 = recyclerView;
        r5.A04 = recyclerView.getScrollX();
        recyclerView.A11(r5.A06);
        int i = r5.A00;
        if (i != -1) {
            if (!r5.A0A) {
                recyclerView.A0l(i);
            } else if (!r5.A09.equals("")) {
                AnonymousClass5A2 r12 = new AnonymousClass5A2(context);
                r12.A0F(r5.A09);
                r12.A00 = r5.A03;
                r12.A02 = r5.A0C;
                r12.A00 = r5.A00;
                M6x m6x = recyclerView.A0H;
                if (m6x != null) {
                    m6x.A1O(r12);
                }
            } else {
                recyclerView.A0m(i);
            }
            r5.A00 = -1;
            r5.A0A = false;
            r5.A09 = "";
            r5.A03 = 0;
            r5.A0C = true;
        }
        int i2 = r5.A01;
        if (!(i2 == -1 && r5.A02 == -1)) {
            boolean z = r5.A0B;
            int i3 = r5.A02;
            if (z) {
                recyclerView.A0r(i2, i3);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
            r5.A01 = -1;
            r5.A02 = -1;
            r5.A0B = false;
        }
        AnonymousClass5AP r02 = r5.A08;
        if (r02 == null) {
            return null;
        }
        recyclerView.A11(r02);
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C111256n2 r2 = this.A01;
        RecyclerView recyclerView2 = r2.A07;
        if (recyclerView2 != null) {
            recyclerView2.setImportantForAutofill(0);
        }
        r2.A07 = null;
        recyclerView.A12(r2.A06);
        AnonymousClass5AP r0 = r2.A08;
        if (r0 != null) {
            recyclerView.A12(r0);
        }
        r2.A08 = null;
    }

    public C127837hn(C108086hn r1, C111256n2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
