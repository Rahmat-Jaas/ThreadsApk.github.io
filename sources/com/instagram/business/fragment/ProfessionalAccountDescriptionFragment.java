package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass266;
import X.AnonymousClass3LK;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C24711ju;
import X.C24731jw;
import X.C34640IcN;
import X.C37408JrQ;
import X.C63283hB;
import X.C67293zJ;
import X.C82034oy;
import X.C82424pb;
import X.C84264sr;
import X.C84654td;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

public class ProfessionalAccountDescriptionFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public BusinessFlowAnalyticsLogger A00;
    public C84654td A01;
    public String A02;
    public UserSession A03;
    public AnonymousClass266 A04;
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;
    public View mMainView;

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "professional_account_description_fragment";
    }

    public final void CCX() {
        ((BusinessConversionActivity) this.A01).Bel((Bundle) null);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("value_props", this.A02, "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A00;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.BcE(new C37408JrQ("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!C67293zJ.A05(this.A01) || AnonymousClass0wJ.A0Y(this.A03).A0g() == AnonymousClass266.A06) {
            C18230wP.A1Q(this.A01);
            return true;
        }
        this.A01.ACI();
        return true;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 160);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        C84654td A012 = C67293zJ.A01(this);
        A012.getClass();
        this.A01 = A012;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(523760863);
        super.onCreate(bundle);
        Bundle A07 = C18250wR.A07(this);
        UserSession A0V = C18180wK.A0V(A07);
        this.A03 = A0V;
        this.A00 = C18190wL.A0O(this.A01.Aiz(), this, A0V, this.A01);
        this.A02 = A07.getString("entry_point", "");
        this.A04 = AnonymousClass266.A00(A07.getInt("selected_account_type"));
        C24731jw.A01(this);
        C14030oh.A09(506673393, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        int i;
        int A022 = C14030oh.A02(1562725913);
        LayoutInflater layoutInflater2 = layoutInflater;
        View inflate = layoutInflater2.inflate(R.layout.stacked_value_props, viewGroup, false);
        this.mMainView = inflate;
        ViewGroup A0J = C18220wO.A0J(inflate, R.id.value_props_container);
        View findViewById = this.mMainView.findViewById(R.id.scroll_view);
        BusinessNavBar A0N = C18240wQ.A0N(this.mMainView);
        this.mBusinessNavBar = A0N;
        C24711ju r0 = new C24711ju(A0N, (C84264sr) this, 2131831737, -1);
        this.mBusinessNavBarHelper = r0;
        registerLifecycleListener(r0);
        this.mBusinessNavBar.A01(findViewById);
        Context requireContext = requireContext();
        UserSession userSession = this.A03;
        AnonymousClass266 r02 = this.A04;
        Context requireContext2 = requireContext();
        List<C63283hB> A002 = AnonymousClass3LK.A00(requireContext2, userSession, r02, false);
        int ordinal = r02.ordinal();
        if (ordinal == 2) {
            string = requireContext2.getString(2131820885);
            string2 = requireContext2.getString(2131820884);
            i = R.drawable.instagram_business_pano_outline_24;
        } else if (ordinal == 3) {
            string = requireContext2.getString(2131820887);
            string2 = requireContext2.getString(2131820886);
            i = R.drawable.instagram_media_account_pano_outline_24;
        } else {
            throw C18190wL.A0a("No supported onboarding configuration for account type");
        }
        Drawable drawable = requireContext2.getDrawable(i);
        ImageView A0K = C18220wO.A0K(A0J, R.id.title_icon);
        TextView A0G = C18180wK.A0G(A0J, R.id.title);
        TextView A0G2 = C18180wK.A0G(A0J, R.id.subtitle);
        if (A0K != null) {
            A0K.setImageDrawable(drawable);
        }
        if (A0G != null) {
            A0G.setText(string);
        }
        if (A0G2 != null) {
            A0G2.setText(string2);
        }
        for (C63283hB r1 : A002) {
            View inflate2 = layoutInflater2.inflate(R.layout.stacked_value_props_row, A0J, false);
            String str = r1.A09;
            String str2 = r1.A07;
            Drawable drawable2 = requireContext.getDrawable(r1.A02);
            TextView A0L = AnonymousClass0wJ.A0L(inflate2, R.id.title);
            TextView A0L2 = AnonymousClass0wJ.A0L(inflate2, R.id.subtitle);
            ImageView A0J2 = C18200wM.A0J(inflate2, R.id.icon);
            A0L.setText(str);
            A0L2.setText(str2);
            A0J2.setImageDrawable(drawable2);
            A0J.addView(inflate2);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("value_props", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        View view = this.mMainView;
        C14030oh.A09(-1558325978, A022);
        return view;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-590947068);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        C14030oh.A09(-1613655386, A022);
    }
}
