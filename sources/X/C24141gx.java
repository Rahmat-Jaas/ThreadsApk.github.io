package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public final class C24141gx extends AnonymousClass435 {
    public final CharSequence A00;
    public final Context A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        if (this.A00.length() != 0) {
            r2.A5K(0);
        }
    }

    public C24141gx(Context context, CharSequence charSequence) {
        this.A01 = context;
        this.A00 = charSequence;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        boolean A1X;
        int A03 = C14030oh.A03(458202053);
        if (view == null) {
            if (obj2 == null) {
                A1X = false;
            } else {
                A1X = AnonymousClass0wJ.A1X(obj2);
            }
            Context context = this.A01;
            CharSequence charSequence = this.A00;
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.row_page_footer);
            TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_page_footer_text);
            textView.setText(charSequence);
            C18180wK.A0z(textView);
            if (A1X) {
                C18200wM.A1D(view, R.id.footer_divider);
            }
        }
        C14030oh.A0A(-612211272, A03);
        return view;
    }
}
