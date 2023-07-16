package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxBDelegateShape506S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
public final class C22851an extends C34640IcN implements C82044oz {
    public static final String __redex_internal_original_name = "DirectInteropUpgradePrivacyFragment";
    public AnonymousClass3DE A00;
    public UserSession A01;
    public boolean A02;
    public E2V A03;
    public final C82034oy A04 = new IDxBDelegateShape506S0100000_1_I2(this, 1);

    public final E2V AOh() {
        return this.A03;
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final String getModuleName() {
        return C18220wO.A0q(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1376497719);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A01 = A0W;
        int A002 = C63473hX.A00(A0W);
        boolean z = true;
        if (A002 != 2) {
            z = false;
        }
        this.A02 = z;
        this.A03 = C18230wP.A0R(this);
        Bundle requireArguments = requireArguments();
        this.A00 = new AnonymousClass3DE(requireArguments.getString("qp_source_upsell"), requireArguments.getString("static_source_upsell"));
        C14030oh.A09(-1643035781, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-2129776340);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.interop_upgrade_privacy_container);
        ViewGroup A0G = C18240wQ.A0G(A0H, R.id.privacy_header_row);
        View findViewById = A0H.findViewById(R.id.interop_actions_container);
        if (A0G == null) {
            i = -1834725959;
        } else {
            E2V e2v = new E2V(C18190wL.A0H(this, 372), A0G);
            this.A03 = e2v;
            e2v.A0S(this.A04);
            boolean A002 = C59623Lo.A00(AnonymousClass0wJ.A0Y(this.A01));
            View findViewById2 = A0H.findViewById(R.id.first_row);
            int i2 = 2131827522;
            boolean z = this.A02;
            if (!z) {
                i2 = 2131827521;
            }
            int i3 = 2131827519;
            if (A002) {
                i3 = 2131827520;
            }
            if (!z) {
                i3 = 2131827518;
            }
            if (findViewById2 != null) {
                ImageView A0K = C18220wO.A0K(findViewById2, R.id.icon);
                if (A0K != null) {
                    A0K.setImageResource(R.drawable.instagram_app_messenger_pano_outline_24);
                }
                TextView A0G2 = C18180wK.A0G(findViewById2, R.id.title_view);
                if (A0G2 != null) {
                    A0G2.setText(i2);
                }
                TextView A0G3 = C18180wK.A0G(findViewById2, R.id.content_view);
                if (A0G3 != null) {
                    if (this.A02) {
                        String string = requireContext().getString(2131827731);
                        AnonymousClass3Zw.A03(C18730xl.A00(this, C18180wK.A00(this), 17), A0G3, string, AnonymousClass0wJ.A0l(requireContext(), string, i3));
                    } else {
                        A0G3.setText(i3);
                    }
                }
                findViewById2.findViewById(R.id.content_view_extra);
            }
            View findViewById3 = A0H.findViewById(R.id.second_row);
            int i4 = 2131835329;
            int i5 = 2131835327;
            if (!this.A02) {
                i4 = 2131835328;
                i5 = 2131835326;
            }
            if (findViewById3 != null) {
                ImageView A0K2 = C18220wO.A0K(findViewById3, R.id.icon);
                if (A0K2 != null) {
                    A0K2.setImageResource(R.drawable.instagram_settings_pano_outline_24);
                }
                TextView A0G4 = C18180wK.A0G(findViewById3, R.id.title_view);
                if (A0G4 != null) {
                    A0G4.setText(i4);
                }
                TextView A0G5 = C18180wK.A0G(findViewById3, R.id.content_view);
                if (A0G5 != null) {
                    String string2 = requireContext().getString(2131827732);
                    AnonymousClass3Zw.A03(C18730xl.A00(this, C18180wK.A00(this), 18), A0G5, string2, AnonymousClass0wJ.A0l(requireContext(), string2, i5));
                }
                findViewById3.findViewById(R.id.content_view_extra);
            }
            View findViewById4 = A0H.findViewById(R.id.third_row);
            int i6 = 2131836783;
            int i7 = 2131836781;
            if (!this.A02) {
                i6 = 2131836782;
                i7 = 2131836780;
            }
            if (findViewById4 != null) {
                ImageView A0K3 = C18220wO.A0K(findViewById4, R.id.icon);
                if (A0K3 != null) {
                    A0K3.setImageResource(R.drawable.instagram_user_following_pano_outline_24);
                }
                TextView A0G6 = C18180wK.A0G(findViewById4, R.id.title_view);
                if (A0G6 != null) {
                    A0G6.setText(i6);
                }
                TextView A0G7 = C18180wK.A0G(findViewById4, R.id.content_view);
                findViewById4.findViewById(R.id.content_view_extra);
                if (A0G7 != null) {
                    A0G7.setText(i7);
                }
            }
            View findViewById5 = A0H.findViewById(R.id.fourth_row);
            int i8 = 2131827705;
            int i9 = 2131827703;
            if (!this.A02) {
                i8 = 2131827704;
                i9 = 2131827702;
            }
            if (findViewById5 != null) {
                ImageView A0K4 = C18220wO.A0K(findViewById5, R.id.icon);
                if (A0K4 != null) {
                    A0K4.setImageResource(R.drawable.instagram_new_story_pano_outline_24);
                }
                TextView A0G8 = C18180wK.A0G(findViewById5, R.id.title_view);
                if (A0G8 != null) {
                    A0G8.setText(i8);
                }
                TextView A0G9 = C18180wK.A0G(findViewById5, R.id.content_view);
                findViewById5.findViewById(R.id.content_view_extra);
                if (A0G9 != null) {
                    A0G9.setText(i9);
                }
            }
            if (this.A02) {
                C18210wN.A0z(findViewById);
            }
            i = 520588872;
        }
        C14030oh.A09(i, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1597801177);
        super.onDestroy();
        C63473hX A012 = C63473hX.A01(this.A01);
        AnonymousClass3DE r0 = this.A00;
        r0.A04 = "upgrade_screen_privacy_dismissed";
        r0.A05 = "upgrade";
        r0.A00 = null;
        A012.A08(r0);
        C14030oh.A09(1639682262, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-245939786);
        super.onDestroyView();
        C14030oh.A09(-1009083010, A022);
    }
}
