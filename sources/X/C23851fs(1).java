package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;

/* renamed from: X.1fs  reason: invalid class name and case insensitive filesystem */
public final class C23851fs extends AnonymousClass436 {
    public AnonymousClass1b1 A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23851fs(AnonymousClass1b1 r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-2089916208);
        AnonymousClass3AO r3 = (AnonymousClass3AO) view.getTag();
        C58733Gx r8 = (C58733Gx) obj;
        Boolean bool = (Boolean) obj2;
        AnonymousClass1b1 r2 = this.A00;
        r3.A01.setText(r8.A00);
        TextView textView = r3.A00;
        textView.setText(2131829574);
        AnonymousClass0wJ.A16(textView, 564, r8);
        IgCheckBox igCheckBox = r3.A02;
        igCheckBox.setChecked(bool.booleanValue());
        C18200wM.A1E(igCheckBox, r2, bool, r8, 48);
        C14030oh.A0A(-1699334388, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-544403616);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_text_with_link_checkbox);
        viewGroup2.setTag(new AnonymousClass3AO(viewGroup2));
        C14030oh.A0A(-500243659, A03);
        return viewGroup2;
    }
}
