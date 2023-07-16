package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1g3  reason: invalid class name */
public final class AnonymousClass1g3 extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g3(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(539454865);
        view.getTag().getClass();
        ((C561836c) view.getTag()).A00.setText((String) obj);
        C14030oh.A0A(1670185522, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1182392564);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_simple_text_item);
        A0H.setTag(new C561836c(AnonymousClass0wJ.A0L(A0H, R.id.header_text_view)));
        C14030oh.A0A(-1336859932, A03);
        return A0H;
    }
}
