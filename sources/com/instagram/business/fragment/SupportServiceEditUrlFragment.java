package com.instagram.business.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass25l;
import X.AnonymousClass4u2;
import X.AnonymousClass5KP;
import X.AnonymousClass5tR;
import X.AnonymousClass7IV;
import X.C04620Ok;
import X.C06810aP;
import X.C09860go;
import X.C10300i6;
import X.C118196zu;
import X.C118206zv;
import X.C121877Ip;
import X.C12560m7;
import X.C14030oh;
import X.C146558mR;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18330wh;
import X.C25348Dk8;
import X.C25764Drc;
import X.C25828Dsm;
import X.C32165H8c;
import X.C34640IcN;
import X.C82034oy;
import X.C82424pb;
import X.C86134wK;
import X.C86154wM;
import X.C94135to;
import X.C99726Kn;
import X.H1T;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape21S1100000_2_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.barcelona.R;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.api.base.IDxACallbackShape5S1100000_2_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;

public class SupportServiceEditUrlFragment extends C34640IcN implements C82424pb, C82034oy {
    public ActionButton A00;
    public SMBPartnerType A01;
    public AnonymousClass7IV A02;
    public UserSession A03;
    public C18330wh A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public String A0E;
    public String A0F;
    public final Handler A0G = AnonymousClass0wJ.A0F();
    public BusinessNavBar mBusinessNavBar;
    public EditText mURLEditText;
    public TextView mURLTitleTextView;

    public final String getModuleName() {
        return "service_partner_edit_url";
    }

    public static void A00(AnonymousClass5KP r3, SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        User A0Y = AnonymousClass0wJ.A0Y(supportServiceEditUrlFragment.A03);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
            A0Y.A05.Cq1(r3);
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            A0Y.A05.Cpy(r3);
        } else if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            A0Y.A05.Cpz(r3);
        }
        C18210wN.A1J(supportServiceEditUrlFragment.A03, A0Y);
    }

    public static void A01(SupportServiceEditUrlFragment supportServiceEditUrlFragment) {
        String str = supportServiceEditUrlFragment.A0A;
        if ("sticker".equals(str) || "business_hub".equals(str)) {
            supportServiceEditUrlFragment.requireActivity().finish();
        } else {
            supportServiceEditUrlFragment.mFragmentManager.A11(SupportLinksFragment.A06, 1);
        }
    }

    public static void A02(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        UserSession userSession = supportServiceEditUrlFragment.A03;
        String str2 = supportServiceEditUrlFragment.A05;
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        IDxACallbackShape5S1100000_2_I2 iDxACallbackShape5S1100000_2_I2 = new IDxACallbackShape5S1100000_2_I2(str, supportServiceEditUrlFragment, 1);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/update_smb_partner/");
        A0N.A0B(AnonymousClass5tR.class, C118206zv.class);
        A0N.A06();
        A0N.A0O("smb_partner_type", sMBPartnerType.toString());
        A0N.A0O("url", str);
        C32165H8c A0T = C18200wM.A0T(A0N, "app_id", str2);
        A0T.A00 = iDxACallbackShape5S1100000_2_I2;
        supportServiceEditUrlFragment.schedule(A0T);
    }

    public static void A04(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        UserSession userSession = supportServiceEditUrlFragment.A03;
        String obj = supportServiceEditUrlFragment.A01.toString();
        IDxACallbackShape5S1100000_2_I2 iDxACallbackShape5S1100000_2_I2 = new IDxACallbackShape5S1100000_2_I2(str, supportServiceEditUrlFragment, 2);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("accounts/update_profile_action_button/");
        A0N.A0B(C94135to.class, C118196zu.class);
        A0N.A06();
        C32165H8c A0T = C18200wM.A0T(A0N, "smb_partner_type", obj);
        A0T.A00 = iDxACallbackShape5S1100000_2_I2;
        supportServiceEditUrlFragment.schedule(A0T);
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        int i;
        boolean z = this.A0C;
        boolean equals = this.A0A.equals("sticker");
        if (z) {
            i = 2131826711;
            if (equals) {
                i = 2131826708;
            }
        } else {
            i = 2131820908;
            if (equals) {
                i = 2131836457;
            }
        }
        this.A00 = r5.Crr(new C25348Dk8(C86134wK.A0P(this, 105), getString(i), 0));
        if (getParentFragmentManager().A0I() != 0) {
            C25764Drc drc = new C25764Drc();
            drc.A04(R.drawable.instagram_arrow_back_24);
            AnonymousClass4u2.A03(drc, r5);
        }
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        View view = this.mView;
        if (view != null) {
            C09860go.A0I(view);
        }
        if (getParentFragmentManager().A0I() == 0) {
            requireActivity().finish();
            return true;
        }
        C12560m7 r0 = this.mFragmentManager;
        if (r0 == null) {
            return true;
        }
        r0.A0d();
        return true;
    }

    public static void A03(SupportServiceEditUrlFragment supportServiceEditUrlFragment, String str) {
        int i;
        String string;
        DialogInterface.OnClickListener iDxCListenerShape21S1100000_2_I2;
        AnonymousClass25l r0;
        int i2;
        C25828Dsm dsm = new C25828Dsm(supportServiceEditUrlFragment.getActivity());
        boolean isEmpty = TextUtils.isEmpty(str);
        SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment.A01;
        boolean equals = sMBPartnerType.equals(SMBPartnerType.DONATION);
        if (isEmpty) {
            if (equals) {
                dsm.A0L(2131834702);
                i2 = 2131834701;
            } else if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                dsm.A0L(2131834700);
                i2 = 2131834703;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    dsm.A0L(2131834700);
                    i2 = 2131834699;
                }
                string = supportServiceEditUrlFragment.getString(2131834698);
                iDxCListenerShape21S1100000_2_I2 = C86154wM.A0N(supportServiceEditUrlFragment, 47);
                r0 = AnonymousClass25l.RED_BOLD;
            }
            dsm.A0K(i2);
            string = supportServiceEditUrlFragment.getString(2131834698);
            iDxCListenerShape21S1100000_2_I2 = C86154wM.A0N(supportServiceEditUrlFragment, 47);
            r0 = AnonymousClass25l.RED_BOLD;
        } else {
            if (equals) {
                dsm.A0L(2131837433);
                i = 2131837432;
            } else if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
                dsm.A0L(2131837431);
                i = 2131837434;
            } else {
                if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                    dsm.A0L(2131837431);
                    i = 2131837430;
                }
                string = supportServiceEditUrlFragment.getString(2131837429);
                iDxCListenerShape21S1100000_2_I2 = new IDxCListenerShape21S1100000_2_I2(supportServiceEditUrlFragment, str, 0);
                r0 = AnonymousClass25l.DEFAULT;
            }
            dsm.A0K(i);
            string = supportServiceEditUrlFragment.getString(2131837429);
            iDxCListenerShape21S1100000_2_I2 = new IDxCListenerShape21S1100000_2_I2(supportServiceEditUrlFragment, str, 0);
            r0 = AnonymousClass25l.DEFAULT;
        }
        dsm.A0Y(iDxCListenerShape21S1100000_2_I2, r0, string, true);
        dsm.A0a(C86154wM.A0N(supportServiceEditUrlFragment, 44), supportServiceEditUrlFragment.getString(2131823059));
        AnonymousClass0wJ.A1K(dsm);
    }

    public final void onCreate(Bundle bundle) {
        boolean A1W;
        int i;
        int A022 = C14030oh.A02(264595987);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = C18180wK.A0V(requireArguments);
        this.A0F = requireArguments.getString("args_session_id");
        this.A05 = requireArguments.getString("APP_ID");
        this.A0B = requireArguments.getString("PARTNER_NAME");
        this.A0E = requireArguments.getString("PLACEHOLDER_URL");
        this.A06 = requireArguments.getString("AUTOFILL_URL");
        String string = requireArguments.getString("args_entry_point");
        this.A0A = string;
        this.A02 = new AnonymousClass7IV(this, this.A03, this.A0F, string);
        this.A0D = "profile".equals(this.A0A);
        String A002 = AnonymousClass000.A00(778);
        String str = null;
        if (requireArguments.getString(A002) != null) {
            String string2 = requireArguments.getString(A002);
            this.A07 = string2;
            SMBPartnerType A003 = C99726Kn.A00(string2);
            if (A003 != null) {
                this.A01 = A003;
                C146558mR A082 = AnonymousClass0wJ.A0Y(this.A03).A08();
                if (A082 != null) {
                    str = A082.AWx();
                }
                this.A08 = str;
                if (A082 != null) {
                    this.A09 = A082.AdT();
                }
                A1W = !TextUtils.isEmpty(this.A06);
            } else {
                throw C18190wL.A0a("No SMBPartnerType for provided category type");
            }
        } else {
            Serializable serializable = requireArguments.getSerializable("args_service_type");
            serializable.getClass();
            SMBPartnerType sMBPartnerType = (SMBPartnerType) serializable;
            this.A01 = sMBPartnerType;
            this.A07 = sMBPartnerType.toString();
            UserSession userSession = this.A03;
            C04620Ok r4 = C06810aP.A01;
            SMBPartnerType A0T = r4.A01(userSession).A0T();
            if (A0T != null) {
                str = A0T.toString();
            }
            this.A08 = str;
            if (A0T != null) {
                int ordinal = A0T.ordinal();
                if (ordinal == 3) {
                    i = 2131827973;
                } else if (ordinal == 2) {
                    i = 2131824938;
                } else if (ordinal == 1) {
                    i = 2131826218;
                } else {
                    throw C86134wK.A0s(AnonymousClass00U.A0L(AnonymousClass000.A00(43), A0T.toString()));
                }
                this.A09 = getString(i);
            }
            A1W = AnonymousClass0wJ.A1W(C121877Ip.A00(this.A01, r4.A01(this.A03)));
        }
        this.A0C = A1W;
        C14030oh.A09(770879893, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(777482716);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.support_service_edit_url_fragment);
        C14030oh.A09(1793741416, A022);
        return A0H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            super.onViewCreated(r10, r11)
            X.7IV r8 = r9.A02
            java.lang.String r7 = r9.A07
            boolean r6 = r9.A0C
            java.lang.String r5 = r9.A05
            java.lang.String r4 = r9.A0B
            java.lang.String r2 = r9.A06
            r3 = 0
            X.C04220Ms.A0B(r7, r3)
            X.AnonymousClass0wJ.A1Q(r5, r4)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.AnonymousClass7IV.A00(r8)
            java.lang.String r0 = "add_url"
            X.C18190wL.A1I(r1, r0)
            java.lang.String r0 = "view"
            X.C18210wN.A1A(r1, r0)
            X.AnonymousClass7IV.A02(r1, r8, r7, r5, r6)
            X.C86114wI.A1F(r1, r4, r2)
            r1.Bb4()
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r4 = X.AnonymousClass0wJ.A0L(r10, r0)
            com.instagram.api.schemas.SMBPartnerType r0 = r9.A01
            com.instagram.api.schemas.SMBPartnerType r1 = com.instagram.api.schemas.SMBPartnerType.DONATION
            boolean r2 = r0.equals(r1)
            r0 = 2131821161(0x7f110269, float:1.9275057E38)
            if (r2 == 0) goto L_0x0044
            r0 = 2131821049(0x7f1101f9, float:1.927483E38)
        L_0x0044:
            X.C18180wK.A10(r4, r9, r0)
            r0 = 2131307619(0x7f092c63, float:1.823347E38)
            android.widget.TextView r7 = X.AnonymousClass0wJ.A0L(r10, r0)
            java.lang.String r2 = r9.A0A
            java.lang.String r0 = "sticker"
            boolean r4 = r2.equals(r0)
            com.instagram.api.schemas.SMBPartnerType r2 = r9.A01
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.GIFT_CARD
            boolean r0 = r2.equals(r0)
            if (r4 == 0) goto L_0x014e
            if (r0 == 0) goto L_0x0141
            r0 = 2131835507(0x7f113a73, float:1.9304155E38)
        L_0x0065:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0069:
            r0 = 2131822797(0x7f1108cd, float:1.9278376E38)
            java.lang.String r8 = r9.getString(r0)
            int r0 = r2.intValue()
            r6 = 1
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r9, r8, r0)
            android.text.SpannableStringBuilder r5 = X.C18200wM.A0E(r0)
            android.content.Context r0 = r9.getContext()
            int r4 = X.C18210wN.A01(r0)
            r2 = 4
            com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2 r0 = new com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2
            r0.<init>(r9, r4, r2)
            X.AnonymousClass3Zw.A01(r5, r0, r8)
            r7.setText(r5)
            r7.setHighlightColor(r3)
            X.C18180wK.A0z(r7)
            r0 = 2131308694(0x7f093096, float:1.823565E38)
            android.view.View r2 = r10.requireViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r9.mURLEditText = r2
            java.lang.String r0 = r9.A0E
            r2.setHint(r0)
            java.lang.String r0 = r9.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b6
            android.widget.EditText r2 = r9.mURLEditText
            java.lang.String r0 = r9.A06
            r2.setText(r0)
        L_0x00b6:
            r0 = 2131300035(0x7f090ec3, float:1.8218088E38)
            android.widget.TextView r0 = X.C18180wK.A0G(r10, r0)
            r9.mURLTitleTextView = r0
            r0 = 2131297666(0x7f090582, float:1.8213283E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r10, r0)
            com.instagram.api.schemas.SMBPartnerType r0 = r9.A01
            boolean r1 = r0.equals(r1)
            r0 = 2131821159(0x7f110267, float:1.9275053E38)
            if (r1 == 0) goto L_0x00d4
            r0 = 2131821048(0x7f1101f8, float:1.9274828E38)
        L_0x00d4:
            r2.setText(r0)
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x012b
            r0 = 2131305773(0x7f09252d, float:1.8229726E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.business.ui.BusinessNavBar r0 = (com.instagram.business.ui.BusinessNavBar) r0
            r9.mBusinessNavBar = r0
            r0.setVisibility(r3)
            com.instagram.business.ui.BusinessNavBar r0 = r9.mBusinessNavBar
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.business.ui.BusinessNavBar r5 = r9.mBusinessNavBar
            r0 = 2131834716(0x7f11375c, float:1.930255E38)
            java.lang.String r4 = r9.getString(r0)
            android.content.Context r1 = r9.getContext()
            r0 = 2131100067(0x7f0601a3, float:1.7812505E38)
            int r2 = r1.getColor(r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r0 = r1.getDimensionPixelSize(r0)
            com.instagram.common.ui.text.TitleTextView r1 = r5.A03
            r1.setText(r4)
            r1.setIsBold(r6)
            r1.setTextColor(r2)
            float r0 = (float) r0
            r1.setTextSize(r3, r0)
            com.instagram.business.ui.BusinessNavBar r1 = r9.mBusinessNavBar
            r0 = 104(0x68, float:1.46E-43)
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r9, r0)
            r1.setSecondaryButtonOnclickListeners(r0)
        L_0x012b:
            X.0wh r2 = X.C18330wh.A01(r9)
            r9.A04 = r2
            android.content.Context r1 = r9.requireContext()
            r0 = 2131832819(0x7f112ff3, float:1.9298703E38)
            X.C18330wh.A02(r1, r2, r0)
            X.0wh r0 = r9.A04
            r0.setCancelable(r3)
            return
        L_0x0141:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016d
            r0 = 2131835506(0x7f113a72, float:1.9304152E38)
            goto L_0x0065
        L_0x014e:
            if (r0 == 0) goto L_0x0155
            r0 = 2131821160(0x7f110268, float:1.9275055E38)
            goto L_0x0065
        L_0x0155:
            com.instagram.api.schemas.SMBPartnerType r0 = com.instagram.api.schemas.SMBPartnerType.FOOD_DELIVERY
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0162
            r0 = 2131821157(0x7f110265, float:1.927505E38)
            goto L_0x0065
        L_0x0162:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x016d
            r0 = 2131821158(0x7f110266, float:1.9275051E38)
            goto L_0x0065
        L_0x016d:
            r2 = 0
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.SupportServiceEditUrlFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
