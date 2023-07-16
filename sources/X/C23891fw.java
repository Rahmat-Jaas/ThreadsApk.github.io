package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fw  reason: invalid class name and case insensitive filesystem */
public final class C23891fw extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23891fw(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-244916462);
        C50282sk.A00((C63063bP) obj, (AnonymousClass12R) view.getTag());
        C14030oh.A0A(1892271918, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1515959592);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_button_item);
        AnonymousClass12R r0 = new AnonymousClass12R(A0H);
        A0H.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(-2131962832, A03);
        return view;
    }
}
