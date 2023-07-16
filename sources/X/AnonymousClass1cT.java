package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.facebook.redex.IDxRListenerShape541S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape181S0200000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessAttributeSyncActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1cT  reason: invalid class name */
public final class AnonymousClass1cT extends C34640IcN implements C82424pb, C84274ss, C85924vz, C82034oy, C82224pH {
    public static final String __redex_internal_original_name = "BusinessContactButtonSetupFragment";
    public View A00;
    public View A01;
    public ActionButton A02;
    public BusinessFlowAnalyticsLogger A03;
    public BusinessInfoSectionView A04;
    public IgSwitch A05;
    public BusinessInfo A06;
    public UserSession A07;
    public User A08;
    public String A09;
    public HashSet A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Handler A0I = AnonymousClass0wJ.A0F();
    public final C82394pY A0J = new IDxObjectShape277S0100000_1_I2(this, 0);
    public final C82394pY A0K = C18220wO.A0P(this, 11);

    public static void A02(AnonymousClass1cT r14) {
        BusinessInfoSectionView businessInfoSectionView = r14.A04;
        UserSession userSession = r14.A07;
        businessInfoSectionView.setBusinessInfo(userSession, r14.A06, r14, false, r14.A0H, true, C63803iN.A05(AnonymousClass0TJ.A05, userSession, 36317672224329638L).booleanValue(), r14.A0G, false, r14.A0E, r14);
        r14.A03(false);
    }

    public final void Bl8() {
    }

    public final boolean Bvc(int i) {
        return false;
    }

    public final void Bw0() {
    }

    public final void CAm() {
    }

    public final void CAo() {
    }

    public final void CGF() {
    }

    public final void CGO() {
        this.A0D = false;
    }

    public final void CGY() {
        this.A0D = true;
    }

    public final void CRi() {
    }

    public final void CSm() {
    }

    public final String getModuleName() {
        return "business_contact_button_setup";
    }

    public static String A00(AnonymousClass1cT r3) {
        if (r3.A08.A1D() == null) {
            return "";
        }
        return PhoneNumberUtils.stripSeparators(AnonymousClass00U.A0V(r3.A08.A05.B55(), " ", r3.A08.A1D()));
    }

    public static Map A01(AnonymousClass1cT r7) {
        String str;
        C15680ri r6 = new C15680ri();
        BusinessInfo businessInfo = r7.A06;
        if (businessInfo != null) {
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            String str2 = null;
            if (publicPhoneContact == null) {
                str = null;
            } else {
                str = publicPhoneContact.A03;
            }
            String str3 = businessInfo.A0L;
            String str4 = businessInfo.A0B;
            Address address = businessInfo.A00;
            if (address != null) {
                str2 = address.A04;
            }
            String valueOf = String.valueOf(businessInfo.A0O);
            String valueOf2 = String.valueOf(businessInfo.A0R);
            r6.A0D("phone", str);
            r6.A0D("whatsapp", str3);
            r6.A0D("email", str4);
            r6.A0D("address", str2);
            r6.A0D("is_profile_audio_call_enabled", valueOf);
            r6.A0D("should_show_public_contacts", valueOf2);
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("phone", r6.A04("phone"));
        A0y.put("whatsapp", r6.A04("whatsapp"));
        A0y.put("email", r6.A04("email"));
        A0y.put("address", r6.A04("address"));
        A0y.put("is_profile_audio_call_enabled", r6.A04("is_profile_audio_call_enabled"));
        A0y.put("should_show_public_contacts", r6.A04("should_show_public_contacts"));
        return A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.A04.A08() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x000f
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A04
            boolean r0 = r0.A08()
            r1 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            com.instagram.model.business.BusinessInfo r0 = r3.A06
            com.instagram.model.business.BusinessInfo r0 = X.C62163Xl.A00(r0, r1)
            r3.A06 = r0
            com.instagram.business.ui.BusinessInfoSectionView r2 = r3.A04
            boolean r1 = r3.A0G
            boolean r0 = r0.A0R
            r2.A07(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cT.A03(boolean):void");
    }

    public final void Bvz(boolean z) {
        this.A02.setEnabled(true);
        this.A0B = true;
        A03(z);
    }

    public final void CDC(boolean z) {
        if (this.A03 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("should_show_public_contacts", String.valueOf(z));
            this.A03.Be5(new C37408JrQ("business_contact_info", this.A09, "contact_options_profile_display_toggle", (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
        if (!z || !this.A04.A08()) {
            this.A06 = C62163Xl.A00(this.A06, z);
            this.A0B = true;
            this.A02.setEnabled(true);
            return;
        }
        this.A04.A02(requireContext());
    }

    public final void CGe(C21971Sw r5) {
        FragmentActivity activity;
        if (r5 != null && r5.A01 != null && r5.A00 != null) {
            Intent A042 = C18250wR.A04(getContext(), BusinessAttributeSyncActivity.class);
            Bundle A062 = C18180wK.A06();
            C18190wL.A13(A062, this.A07.token);
            A062.putParcelable("fb_attributes", r5.A00);
            A062.putParcelable("ig_attributes", r5.A01);
            A042.putExtras(A062);
            if (isAdded() && (activity = getActivity()) != null) {
                C10650ih.A02(activity, A042);
            }
        }
    }

    public final void CVG() {
        String str;
        C49182qy.A00(this.A07).A00("start_funnel");
        UserSession userSession = this.A07;
        boolean A0E2 = C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36328220664015172L);
        UserSession userSession2 = this.A07;
        if (A0E2) {
            C84834tw.A00(requireActivity(), C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, userSession2), "ContactOptionsEntryPoint", "whatsapp_linking_in_business_contact_button_setup");
            return;
        }
        if (!AnonymousClass0wJ.A0Y(userSession2).A2y()) {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen";
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("back_stack_tag", "ContactOptionsEntryPoint");
        A0y.put("entrypoint", "whatsapp_linking_in_business_contact_button_setup");
        C63743iE A022 = C63743iE.A02(str, A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(this.A07);
        C18230wP.A1A(this, A0N, 2131838095);
        AnonymousClass1c8 A023 = C62853b1.A02(A0N, A022);
        C25786Drz A0Q = C18180wK.A0Q(requireActivity(), this.A07);
        A0Q.A07 = "ContactOptionsEntryPoint";
        A0Q.A08();
        A0Q.A03 = A023;
        A0Q.A05();
    }

    public final void D9K(Address address) {
        Address address2;
        if (address == null) {
            address2 = new Address("", "", "0", "", "");
        } else {
            address2 = address;
        }
        C62163Xl r1 = new C62163Xl(this.A06);
        r1.A0B = AnonymousClass0wJ.A0n(this.A04.A00);
        r1.A00 = address2;
        this.A06 = new BusinessInfo(r1);
        this.A04.A04(address);
        this.A0B = true;
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A0F && (businessFlowAnalyticsLogger = this.A03) != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("business_contact_info", this.A09, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        synchronized (((AnonymousClass3S4) C18180wK.A0c(this.A07, AnonymousClass3S4.class, 7)).A00) {
        }
        return false;
    }

    public final void Bk3() {
        C62883b4.A04();
        String str = this.A09;
        Address address = this.A06.A00;
        C04220Ms.A0B(str, 0);
        Bundle A062 = C18180wK.A06();
        C18210wN.A0x(A062, str);
        A062.putParcelable(AnonymousClass1cS.A0H, address);
        A062.putBoolean(AnonymousClass1c6.A0B, true);
        AnonymousClass1c6 r2 = new AnonymousClass1c6();
        r2.setArguments(A062);
        r2.setTargetFragment(this, 0);
        AnonymousClass0wJ.A19(r2, getActivity(), this.A07);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r1.A0C == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C8b() {
        /*
            r15 = this;
            X.Dd0 r0 = X.C62883b4.A01()
            X.DeW r4 = r0.A00()
            com.instagram.model.business.BusinessInfo r0 = r15.A06
            boolean r3 = r0.A0O
            com.instagram.business.ui.BusinessInfoSectionView r1 = r15.A04
            android.widget.EditText r0 = r1.A00
            boolean r0 = X.C18250wR.A1I(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x008e
            com.instagram.ui.widget.editphonenumber.EditPhoneNumberView r0 = r1.A0A
            android.widget.EditText r0 = r0.A01
            java.lang.String r0 = X.AnonymousClass0wJ.A0n(r0)
        L_0x0022:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            android.widget.TextView r0 = r1.A01
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            android.widget.TextView r0 = r1.A08
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r1.A0C
            r2 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            java.lang.String r1 = r15.A09
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r15.A03
            androidx.fragment.app.Fragment r2 = r4.A03(r0, r1, r3, r2)
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            com.instagram.service.session.UserSession r0 = r15.A07
            X.AnonymousClass0wJ.A19(r2, r1, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r15.A03
            if (r0 == 0) goto L_0x008d
            java.lang.String r2 = "business_contact_info"
            r5 = 0
            java.lang.String r3 = r15.A09
            java.lang.String r4 = "profile_native_calling"
            X.JrQ r1 = new X.JrQ
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.Be5(r1)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r15.A03
            java.lang.String r8 = r15.A09
            com.instagram.model.business.BusinessInfo r0 = r15.A06
            boolean r0 = r0.A0O
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_profile_audio_call_enabled"
            java.util.Map r12 = java.util.Collections.singletonMap(r0, r1)
            X.JrQ r6 = new X.JrQ
            r7 = r4
            r10 = r5
            r11 = r5
            r13 = r5
            r14 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.Bdt(r6)
        L_0x008d:
            return
        L_0x008e:
            android.widget.TextView r0 = r1.A07
            java.lang.CharSequence r0 = r0.getText()
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cT.C8b():void");
    }

    public final void CAn() {
        String str;
        C62883b4.A04();
        PublicPhoneContact publicPhoneContact = this.A06.A01;
        C04220Ms.A0B(publicPhoneContact, 0);
        Bundle A062 = C18180wK.A06();
        A062.putParcelable(AnonymousClass1dW.A0A, publicPhoneContact);
        AnonymousClass1dW r2 = new AnonymousClass1dW();
        r2.setArguments(A062);
        r2.setTargetFragment(this, 0);
        AnonymousClass0wJ.A19(r2, getActivity(), this.A07);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("business_contact_info", this.A09, "phone", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            PublicPhoneContact publicPhoneContact2 = this.A06.A01;
            if (publicPhoneContact2 == null) {
                str = null;
            } else {
                str = publicPhoneContact2.A03;
            }
            this.A03.Bdt(new C37408JrQ("business_contact_info", this.A09, (String) null, (String) null, (String) null, Collections.singletonMap("phone", String.valueOf(str)), (Map) null, (Map) null));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        ActionButton Crr = r5.Crr(new C25348Dk8(C18190wL.A0H(this, 119), AnonymousClass0wJ.A0B(this).getString(2131824331), R.drawable.instagram_arrow_back_24));
        this.A02 = Crr;
        Crr.setEnabled(this.A0B);
        r5.setIsLoading(this.A0C);
    }

    public final void onCreate(Bundle bundle) {
        Address address;
        String str;
        int A022 = C14030oh.A02(1063088398);
        super.onCreate(bundle);
        this.A09 = C18190wL.A0k(this);
        C24731jw.A01(this);
        UserSession A0V = C18180wK.A0V(this.mArguments);
        this.A07 = A0V;
        AnonymousClass3LY.A00(A0V).A01(this.A0K, C689546c.class);
        getParentFragmentManager().A0y(new IDxRListenerShape541S0100000_1_I2(this, 0), this, "native_calling_page_save");
        this.A08 = AnonymousClass0wJ.A0Y(this.A07);
        this.A03 = C37076Jk8.A00(C311924p.EDIT_PROFILE, this, this.A07, C18180wK.A0e());
        this.A0G = requireArguments().getBoolean("show_public_contacts_toggle", true);
        String A042 = C67353zP.A04(getContext(), this.A08.A0u(), this.A08.A0t(), this.A08.A0s());
        if (TextUtils.isEmpty(A042)) {
            address = new Address("", "", "0", "", "");
        } else {
            address = new Address(this.A08.A0u(), this.A08.A0s(), this.A08.A05.AXW(), this.A08.A0t(), A042);
        }
        String A002 = A00(this);
        String B55 = this.A08.A05.B55();
        String A1D = this.A08.A1D();
        switch (this.A08.A0m().intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "CALL";
                break;
            default:
                str = "TEXT";
                break;
        }
        PublicPhoneContact publicPhoneContact = new PublicPhoneContact(B55, A1D, A002, str);
        LIP A0H2 = this.A08.A0H();
        String str2 = null;
        if (A0H2 != null) {
            str2 = A0H2.A01;
        }
        C62163Xl r2 = new C62163Xl();
        r2.A09 = this.A08.A0w();
        r2.A0B = this.A08.A1C();
        r2.A01 = publicPhoneContact;
        r2.A00 = address;
        r2.A0J = this.A08.A17();
        r2.A0L = this.A08.A1N();
        r2.A0O = this.A08.A3b();
        r2.A0M = this.A08.A3E();
        r2.A05 = this.A08.A05.AhR();
        r2.A04 = this.A08.A12();
        r2.A06 = this.A08.A05.AhU();
        r2.A07 = this.A08.A13();
        r2.A08 = str2;
        r2.A0C = this.A08.A05.Ahe();
        r2.A0D = this.A08.A05.Ahf();
        r2.A0E = this.A08.A05.Ahh();
        r2.A0F = this.A08.A05.Ahg();
        r2.A0R = this.A08.A30();
        this.A06 = new BusinessInfo(r2);
        this.A0H = !C59623Lo.A01(this.A08);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("business_contact_info", this.A09, (String) null, (String) null, (String) null, A01(this), (Map) null, (Map) null));
        }
        AnonymousClass3LY.A00(this.A07).A01(this.A0J, AnonymousClass46E.class);
        C14030oh.A09(-795239667, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(474308974);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.contact_button_setup_fragment_layout);
        C14030oh.A09(1132664414, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(140946808);
        super.onDestroy();
        AnonymousClass3LY.A00(this.A07).A02(this.A0J, AnonymousClass46E.class);
        AnonymousClass3LY.A00(this.A07).A02(this.A0K, C689546c.class);
        C14030oh.A09(-513979535, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1611485396);
        super.onDestroyView();
        this.A05 = null;
        C14030oh.A09(-1651880704, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(337199959);
        super.onPause();
        this.A04.A01();
        C14030oh.A09(1984754353, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1763591004);
        super.onResume();
        this.A04.setBusinessInfoListeners(this);
        C18240wQ.A10(this);
        C18180wK.A0F(this).setSoftInputMode(3);
        A03(false);
        C14030oh.A09(864818697, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(249560852);
        super.onStop();
        C18240wQ.A10(this);
        C18180wK.A0F(this).setSoftInputMode(3);
        C14030oh.A09(2128965205, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TreeJNI treeValue;
        String stringValue;
        ArrayList<String> stringArrayList;
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.loading_spinner);
        this.A00 = view.requireViewById(R.id.contact_info_container);
        this.A04 = (BusinessInfoSectionView) view.findViewById(R.id.business_info_section);
        boolean A3E = this.A08.A3E();
        this.A0A = C18200wM.A0u();
        if (A3E) {
            Bundle bundle2 = this.mArguments;
            if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("ldp_app_ids")) == null)) {
                this.A0A = new HashSet(stringArrayList);
            }
            this.A0A.contains(this.A08.A12());
        }
        A02(this);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.public_business_information_text);
        int i = 2131833816;
        if (C59623Lo.A00(this.A08)) {
            i = 2131833806;
        }
        A0L.setText(i);
        UserSession userSession = this.A07;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A05(r3, userSession, 36313905538008814L).booleanValue()) {
            View requireViewById = this.A04.requireViewById(R.id.business_attribute_sync_switch_container);
            TextView A0L2 = AnonymousClass0wJ.A0L(requireViewById, R.id.title);
            TextView A0L3 = AnonymousClass0wJ.A0L(requireViewById, R.id.sub_title);
            this.A05 = (IgSwitch) requireViewById.findViewById(R.id.toggle);
            A0L2.setText(2131822775);
            A0L3.setText(this.A08.BK7());
            Boolean AlY = this.A08.A05.AlY();
            if (AlY == null || !AlY.booleanValue()) {
                requireViewById.setVisibility(8);
            } else {
                requireViewById.setVisibility(0);
                AnonymousClass3S4 r2 = (AnonymousClass3S4) C18180wK.A0c(this.A07, AnonymousClass3S4.class, 7);
                this.A05.setChecked(this.A08.A3B());
                this.A05.A07 = new IDxTListenerShape181S0200000_1_I2(0, (Object) this, (Object) r2);
                synchronized (r2.A00) {
                }
            }
        }
        BusinessInfoSectionView businessInfoSectionView = this.A04;
        if (businessInfoSectionView != null) {
            this.A08.A1N();
            businessInfoSectionView.A05(this.A07);
        }
        IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent A002 = AnonymousClass312.A00();
        if (!(A002 == null || (treeValue = A002.getTreeValue("business_info_sync_reminder(business_info_type:\"GENERAL\",identity_id:$identity_id)", IGFxImBusinessReminderQueryResponseImpl.FxIdentityManagement.BciReminderContent.BusinessInfoSyncReminder.class)) == null || (stringValue = treeValue.getStringValue("subtext")) == null)) {
            TextView A0L4 = AnonymousClass0wJ.A0L(view, R.id.fx_im_bci_contact_info_reminder);
            A0L4.setVisibility(0);
            A0L4.setText(stringValue);
            UserSession userSession2 = this.A07;
            C319129l r1 = C319129l.BIZ_EDIT_GENERAL_CONTACT_INFO;
            C04220Ms.A0B(userSession2, 0);
            C63243h6.A02(AnonymousClass2A7.A0D, r1, userSession2);
        }
        if (C63803iN.A05(r3, this.A07, 2342165959952834102L).booleanValue()) {
            View view2 = this.A01;
            if (!(view2 == null || this.A00 == null)) {
                view2.setVisibility(0);
                this.A00.setVisibility(8);
            }
            AnonymousClass2KW.A00(C63873iU.A06(this, 9), this.A07, this, false);
        }
    }
}
