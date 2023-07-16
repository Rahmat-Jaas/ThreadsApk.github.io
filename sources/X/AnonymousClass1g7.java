package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.1g7  reason: invalid class name */
public final class AnonymousClass1g7 extends AnonymousClass436 {
    public final AnonymousClass1cA A00;
    public final C11630kW A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g7(AnonymousClass1cA r1, C11630kW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1139565827);
        AnonymousClass3B9 r4 = (AnonymousClass3B9) view.getTag();
        C72144Mm r10 = (C72144Mm) obj;
        C11630kW r6 = this.A01;
        AnonymousClass1cA r2 = this.A00;
        if (AnonymousClass0hB.A02(view.getContext())) {
            view.setLayoutDirection(1);
        }
        CircularImageView circularImageView = r4.A03;
        Context context = circularImageView.getContext();
        circularImageView.A09();
        ImageUrl imageUrl = r10.A00.A04;
        imageUrl.getClass();
        circularImageView.setUrl(imageUrl, r6);
        circularImageView.A0F(1, C121907Is.A00(context, R.attr.avatarInnerStroke));
        r4.A02.setText(r10.A02());
        C18200wM.A1E(r4.A00, r2, r4, r10, 6);
        C14030oh.A0A(-1982366828, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(166901295);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_account_linking_main_account_for_manage);
        viewGroup2.setTag(new AnonymousClass3B9(viewGroup2));
        C14030oh.A0A(1806618589, A03);
        return viewGroup2;
    }
}
