package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.1co  reason: invalid class name and case insensitive filesystem */
public final class C23231co extends C34640IcN implements C82424pb, AnonymousClass4tH, C82034oy, C82814qJ, C82654q3, C82854qN {
    public static final EnumSet A0L = EnumSet.of(C313225m.ARGUMENT_EDIT_PROFILE_FLOW, C313225m.ARGUMENT_ADD_PHONE_NUMBER_FLOW);
    public static final String __redex_internal_original_name = "PhoneNumberEntryFragment";
    public View A00;
    public TextView A01;
    public IgTextView A02;
    public IgSwitch A03;
    public C313225m A04;
    public UserSession A05;
    public AnonymousClass3F8 A06;
    public EditPhoneNumberView A07;
    public ProgressButton A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;
    public AnonymousClass06E A0D;
    public ActionButton A0E;
    public String A0F;
    public boolean A0G;
    public final Handler A0H = C18250wR.A08();
    public final C63873iU A0I = C63873iU.A06(this, 68);
    public final C63873iU A0J = C63873iU.A06(this, 67);
    public final Runnable A0K = new AnonymousClass4PJ(this);

    public final void Bl8() {
    }

    public final boolean Bvc(int i) {
        if (i != 2) {
            return false;
        }
        if (!this.A0E.isEnabled()) {
            return true;
        }
        A02(this);
        return true;
    }

    public final void CAo() {
    }

    public final String getModuleName() {
        return "phone_number_entry";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x0032
            com.instagram.actionbar.ActionButton r0 = r3.A0E
            if (r0 == 0) goto L_0x0032
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x001b
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r3.A08
            if (r1 == 0) goto L_0x0025
            r0 = r2 ^ 1
            r1.setEnabled(r0)
        L_0x0025:
            android.view.View r0 = r3.A00
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0032
            com.instagram.igds.components.switchbutton.IgSwitch r0 = r3.A03
            r0.setEnabled(r2)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23231co.A00():void");
    }

    public static void A01(AnonymousClass3Um r9, C23231co r10, boolean z) {
        boolean A1Z = C18180wK.A1Z(r10.A04, C313225m.ARGUMENT_TWOFAC_FLOW);
        String phoneNumber = r10.A07.getPhoneNumber();
        String countryCodeWithoutPlus = r10.A07.A04.getCountryCodeWithoutPlus();
        String A0n = AnonymousClass0wJ.A0n(r10.A07.A01);
        Bundle A062 = C18180wK.A06();
        r9.A00(A062);
        AnonymousClass2SL.A00(A062, phoneNumber, countryCodeWithoutPlus, A0n, A1Z, !A1Z);
        A062.putBoolean("AUTO_CONFIRM_SMS", z);
        C25786Drz A002 = C63463hW.A00(r10.getActivity(), r10.A05);
        A002.A0A(A062, new AnonymousClass1aA());
        A002.A0C(r10, 0);
        A002.A0B = true;
        A002.A07();
    }

    public static void A02(C23231co r6) {
        C32165H8c h8c;
        C63873iU r0;
        C23231co r4 = r6;
        if (A0L.contains(r6.A04)) {
            if (TextUtils.isEmpty(AnonymousClass0wJ.A0n(r6.A07.A01))) {
                C18180wK.A12(r6);
                C38039KHq A002 = AnonymousClass3LY.A00(r6.A05);
                UserSession userSession = r6.A05;
                if (userSession != null) {
                    userSession.getUserId();
                }
                A002.CWx(new C689245z());
                return;
            }
            r6.A06.A00("contact_point", "add_contact_point");
            C63103bV.A03.A03(r6.getActivity(), r6.A05, r4, AnonymousClass265.A19, r6.A07.getPhoneNumber());
            String phoneNumber = r4.A07.getPhoneNumber();
            h8c = C63503hc.A01(r4.getRootActivity().getApplicationContext(), r4.A05, AnonymousClass006.A0C, phoneNumber);
            r0 = r4.A0I;
        } else if (r6.A04 != C313225m.ARGUMENT_TWOFAC_FLOW) {
            return;
        } else {
            if (TextUtils.isEmpty(r6.A07.getPhoneNumber())) {
                C63813iO.A0D(r6.getActivity(), r6.getString(2131832475), 0);
                return;
            }
            h8c = C62403Zn.A02(r6.getContext(), r6.A05, r6.A07.getPhoneNumber());
            r0 = r6.A0J;
        }
        h8c.A00 = r0;
        r4.schedule(h8c);
    }

    public final boolean BNR() {
        C313225m r2 = this.A04;
        C313225m r0 = C313225m.ARGUMENT_TWOFAC_FLOW;
        C12560m7 r1 = this.mFragmentManager;
        if (r2 == r0) {
            r1.A11((String) null, 1);
            C63463hW.A03();
            Bundle A0E2 = AnonymousClass0wJ.A0E(this.A05);
            C29211xV r22 = new C29211xV();
            r22.setArguments(A0E2);
            AnonymousClass0wJ.A19(r22, getActivity(), this.A05);
            return true;
        }
        r1.A11("PhoneNumberEntryFragment.BACKSTATE_NAME", 1);
        C38039KHq A002 = AnonymousClass3LY.A00(this.A05);
        UserSession userSession = this.A05;
        if (userSession != null) {
            userSession.getUserId();
        }
        A002.CWx(new C689245z());
        return true;
    }

    public final void CHy(Context context, String str, String str2) {
        AnonymousClass06E r2 = this.A0D;
        C32165H8c A042 = C63503hc.A04(this.A05, str2, str, true);
        A042.A00 = new AnonymousClass1iC(str2, str);
        C31155GhB.A01(context, r2, A042);
    }

    public final void CRi() {
        if (this.A0G) {
            C18180wK.A11(this);
        }
    }

    public final void CjW(CountryCodeData countryCodeData) {
        this.A07.setCountryCodeWithCountryPrefix(countryCodeData);
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final void CSm() {
        A00();
    }

    public final void afterOnResume() {
        super.afterOnResume();
        if ("personal_information".equals(this.A0F)) {
            C32165H8c A012 = C62403Zn.A01(getContext(), this.A05);
            A012.A00 = new IDxDCallbackShape173S0100000_1_I2(getParentFragmentManager(), this, 1);
            schedule(A012);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r3.A07.getPhoneNumber().equalsIgnoreCase(r3.A09) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r4) {
        /*
            r3 = this;
            r1 = 2131832467(0x7f112e93, float:1.9297989E38)
            r0 = 506(0x1fa, float:7.09E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r3, r0)
            com.instagram.actionbar.ActionButton r2 = r4.Crq(r0, r1)
            r3.A0E = r2
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0023
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r3.A07
            java.lang.String r1 = r0.getPhoneNumber()
            java.lang.String r0 = r3.A09
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 8
            if (r1 != 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            r2.setVisibility(r0)
            r3.A00()
            r0 = 1
            r3.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23231co.configureActionBar(X.4u2):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1196399909);
        super.onCreate(bundle);
        this.A04 = C313225m.values()[requireArguments().getInt("flow_key")];
        this.A05 = AnonymousClass0wJ.A0W(this);
        this.A0F = requireArguments().getString("ENTRYPOINT");
        this.A06 = new AnonymousClass3F8(this.A05);
        C14030oh.A09(-596575268, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C61583Uh r0;
        int A022 = C14030oh.A02(2112595722);
        View inflate = layoutInflater.inflate(R.layout.fragment_phone_number_entry_new, viewGroup, false);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.phone_view_next_button);
        this.A08 = progressButton;
        AnonymousClass0wJ.A16(progressButton, HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, this);
        this.A07 = (EditPhoneNumberView) inflate.requireViewById(R.id.phone_number_view);
        this.A01 = C18180wK.A0G(inflate, R.id.two_fac_phone_number_info_view);
        this.A00 = inflate.requireViewById(R.id.phone_number_confirmed_toggle_row);
        this.A02 = C18250wR.A0L(inflate, R.id.phone_number_confirmed_secondary_text);
        this.A03 = C18250wR.A0N(inflate, R.id.phone_number_confirmed_toggle_switch);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("PHONE_NUMBER");
            this.A09 = string;
            if (!TextUtils.isEmpty(string)) {
                this.A07.setupEditPhoneNumberView(C60053Nl.A01(getContext(), this.mArguments.getString("COUNTRY_CODE")), this.mArguments.getString("NATIONAL_NUMBER"));
            } else {
                Integer num = AnonymousClass006.A0N;
                FragmentActivity activity = getActivity();
                UserSession userSession = this.A05;
                AnonymousClass265 r1 = AnonymousClass265.A19;
                AnonymousClass0wJ.A1O(activity, userSession);
                C04220Ms.A0B(r1, 3);
                List A042 = C63573hp.A04(activity, userSession, r1, num);
                if (!A042.isEmpty() && (r0 = (C61583Uh) A042.get(0)) != null) {
                    String str = r0.A01;
                    try {
                        C72344Np A0A2 = PhoneNumberUtil.A01(getActivity()).A0A(str, C60053Nl.A00(getActivity()).A00);
                        String A0j = C18180wK.A0j("%d", C18240wQ.A1b(A0A2.A02));
                        EditPhoneNumberView editPhoneNumberView = this.A07;
                        Context context = getContext();
                        int i = A0A2.A00;
                        C04220Ms.A0B(context, 0);
                        String A0B2 = PhoneNumberUtil.A01(context).A0B(i);
                        C04220Ms.A06(A0B2);
                        editPhoneNumberView.setupEditPhoneNumberView(new CountryCodeData(i, A0B2), A0j);
                    } catch (C32122Ah unused) {
                    }
                }
            }
            this.A0B = this.mArguments.getBoolean("IS_PHONE_CONFIRMED");
        }
        EditPhoneNumberView editPhoneNumberView2 = this.A07;
        EditPhoneNumberView.A01(this, (C12560m7) null, this.A04, (C82854qN) null, this.A05, this, editPhoneNumberView2);
        this.A07.requestFocus();
        if (A0L.contains(this.A04)) {
            AnonymousClass0wJ.A0L(inflate, R.id.instructions_view).setText(2131836051);
        }
        this.A0D = AnonymousClass06E.A00(this);
        this.A06.A00.markerEnd(857808781, 2);
        C14030oh.A09(-1828716266, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1321708138);
        super.onDestroy();
        C63103bV.A03.A05(getContext());
        C14030oh.A09(-894334433, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(583932428);
        super.onDestroyView();
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        C14030oh.A09(1318306072, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-451001097);
        super.onPause();
        this.A0H.removeCallbacks(this.A0K);
        C14030oh.A09(-1404588560, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1659353686);
        super.onResume();
        if (C18240wQ.A1S(requireArguments(), "push_to_next")) {
            this.A0H.post(this.A0K);
        } else {
            EditPhoneNumberView editPhoneNumberView = this.A07;
            editPhoneNumberView.A01.postDelayed(editPhoneNumberView.A0A, 200);
        }
        C14030oh.A09(-1567584986, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1384329771);
        super.onStart();
        C313225m r1 = this.A04;
        if (r1 == C313225m.ARGUMENT_EDIT_PROFILE_FLOW || r1 == C313225m.ARGUMENT_TWOFAC_FLOW) {
            getRootActivity();
            C63103bV.A03.A05(getContext());
        }
        C14030oh.A09(-647072891, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1481032813);
        C313225m r1 = this.A04;
        if (r1 == C313225m.ARGUMENT_EDIT_PROFILE_FLOW || r1 == C313225m.ARGUMENT_TWOFAC_FLOW) {
            getRootActivity();
        }
        C18240wQ.A10(this);
        C18180wK.A0F(this).setSoftInputMode(3);
        super.onStop();
        C14030oh.A09(-526455746, A022);
    }
}
