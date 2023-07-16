package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1c3  reason: invalid class name */
public final class AnonymousClass1c3 extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "UserPasswordRecoveryFragment";
    public int A00;
    public Handler A01 = C18250wR.A08();
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public AnonymousClass3V1 A06 = new AnonymousClass3V1();
    public C07530bf A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public View A0G;
    public boolean A0H;
    public final C71854Kn A0I = new C71854Kn(this);

    public final String getModuleName() {
        return "user_password_recovery";
    }

    public static String A00(AnonymousClass0A3 r2, AnonymousClass1c3 r3, List list) {
        r2.A0U("cp_recovery_options", list);
        r2.A0T("cp_type_given", r3.A06.A00.getString(AnonymousClass267.A05.A03()));
        r2.A0S("cps_available_to_choose", Long.valueOf((long) r3.A0B.size()));
        r2.A0Q("prefill_given_match", Boolean.valueOf(r3.A06.A00.getBoolean(AnonymousClass267.A06.A03())));
        r2.A0Q("was_from_recovery_flow", Boolean.valueOf(r3.A06.A00.getBoolean(AnonymousClass267.A0A.A03())));
        r2.A0T("cp_prefill_type", r3.A06.A00.getString(AnonymousClass267.A03.A03()));
        if (C05030Qo.A01(r3.A07).A0B() > 0) {
            return "mas";
        }
        return null;
    }

    public static void A02(AnonymousClass1c3 r3, String str) {
        C62323Yh.A00.A01(r3.A07, "recovery_page", str);
    }

    public static void A03(AnonymousClass1c3 r3, String str) {
        C63313hF A0B2 = AnonymousClass269.A0Y.A0B(r3.A07);
        AnonymousClass265 r0 = AnonymousClass265.A1D;
        C15730rn A052 = A0B2.A05();
        C18250wR.A19(A052, r0.A01);
        r3.A06.A00.putString(C18240wQ.A0g("RECOVERY_LINK_TYPE"), str);
        r3.A06.A02(A052);
        C18180wK.A1K(A052, r3.A07);
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C67363zQ.A06(intent, this.A07, this.A0I, i2);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00.A01(this.A07, "recovery_page");
        return false;
    }

    public static void A01(AnonymousClass1c3 r8) {
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8.A07), "recovery_sms"), 2571);
        if (AnonymousClass0wJ.A1U(A0I2)) {
            AnonymousClass0wJ.A1A(A0I2, A002, A003);
            AnonymousClass269.A08(A0I2, "recovery_page");
            A0I2.A0T("cp_prefill_type", r8.A06.A00.getString(C18240wQ.A0g("CP_PREFILL_TYPE")));
            A0I2.A0U("cp_recovery_options", r8.A0B);
            A0I2.A0T("cp_type_given", r8.A06.A00.getString(C18240wQ.A0g("CP_TYPE_GIVEN")));
            A0I2.A0S("cps_available_to_choose", C18230wP.A0f(r8.A0B.size()));
            C18180wK.A19(A0I2);
            C18180wK.A1B(A0I2, A002);
            C18180wK.A1G(A0I2);
            A0I2.A0Q("prefill_given_match", C18210wN.A0Q(r8.A06.A00, C18240wQ.A0g("PREFILL_GIVEN_MATCH")));
            C18200wM.A1K(A0I2, A003);
            A0I2.A0Q("was_from_recovery_flow", C18210wN.A0Q(r8.A06.A00, C18240wQ.A0g("WAS_FROM_RECOVERY_FLOW")));
            A0I2.Bb4();
        }
        AnonymousClass01V.A0p.markerPoint(725096125, "network_request_start");
        C32165H8c A012 = C63883iV.A01(r8.requireContext(), r8.A07, (Boolean) null, (Boolean) null, r8.A09, (String) null, true, false);
        A012.A00 = new C26841rJ(r8, r8.A07, r8, AnonymousClass265.A1D);
        C31155GhB.A03(A012);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A07(r2, 2131820822);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1856280317);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A09 = C18190wL.A0j(requireArguments, "lookup_user_input");
        this.A0C = requireArguments.getBoolean("can_email_reset");
        this.A0D = requireArguments.getBoolean("can_sms_reset");
        this.A0E = requireArguments.getBoolean("can_wa_reset");
        this.A0H = requireArguments.getBoolean("has_fb_login_option");
        this.A0F = C18240wQ.A1S(requireArguments, "is_autoconf_test_user");
        this.A08 = C18190wL.A0j(requireArguments, "lookup_source");
        this.A07 = AnonymousClass0RA.A0C.A04(requireArguments);
        AnonymousClass3V1 A002 = AnonymousClass3V1.A00(requireArguments);
        this.A06 = A002;
        ArrayList A0k = C18240wQ.A0k(4);
        if (this.A0C) {
            A0k.add("email");
        }
        if (this.A0D) {
            A0k.add("sms");
        }
        if (this.A0E) {
            A0k.add("whatsapp");
        }
        A0k.add("facebook");
        this.A0B = A0k;
        A002.A00.putInt(C18240wQ.A0g("CPS_AVAILABLE_TO_CHOOSE"), A0k.size());
        this.A06.A00.putStringArrayList(C18240wQ.A0g("CP_RECOVERY_OPTIONS"), C18200wM.A0s(this.A0B));
        C07530bf r5 = this.A07;
        AnonymousClass3V1 r6 = this.A06;
        AnonymousClass0wJ.A1N(r5, "recovery_page");
        AnonymousClass3YT.A00(r5, r6, (C313625r) null, (Integer) null, "recovery_page", (String) null);
        C14030oh.A09(764573097, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-791689457);
        View inflate = layoutInflater.inflate(R.layout.fragment_user_password_recovery, viewGroup, false);
        int A023 = C121907Is.A02(requireContext(), R.attr.glyphColorPrimary);
        C63163fI.A03(AnonymousClass0wJ.A0L(inflate, R.id.fragment_user_password_recovery_button_email_reset), A023);
        C63163fI.A03(AnonymousClass0wJ.A0L(inflate, R.id.fragment_user_password_recovery_button_sms_reset), A023);
        C63163fI.A03(AnonymousClass0wJ.A0L(inflate, R.id.fragment_user_password_recovery_button_whatsapp_reset), A023);
        C63163fI.A03(AnonymousClass0wJ.A0L(inflate, R.id.connect_with_facebook_textview), A023);
        this.A03 = inflate.requireViewById(R.id.sms_spinner);
        if (this.A0D) {
            View requireViewById = inflate.requireViewById(R.id.fragment_user_password_recovery_button_sms_reset_container);
            requireViewById.setVisibility(0);
            AnonymousClass0wJ.A16(requireViewById, 513, this);
        }
        if (this.A0C) {
            View requireViewById2 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
            requireViewById2.setVisibility(0);
            AnonymousClass0wJ.A16(requireViewById2, 514, this);
        }
        if (this.A0E) {
            View requireViewById3 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_whatsapp_reset_container);
            requireViewById3.setVisibility(0);
            AnonymousClass0wJ.A16(requireViewById3, 515, this);
        }
        View requireViewById4 = inflate.requireViewById(R.id.fragment_user_password_recovery_button_connect_with_facebook);
        this.A0G = requireViewById4;
        if (!this.A0H) {
            requireViewById4.setVisibility(8);
        } else {
            AnonymousClass0wJ.A16(requireViewById4, 516, this);
        }
        AnonymousClass0wJ.A16(inflate.requireViewById(R.id.fragment_user_password_recovery_dont_have_access), 517, this);
        IgImageView A0M = C18250wR.A0M(inflate, R.id.user_profile_picture);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.username_textview);
        if (!C63213h0.A01(137, 8, 91).equals(this.A08) || (str = this.A09) == null) {
            A0M.setVisibility(8);
            A0L.setVisibility(8);
            C18190wL.A18(inflate, R.id.divider_row, 8);
        } else {
            A0L.setText(str);
            A0M.setUrl((ImageUrl) C18240wQ.A0D(requireArguments(), "user_profile_pic"), this);
        }
        C14030oh.A09(424151089, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-45585454);
        super.onDestroyView();
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A0G = null;
        C14030oh.A09(-105329119, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1621545651);
        super.onStart();
        C14030oh.A09(-549734070, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass01V.A0p.markerEnd(725096220, 2);
    }
}
