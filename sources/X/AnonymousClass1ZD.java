package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape54S0300000_1_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape21S0200000_I2_5;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;

/* renamed from: X.1ZD  reason: invalid class name */
public final class AnonymousClass1ZD extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "StoryHighlightsToReelsFragment";
    public final C04530Oa A00 = C80644m9.A00(this);
    public final C04530Oa A01;
    public final String A02 = "story_highlights_to_reels_fragment";

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 169);
        r3.Cqb(2131836242);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C150268vy r4 = new C150268vy(requireActivity(), this, AnonymousClass0wJ.A0X(this.A00));
        requireContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A02 = new C196110s(r4);
        View requireViewById = view.requireViewById(R.id.recycler_view);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(r4);
        C18230wP.A0J(((C19330zh) this.A01.getValue()).A01).A0C(getViewLifecycleOwner(), new IDxObserverShape54S0300000_1_I2(2, r4, view, this));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public AnonymousClass1ZD() {
        KtLambdaShape40S0100000_I2_20 ktLambdaShape40S0100000_I2_20 = new KtLambdaShape40S0100000_I2_20(this, 41);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape40S0100000_I2_20(new KtLambdaShape40S0100000_I2_20(this, 38), 39));
        this.A01 = C18220wO.A0M(new KtLambdaShape40S0100000_I2_20(A012, 40), ktLambdaShape40S0100000_I2_20, new KtLambdaShape21S0200000_I2_5(5, A012, (Object) null), C18210wN.A0l(C19330zh.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-832530684);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.story_highlights_to_reels_layout, false);
        C14030oh.A09(1044676425, A022);
        return A0D;
    }
}
