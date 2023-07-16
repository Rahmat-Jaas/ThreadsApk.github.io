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
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

/* renamed from: X.1bg  reason: invalid class name and case insensitive filesystem */
public final class C22961bg extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AddObjectivesFlowConnectFragment";
    public RecyclerView A00;
    public AnonymousClass10z A01;
    public BusinessFlowAnalyticsLogger A02;
    public AnonymousClass3V5 A03;
    public IgdsBottomButtonLayout A04;
    public String A05;
    public List A06;
    public C84654td A07;
    public IgdsStepperHeader A08;
    public final Set A09;
    public final C04530Oa A0A;
    public final C04530Oa A0B = C80644m9.A00(this);
    public final C82394pY A0C;

    public final String getModuleName() {
        return "add_objectives_flow_connect_fragment";
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
        this.A07 = r1;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A08 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.A02(1, 2, true, false);
        }
        IgdsStepperHeader igdsStepperHeader2 = this.A08;
        if (igdsStepperHeader2 != null) {
            igdsStepperHeader2.A00();
        }
        IgdsBottomButtonLayout A0W = C18230wP.A0W(view, R.id.action_bottom_button);
        A0W.setPrimaryButtonEnabled(false);
        A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 113));
        this.A04 = A0W;
        C18250wR.A0v(getViewLifecycleOwner(), ((C19460zu) this.A0A.getValue()).A02, view, this, 2);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.Cqb(2131821084);
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A00 = R.drawable.instagram_arrow_left_pano_outline_24;
            AnonymousClass4u2.A04(A0K, r3, this, 112);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0B);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public C22961bg() {
        C02230Ai A0l = C18210wN.A0l(C19460zu.class);
        this.A0A = C18220wO.A0M(new KtLambdaShape40S0100000_I2_20(this, 28), new KtLambdaShape40S0100000_I2_20(this, 29), new KtLambdaShape21S0200000_I2_5(2, this, (Object) null), A0l);
        this.A09 = new LinkedHashSet();
        this.A0C = C18220wO.A0P(this, 10);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1252348747);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r4 = this.A0B;
        this.A03 = new AnonymousClass3V5(this, AnonymousClass0wJ.A0X(r4));
        C38040KHr.A01.A03(this.A0C, AnonymousClass0P9.class);
        this.A05 = requireArguments.getString("entry_point");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A07, this, AnonymousClass0wJ.A0U(r4));
        this.A02 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("business_objectives", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(-1755835421, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-138260677);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_objectives_flow_connect_fragment, viewGroup, false);
        AnonymousClass0wJ.A0L(inflate, R.id.title).setText(2131821082);
        AnonymousClass0wJ.A0L(inflate, R.id.subtitle).setText(2131821081);
        C18190wL.A1C(getViewLifecycleOwner(), ((C19460zu) this.A0A.getValue()).A03, this, 6);
        C14030oh.A09(-1511279716, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(770164341);
        super.onDestroyView();
        this.A08 = null;
        this.A00 = null;
        C38040KHr.A01.A04(this.A0C, AnonymousClass0P9.class);
        C14030oh.A09(-1319679847, A022);
    }
}
