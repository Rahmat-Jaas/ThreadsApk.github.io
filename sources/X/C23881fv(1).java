package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fv  reason: invalid class name and case insensitive filesystem */
public final class C23881fv extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23881fv(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1095411552);
        C50272sj.A00((C62593aM) obj, (C200713a) view.getTag());
        C14030oh.A0A(-827944647, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1444327395);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_arrow_item);
        C200713a r0 = new C200713a(A0H);
        A0H.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(699771866, A03);
        return view;
    }
}
