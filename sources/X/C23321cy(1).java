package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape11S1100000_1_I2;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;

/* renamed from: X.1cy  reason: invalid class name and case insensitive filesystem */
public final class C23321cy extends C34640IcN implements C21839C2o, C82034oy, C83044qh {
    public static final String __redex_internal_original_name = "PoliticalAdExpandedInfoSheetFragment";
    public UserSession A00;
    public String A01;
    public String A02;

    public final void CVi(String str, String str2) {
        String str3 = str2;
        C04220Ms.A0B(str2, 1);
        UserSession userSession = this.A00;
        String str4 = "userSession";
        if (userSession != null) {
            String str5 = this.A01;
            if (str5 == null) {
                str4 = "adId";
            } else {
                String str6 = this.A02;
                if (str6 == null) {
                    str4 = "trackingToken";
                } else {
                    C19606Az7.A0Q(this, userSession, str3, "webclick", str, str5, str6);
                    FragmentActivity requireActivity = requireActivity();
                    UserSession userSession2 = this.A00;
                    if (userSession2 != null) {
                        C37412JrW.A06(requireActivity, userSession2, C171209wF.A1r, (Long) null, str, "political_ad_expanded_info_sheet");
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str4);
        throw null;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        String string = requireArguments().getString("header_title");
        if (string != null) {
            AnonymousClass4u2.A08(r3, string);
            return;
        }
        throw C18180wK.A0a("Header title can't be null");
    }

    public final String getModuleName() {
        return "political_ad_expanded_info_sheet";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        UserSession userSession = this.A00;
        if (userSession == null) {
            C18210wN.A0m();
            throw null;
        }
        FragmentActivity requireActivity = requireActivity();
        String string = requireArguments.getString("state_run_media_country");
        if (!(string == null || string.length() == 0)) {
            View A0G = C18200wM.A0G(view, R.id.state_run_media_info_stub);
            C04220Ms.A06(A0G);
            TextView textView = (TextView) AnonymousClass0wJ.A0J(A0G, R.id.state_entity_sublabel);
            ((TextView) AnonymousClass0wJ.A0J(A0G, R.id.state_entity_name)).setText(AnonymousClass0wJ.A0l(A0G.getContext(), string, 2131836115));
            Context context = textView.getContext();
            AnonymousClass3Zw.A03(new IDxCSpanShape63S0200000_1_I2(C18210wN.A01(context), 9, (Object) requireActivity, (Object) userSession), textView, context.getString(2131836112), context.getString(2131836113));
        }
        C18250wR.A0q(requireArguments, (TextView) AnonymousClass0wJ.A0J(view, R.id.paid_for_by_title), "byline_text");
        String string2 = requireArguments.getString(AnonymousClass3QC.A00(43, 12, 14));
        String string3 = requireArguments.getString("email");
        String string4 = requireArguments.getString("website");
        String string5 = requireArguments.getString("tax_id");
        if (!((string5 == null || string5.length() == 0) && ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))))) {
            C18250wR.A0q(requireArguments, C18250wR.A0A(C18200wM.A0G(view, R.id.funding_info_subheader_stub)), "funding_disclaimer_short");
            if (!(string5 == null || string5.length() == 0)) {
                View A0G2 = C18200wM.A0G(view, R.id.tax_row_stub);
                C04220Ms.A06(A0G2);
                C50142sW.A00(A0G2, string5, R.drawable.instagram_licensing_outline_24);
                A0G2.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(string5, (Object) view, 25));
            }
            if (!(string2 == null || string2.length() == 0)) {
                View A0G3 = C18200wM.A0G(view, R.id.phone_row_stub);
                C04220Ms.A06(A0G3);
                C50142sW.A00(A0G3, string2, R.drawable.instagram_device_phone_outline_24);
                A0G3.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(string2, (Object) view, 24));
            }
            if (!(string3 == null || string3.length() == 0)) {
                View A0G4 = C18200wM.A0G(view, R.id.email_row_stub);
                C04220Ms.A06(A0G4);
                C50142sW.A00(A0G4, string3, R.drawable.instagram_mail_pano_outline_24);
                A0G4.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(string3, (Object) view, 23));
            }
            if (!(string4 == null || string4.length() == 0)) {
                View A0G5 = C18200wM.A0G(view, R.id.website_row_stub);
                C04220Ms.A06(A0G5);
                C50142sW.A00(A0G5, string4, R.drawable.instagram_link_pano_outline_24);
                A0G5.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(string4, (Object) this, 26));
            }
        }
        String string6 = requireArguments.getString("ad_library_url");
        if (string6 != null) {
            Resources resources = view.getResources();
            String A0g = C18190wL.A0g(resources, 2131821010);
            String A0h = C18190wL.A0h(resources, A0g, 2131827992);
            C04220Ms.A06(A0h);
            Context context2 = view.getContext();
            AnonymousClass3Zw.A03(new IDxCSpanShape11S1100000_1_I2(this, string6, context2.getColor(R.color.igds_link), 3), (TextView) AnonymousClass0wJ.A0J(view, R.id.ad_library_text), A0g, A0h);
            C18250wR.A0q(requireArguments, (TextView) AnonymousClass0wJ.A0J(view, R.id.ads_about_politics_header), "ads_about_politics_header");
            C18250wR.A0q(requireArguments, (TextView) AnonymousClass0wJ.A0J(view, R.id.ads_about_politics_body), "ads_about_politics_description");
            TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.visit_help_center_text);
            String A0g2 = C18190wL.A0g(resources, 2131828278);
            String A0h2 = C18190wL.A0h(resources, A0g2, 2131837970);
            C04220Ms.A06(A0h2);
            String string7 = requireArguments.getString("about_ads_url");
            if (string7 != null) {
                AnonymousClass3Zw.A03(new IDxCSpanShape11S1100000_1_I2(this, string7, context2.getColor(R.color.igds_link), 2), textView2, A0g2, A0h2);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-2019740539);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("ad_id");
        if (string != null) {
            this.A01 = string;
            String string2 = requireArguments.getString("tracking_token");
            if (string2 != null) {
                this.A02 = string2;
                C14030oh.A09(326699995, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -478668864;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 748549558;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2109064009);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.political_ad_expanded_info_sheet, false);
        C14030oh.A09(-920143939, A022);
        return A0D;
    }
}
