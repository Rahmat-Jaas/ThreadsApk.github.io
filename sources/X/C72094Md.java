package X;

import android.graphics.drawable.shapes.OvalShape;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.4Md  reason: invalid class name and case insensitive filesystem */
public final class C72094Md implements C83884s9 {
    public final /* synthetic */ C22451Yd A00;
    public final /* synthetic */ String A01;

    public final void Bxr(AnonymousClass3XX r4) {
        C04220Ms.A0B(r4, 0);
        String A0L = AnonymousClass00U.A0L("Cannot load CTL user info: ", this.A01);
        Throwable th = r4.A01;
        if (th != null) {
            C10450iM.A06(C22451Yd.__redex_internal_original_name, A0L, th);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void CNG(User user) {
        C04220Ms.A0B(user, 0);
        C22451Yd r5 = this.A00;
        if (r5.isVisible()) {
            ExtendedImageUrl A0c = user.A0c();
            if (A0c != null) {
                SimpleImageUrl A0K = C18250wR.A0K(A0c.A0A);
                IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(r5.requireView(), R.id.wellbeing_interstitial_image);
                igImageView.A0K = new H91(new OvalShape());
                igImageView.setUrl(A0K, r5);
            }
            String A0w = user.A0w();
            if (A0w != null && A0w.length() != 0) {
                TextView textView = (TextView) AnonymousClass0wJ.A0J(r5.requireView(), R.id.wellbeing_interstitial_sub_title);
                textView.setText(user.A0w());
                textView.setVisibility(0);
            }
        }
    }

    public C72094Md(C22451Yd r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
