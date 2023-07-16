package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1fi  reason: invalid class name and case insensitive filesystem */
public final class C23751fi extends AnonymousClass436 {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-120826509);
        AnonymousClass0wJ.A1O(view, obj);
        CharSequence charSequence = (CharSequence) obj;
        AnonymousClass36G r0 = (AnonymousClass36G) view.getTag();
        if (r0 != null) {
            TextView textView = r0.A00;
            textView.setText(charSequence);
            C18180wK.A0z(textView);
        }
        C14030oh.A0A(313963364, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r3, obj);
        r3.A5L(A1Y, obj, Integer.valueOf(A1Y ? 1 : 0));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A00 = AnonymousClass436.A00(-1333272598, viewGroup);
        TextView A0A = C18250wR.A0A(C18180wK.A0C(viewGroup).inflate(R.layout.product_source_footer_layout, viewGroup, false));
        A0A.setTag(new AnonymousClass36G(A0A));
        C14030oh.A0A(-846410805, A00);
        return A0A;
    }
}
