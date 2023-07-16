package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.1gG  reason: invalid class name */
public final class AnonymousClass1gG extends AnonymousClass436 {
    public final C11630kW A00;
    public final AnonymousClass1aS A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gG(C11630kW r1, AnonymousClass1aS r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(257161138);
        C57443Bb r5 = (C57443Bb) view.getTag();
        C72144Mm r9 = (C72144Mm) obj;
        C11630kW r2 = this.A00;
        AnonymousClass1aS r4 = this.A01;
        ImageUrl imageUrl = r9.A00.A04;
        if (imageUrl != null) {
            r5.A03.setUrl(imageUrl, r2);
        } else {
            CircularImageView circularImageView = r5.A03;
            C18180wK.A0r(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        r5.A02.setText(r9.A02());
        TextView textView = r5.A01;
        String str = r9.A00.A0D;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        r5.A00.setOnClickListener(new IDxCListenerShape70S0200000_1_I2(r4, r9, 140));
        C14030oh.A0A(1760467584, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1624704714);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_account_recovery_user);
        viewGroup2.setTag(new C57443Bb(viewGroup2));
        C14030oh.A0A(1928242358, A03);
        return viewGroup2;
    }
}
