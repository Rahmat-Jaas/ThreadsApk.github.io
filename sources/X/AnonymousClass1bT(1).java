package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;

/* renamed from: X.1bT  reason: invalid class name */
public final class AnonymousClass1bT extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "GuidedActivationConfirmationFragment";
    public IgLinearLayout A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public CDB A04;
    public SpinnerImageView A05;
    public RecyclerView A06;
    public final C04530Oa A07 = C62373Zc.A01(this, 28);
    public final C04530Oa A08 = C80644m9.A00(this);
    public final C04530Oa A09;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgLinearLayout) AnonymousClass0wJ.A0J(view, R.id.guided_activation_container);
        this.A05 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        this.A03 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.guided_activation_confirmation_title);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.guided_activation_confirmation_subtitle);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.guided_activation_notify_now);
        this.A06 = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.notification_deferral_next_steps_recycler_view);
        CDB cdb = new CDB(AnonymousClass0wJ.A0X(this.A08));
        this.A04 = cdb;
        cdb.A00 = this;
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            C04220Ms.A0E("nextSteps");
            throw null;
        }
        recyclerView.setAdapter(cdb);
        C62793ak A0N = C18200wM.A0N(this.A09);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0202000_I2((Object) A0N, (C146958n9) null, 5), AnonymousClass3J5.A00(A0N), 3);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r4, (Object) this, (C146958n9) null, 47), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A08);
    }

    public AnonymousClass1bT() {
        KtLambdaShape69S0100000_I2_49 A0f = C18250wR.A0f(this, 32);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 29), 30));
        this.A09 = C18220wO.A0M(C18250wR.A0f(A012, 31), A0f, C18250wR.A0d(A012, (Object) null, 44), C18210wN.A0l(AnonymousClass108.class));
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        AnonymousClass4u2.A05(r2);
        AnonymousClass4u2.A06(r2);
        r2.Cqb(2131828234);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(35958899);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.guided_activation_confirmation, viewGroup, false);
        C14030oh.A09(1353784320, A022);
        return inflate;
    }
}
