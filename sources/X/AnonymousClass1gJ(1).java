package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;
import com.instagram.user.model.User;

/* renamed from: X.1gJ  reason: invalid class name */
public final class AnonymousClass1gJ extends AnonymousClass436 {
    public final C11630kW A00;
    public final AnonymousClass1fU A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gJ(C11630kW r1, AnonymousClass1fU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1969686892);
        AnonymousClass3CR r5 = (AnonymousClass3CR) C18210wN.A0X(view);
        C57313Ao r11 = (C57313Ao) obj;
        C11630kW r7 = this.A00;
        AnonymousClass1fU r3 = this.A01;
        CheckBox checkBox = r5.A01;
        checkBox.setBackground(checkBox.getContext().getDrawable(R.drawable.checkbox_selector));
        SingleSelectableAvatar singleSelectableAvatar = r5.A04;
        User user = r11.A02;
        singleSelectableAvatar.setUrl(user.B4M(), r7);
        TextView textView = r5.A03;
        C63563ho.A07(textView, user.BZi());
        textView.setText(user.BK7());
        r5.A02.setText(user.Ak1());
        checkBox.setChecked(r11.A01);
        C18200wM.A1E(r5.A00, r5, r11, r3, 57);
        C14030oh.A0A(57240168, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1783126738);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_reel_viewer_user);
        A0H.setTag(new AnonymousClass3CR(A0H));
        C14030oh.A0A(-1650217492, A03);
        return A0H;
    }
}
