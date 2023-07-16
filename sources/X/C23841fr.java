package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public final class C23841fr extends AnonymousClass436 {
    public final AnonymousClass1b1 A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23841fr(AnonymousClass1b1 r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-711131155);
        AnonymousClass38X r1 = (AnonymousClass38X) view.getTag();
        Boolean bool = (Boolean) obj2;
        AnonymousClass1b1 r2 = this.A00;
        r1.A00.setText((String) obj);
        IgCheckBox igCheckBox = r1.A01;
        igCheckBox.setChecked(bool.booleanValue());
        AnonymousClass0wJ.A18(igCheckBox, 144, bool, r2);
        C14030oh.A0A(-783457709, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1140171822);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_text_with_checkbox);
        viewGroup2.setTag(new AnonymousClass38X(viewGroup2));
        C14030oh.A0A(-2016491290, A03);
        return viewGroup2;
    }
}
