package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.1g5  reason: invalid class name */
public final class AnonymousClass1g5 extends AnonymousClass436 {
    public final AnonymousClass1cB A00;
    public final C11630kW A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g5(AnonymousClass1cB r1, C11630kW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1368348544);
        AnonymousClass39X r7 = (AnonymousClass39X) view.getTag();
        AnonymousClass378 r11 = (AnonymousClass378) obj;
        C11630kW r4 = this.A01;
        AnonymousClass1cB r6 = this.A00;
        C72144Mm r3 = r11.A01;
        CircularImageView circularImageView = r7.A01;
        Context context = circularImageView.getContext();
        circularImageView.A09();
        ImageUrl imageUrl = r3.A00.A04;
        imageUrl.getClass();
        circularImageView.setUrl(imageUrl, r4);
        circularImageView.A0F(1, C121907Is.A00(context, R.attr.avatarInnerStroke));
        r7.A00.setText(r3.A02());
        C19577Ayd ayd = r7.A02;
        ayd.A08().setBackgroundDrawable(C19587Ayn.A00(view.getContext(), R.color.blue_5));
        ((CompoundButton) ayd.A08()).setChecked(r11.A00);
        AnonymousClass0wJ.A18(view, 1, r6, r11);
        C14030oh.A0A(255625654, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(2041397109);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_account_linking_child_account_for_selection);
        viewGroup2.setTag(new AnonymousClass39X(viewGroup2));
        C14030oh.A0A(-974288455, A03);
        return viewGroup2;
    }
}
