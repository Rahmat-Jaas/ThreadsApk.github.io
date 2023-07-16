package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

/* renamed from: X.1gH  reason: invalid class name */
public final class AnonymousClass1gH extends AnonymousClass436 {
    public final C11630kW A00;
    public final OneTapLoginLandingFragment A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gH(C11630kW r1, OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        this.A00 = r1;
        this.A01 = oneTapLoginLandingFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(2003375110);
        AnonymousClass3CL r5 = (AnonymousClass3CL) view.getTag();
        C62733ac r9 = (C62733ac) obj;
        C11630kW r2 = this.A00;
        OneTapLoginLandingFragment oneTapLoginLandingFragment = this.A01;
        ImageUrl imageUrl = r9.A02;
        if (imageUrl != null) {
            r5.A04.setUrl(imageUrl, r2);
        } else {
            CircularImageView circularImageView = r5.A04;
            C18180wK.A0r(circularImageView.getContext(), circularImageView, R.drawable.profile_anonymous_user);
        }
        r5.A03.setText(r9.A06);
        C18250wR.A0s(r5.A00, oneTapLoginLandingFragment, r9, 141);
        C18250wR.A0s(r5.A01, oneTapLoginLandingFragment, r9, 142);
        C18250wR.A0s(r5.A02, oneTapLoginLandingFragment, r9, 143);
        C14030oh.A0A(-1327904465, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-550007132);
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_one_tap_user);
        viewGroup2.setTag(new AnonymousClass3CL(viewGroup2));
        C14030oh.A0A(-230962892, A03);
        return viewGroup2;
    }
}
