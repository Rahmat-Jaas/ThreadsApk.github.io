package com.instagram.business.fragment;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass266;
import X.AnonymousClass2KW;
import X.AnonymousClass37Z;
import X.AnonymousClass3BG;
import X.AnonymousClass3OP;
import X.AnonymousClass4OP;
import X.C04220Ms;
import X.C04620Ok;
import X.C06810aP;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C24711ju;
import X.C31155GhB;
import X.C311924p;
import X.C32165H8c;
import X.C34640IcN;
import X.C37408JrQ;
import X.C63803iN;
import X.C63813iO;
import X.C63873iU;
import X.C67293zJ;
import X.C82424pb;
import X.C84264sr;
import X.C84294su;
import X.C84654td;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public class AccountTypeSelectionV2Fragment extends C34640IcN implements C82424pb, C84294su, C84264sr {
    public BusinessFlowAnalyticsLogger A00;
    public C24711ju A01;
    public UserSession A02;
    public AnonymousClass266 A03;
    public AnonymousClass266 A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = AnonymousClass0wJ.A0F();
    public RadioButton mBusinessRadioButton;
    public C84654td mController;
    public RadioButton mCreatorRadioButton;

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CGO() {
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "account_type_selection_v2_fragment";
    }

    public static void A00(C311924p r10, AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        BusinessFlowAnalyticsLogger A0O;
        C84654td r0 = accountTypeSelectionV2Fragment.mController;
        if (r0 != null) {
            r0.ClA(r10);
            C18230wP.A1P(accountTypeSelectionV2Fragment.mController);
        }
        if (accountTypeSelectionV2Fragment.A00 != null) {
            String str = accountTypeSelectionV2Fragment.A05;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("preselected_account_type", accountTypeSelectionV2Fragment.A03.A01);
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("selected_account_type", accountTypeSelectionV2Fragment.A04.A01);
            accountTypeSelectionV2Fragment.A00.BcE(new C37408JrQ("account_type_selection", str, (String) null, (String) null, (String) null, A0y, A0y2, (Map) null));
        }
        C84654td r1 = accountTypeSelectionV2Fragment.mController;
        if (r1 != null && (A0O = C18190wL.A0O(r10, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, r1)) != null) {
            A0O.Bbz(new C37408JrQ("account_type_selection", accountTypeSelectionV2Fragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A01(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment) {
        C311924p r5;
        if (accountTypeSelectionV2Fragment.mController != null) {
            boolean z = accountTypeSelectionV2Fragment.A06;
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(accountTypeSelectionV2Fragment.A02).A0g();
            AnonymousClass266 r0 = AnonymousClass266.A05;
            if (z) {
                if (A0g == r0) {
                    r5 = C311924p.CREATOR_SIGNUP_FLOW;
                } else {
                    r5 = C311924p.BUSINESS_SIGNUP_FLOW;
                }
            } else if (A0g == r0) {
                r5 = C311924p.CREATOR_CONVERSION_FLOW;
            } else {
                r5 = C311924p.CONVERSION_FLOW;
            }
            if (C63803iN.A05(AnonymousClass0TJ.A05, accountTypeSelectionV2Fragment.A02, 36322138990320835L).booleanValue()) {
                BusinessFlowAnalyticsLogger A0O = C18190wL.A0O(r5, accountTypeSelectionV2Fragment, accountTypeSelectionV2Fragment.A02, accountTypeSelectionV2Fragment.mController);
                AnonymousClass3BG r3 = new AnonymousClass3BG(A0O, r5, new AnonymousClass37Z(r5, accountTypeSelectionV2Fragment), accountTypeSelectionV2Fragment);
                UserSession userSession = accountTypeSelectionV2Fragment.A02;
                C04220Ms.A0B(userSession, 0);
                IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(12, r3, A0O);
                C32165H8c A002 = AnonymousClass3OP.A00(userSession, "email_and_sms");
                A002.A00 = iDxACallbackShape35S0200000_1_I2;
                C31155GhB.A03(A002);
                return;
            }
            A00(r5, accountTypeSelectionV2Fragment);
        }
    }

    public static void A02(AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!accountTypeSelectionV2Fragment.A07 && (businessFlowAnalyticsLogger = accountTypeSelectionV2Fragment.A00) != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("account_type_selection", accountTypeSelectionV2Fragment.A05, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void CCX() {
        A02(this, "continue");
        if (this.mController == null || this.A04 == AnonymousClass0wJ.A0Y(this.A02).A0g()) {
            if (this.mController != null) {
                AnonymousClass266 r1 = AnonymousClass266.A04;
                if (r1.equals(this.A04) && r1.equals(AnonymousClass0wJ.A0Y(this.A02).A0g())) {
                    AnonymousClass2KW.A00(C63873iU.A06(this, 6), this.A02, this, this.A06);
                    return;
                }
            }
            A01(this);
            return;
        }
        ((BusinessConversionActivity) this.mController).A0I(requireContext(), this, this, this.A04, "account_type_selection", true);
    }

    public final void CGJ(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("account_type_selection", this.A05, "switch_to_professional", str2, str3, (Map) null, (Map) null, (Map) null));
        }
        C63813iO.A01(requireContext(), str);
        this.A01.A00();
    }

    public final void CGY() {
        this.A01.A01();
    }

    public final void CGg(AnonymousClass266 r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ("account_type_selection", this.A05, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (AnonymousClass266.A04.equals(AnonymousClass0wJ.A0Y(this.A02).A0g())) {
            AnonymousClass2KW.A00(C63873iU.A06(this, 6), this.A02, this, this.A06);
            return;
        }
        this.A08.post(new AnonymousClass4OP(this));
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return true;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("account_type_selection", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return true;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.mController = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass266 r0;
        int A022 = C14030oh.A02(34459038);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A02 = C18180wK.A0V(A072);
        this.A05 = C18190wL.A0j(A072, "entry_point");
        C84654td r02 = this.mController;
        if (r02 != null) {
            this.A00 = C18190wL.A0O(r02.Aiz(), this, this.A02, this.mController);
        }
        UserSession userSession = this.A02;
        C04620Ok r1 = C06810aP.A01;
        if (C18200wM.A0b(userSession, r1) != null) {
            r0 = C18200wM.A0b(this.A02, r1);
            this.A03 = r0;
        } else {
            this.A03 = AnonymousClass266.A07;
            r0 = AnonymousClass266.A04;
        }
        this.A04 = r0;
        this.A06 = C67293zJ.A06(this.mController);
        C14030oh.A09(404990344, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = C14030oh.A02(-1007450277);
        this.A07 = true;
        View inflate = layoutInflater.inflate(R.layout.account_type_selection_v2_fragment, viewGroup, false);
        C24711ju r0 = new C24711ju((C84264sr) this, C18230wP.A0W(inflate, R.id.navigation_bar_igds_bottom_button), 2131831737, -1);
        this.A01 = r0;
        registerLifecycleListener(r0);
        this.A01.A02(false);
        View requireViewById = inflate.requireViewById(R.id.header);
        TextView A0L = AnonymousClass0wJ.A0L(requireViewById, R.id.title);
        TextView A0L2 = AnonymousClass0wJ.A0L(requireViewById, R.id.subtitle);
        AnonymousClass266 r02 = this.A03;
        AnonymousClass266 r5 = AnonymousClass266.A05;
        if (r02 == r5) {
            A0L.setText(2131820895);
            i = 2131820894;
        } else {
            A0L.setText(2131820893);
            i = 2131820892;
        }
        A0L2.setText(i);
        AnonymousClass266 r1 = this.A03;
        View requireViewById2 = inflate.requireViewById(R.id.card_1);
        View requireViewById3 = inflate.requireViewById(R.id.card_2);
        View view = requireViewById3;
        if (r1 != r5) {
            requireViewById3 = requireViewById2;
            requireViewById2 = view;
        }
        ViewGroup A0J = C18220wO.A0J(requireViewById3, R.id.container_value_prop);
        ViewGroup A0J2 = C18220wO.A0J(requireViewById2, R.id.container_value_prop);
        A0J.setVisibility(8);
        A0J2.setVisibility(8);
        this.mBusinessRadioButton = (RadioButton) requireViewById3.requireViewById(R.id.radio_account_type);
        this.mCreatorRadioButton = (RadioButton) requireViewById2.requireViewById(R.id.radio_account_type);
        this.mBusinessRadioButton.setOnClickListener(new IDxCListenerShape41S0300000_1_I2(A0J, A0J2, this, 10));
        this.mCreatorRadioButton.setOnClickListener(new IDxCListenerShape41S0300000_1_I2(A0J2, A0J, this, 11));
        AnonymousClass0wJ.A16(requireViewById3, 110, this);
        AnonymousClass0wJ.A16(requireViewById2, 111, this);
        AnonymousClass0wJ.A0L(requireViewById3, R.id.text_card_title).setText(2131820885);
        AnonymousClass0wJ.A0L(requireViewById3, R.id.text_card_description).setText(2131820884);
        AnonymousClass0wJ.A0L(requireViewById2, R.id.text_card_title).setText(2131820887);
        AnonymousClass0wJ.A0L(requireViewById2, R.id.text_card_description).setText(2131820886);
        if (this.A00 != null) {
            String str = this.A05;
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("preselected_account_type", this.A03.A01);
            this.A00.Bdt(new C37408JrQ("account_type_selection", str, (String) null, (String) null, (String) null, A0y, (Map) null, (Map) null));
        }
        C14030oh.A09(1919441539, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-387637542);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        C14030oh.A09(-63247709, A022);
    }

    public final void onViewStateRestored(Bundle bundle) {
        RadioButton radioButton;
        int A022 = C14030oh.A02(-1520255634);
        super.onViewStateRestored(bundle);
        int ordinal = this.A04.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                radioButton = this.mCreatorRadioButton;
            }
            this.A07 = false;
            C14030oh.A09(-1651681999, A022);
        }
        radioButton = this.mBusinessRadioButton;
        radioButton.performClick();
        this.A07 = false;
        C14030oh.A09(-1651681999, A022);
    }
}
