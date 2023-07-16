package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1fk  reason: invalid class name and case insensitive filesystem */
public final class C23771fk extends AnonymousClass436 {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1921310715);
        ((TextView) view).setText(((AnonymousClass36N) obj).A00);
        C14030oh.A0A(1738667362, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(910683936);
        Context context = viewGroup.getContext();
        TextView textView = (TextView) AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.comments_title_row);
        textView.setTypeface(C09250f7.A05.A00(context).A03(C09340fG.A0k));
        C14030oh.A0A(571359792, A03);
        return textView;
    }
}
