package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessInfoSectionView;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1cS  reason: invalid class name */
public final class AnonymousClass1cS extends C34640IcN implements C82424pb, C85924vz, C82034oy, C144658ir, C84264sr, C82224pH, C82854qN, CallerContextable {
    public static final String A0H = AnonymousClass00U.A0L(AnonymousClass1cS.class.getName(), ".EXTRA_ADDRESS");
    public static final String __redex_internal_original_name = "EditBusinessProfileFragment";
    public View A00;
    public BusinessFlowAnalyticsLogger A01;
    public C84654td A02;
    public BusinessInfoSectionView A03;
    public C24711ju A04;
    public BusinessInfo A05;
    public UserSession A06;
    public User A07;
    public String A08;
    public boolean A09 = false;
    public LinearLayout A0A;
    public BusinessNavBar A0B;
    public C84464tB A0C;
    public boolean A0D;
    public final Handler A0E = AnonymousClass0wJ.A0F();
    public final Runnable A0F = new AnonymousClass4OV(this);
    public final C82394pY A0G = C18220wO.A0P(this, 12);

    public static void A00(AnonymousClass1cS r14, boolean z) {
        AnonymousClass1cS r7 = r14;
        BusinessInfoSectionView businessInfoSectionView = r14.A03;
        UserSession userSession = r14.A06;
        BusinessInfo businessInfo = r14.A05;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        boolean z2 = z;
        businessInfoSectionView.setBusinessInfo(userSession, businessInfo, r7, true, true, C63803iN.A05(r3, userSession, 36318587052364423L).booleanValue(), C63803iN.A05(r3, r14.A06, 36317672224329638L).booleanValue(), true, z2, false, r7);
        r7.A02(z2);
    }

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final boolean Bvc(int i) {
        return false;
    }

    public final void CAm() {
        A02(true);
    }

    public final void CAn() {
    }

    public final void CRi() {
    }

    public final void CSm() {
    }

    public final String getModuleName() {
        return "edit_business_profile";
    }

    private void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("edit_contact_info", this.A08, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.A03.A08() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(boolean r4) {
        /*
            r3 = this;
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            boolean r0 = r0.A0R
            r2 = 1
            if (r0 == 0) goto L_0x0010
            com.instagram.business.ui.BusinessInfoSectionView r0 = r3.A03
            boolean r0 = r0.A08()
            r1 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.instagram.model.business.BusinessInfo r0 = r3.A05
            com.instagram.model.business.BusinessInfo r0 = X.C62163Xl.A00(r0, r1)
            r3.A05 = r0
            com.instagram.business.ui.BusinessInfoSectionView r1 = r3.A03
            boolean r0 = r0.A0R
            r1.A07(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cS.A02(boolean):void");
    }

    public final void Bk3() {
        A01("address");
        C62883b4.A04();
        String str = this.A08;
        Address address = this.A05.A00;
        C04220Ms.A0B(str, 0);
        Bundle A062 = C18180wK.A06();
        C18210wN.A0x(A062, str);
        A062.putParcelable(A0H, address);
        A062.putBoolean(AnonymousClass1c6.A0B, false);
        AnonymousClass1c6 r2 = new AnonymousClass1c6();
        r2.setArguments(A062);
        r2.setTargetFragment(this, 0);
        AnonymousClass0wJ.A19(r2, getActivity(), this.A06);
    }

    public final void Bl8() {
        A01("area_code");
    }

    public final void Bw0() {
        A01("email");
    }

    public final void C46(int i, boolean z) {
        int i2;
        int height = this.A0B.getHeight();
        View A092 = C18250wR.A09(this);
        int[] iArr = new int[2];
        if (A092 != null) {
            A092.getLocationInWindow(iArr);
        }
        if (i > 0) {
            if (A092 != null) {
                i2 = A092.getHeight();
            } else {
                i2 = 0;
            }
            int A072 = (C09860go.A07(getContext()) - iArr[1]) - i2;
            int i3 = i + height;
            if (A072 < i3) {
                this.A00.postDelayed(new C73074Qv(this, i3 - A072), 300);
            }
        }
    }

    public final void CAo() {
        A01("phone");
    }

    public final void CDC(boolean z) {
        if (this.A01 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("should_show_public_contacts", String.valueOf(z));
            this.A01.Be5(new C37408JrQ("edit_contact_info", this.A08, "contact_options_profile_display_toggle", (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
        if (!z || !this.A03.A08()) {
            this.A05 = C62163Xl.A00(this.A05, z);
        } else {
            this.A03.A02(requireContext());
        }
    }

    public final void CJ9() {
        A01("skip");
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdo(new C37408JrQ("edit_contact_info", this.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C18220wO.A1N(this.A02);
    }

    public final void CVG() {
        String str;
        C49182qy.A00(this.A06).A00("start_funnel");
        UserSession userSession = this.A06;
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36328220664015172L)) {
            C84834tw.A00(requireActivity(), C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, this.A06), "edit_business_profile", "whatsapp_linking_in_business_conversion_flow");
            return;
        }
        if (!AnonymousClass0wJ.A0Y(this.A06).A2y()) {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen";
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("back_stack_tag", "edit_business_profile");
        A0y.put("entrypoint", "whatsapp_linking_in_business_conversion_flow");
        C63743iE A022 = C63743iE.A02(str, A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(this.A06);
        C18230wP.A1A(this, A0N, 2131838095);
        AnonymousClass1c8 A023 = C62853b1.A02(A0N, A022);
        C25786Drz A0Q = C18180wK.A0Q(requireActivity(), this.A06);
        A0Q.A07 = "edit_business_profile";
        A0Q.A08();
        A0Q.A03 = A023;
        A0Q.A05();
    }

    public final void CjW(CountryCodeData countryCodeData) {
        this.A03.setCountryCode(countryCodeData);
        String str = countryCodeData.A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("area_code", str);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("edit_contact_info", this.A08, "area_code_option", (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
    }

    public final void D9K(Address address) {
        BusinessInfo businessInfo = this.A05;
        if (businessInfo == null) {
            businessInfo = AnonymousClass0wJ.A0R(this.A02).A06;
            this.A05 = businessInfo;
        }
        BusinessInfoSectionView businessInfoSectionView = this.A03;
        if (businessInfoSectionView != null) {
            C62163Xl r1 = new C62163Xl(businessInfo);
            r1.A0B = AnonymousClass0wJ.A0n(businessInfoSectionView.A00);
            r1.A01 = this.A03.getSubmitPublicPhoneContact();
            r1.A00 = address;
            this.A05 = new BusinessInfo(r1);
            this.A03.A04(address);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.setTitle("");
        if (this.A0D) {
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 137);
        }
    }

    public final C10300i6 getSession() {
        return this.A06;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("edit_contact_info", this.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A0D) {
            return true;
        }
        C18230wP.A1Q(this.A02);
        return true;
    }

    public final void C8b() {
        C25039DeW A002 = C62883b4.A01().A00();
        boolean z = this.A05.A0O;
        AnonymousClass0wJ.A19(A002.A03(this.A01, this.A08, z, false), requireActivity(), this.A06);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("edit_contact_info", this.A08, "profile_native_calling", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            this.A01.Bdt(new C37408JrQ("profile_native_calling", this.A08, (String) null, (String) null, (String) null, Collections.singletonMap("is_profile_audio_call_enabled", String.valueOf(this.A05.A0O)), (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CCX() {
        /*
            r11 = this;
            X.C18240wQ.A10(r11)
            java.lang.String r1 = "continue"
            r11.A01(r1)
            com.instagram.model.business.BusinessInfo r1 = r11.A05
            java.lang.String r3 = r1.A0B
            com.instagram.model.business.Address r5 = r1.A00
            if (r5 == 0) goto L_0x00b1
            java.lang.String r2 = r5.A03
        L_0x0012:
            com.instagram.business.ui.BusinessInfoSectionView r4 = r11.A03
            android.widget.EditText r1 = r4.A00
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x009d
            android.widget.EditText r1 = r4.A00
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r1)
            boolean r1 = X.AnonymousClass0hA.A09(r1)
            if (r1 != 0) goto L_0x009d
            r1 = 2131832597(0x7f112f15, float:1.9298252E38)
            java.lang.String r6 = r11.getString(r1)
            java.lang.String r7 = "INVALID_EMAIL"
        L_0x0035:
            java.lang.String r1 = "INVALID_EMAIL"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0090
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            android.widget.TextView r4 = r1.A05
        L_0x0041:
            r1 = 0
            r4.setVisibility(r1)
        L_0x0045:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x0075
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "email"
            r9.put(r1, r3)
        L_0x0058:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = "address"
            r9.put(r1, r2)
        L_0x0063:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "business_info_validation"
            X.JrQ r2 = new X.JrQ
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.BcB(r2)
        L_0x0075:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x008f
            java.lang.String r3 = "edit_contact_info"
            r8 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "save_info"
            com.instagram.model.business.BusinessInfo r0 = r11.A05
            java.util.Map r9 = X.C34492Jt.A00(r0)
            X.JrQ r2 = new X.JrQ
            r10 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Bdy(r2)
        L_0x008f:
            return
        L_0x0090:
            java.lang.String r1 = "NO_CONTACT_INFORMATION_PROVIDED"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0045
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            android.widget.TextView r4 = r1.A02
            goto L_0x0041
        L_0x009d:
            if (r5 == 0) goto L_0x00b5
            java.lang.String r1 = r5.A00
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00b5
            r1 = 2131832596(0x7f112f14, float:1.929825E38)
            java.lang.String r6 = r11.getString(r1)
            java.lang.String r7 = "NO_CITY"
            goto L_0x0035
        L_0x00b1:
            java.lang.String r2 = ""
            goto L_0x0012
        L_0x00b5:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            if (r1 == 0) goto L_0x00e7
            java.util.HashMap r9 = X.AnonymousClass0wJ.A0y()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = "email"
            r9.put(r1, r3)
        L_0x00c8:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00d3
            java.lang.String r1 = "address"
            r9.put(r1, r2)
        L_0x00d3:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r11.A01
            java.lang.String r3 = "edit_contact_info"
            r6 = 0
            java.lang.String r4 = r11.A08
            java.lang.String r5 = "business_info_validation"
            X.JrQ r2 = new X.JrQ
            r7 = r6
            r8 = r6
            r10 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.BcA(r2)
        L_0x00e7:
            X.4td r1 = r11.A02
            X.3yv r3 = X.AnonymousClass0wJ.A0R(r1)
            com.instagram.model.business.BusinessInfo r1 = r11.A05
            X.3Xl r2 = new X.3Xl
            r2.<init>(r1)
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            android.widget.EditText r1 = r1.A00
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r1)
            r2.A0B = r1
            com.instagram.business.ui.BusinessInfoSectionView r1 = r11.A03
            com.instagram.model.business.PublicPhoneContact r1 = r1.getSubmitPublicPhoneContact()
            r2.A01 = r1
            com.instagram.model.business.BusinessInfo r1 = r11.A05
            boolean r1 = r1.A0O
            r2.A0O = r1
            com.instagram.user.model.User r1 = r11.A07
            java.lang.String r1 = r1.A1N()
            r2.A0L = r1
            com.instagram.model.business.BusinessInfo r1 = new com.instagram.model.business.BusinessInfo
            r1.<init>((X.C62163Xl) r2)
            r3.A06 = r1
            X.1ju r1 = r11.A04
            if (r1 == 0) goto L_0x0122
            r1.A01()
        L_0x0122:
            android.os.Handler r1 = r11.A0E
            java.lang.Runnable r0 = r11.A0F
            r1.removeCallbacks(r0)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cS.CCX():void");
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        C84654td A012 = C67293zJ.A01(this);
        A012.getClass();
        this.A02 = A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        if (r5.A01(r6.A06).A30() != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -1777263224(0xffffffff96111d88, float:-1.1722325E-25)
            int r4 = X.C14030oh.A02(r0)
            super.onCreate(r7)
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0W(r6)
            r6.A06 = r2
            X.4td r0 = r6.A02
            X.24p r1 = r0.Aiz()
            X.4td r0 = r6.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C18190wL.A0O(r1, r6, r2, r0)
            r6.A01 = r0
            X.C24731jw.A01(r6)
            X.0m7 r2 = r6.getParentFragmentManager()
            r3 = 1
            com.facebook.redex.IDxRListenerShape541S0100000_1_I2 r1 = new com.facebook.redex.IDxRListenerShape541S0100000_1_I2
            r1.<init>(r6, r3)
            java.lang.String r0 = "native_calling_page_save"
            r2.A0y(r1, r6, r0)
            com.instagram.service.session.UserSession r0 = r6.A06
            X.KHq r2 = X.AnonymousClass3LY.A00(r0)
            java.lang.Class<X.46c> r1 = X.C689546c.class
            X.4pY r0 = r6.A0G
            r2.A01(r0, r1)
            com.instagram.service.session.UserSession r0 = r6.A06
            X.0Ok r5 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r5.A01(r0)
            r6.A07 = r0
            com.instagram.model.business.BusinessInfo r1 = r6.A05
            if (r1 != 0) goto L_0x00cc
            android.os.Bundle r1 = r6.mArguments
            X.4td r0 = r6.A02
            if (r0 == 0) goto L_0x00f0
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r2 = r0.A06
        L_0x0057:
            if (r2 == 0) goto L_0x005d
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x006a
        L_0x005d:
            com.instagram.service.session.UserSession r0 = r6.A06
            com.instagram.user.model.User r0 = r5.A01(r0)
            boolean r1 = r0.A30()
            r0 = 0
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r0 = 1
        L_0x006b:
            com.instagram.model.business.BusinessInfo r5 = X.C62163Xl.A00(r2, r0)
            X.4td r0 = r6.A02
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r2 = r0.A07
            if (r2 == 0) goto L_0x0099
            X.3Xl r1 = new X.3Xl
            r1.<init>(r5)
            java.lang.String r0 = r2.A0B
            r1.A0B = r0
            com.instagram.model.business.PublicPhoneContact r0 = r2.A01
            r1.A01 = r0
            com.instagram.model.business.Address r0 = r2.A00
            r1.A00 = r0
            r1.A0N = r3
            com.instagram.model.business.BusinessInfo r5 = new com.instagram.model.business.BusinessInfo
            r5.<init>((X.C62163Xl) r1)
            X.4td r0 = r6.A02
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            r0.A06 = r5
        L_0x0099:
            r3 = 0
            java.lang.String r2 = r5.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00a8
            boolean r0 = X.AnonymousClass0hA.A09(r2)
            if (r0 != 0) goto L_0x00a9
        L_0x00a8:
            r2 = r3
        L_0x00a9:
            com.instagram.model.business.Address r1 = r5.A00
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b6
            r3 = r1
        L_0x00b6:
            X.3Xl r0 = new X.3Xl
            r0.<init>(r5)
            r0.A0B = r2
            r0.A00 = r3
            com.instagram.model.business.BusinessInfo r1 = new com.instagram.model.business.BusinessInfo
            r1.<init>((X.C62163Xl) r0)
            X.4td r0 = r6.A02
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            r0.A06 = r1
        L_0x00cc:
            r6.A05 = r1
            java.lang.String r0 = X.C18190wL.A0k(r6)
            r6.A08 = r0
            r0 = 0
            X.4tB r0 = X.C25711DqZ.A01(r6, r0, r0)
            r6.A0C = r0
            X.4td r0 = r6.A02
            com.instagram.business.controller.datamodel.ConversionStep r1 = r0.CWQ()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            boolean r0 = X.C18240wQ.A1Y(r1, r0)
            r6.A0D = r0
            r0 = 196777132(0xbba94ac, float:7.186829E-32)
            X.C14030oh.A09(r0, r4)
            return
        L_0x00f0:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r2 = r1.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r2 = (com.instagram.model.business.BusinessInfo) r2
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cS.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(108382590);
        View inflate = layoutInflater.inflate(R.layout.edit_business_profile_fragment, viewGroup, false);
        BusinessNavBar A0N = C18240wQ.A0N(inflate);
        this.A0B = A0N;
        C24711ju r0 = new C24711ju(A0N, (C84264sr) this, 2131831737, -1);
        this.A04 = r0;
        registerLifecycleListener(r0);
        this.A0B.setVisibility(0);
        BusinessNavBar businessNavBar = this.A0B;
        int i = 2131826219;
        if (this.A02.CWP() != null) {
            i = 2131831737;
        }
        businessNavBar.setPrimaryButtonText(i);
        this.A0B.setSecondaryButtonText(2131826224);
        BusinessNavBar businessNavBar2 = this.A0B;
        businessNavBar2.A03.setVisibility(0);
        businessNavBar2.A00();
        this.A0C.A6s(this);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.public_business_information_text);
        int i2 = 2131833806;
        if (C67293zJ.A05(this.A02)) {
            i2 = 2131833816;
        }
        A0L.setText(i2);
        if (requireArguments().getBoolean("update_from_argument", false)) {
            C62163Xl r4 = new C62163Xl(this.A05);
            r4.A0B = requireArguments().getString("android.intent.extra.EMAIL");
            r4.A01 = (PublicPhoneContact) requireArguments().getParcelable("android.intent.extra.PHONE_NUMBER");
            this.A05 = new BusinessInfo(r4);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("edit_contact_info", this.A08, (String) null, (String) null, (String) null, C34492Jt.A00(this.A05), (Map) null, (Map) null));
        }
        C14030oh.A09(720538660, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1225960620);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        this.A0C.Cc8(this);
        this.A04 = null;
        this.A0B = null;
        requireArguments().putBoolean("update_from_argument", true);
        requireArguments().putParcelable("android.intent.extra.PHONE_NUMBER", this.A03.getSubmitPublicPhoneContact());
        requireArguments().putString("android.intent.extra.EMAIL", AnonymousClass0wJ.A0n(this.A03.A00));
        AnonymousClass3LY.A00(this.A06).A02(this.A0G, C689546c.class);
        C14030oh.A09(-116450871, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1662578765);
        super.onPause();
        this.A03.A01();
        C18190wL.A0F(this).setSoftInputMode(48);
        C14030oh.A09(996588023, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1032223514);
        super.onResume();
        this.A03.setBusinessInfoListeners(this);
        AnonymousClass3LY.A00(this.A06).A01(this.A0G, C689546c.class);
        if (this.A03 != null && AnonymousClass0wJ.A0Y(this.A06).A2y()) {
            C62163Xl r1 = new C62163Xl(this.A05);
            r1.A0L = this.A07.A1N();
            this.A05 = new BusinessInfo(r1);
            BusinessInfoSectionView businessInfoSectionView = this.A03;
            this.A07.A1N();
            businessInfoSectionView.A05(this.A06);
        }
        C18190wL.A0F(this).setSoftInputMode(16);
        A00(this, false);
        C14030oh.A09(-1487981512, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(-1215408529);
        super.onStart();
        this.A0C.CLs((Activity) getContext());
        C14030oh.A09(-901533121, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1480249668);
        super.onStop();
        C18240wQ.A10(this);
        this.A0C.onStop();
        C14030oh.A09(197524609, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        PublicPhoneContact publicPhoneContact;
        super.onViewCreated(view, bundle);
        this.A00 = view.findViewById(R.id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.scroll_container);
        this.A0A = linearLayout;
        this.A0B.A01(linearLayout);
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.header_stub);
        viewStub.setLayoutResource(R.layout.business_title_card_bigger_title);
        View inflate = viewStub.inflate();
        AnonymousClass0wJ.A0L(inflate, R.id.title).setText(2131826713);
        AnonymousClass0wJ.A0L(inflate, R.id.subtitle).setText(2131826653);
        this.A03 = (BusinessInfoSectionView) view.findViewById(R.id.business_info_section);
        BusinessInfo businessInfo = this.A05;
        if (!TextUtils.isEmpty(businessInfo.A0B) || businessInfo.A00 != null || (((publicPhoneContact = businessInfo.A01) != null && !TextUtils.isEmpty(publicPhoneContact.A02)) || !TextUtils.isEmpty(businessInfo.A0L) || this.A09)) {
            A00(this, false);
        } else {
            C63873iU.A0C(this, C63503hc.A06(this.A06), 11);
        }
        String str = AnonymousClass0wJ.A0R(this.A02).A0A;
        if (str != null) {
            C63813iO.A01(getContext(), str);
        }
    }

    public final void Bvz(boolean z) {
        A02(z);
    }
}
