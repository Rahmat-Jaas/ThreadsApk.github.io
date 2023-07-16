package com.instagram.business.fragment;

import X.AnonymousClass0wJ;
import X.AnonymousClass1fT;
import X.AnonymousClass38H;
import X.AnonymousClass3G8;
import X.AnonymousClass3LY;
import X.AnonymousClass3V5;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C113246qz;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C24711ju;
import X.C25348Dk8;
import X.C25705DqT;
import X.C34640IcN;
import X.C37408JrQ;
import X.C554633h;
import X.C58343Fc;
import X.C63873iU;
import X.C67293zJ;
import X.C681742p;
import X.C82034oy;
import X.C82394pY;
import X.C82424pb;
import X.C84264sr;
import X.C84654td;
import X.E2V;
import X.E6M;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxSListenerShape58S0100000_1_I2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public class SuggestBusinessFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public AnonymousClass1fT A00;
    public BusinessFlowAnalyticsLogger A01;
    public AnonymousClass3V5 A02;
    public C58343Fc A03;
    public UserSession A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09 = true;
    public int A0A;
    public int A0B;
    public C113246qz A0C = new IDxSListenerShape58S0100000_1_I2(this, 1);
    public AnonymousClass3G8 A0D;
    public C84654td A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final C82394pY A0I = C18220wO.A0P(this, 17);
    public E2V mActionBarService;
    public BusinessNavBar mBusinessNavBar;
    public C24711ju mBusinessNavBarHelper;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mRecyclerView;
    public IgdsStepperHeader mStepperHeader;

    public static AnonymousClass1fT A00(SuggestBusinessFragment suggestBusinessFragment) {
        SuggestBusinessFragment suggestBusinessFragment2 = suggestBusinessFragment;
        AnonymousClass1fT r0 = suggestBusinessFragment.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1fT r02 = new AnonymousClass1fT(suggestBusinessFragment.requireContext(), new C554633h(suggestBusinessFragment2), suggestBusinessFragment2, suggestBusinessFragment.A04, suggestBusinessFragment.A0G, suggestBusinessFragment.A0F);
        suggestBusinessFragment2.A00 = r02;
        return r02;
    }

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CCX() {
        this.A09 = false;
        A02(this, "continue", (Map) null);
        C84654td r0 = this.A0E;
        if (r0 != null) {
            ((BusinessConversionActivity) r0).Bel((Bundle) null);
        } else {
            C18180wK.A12(this);
        }
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "suggest_business_fragment";
    }

    public static void A01(SuggestBusinessFragment suggestBusinessFragment) {
        if (suggestBusinessFragment.mView != null && suggestBusinessFragment.A07 != null) {
            AnonymousClass1fT A002 = A00(suggestBusinessFragment);
            List list = suggestBusinessFragment.A07;
            if (list != null) {
                A002.A01 = list;
                A002.A00();
            }
            List list2 = suggestBusinessFragment.A07;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            for (int i = 0; i < list2.size(); i++) {
                User user = ((AnonymousClass38H) list2.get(i)).A01;
                if (user != null) {
                    builder.add((Object) user);
                    builder2.add((Object) user.getId());
                }
            }
            C63873iU.A0C(suggestBusinessFragment, C25705DqT.A03(suggestBusinessFragment.A04, builder.build(), false), 23);
        }
    }

    public static void A02(SuggestBusinessFragment suggestBusinessFragment, String str, Map map) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = suggestBusinessFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("pro_account_suggestions", suggestBusinessFragment.A05, str, (String) null, (String) null, (Map) null, map, (Map) null));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        r5.setTitle("");
        r5.Crr(new C25348Dk8(C18190wL.A0H(this, 170), (String) null, 0));
        AnonymousClass4u2.A04(C18190wL.A0K(), r5, this, 171);
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A09 || (businessFlowAnalyticsLogger = this.A01) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(C18240wQ.A0M(this));
        return false;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A0E = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1391987609);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = C18180wK.A0V(requireArguments);
        this.A05 = C18190wL.A0j(requireArguments, "entry_point");
        this.A08 = requireArguments.getBoolean("ARG_CHECKLIST_ITEM_COMPLETED", false);
        String string = requireArguments.getString("suggested_business_fetch_entry_point");
        this.A06 = "";
        if (string != null) {
            this.A06 = string;
        }
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A0E, this, this.A04);
        this.A01 = A002;
        if (A002 != null) {
            A002.Bdt(C18240wQ.A0M(this));
        }
        this.A02 = new AnonymousClass3V5(this, this.A04);
        this.A03 = new C58343Fc();
        this.A0H = requireArguments.getBoolean("ARG_SHOW_STEPPER_HEADER", false);
        this.A0B = requireArguments.getInt("ARG_STEP_INDEX", -1);
        this.A0A = requireArguments.getInt("ARG_STEP_COUNT", -1);
        this.A0G = requireArguments.getString("ARG_TITLE", requireContext().getString(2131836353));
        this.A0F = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131836352));
        C14030oh.A09(-72314051, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1925800858);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.suggest_business_fragment);
        BusinessNavBar A0N = C18240wQ.A0N(A0H2);
        this.mBusinessNavBar = A0N;
        C24711ju r0 = new C24711ju(A0N, (C84264sr) this, 2131831737, -1);
        this.mBusinessNavBarHelper = r0;
        registerLifecycleListener(r0);
        this.mLoadingSpinner = (SpinnerImageView) A0H2.requireViewById(R.id.loading_indicator);
        this.A05 = C18190wL.A0j(requireArguments(), "entry_point");
        this.mActionBarService = C18190wL.A0M(this);
        this.mBusinessNavBar.setVisibility(8);
        C84654td r02 = this.A0E;
        if (r02 != null && r02.CWP() == null) {
            this.mBusinessNavBar.setPrimaryButtonText(2131826219);
        }
        C14030oh.A09(1206583995, A022);
        return A0H2;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-785230903);
        super.onDestroyView();
        unregisterLifecycleListener(this.mBusinessNavBarHelper);
        AnonymousClass3LY.A00(this.A04).A02(this.A0I, E6M.class);
        C14030oh.A09(358279542, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView A0L = C18230wP.A0L(view);
        this.mRecyclerView = A0L;
        A0L.A11(this.A0C);
        if (this.A01 != null) {
            this.A0D = new AnonymousClass3G8(this.mRecyclerView, A00(this), this);
        }
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.mBusinessNavBar.A01(this.mRecyclerView);
        this.mRecyclerView.setAdapter(A00(this));
        AnonymousClass3LY.A00(this.A04).A01(this.A0I, E6M.class);
        if (this.A0H) {
            IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
            this.mStepperHeader = igdsStepperHeader;
            igdsStepperHeader.setVisibility(0);
            this.mStepperHeader.A01(this.A0B, this.A0A);
        }
        if (this.A07 == null) {
            SpinnerImageView spinnerImageView = this.mLoadingSpinner;
            if (!(spinnerImageView == null || this.mBusinessNavBar == null)) {
                spinnerImageView.setVisibility(0);
            }
            this.A03.A00(new C681742p(this), this, this.A04, this.A06);
            return;
        }
        A01(this);
    }
}
