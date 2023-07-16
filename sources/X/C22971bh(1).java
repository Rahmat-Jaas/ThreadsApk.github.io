package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

/* renamed from: X.1bh  reason: invalid class name and case insensitive filesystem */
public final class C22971bh extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AddObjectivesFlowSeeMoreFragment";
    public RecyclerView A00;
    public C196610y A01;
    public BusinessFlowAnalyticsLogger A02;
    public AnonymousClass3V5 A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public List A07;
    public C84654td A08;
    public IgdsStepperHeader A09;
    public final Set A0A;
    public final C04530Oa A0B;
    public final C04530Oa A0C = C80644m9.A00(this);

    public final String getModuleName() {
        return "add_objectives_flow_see_more_fragment";
    }

    public final void onAttach(Context context) {
        C84654td r1;
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof C84654td) {
            r1 = (C84654td) requireActivity;
        } else {
            r1 = null;
        }
        this.A08 = r1;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A09 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A02(0, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A09;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A00();
        }
        this.A01 = new C196610y(this);
        RecyclerView A0L = C18230wP.A0L(view);
        this.A00 = A0L;
        if (A0L != null) {
            getContext();
            C18190wL.A1D(A0L);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C196610y r0 = this.A01;
            if (r0 == null) {
                str = "adapter";
                C04220Ms.A0E(str);
                throw null;
            }
            recyclerView.setAdapter(r0);
        }
        IgdsBottomButtonLayout A0W = C18230wP.A0W(view, R.id.action_bottom_button);
        A0W.setPrimaryButtonEnabled(false);
        A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 115));
        this.A04 = A0W;
        AnonymousClass3V5 r1 = this.A03;
        if (r1 == null) {
            str = "onboardingChecklistNetworkHelper";
            C04220Ms.A0E(str);
            throw null;
        }
        requireContext();
        IDxACallbackShape111S0100000_1_I2 A062 = C63873iU.A06(this, 8);
        C145538kf r3 = r1.A00;
        H1T A0O = C18180wK.A0O(r1.A01);
        A0O.A0J("business/account/get_business_objectives_connection_methods/");
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C21981Sx.class, AnonymousClass3L3.class);
        A0T.A00 = A062;
        r3.schedule(A0T);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131821084);
            AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 114);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0C);
    }

    public C22971bh() {
        C02230Ai A0l = C18210wN.A0l(C19460zu.class);
        this.A0B = C18220wO.A0M(new KtLambdaShape40S0100000_I2_20(this, 30), new KtLambdaShape40S0100000_I2_20(this, 31), new KtLambdaShape21S0200000_I2_5(3, this, (Object) null), A0l);
        this.A07 = AnonymousClass0wJ.A0v();
        this.A0A = new LinkedHashSet();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(261899016);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r2 = this.A0C;
        this.A03 = new AnonymousClass3V5(this, AnonymousClass0wJ.A0X(r2));
        this.A05 = requireArguments.getString("entry_point");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A08, this, AnonymousClass0wJ.A0U(r2));
        this.A02 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(-1385959575, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2120024836);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_see_more_fragment, viewGroup, false);
        AnonymousClass0wJ.A0L(inflate, R.id.title).setText(2131821086);
        AnonymousClass0wJ.A0L(inflate, R.id.subtitle).setText(2131821085);
        C18190wL.A1C(getViewLifecycleOwner(), ((C19460zu) this.A0B.getValue()).A03, this, 7);
        C14030oh.A09(-903777615, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1853298034);
        super.onDestroyView();
        this.A09 = null;
        this.A00 = null;
        this.A04 = null;
        C14030oh.A09(-943214330, A022);
    }
}
