package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1gv  reason: invalid class name and case insensitive filesystem */
public final class C24121gv extends AnonymousClass435 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24121gv(Context context) {
        this.A00 = context;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-2032138037);
        if (view == null) {
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.block_commenters_empty_state);
        }
        C14030oh.A0A(-124682832, A03);
        return view;
    }
}
