package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.barcelona.R;
import com.instagram.login.callback.IDxLCallbacksShape165S0100000_1_I2;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.text.IDxCSpanShape62S0200000_1_I2;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1ci  reason: invalid class name */
public final class AnonymousClass1ci extends C34640IcN implements C82424pb, AnonymousClass4tS, C82824qK, C10390iG, C82814qJ {
    public static final String __redex_internal_original_name = "PhoneConfirmationFragment";
    public long A00;
    public C690746q A01;
    public C690846r A02;
    public C690946s A03;
    public C691046t A04;
    public RegFlowExtras A05;
    public C24721jv A06;
    public C07530bf A07;
    public SearchEditText A08;
    public String A09 = "";
    public String A0A;
    public String A0B = "";
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = false;
    public Dialog A0H;
    public AnonymousClass3V1 A0I;
    public NotificationBar A0J;
    public InlineErrorMessageView A0K;
    public String A0L;
    public String A0M = "";

    public final void CDH(boolean z) {
    }

    public final boolean onBackPressed() {
        if (!this.A0E || C18190wL.A1X(C18200wM.A0C(), "has_user_confirmed_dialog")) {
            C07530bf r3 = this.A07;
            String str = BDt().A01;
            C313625r Aiy = Aiy();
            AnonymousClass0wJ.A1N(r3, str);
            C62223Xv.A00(r3, Aiy, (Boolean) null, (Integer) null, str);
            return false;
        }
        AnonymousClass2S0.A00(this, (C81584o2) null, this.A07, Aiy(), BDt(), (Integer) null);
        return true;
    }

    private void A02(String str, boolean z) {
        Integer num;
        C26891rQ r5;
        String str2;
        String str3 = this.A0L;
        String str4 = null;
        if (str3 == null || !z) {
            num = null;
        } else {
            num = AnonymousClass006.A00;
        }
        String str5 = str;
        if (this.A0C == null) {
            r5 = null;
        } else {
            r5 = new C26891rQ(this, str5);
        }
        if (!(str3 == null || num == null || !z)) {
            C62323Yh r13 = C62323Yh.A00;
            C07530bf r14 = this.A07;
            String str6 = BDt().A01;
            switch (num.intValue()) {
                case 1:
                    str2 = "authentication_flow";
                    break;
                case 2:
                    str2 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = "registration_flow";
                    break;
            }
            r13.A03(r14, str6, "client_reg_send_reg_nonce", "send user input nonce to server for auto conf registration", str2, "ar_code_sms");
        }
        Context context = getContext();
        C07530bf r9 = this.A07;
        String str7 = this.A0A;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str4 = "authentication_flow";
                    break;
                case 2:
                    str4 = "optimistic_authentication_flow";
                    break;
                case 3:
                    str4 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str4 = "registration_flow";
                    break;
            }
        }
        C32165H8c A062 = C63883iV.A06(context, r9, str7, str5, str4, this.A0L, (String) null, (String) null);
        C07530bf r7 = this.A07;
        FragmentActivity activity = getActivity();
        A062.A00 = new IDxLCallbacksShape165S0100000_1_I2(activity, this, new C70224Dh(activity), r5, this, r7, BDt(), AnonymousClass006.A01, this.A0A, str5, this.A0C);
        C31155GhB.A03(A062);
    }

    public final void AHz() {
        this.A08.setEnabled(false);
        this.A08.setClearButtonEnabled(false);
    }

    public final void AJV() {
        this.A08.setEnabled(true);
        this.A08.setClearButtonEnabled(true);
    }

    public final C313625r Aiy() {
        if (this.A0E) {
            return C313625r.PHONE;
        }
        return null;
    }

    public final AnonymousClass265 BDt() {
        if (this.A0E) {
            return AnonymousClass265.A0V;
        }
        return AnonymousClass265.A1E;
    }

    public final boolean BXY() {
        return AnonymousClass0wJ.A1T(this.A08.getText().length(), 6);
    }

    public final void C9G() {
        String A0f = C18180wK.A0f(this.A08);
        if (this.A0E) {
            C63103bV.A01(getContext(), this.A07, C63553hn.A00(this.A09, this.A0B), A0f, true);
            return;
        }
        if (this.A0D) {
            AnonymousClass01V.A0p.markerStart(725095506);
            AnonymousClass01V.A0p.markerAnnotate(725095506, "flow", "prod");
            A01(A0f, C63553hn.A00(this.A09, this.A0B));
        } else {
            A02(A0f, false);
        }
        C62713aZ.A00.A03(this.A07, BDt().A01);
    }

    public final void CHy(Context context, String str, String str2) {
        if (this.A0E) {
            C63103bV.A01(context, this.A07, str2, str, false);
        } else if (this.A0D) {
            A01(str, str2);
        } else {
            A02(str, true);
        }
    }

    public final void Cth(String str, Integer num) {
        if (this.A0G) {
            AnonymousClass3WW.A00(this, this.A05, this.A07, str);
            this.A0G = false;
        } else if (AnonymousClass006.A15 == num) {
            this.A0K.A05(str);
            this.A0J.A02();
        } else {
            C63553hn.A08(this.A0J, str);
        }
    }

    public final String getModuleName() {
        return "phone_confirmation";
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.A0D && this.A0H == null) {
            C25828Dsm A0W = C18190wL.A0W(getActivity());
            A0W.A0L(2131830195);
            A0W.A0p(AnonymousClass0wJ.A0o(this, this.A0B, 2131830194));
            A0W.A0I(R.drawable.confirmation_icon);
            A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
            Dialog A0G2 = A0W.A0G();
            this.A0H = A0G2;
            C13950oZ.A00(A0G2);
            C15730rn A062 = AnonymousClass269.A0W.A0B(this.A07).A06((C313625r) null, BDt());
            this.A0I.A00.putString(C18240wQ.A0g("RECOVERY_CODE_TYPE"), "sms");
            this.A0I.A02(A062);
            C18180wK.A1K(A062, this.A07);
        }
        AnonymousClass01V.A0p.markerAnnotate(725096125, DatePickerDialogModule.ARG_MODE, "sms");
        AnonymousClass01V.A0p.markerEnd(725096125, 2);
    }

    public static void A00(AnonymousClass1ci r5) {
        String string = r5.getString(2131836050);
        NotificationBar notificationBar = r5.A0J;
        Context context = notificationBar.getContext();
        notificationBar.A04(string, context.getColor(R.color.igds_success), context.getColor(R.color.igds_elevated_background));
    }

    private void A01(String str, String str2) {
        C32165H8c A052 = C63883iV.A05(getContext(), this.A07, str, str2, C63213h0.A01(94, 12, 11), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A052.A00 = new C27481sa(getActivity(), this, this.A07);
        C31155GhB.A03(A052);
    }

    public final void onAppBackgrounded() {
        RegFlowExtras regFlowExtras;
        int A032 = C14030oh.A03(1948543156);
        if (this.A0E && (regFlowExtras = this.A05) != null) {
            regFlowExtras.A0N = BDt().name();
            regFlowExtras.A03(Aiy());
            regFlowExtras.A05 = C18180wK.A0f(this.A08);
            AnonymousClass3Y3.A00(getContext()).A02(this.A07, this.A05);
        }
        C14030oh.A0A(-984396273, A032);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(1052312869, C14030oh.A03(-1206822333));
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        Integer A022;
        int A023 = C14030oh.A02(1558969250);
        super.onCreate(bundle);
        this.A07 = AnonymousClass0RA.A0C.A04(this.mArguments);
        this.A0I = AnonymousClass3V1.A00(this.mArguments);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("should_enable_auto_conf");
        } else {
            z = false;
        }
        this.A0F = z;
        C07530bf r3 = this.A07;
        String str = BDt().A01;
        C313625r Aiy = Aiy();
        RegFlowExtras regFlowExtras = this.A05;
        if (regFlowExtras == null) {
            A022 = null;
        } else {
            A022 = regFlowExtras.A02();
        }
        AnonymousClass3V1 r4 = this.A0I;
        AnonymousClass0wJ.A1N(r3, str);
        AnonymousClass3YT.A00(r3, r4, Aiy, A022, str, (String) null);
        C14030oh.A09(1373456028, A023);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        String replace;
        String A0n;
        CountryCodeData countryCodeData;
        String formatNumber;
        int A022 = C14030oh.A02(1967083849);
        LayoutInflater layoutInflater2 = layoutInflater;
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater2, viewGroup, R.layout.reg_container);
        this.A0J = C18240wQ.A0U(A0H2);
        layoutInflater2.inflate(R.layout.phone_confirmation_fragment, C18190wL.A0E(A0H2), true);
        this.A0E = requireArguments().getBoolean("arg_is_reg_flow");
        this.A05 = C18210wN.A0M(this);
        this.A0D = requireArguments().getBoolean("arg_is_multiple_account_recovery", false);
        String string = requireArguments().getString("phone_number_key");
        String string2 = requireArguments().getString("query_key");
        String string3 = requireArguments().getString("client_message");
        String string4 = requireArguments().getString("register_start_message");
        if (!this.A0E ? string == null || string2 == null : this.A05 == null) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass7Ko.A0D(z, "Must have the reg flow extra when in the reg flow, or a phone number and a lookup key when otherwise");
        this.A0A = string2;
        this.A0L = string3;
        this.A0C = string4;
        RegFlowExtras regFlowExtras = this.A05;
        String str = "";
        if (!this.A0E || regFlowExtras == null) {
            replace = string.replace("+", str);
        } else {
            replace = regFlowExtras.A0R;
        }
        this.A0B = replace;
        if (!this.A0E || (countryCodeData = regFlowExtras.A01) == null) {
            A0n = C18200wM.A0n(replace);
        } else {
            this.A09 = countryCodeData.A00();
            String str2 = countryCodeData.A01;
            String str3 = countryCodeData.A00;
            if (str3 != null) {
                formatNumber = PhoneNumberUtils.formatNumber(replace, str3);
            } else {
                formatNumber = PhoneNumberUtils.formatNumber(replace);
            }
            A0n = AnonymousClass00U.A0N(str2, formatNumber, ' ');
        }
        if (A0n != null) {
            str = A0n;
        }
        this.A0M = C18180wK.A0m(getContext(), str).toString();
        TextView A0L2 = AnonymousClass0wJ.A0L(A0H2, R.id.field_title);
        if (this.A0E) {
            C18200wM.A19(AnonymousClass0wJ.A0B(this), A0L2, this.A0M, 2131826845);
            A0L2.setTextAppearance(R.style.igds_headline_2);
            A0L2.setAllCaps(false);
        } else {
            A0L2.setText(2131826844);
        }
        TextView A0L3 = AnonymousClass0wJ.A0L(A0H2, R.id.field_detail);
        C07530bf r13 = this.A07;
        boolean z2 = this.A0D;
        AnonymousClass1ci r15 = this;
        if (z2) {
            r15 = null;
        }
        C64763rm r11 = new C64763rm(this, r13, this, r15, Aiy(), BDt(), this.A09, this.A0B);
        if (z2) {
            C18200wM.A19(AnonymousClass0wJ.A0B(this), A0L3, this.A0M, 2131835987);
        } else if (this.A0E) {
            String string5 = getString(2131823221);
            String string6 = getString(2131834853);
            SpannableStringBuilder A0E2 = C18200wM.A0E(C18220wO.A0k(this, string5, string6, 2131832464));
            C18720xk.A00(A0E2, this, string5, requireActivity().getColor(R.color.igds_link), 14);
            AnonymousClass3Zw.A01(A0E2, new IDxCSpanShape62S0200000_1_I2(requireActivity().getColor(R.color.igds_link), 1, this, r11), string6);
            A0L3.setText(A0E2);
            C18180wK.A0z(A0L3);
        } else {
            C18200wM.A19(AnonymousClass0wJ.A0B(this), A0L3, this.A0M, 2131834851);
            C63163fI.A04(A0L3, R.color.grey_5);
        }
        this.A00 = SystemClock.elapsedRealtime();
        SearchEditText searchEditText = (SearchEditText) A0H2.requireViewById(R.id.confirmation_field);
        this.A08 = searchEditText;
        C63163fI.A05(searchEditText);
        this.A08.requestFocus();
        this.A08.setHint(2131824256);
        this.A08.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        if (this.A0E && this.A05 != null && C09860go.A0p(this.A08) && !TextUtils.isEmpty(this.A05.A05)) {
            this.A08.setText(this.A05.A05);
        }
        this.A0K = (InlineErrorMessageView) A0H2.findViewById(R.id.confirmation_field_inline_error);
        InlineErrorMessageView.A03(C18240wQ.A0G(A0H2, R.id.confirmation_field_container));
        C24721jv r0 = new C24721jv(this.A08, this.A07, this, C18230wP.A0c(A0H2));
        this.A06 = r0;
        registerLifecycleListener(r0);
        if (!this.A0D && !this.A0E) {
            A0L3.setOnClickListener(r11);
        }
        C38040KHr kHr = C38040KHr.A01;
        C690946s r02 = new C690946s(this);
        this.A03 = r02;
        kHr.A03(r02, AnonymousClass45I.class);
        C690746q r03 = new C690746q(this);
        this.A01 = r03;
        kHr.A03(r03, AnonymousClass45D.class);
        C691046t r04 = new C691046t(this);
        this.A04 = r04;
        kHr.A03(r04, AnonymousClass45S.class);
        C690846r r05 = new C690846r(this);
        this.A02 = r05;
        kHr.A03(r05, AnonymousClass45R.class);
        if (this.A0E) {
            C63553hn.A05(A0H2, this, this.A07, Aiy(), BDt(), false);
            for (TextView A042 : new TextView[]{A0L3, C18180wK.A0G(A0H2, R.id.log_in_button)}) {
                C63163fI.A04(A042, R.color.igds_link);
            }
            AnonymousClass3YT.A00.A01(this.A07, Aiy(), BDt().A01);
        } else {
            C18200wM.A1D(A0H2, R.id.reg_footer_container);
        }
        C691847d.A02(this);
        C14030oh.A09(1319449344, A022);
        return A0H2;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1367963899);
        super.onDestroyView();
        unregisterLifecycleListener(this.A06);
        C691847d.A03(this);
        C38040KHr kHr = C38040KHr.A01;
        kHr.A04(this.A03, AnonymousClass45I.class);
        kHr.A04(this.A01, AnonymousClass45D.class);
        kHr.A04(this.A04, AnonymousClass45S.class);
        kHr.A04(this.A02, AnonymousClass45R.class);
        C63103bV.A03.A05(getContext());
        this.A06 = null;
        this.A08 = null;
        this.A0K = null;
        this.A0J = null;
        C14030oh.A09(-1634135274, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1143558386);
        super.onPause();
        C09860go.A0I(this.A08);
        C18180wK.A0F(this).setSoftInputMode(0);
        C14030oh.A09(16518198, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1752519897);
        super.onResume();
        C63553hn.A06(this.A08);
        C18180wK.A15(this);
        C14030oh.A09(541374712, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(799897039);
        super.onStart();
        C14030oh.A09(-912062893, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-10588112);
        super.onStop();
        Dialog dialog = this.A0H;
        if (dialog != null && dialog.isShowing()) {
            this.A0H.dismiss();
        }
        C14030oh.A09(-1543476083, A022);
    }
}
