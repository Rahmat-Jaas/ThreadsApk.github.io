package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ar  reason: invalid class name and case insensitive filesystem */
public final class C22861ar extends C34640IcN implements C11630kW {
    public static final String __redex_internal_original_name = "CheckoutAwarenessValuePropsFragment";
    public C13330nS A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final String getModuleName() {
        return "instagram_shopping_checkout_awareness_value_props";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1802715821);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(C18250wR.A07(this));
        this.A02 = this.mArguments.getString("merchant_username");
        this.A03 = C18190wL.A0j(this.mArguments, "prior_module_name");
        this.A04 = C18190wL.A0j(this.mArguments, "prior_submodule_name");
        this.A05 = AnonymousClass3P5.A00(this.mArguments, this, this.A01);
        C13330nS A012 = C13330nS.A01(this, this.A01);
        this.A00 = A012;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A012, "instagram_shopping_checkout_awareness_value_props_entry"), 2031);
        A0I.A0T("visual_style", "checkout_signaling_icon_dialog");
        A0I.A0T("prior_module", this.A03);
        A0I.A0T("prior_submodule", this.A04);
        A0I.A0T("shopping_session_id", this.A05);
        A0I.Bb4();
        C14030oh.A09(903806204, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(899488463);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.checkout_awareness);
        C14030oh.A09(890074031, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(995547152);
        super.onDestroy();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A00, "instagram_shopping_checkout_awareness_value_props_closed"), 2030);
        A0I.A0T("visual_style", "checkout_signaling_icon_dialog");
        A0I.A0T("prior_module", this.A03);
        A0I.A0T("shopping_session_id", this.A05);
        A0I.Bb4();
        C14030oh.A09(-1499667995, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.shipping_information);
        ImageView A0K = C18220wO.A0K(findViewById, R.id.icon);
        TextView A0G = C18180wK.A0G(findViewById, R.id.title);
        TextView A0G2 = C18180wK.A0G(findViewById, R.id.description);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), A0G, 2131823261);
        String str = this.A02;
        if (str == null || str.isEmpty()) {
            string = AnonymousClass0wJ.A0B(this).getString(2131823263);
        } else {
            string = C18190wL.A0h(AnonymousClass0wJ.A0B(this), this.A02, 2131823262);
        }
        A0G2.setText(string);
        Context context = A0K.getContext();
        C18180wK.A0r(context, A0K, R.drawable.instagram_device_phone_outline_24);
        C63393hP.A04(context, A0K, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        View findViewById2 = view.findViewById(R.id.secure_payment_information);
        ImageView A0K2 = C18220wO.A0K(findViewById2, R.id.icon);
        TextView A0G3 = C18180wK.A0G(findViewById2, R.id.title);
        TextView A0G4 = C18180wK.A0G(findViewById2, R.id.description);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), A0G3, 2131823271);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), A0G4, 2131823272);
        Context context2 = A0K2.getContext();
        C18180wK.A0r(context2, A0K2, R.drawable.instagram_lock_pano_outline_24);
        C63393hP.A04(context2, A0K2, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        View findViewById3 = view.findViewById(R.id.purchase_protection_information);
        ImageView A0K3 = C18220wO.A0K(findViewById3, R.id.icon);
        TextView A0G5 = C18180wK.A0G(findViewById3, R.id.title);
        TextView A0G6 = C18180wK.A0G(findViewById3, R.id.description);
        C18200wM.A17(AnonymousClass0wJ.A0B(this), A0G5, 2131823273);
        String string2 = AnonymousClass0wJ.A0B(this).getString(2131823275);
        AnonymousClass3Zw.A03(C18730xl.A00(this, getContext().getColor(C121907Is.A02(getContext(), R.attr.textColorRegularLink)), 52), A0G6, string2, C18190wL.A0h(AnonymousClass0wJ.A0B(this), string2, 2131823274));
        Context context3 = A0K3.getContext();
        C18180wK.A0r(context3, A0K3, R.drawable.instagram_shield_pano_outline_24);
        C63393hP.A04(context3, A0K3, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.learn_more_help_center);
        Uri A012 = C15430rJ.A01(AnonymousClass3W8.A01(getActivity(), "https://help.instagram.com/357872324807367/"));
        String string3 = AnonymousClass0wJ.A0B(this).getString(2131823270);
        SpannableStringBuilder A0E = C18200wM.A0E(C18190wL.A0h(AnonymousClass0wJ.A0B(this), string3, 2131823269));
        AnonymousClass3Zw.A01(A0E, new C18670xb(A012), string3);
        A0L.setText(A0E);
        C28242F2u f2u = C28242F2u.A00;
        if (f2u == null) {
            f2u = new C28242F2u();
            C28242F2u.A00 = f2u;
        }
        A0L.setMovementMethod(f2u);
        ImageView A0J = C18200wM.A0J(view, R.id.close_button);
        C63393hP.A04(A0J.getContext(), A0J, R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        AnonymousClass0wJ.A17(A0J, HttpStatus.SC_MOVED_PERMANENTLY, this);
        C18200wM.A0J(view, R.id.main_image_icon).setImageResource(R.drawable.checkout_chevron_96);
    }
}
