package com.instagram.business.fragment;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1kD;
import X.AnonymousClass3IJ;
import X.AnonymousClass3LY;
import X.AnonymousClass3V5;
import X.AnonymousClass46F;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C150388wA;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C18489AgL;
import X.C24841ki;
import X.C25764Drc;
import X.C29325FmP;
import X.C311924p;
import X.C34640IcN;
import X.C37408JrQ;
import X.C554433f;
import X.C570839r;
import X.C57933Db;
import X.C63393hP;
import X.C63803iN;
import X.C63873iU;
import X.C67293zJ;
import X.C67333zN;
import X.C82034oy;
import X.C82394pY;
import X.C82424pb;
import X.C84654td;
import X.I2G;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape370S0100000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

public class OnboardingCheckListFragment extends C34640IcN implements C82424pb, C82034oy {
    public Handler A00;
    public C57933Db A01;
    public C570839r A02;
    public C554433f A03;
    public AnonymousClass3IJ A04;
    public AnonymousClass3V5 A05;
    public C150388wA A06;
    public UserSession A07;
    public String A08;
    public boolean A09 = true;
    public boolean A0A;
    public AnonymousClass4u2 A0B;
    public C84654td A0C;
    public boolean A0D;
    public final C82394pY A0E = C18220wO.A0P(this, 16);
    public BusinessNavBar mBusinessNavBar;
    public ImageView mConfettiView;
    public IgdsHeadline mHeadline;
    public ViewGroup mLayoutContent;
    public ProgressBar mProgressBar;
    public RecyclerView mRecyclerView;
    public TextView mSkipOcButton;
    public View mSkipOcContainer;
    public TextView mStepsCompletedTextView;

    public final String getModuleName() {
        return "onboarding_checklist_fragment";
    }

    public final void A00() {
        C84654td r0 = this.A0C;
        if (r0 != null) {
            r0.ACI();
        } else {
            C18180wK.A12(this);
        }
        C63803iN.A0E(AnonymousClass0TJ.A05, this.A07, 36321537694899082L);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A07;
    }

    public final boolean onBackPressed() {
        Bundle bundle;
        boolean z = this.A09;
        AnonymousClass3IJ r1 = this.A04;
        if (z) {
            bundle = null;
            r1.A04.BbZ(new C37408JrQ("onboarding_checklist", r1.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        } else {
            bundle = null;
            r1.A04.BcE(new C37408JrQ("onboarding_checklist", r1.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (this.A08.equals("profile")) {
            getRootActivity();
        }
        boolean z2 = this.A0D;
        C84654td r0 = this.A0C;
        if (z2) {
            r0.getClass();
            ((BusinessConversionActivity) r0).CfG(bundle);
            return true;
        } else if (!C67293zJ.A05(r0)) {
            return false;
        } else {
            A00();
            return true;
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        ActionButton Crj = r5.Crj(C18190wL.A0H(this, 156), R.drawable.instagram_x_pano_outline_24);
        Crj.setColorFilter(C63393hP.A01(getContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color));
        Crj.setContentDescription(getString(2131824015));
        if (this.A0D) {
            C25764Drc A0N = C18180wK.A0N();
            A0N.A0C = C18190wL.A0H(this, 157);
            A0N.A04 = 2131824015;
            AnonymousClass4u2.A03(A0N, r5);
        }
        this.A0B = r5;
        r5.BHD().setVisibility(8);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0C = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        C84654td r0;
        C84654td r02;
        boolean z;
        C84654td r03;
        int A022 = C14030oh.A02(415085458);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A07 = C18180wK.A0V(A072);
        this.A08 = A072.getString("entry_point");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A0C, this, this.A07);
        this.A01 = new C57933Db();
        this.A03 = new C554433f(this.A07);
        this.A02 = new C570839r(getContext());
        this.A00 = AnonymousClass0wJ.A0F();
        C84654td r04 = this.A0C;
        if ((r04 == null || r04.Aiz() != C311924p.CONVERSION_FLOW) && (((r0 = this.A0C) == null || r0.Aiz() != C311924p.BUSINESS_SIGNUP_FLOW) && (((r02 = this.A0C) == null || r02.Aiz() != C311924p.CREATOR_SIGNUP_FLOW) && (!C67293zJ.A05(this.A0C) || (r03 = this.A0C) == null || r03.CWQ() == ConversionStep.RENEW)))) {
            z = false;
        } else {
            z = true;
        }
        this.A0D = z;
        C67293zJ.A04(this.A0C);
        UserSession userSession = this.A07;
        AnonymousClass3V5 r6 = new AnonymousClass3V5(this, userSession);
        this.A05 = r6;
        this.A04 = new AnonymousClass3IJ(A002, this, r6, userSession, this.A08);
        AnonymousClass3LY.A00(this.A07).A01(this.A0E, AnonymousClass46F.class);
        AnonymousClass3IJ r1 = this.A04;
        r1.A04.Bdt(new C37408JrQ("onboarding_checklist", r1.A08, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        C14030oh.A09(138482686, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1390027536);
        View inflate = layoutInflater.inflate(R.layout.onboarding_check_list_fragment, viewGroup, false);
        this.mRecyclerView = (RecyclerView) inflate.requireViewById(R.id.recycler_onboarding_check_list);
        C18489AgL A002 = C150388wA.A00(getContext());
        A002.A03 = true;
        UserSession userSession = this.A07;
        C04220Ms.A0B(userSession, 0);
        A002.A01(new C24841ki(this, C67333zN.A06(userSession, 36320257794643838L, true)));
        this.A06 = C18220wO.A0Z(A002, new AnonymousClass1kD());
        RecyclerView recyclerView = this.mRecyclerView;
        getContext();
        C18190wL.A1D(recyclerView);
        this.mRecyclerView.setAdapter(this.A06);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.onboarding_checklist_headline);
        this.mHeadline = A0S;
        A0S.setVisibility(0);
        this.mStepsCompletedTextView = C18180wK.A0G(inflate, R.id.text_steps_completed);
        this.mProgressBar = (ProgressBar) inflate.findViewById(R.id.progressbar_loading);
        this.mLayoutContent = C18240wQ.A0G(inflate, R.id.layout_content);
        this.mConfettiView = C18220wO.A0K(inflate, R.id.image_confetti);
        this.mBusinessNavBar = C18240wQ.A0N(inflate);
        UserSession userSession2 = this.A07;
        C04220Ms.A0B(userSession2, 0);
        if (C67333zN.A06(userSession2, 36315357237086740L, true)) {
            this.mSkipOcButton = AnonymousClass0wJ.A0L(inflate, R.id.skip_oc_button);
            this.mSkipOcContainer = inflate.requireViewById(R.id.skip_oc_container);
            TextView textView = this.mSkipOcButton;
            if (textView != null) {
                AnonymousClass0wJ.A16(textView, 158, this);
            }
        }
        C570839r r2 = this.A02;
        r2.A01 = this.mConfettiView;
        I2G A003 = C29325FmP.A00(r2.A00, R.raw.countdown_sticker_confetti);
        r2.A02 = A003;
        if (A003 != null) {
            A003.A6O(new IDxAListenerShape370S0100000_1_I2(r2, 0));
        }
        r2.A01.setImageDrawable(r2.A02);
        this.mBusinessNavBar.setPrimaryButtonOnclickListeners(C18190wL.A0H(this, 155));
        C14030oh.A09(1573267864, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-1164212644);
        super.onDestroy();
        AnonymousClass3LY.A00(this.A07).A02(this.A0E, AnonymousClass46F.class);
        C14030oh.A09(41845197, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-2086006061);
        super.onDestroyView();
        AnonymousClass4u2 r0 = this.A0B;
        if (r0 != null) {
            r0.BHD().setVisibility(0);
        }
        C14030oh.A09(-1641870030, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(102267022);
        super.onStart();
        if (this.A08.equals("profile")) {
            getRootActivity();
        }
        C14030oh.A09(-818054959, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass3IJ r4 = this.A04;
        List list = r4.A03;
        if (list == null) {
            r4.A06.A02(C63873iU.A06(r4, 25), r4.A08);
            return;
        }
        OnboardingCheckListFragment onboardingCheckListFragment = r4.A05;
        ProgressBar progressBar = onboardingCheckListFragment.mProgressBar;
        if (!(progressBar == null || onboardingCheckListFragment.mLayoutContent == null)) {
            progressBar.setVisibility(8);
            onboardingCheckListFragment.mLayoutContent.setVisibility(0);
        }
        r4.A02(list);
    }
}
