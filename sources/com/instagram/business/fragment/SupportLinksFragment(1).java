package com.instagram.business.fragment;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass5KP;
import X.AnonymousClass691;
import X.AnonymousClass7IV;
import X.C06750aI;
import X.C10300i6;
import X.C118156zq;
import X.C14030oh;
import X.C146558mR;
import X.C18180wK;
import X.C18190wL;
import X.C24731jw;
import X.C25348Dk8;
import X.C32165H8c;
import X.C34640IcN;
import X.C82034oy;
import X.C86104wH;
import X.C94125tn;
import X.H1T;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.api.schemas.CallToAction;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.Locale;

public class SupportLinksFragment extends C34640IcN implements C82034oy {
    public static final String A06 = AnonymousClass00U.A0L(SupportLinksFragment.class.getName(), ".BACK_STACK");
    public LayoutInflater A00;
    public AnonymousClass7IV A01;
    public UserSession A02;
    public String A03;
    public String A04;
    public boolean A05;
    public View mLoadingIndicator;
    public ViewGroup mPartnerTypeRowsContainer;
    public ViewGroup mProfileDisplayRow;
    public View mSelectButtonRow;

    public final String getModuleName() {
        return "support_links_fragment";
    }

    public static void A00(SupportLinksFragment supportLinksFragment) {
        View view;
        String string;
        if (supportLinksFragment.A05) {
            Context context = supportLinksFragment.getContext();
            C146558mR A08 = AnonymousClass0wJ.A0Y(supportLinksFragment.A02).A08();
            if (A08 == null || A08.AdT() == null) {
                string = context.getString(2131822798);
            } else {
                string = A08.AdT();
            }
            ((TextView) C18180wK.A0E(supportLinksFragment.mProfileDisplayRow, R.id.shown_button_text)).setText(string);
            supportLinksFragment.mProfileDisplayRow.setVisibility(0);
            view = supportLinksFragment.mSelectButtonRow;
        } else {
            supportLinksFragment.mSelectButtonRow.setVisibility(0);
            view = supportLinksFragment.mProfileDisplayRow;
        }
        view.setVisibility(8);
    }

    public static boolean A01(AnonymousClass5KP r3, String str) {
        String str2;
        if (r3 == null || (str2 = r3.A03) == null || str2.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return AnonymousClass691.A05.A01.equals(str);
        }
        Object obj = CallToAction.A02.get(str2.toUpperCase(Locale.US));
        if (obj == null) {
            obj = CallToAction.UNRECOGNIZED;
        }
        return C06750aI.A17(CallToAction.APPLY_NOW, CallToAction.LEARN_MORE, CallToAction.GET_QUOTE, CallToAction.SIGN_UP).contains(obj);
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.Crr(new C25348Dk8(C18190wL.A0H(this, 172), AnonymousClass0wJ.A0B(this).getString(2131836453), R.drawable.instagram_arrow_back_24)).setEnabled(true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(545035804);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C18180wK.A0V(requireArguments);
        this.A03 = requireArguments.getString("args_entry_point");
        String string = requireArguments.getString("args_session_id");
        this.A04 = string;
        this.A01 = new AnonymousClass7IV(this, this.A02, string, this.A03);
        this.A05 = false;
        registerLifecycleListener(new C24731jw(getActivity()));
        C14030oh.A09(-1761377935, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1521402440);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.support_links_setup_fragment);
        this.A00 = layoutInflater;
        C14030oh.A09(-1380120416, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.requireViewById(R.id.links_setup_headline);
        igdsHeadline.A08(R.drawable.ig_illustrations_illo_business_flare, false);
        igdsHeadline.setHeadline(2131820911);
        igdsHeadline.setBody(2131836454);
        this.mSelectButtonRow = C18180wK.A0E(view, R.id.action_button_section_title);
        this.mProfileDisplayRow = (ViewGroup) C18180wK.A0E(view, R.id.profile_display_options_row);
        A00(this);
        C86104wH.A1C(this.mProfileDisplayRow, HttpStatus.SC_SWITCHING_PROTOCOLS, this);
        this.mPartnerTypeRowsContainer = (ViewGroup) C18180wK.A0E(view, R.id.partner_type_rows_container);
        this.mLoadingIndicator = view.findViewById(R.id.loading_spinner);
        UserSession userSession = this.A02;
        IDxACallbackShape112S0100000_2_I2 iDxACallbackShape112S0100000_2_I2 = new IDxACallbackShape112S0100000_2_I2(this, 4);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("business/profile_action_buttons/get_all_cta_categories_info/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C94125tn.class, C118156zq.class);
        A0T.A00 = iDxACallbackShape112S0100000_2_I2;
        schedule(A0T);
    }
}
