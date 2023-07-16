package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape54S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

/* renamed from: X.1Za  reason: invalid class name and case insensitive filesystem */
public final class C22681Za extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ScheduledContentFragment";
    public AnonymousClass11L A00;
    public AnonymousClass3In A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03;
    public final String A04 = "scheduled_content_fragment";

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 167);
        r3.Cqb(2131836013);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Integer num = AnonymousClass006.A02;
        C04530Oa r2 = this.A02;
        this.A01 = new AnonymousClass3In(this, AnonymousClass0wJ.A0X(r2), num);
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(r2);
        AnonymousClass3In r5 = this.A01;
        if (r5 == null) {
            str = "contentSchedulingLogger";
        } else {
            this.A00 = new AnonymousClass11L(requireContext, requireActivity, r5, this, A0X);
            View requireViewById = view.requireViewById(R.id.recycler_view);
            C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            requireContext();
            C18190wL.A1D(recyclerView);
            AnonymousClass11L r0 = this.A00;
            if (r0 == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(r0);
                C18230wP.A0J(((C19290zd) this.A03.getValue()).A00).A0C(getViewLifecycleOwner(), new IDxObserverShape54S0300000_1_I2(1, recyclerView, view, this));
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public C22681Za() {
        KtLambdaShape40S0100000_I2_20 ktLambdaShape40S0100000_I2_20 = new KtLambdaShape40S0100000_I2_20(this, 37);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape40S0100000_I2_20(new KtLambdaShape40S0100000_I2_20(this, 34), 35));
        this.A03 = C18220wO.A0M(new KtLambdaShape40S0100000_I2_20(A012, 36), ktLambdaShape40S0100000_I2_20, new KtLambdaShape21S0200000_I2_5(4, A012, (Object) null), C18210wN.A0l(C19290zd.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-974320680);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.scheduled_content_fragment, false);
        C14030oh.A09(-224898876, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1417120360);
        super.onDestroyView();
        AnonymousClass11L r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("adapter");
            throw null;
        }
        r0.A02();
        C14030oh.A09(-547165564, A022);
    }
}
