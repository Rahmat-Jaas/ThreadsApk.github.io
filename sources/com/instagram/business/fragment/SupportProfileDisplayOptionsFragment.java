package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass3QD;
import X.AnonymousClass4u2;
import X.AnonymousClass5yI;
import X.AnonymousClass7IV;
import X.AnonymousClass7Ko;
import X.C10300i6;
import X.C118156zq;
import X.C14030oh;
import X.C146558mR;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C25348Dk8;
import X.C32165H8c;
import X.C34640IcN;
import X.C82034oy;
import X.C86114wI;
import X.C86134wK;
import X.C94125tn;
import X.H1T;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.service.session.UserSession;

public class SupportProfileDisplayOptionsFragment extends C34640IcN implements C82034oy {
    public ActionButton A00;
    public C146558mR A01;
    public AnonymousClass5yI A02;
    public AnonymousClass7IV A03;
    public UserSession A04;
    public String A05;
    public final Handler A06 = AnonymousClass0wJ.A0F();
    public BusinessNavBar mBusinessNavBar;
    public View mLoadingIndicator;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "support_profile_display_options";
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        ActionButton Crr = r5.Crr(new C25348Dk8(C86134wK.A0P(this, 103), AnonymousClass0wJ.A0B(this).getString(2131832960), R.drawable.instagram_arrow_back_24));
        this.A00 = Crr;
        Crr.setEnabled(false);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1251531810);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C18180wK.A0V(requireArguments);
        String string = requireArguments.getString("args_session_id");
        AnonymousClass7Ko.A07(string, "session_id should not be null");
        this.A05 = string;
        this.A03 = new AnonymousClass7IV(this, this.A04, this.A05, requireArguments.getString("args_entry_point"));
        this.A02 = new AnonymousClass5yI(requireContext(), this);
        C14030oh.A09(332902542, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1729142557);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.support_profile_display_options_fragment);
        C14030oh.A09(-744947297, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Long l;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) view.requireViewById(R.id.recycler_view);
        this.mLoadingIndicator = view.requireViewById(R.id.loading_spinner);
        UserSession userSession = this.A04;
        IDxACallbackShape112S0100000_2_I2 iDxACallbackShape112S0100000_2_I2 = new IDxACallbackShape112S0100000_2_I2(this, 5);
        H1T A0N = AnonymousClass0wJ.A0N(userSession);
        A0N.A0J("business/profile_action_buttons/get_all_cta_categories_info/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0N, C94125tn.class, C118156zq.class);
        A0T.A00 = iDxACallbackShape112S0100000_2_I2;
        schedule(A0T);
        this.mRecyclerView.setAdapter(this.A02);
        C146558mR A08 = AnonymousClass0wJ.A0Y(this.A04).A08();
        this.A01 = A08;
        if (A08 != null) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.A01.setVisibility(8);
            BusinessNavBar businessNavBar2 = this.mBusinessNavBar;
            String string = getString(2131834613);
            int color = requireContext().getColor(R.color.igds_error_or_destructive);
            int dimensionPixelSize = AnonymousClass0wJ.A0B(this).getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            TitleTextView titleTextView = businessNavBar2.A03;
            titleTextView.setText(string);
            titleTextView.setIsBold(true);
            titleTextView.setTextColor(color);
            titleTextView.setTextSize(0, (float) dimensionPixelSize);
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(C86134wK.A0P(this, HttpStatus.SC_PROCESSING));
            this.mBusinessNavBar.setVisibility(0);
        }
        C146558mR r0 = this.A01;
        String str4 = null;
        if (r0 != null) {
            str4 = r0.AWx();
            str = this.A01.AQz();
            str2 = this.A01.B08();
            str3 = this.A01.getUrl();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        AnonymousClass7IV r8 = this.A03;
        USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r8);
        C18190wL.A1I(A002, "edit_action_button");
        C18210wN.A1A(A002, "view");
        A002.A0T(AnonymousClass3QD.A00(21, 10, 110), r8.A03);
        A002.A0Q("is_support_partner_enabled", C18180wK.A0Y());
        A002.A0T("entry_point", r8.A02);
        A002.A0T("service_type", str4);
        if (str != null) {
            l = AnonymousClass0wJ.A0d(str);
        } else {
            l = null;
        }
        A002.A0S("partner_id", l);
        C86114wI.A1F(A002, str2, str3);
        A002.Bb4();
    }
}
