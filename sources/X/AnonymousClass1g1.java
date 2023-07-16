package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1g1  reason: invalid class name */
public final class AnonymousClass1g1 extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g1(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1655120038);
        AnonymousClass13U r0 = (AnonymousClass13U) view.getTag();
        if (r0 != null) {
            r0.A03.setVisibility(8);
            throw C18210wN.A0W("getOnClickListener");
        } else {
            C14030oh.A0A(-1932112815, A03);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1409949549);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_badge_item);
        AnonymousClass13U r0 = new AnonymousClass13U(A0H);
        A0H.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(-1226573545, A03);
        return view;
    }
}
