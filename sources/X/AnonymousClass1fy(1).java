package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fy  reason: invalid class name */
public final class AnonymousClass1fy extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1fy(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-2006204423);
        C50312sn.A00((C62133Xg) obj, (C57583Bq) obj2, (AnonymousClass13J) view.getTag());
        C14030oh.A0A(428585953, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1396262938);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_menu_link_item);
        AnonymousClass13J r0 = new AnonymousClass13J(A0H);
        A0H.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(-1991710368, A03);
        return view;
    }
}
