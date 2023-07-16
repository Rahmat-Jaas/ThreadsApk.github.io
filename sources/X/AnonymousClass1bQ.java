package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape27S0400000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1bQ  reason: invalid class name */
public final class AnonymousClass1bQ extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "AllowedAdPlacementsSettingsFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape91S0100000_I2_71(this, 11));
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r3) {
        C04220Ms.A0B(r3, 0);
        r3.Cqb(2131821298);
        r3.CtU(C18210wN.A0H(this, 36), true);
    }

    public final String getModuleName() {
        return "allowed_ad_placements_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0J = AnonymousClass0wJ.A0J(view, R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recycler_view);
        AnonymousClass1fC r7 = new AnonymousClass1fC(requireContext(), AnonymousClass0wJ.A0U(this.A01), this);
        requireContext();
        C18190wL.A1D(recyclerView);
        recyclerView.setAdapter(r7);
        ((AnonymousClass10T) this.A02.getValue()).A00.A0C(getViewLifecycleOwner(), new IDxObserverShape27S0400000_1_I2(0, this, A0J, recyclerView, r7));
        AnonymousClass061 r72 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(viewLifecycleOwner, r72, this, (C146958n9) null, 39), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final boolean onBackPressed() {
        C62793ak A0N = C18200wM.A0N(this.A02);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7(A0N, (C146958n9) null, 33), AnonymousClass3J5.A00(A0N), 3);
        return true;
    }

    public AnonymousClass1bQ() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 15);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 12), 13));
        this.A02 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A012, 14), ktLambdaShape91S0100000_I2_71, new KtLambdaShape31S0200000_I2_15(48, (Object) null, A012), C18210wN.A0l(AnonymousClass10T.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1452069730);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.allowed_ad_placements, false);
        C14030oh.A09(-2020683034, A022);
        return A0D;
    }
}
