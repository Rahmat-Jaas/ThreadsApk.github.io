package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YF  reason: invalid class name */
public final class AnonymousClass1YF extends C34640IcN {
    public static final String __redex_internal_original_name = "DirectInteropUpgradeInterstitialChildFragment";
    public Context A00;
    public View A01;
    public C63323hG A02;
    public IgdsHeadline A03;
    public UserSession A04;
    public boolean A05;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1160234361);
        super.onCreate(bundle);
        this.A04 = AnonymousClass0wJ.A0W(this);
        this.A00 = requireContext();
        UserSession userSession = this.A04;
        int i = 3;
        if (requireArguments().getInt("nux_view_type") != 3) {
            i = 1;
        }
        this.A02 = new C63323hG(AnonymousClass3WS.A01(userSession), userSession, i);
        this.A05 = C63803iN.A05(AnonymousClass0TJ.A05, this.A04, 36312221911614325L).booleanValue();
        C14030oh.A09(1599438828, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IgdsHeadline igdsHeadline;
        int i;
        int A022 = C14030oh.A02(373956945);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(R.layout.interop_upgrade_interstitial_container, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.interop_headline);
        this.A03 = A0S;
        boolean z = this.A05;
        int i2 = R.drawable.interop_header_image;
        if (z) {
            i2 = R.drawable.interop_header_image_rebrand;
        }
        A0S.A08(i2, false);
        this.A01 = inflate;
        AnonymousClass3D0 A052 = this.A02.A05(this.A00);
        String str = A052.A04;
        if (str != null) {
            this.A03.setHeadline((CharSequence) str);
            igdsHeadline = this.A03;
            i = 0;
        } else {
            igdsHeadline = this.A03;
            i = 8;
        }
        igdsHeadline.setVisibility(i);
        ViewGroup A0J = C18220wO.A0J(inflate, R.id.interop_highlights_scroll);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater2.inflate(R.layout.interop_upgrade_interstitial_highlight, A0J, false);
        boolean z2 = A052.A06;
        int i3 = R.layout.interop_upgrade_interstitial_row;
        if (z2) {
            i3 = R.layout.interop_upgrade_interstitial_row_with_description;
        }
        for (AnonymousClass3A1 r4 : A052.A05) {
            View inflate2 = layoutInflater2.inflate(i3, viewGroup2, false);
            if (z2) {
                String str2 = r4.A02;
                String str3 = r4.A01;
                int i4 = r4.A00;
                if (inflate2 != null) {
                    ImageView A0K = C18220wO.A0K(inflate2, R.id.icon);
                    if (A0K != null) {
                        A0K.setImageResource(i4);
                    }
                    TextView A0G = C18180wK.A0G(inflate2, R.id.title_view);
                    if (A0G != null) {
                        A0G.setText(str2);
                    }
                    TextView A0G2 = C18180wK.A0G(inflate2, R.id.description_view);
                    if (!(A0G2 == null || str3 == null)) {
                        A0G2.setText(str3);
                    }
                }
            } else {
                TextView textView = (TextView) inflate2;
                String str4 = r4.A02;
                int i5 = r4.A00;
                if (textView != null) {
                    textView.setText(str4);
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(this.A00.getDrawable(i5), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView.setCompoundDrawablePadding(40);
                    int currentTextColor = textView.getCurrentTextColor();
                    for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN));
                        }
                    }
                }
            }
            viewGroup2.addView(inflate2);
        }
        A0J.addView(viewGroup2);
        C14030oh.A09(1410141829, A022);
        return inflate;
    }
}
