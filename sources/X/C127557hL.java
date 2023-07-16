package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7hL  reason: invalid class name and case insensitive filesystem */
public final class C127557hL implements Mcm {
    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        Parcelable parcelable;
        RecyclerView recyclerView = (RecyclerView) obj;
        C90975fO r6 = (C90975fO) obj2;
        recyclerView.setAdapter(r6.A0D);
        recyclerView.setItemAnimator((M0E) null);
        C104756cK r0 = r6.A07;
        if (r0 == null || (parcelable = r0.A00) == null) {
            int i = r6.A03;
            if (i >= 0) {
                recyclerView.A0l(i);
                return null;
            }
        } else {
            M6x m6x = recyclerView.A0H;
            m6x.getClass();
            m6x.A15(parcelable);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return C18240wQ.A1Y(((C90975fO) obj).A0D, ((C90975fO) obj2).A0D);
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C104756cK r1 = ((C90975fO) obj2).A07;
        if (r1 != null) {
            M6x m6x = recyclerView.A0H;
            m6x.getClass();
            r1.A00 = m6x.A0p();
        }
        recyclerView.setAdapter((C41030Luu) null);
    }
}
