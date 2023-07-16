package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1gi  reason: invalid class name and case insensitive filesystem */
public final class C23991gi extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23991gi(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1835155107);
        C50292sl.A00((AnonymousClass3TL) obj, (AnonymousClass12T) view.getTag());
        C14030oh.A0A(1734544695, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1084346466);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_custom_text);
        AnonymousClass12T r0 = new AnonymousClass12T(A0H);
        A0H.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(-201218866, A03);
        return view;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
