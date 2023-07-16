package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fc  reason: invalid class name and case insensitive filesystem */
public final class C23691fc extends AnonymousClass436 {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1612808056);
        ((C551732b) view.getTag()).A00.setText((String) obj);
        C14030oh.A0A(-1985522869, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(407841918);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_account_linking_title_text);
        viewGroup2.setTag(new C551732b(viewGroup2));
        C14030oh.A0A(-1247784440, A03);
        return viewGroup2;
    }
}
