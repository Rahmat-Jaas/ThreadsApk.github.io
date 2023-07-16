package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Yd  reason: invalid class name and case insensitive filesystem */
public final class C22451Yd extends C34640IcN {
    public static final String __redex_internal_original_name = "CsomInterstitialFragment";
    public AnonymousClass3SK A00;
    public UserSession A01;

    public final String getModuleName() {
        return "support_resources_csom_interstitial";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0C = C63803iN.A0C(AnonymousClass0TJ.A05, this.A01, 36875506872090710L);
        AnonymousClass3Y8.A02.A00(this.A01, new C72094Md(this, A0C), A0C);
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-451241982);
        int A022 = C14030oh.A02(-525325696);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-413703869, A022);
        String string = requireArguments().getString("csom_session_id");
        if (string == null || string.length() == 0) {
            C10450iM.A03(__redex_internal_original_name, "Empty session id");
            string = C18230wP.A0h();
        }
        if (string != null) {
            UserSession userSession = this.A01;
            C04220Ms.A05(userSession);
            this.A00 = new AnonymousClass3SK(this, userSession, string);
            C14030oh.A09(1714808604, A02);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-1321790281, A02);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        int A02 = C14030oh.A02(-755773842);
        View inflate = layoutInflater.inflate(R.layout.wellbeing_interstitial_layout, viewGroup, false);
        ImageView A0J = C18200wM.A0J(inflate, R.id.wellbeing_interstitial_image);
        A0J.setImageResource(R.drawable.filled_circle_grey_3);
        int i4 = 0;
        A0J.setVisibility(0);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.wellbeing_interstitial_title);
        UserSession userSession = this.A01;
        AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
        SpannableStringBuilder A0E = C18200wM.A0E(C63803iN.A0C(r8, userSession, 36875506871828564L));
        boolean A022 = AnonymousClass0hB.A02(requireContext());
        int i5 = 0;
        if (A022) {
            A0E.insert(0, " ");
        } else {
            A0E.append(" ");
        }
        Drawable mutate = requireContext().getDrawable(R.drawable.verified_profile).mutate();
        if (mutate != null) {
            C63393hP.A03(requireContext(), mutate, R.color.blue_5);
            Resources A0B = AnonymousClass0wJ.A0B(this);
            C04220Ms.A06(A0B);
            C31166Ghe.A03(A0B, mutate, R.dimen.account_section_text_line_height);
            if (!A022) {
                i5 = A0E.length();
            }
            C31166Ghe.A05(mutate, A0E, i5);
            A0L.setText(A0E);
            TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.wellbeing_interstitial_sub_title);
            if (TextUtils.isEmpty((CharSequence) null)) {
                i4 = 8;
            } else {
                A0L2.setText((CharSequence) null);
            }
            A0L2.setVisibility(i4);
            TextView A0L3 = AnonymousClass0wJ.A0L(inflate, R.id.wellbeing_interstitial_note);
            String string = getString(2131824673);
            if (TextUtils.isEmpty(string)) {
                i = 8;
            } else {
                A0L3.setText(string);
                i = 0;
            }
            A0L3.setVisibility(i);
            ((RecyclerView) inflate.requireViewById(R.id.wellbeing_interstitial_list)).setAdapter(new C196510x(C06750aI.A17(new AnonymousClass3A6(R.drawable.instagram_clock_pano_outline_24, 2131824668, 2131824667), new AnonymousClass3A6(R.drawable.instagram_app_messenger_pano_outline_24, 2131824670, 2131824669), new AnonymousClass3A6(R.drawable.instagram_heart_pano_outline_24, 2131824672, 2131824671))));
            TextView A0L4 = AnonymousClass0wJ.A0L(inflate, R.id.wellbeing_interstitial_cta_btn);
            int i6 = 0;
            SpannableStringBuilder A0E2 = C18200wM.A0E(AnonymousClass0wJ.A0o(this, C63803iN.A0C(r8, this.A01, 36875506871828564L), 2131824665));
            Context requireContext = requireContext();
            Drawable A012 = C19587Ayn.A01(requireContext, R.drawable.instagram_app_messenger_filled_16, requireContext.getColor(R.color.design_dark_default_color_on_background));
            boolean A023 = AnonymousClass0hB.A02(requireContext());
            int A002 = C18250wR.A00(AnonymousClass0wJ.A0B(this));
            Resources A0B2 = AnonymousClass0wJ.A0B(this);
            C04220Ms.A06(A0B2);
            C31166Ghe.A03(A0B2, A012, R.dimen.abc_text_size_menu_header_material);
            if (A023) {
                i2 = A0E2.length();
                i3 = A002;
            } else {
                i2 = 0;
                i3 = 0;
                i6 = A002;
            }
            C31166Ghe.A06(A012, A0E2, i2, i3, i6);
            A0L4.setText(A0E2);
            AnonymousClass0wJ.A16(A0L4, 385, this);
            View requireViewById = inflate.requireViewById(R.id.wellbeing_interstitial_close);
            AnonymousClass0wJ.A16(requireViewById, 386, this);
            requireViewById.setVisibility(0);
            C14030oh.A09(2018840384, A02);
            return inflate;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(1357755513);
        super.onDestroyView();
        AnonymousClass3SK r1 = this.A00;
        if (r1 != null) {
            AnonymousClass3SK.A00(AnonymousClass29V.CSOM_CHAT_WITH_SOMEONE_DISMISSED, r1);
        }
        C14030oh.A09(-1424551878, A02);
    }
}
