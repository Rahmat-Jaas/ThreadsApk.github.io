package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape19S0201000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0101000_I2_6;
import kotlin.jvm.internal.KtLambdaShape25S0200000_I2_9;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

/* renamed from: X.1Zw  reason: invalid class name and case insensitive filesystem */
public final class C22791Zw extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CreatorToolsMonetizationFragment";
    public final C04530Oa A00 = C62373Zc.A00(this, 29);
    public final C04530Oa A01 = C62373Zc.A00(this, 30);
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03 = C18220wO.A0M(new KtLambdaShape60S0100000_I2_40(this, 31), new KtLambdaShape60S0100000_I2_40(this, 32), new KtLambdaShape25S0200000_I2_9(45, (Object) null, this), C18210wN.A0l(AnonymousClass10W.class));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131824656);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C04530Oa r6 = this.A03;
        C04530Oa r1 = this.A00;
        ((AnonymousClass10W) r6.getValue()).A00 = C18200wM.A0q(r1);
        if (C04220Ms.A0I(r1.getValue(), "pro_home")) {
            AnonymousClass10W r5 = (AnonymousClass10W) r6.getValue();
            FragmentActivity activity = getActivity();
            r5.A0C.CrC(C18180wK.A0Y());
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape19S0201000_I2_5((Object) r5, (Object) activity, (C146958n9) null, 20), AnonymousClass3J5.A00(r5), 3);
            A00(view);
            C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r6.getValue()).A01, view, this, 5);
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 29), C18200wM.A0M(this), 3);
        } else {
            AnonymousClass0wJ.A0I(view, R.id.megaphone_header_content).setVisibility(0);
            AnonymousClass0wJ.A0I(view, R.id.headline_bottom_divider).setVisibility(0);
            C18180wK.A0r(requireContext(), C18220wO.A0K(view, R.id.megaphone_header_icon), R.drawable.ig_illustrations_qp_circle_dollar_refresh);
            C18180wK.A10(C18180wK.A0G(view, R.id.megaphone_header_title), this, 2131824655);
            C18180wK.A10(C18180wK.A0G(view, R.id.megaphone_header_body), this, 2131824654);
            AnonymousClass10W r52 = (AnonymousClass10W) r6.getValue();
            FragmentActivity activity2 = getActivity();
            r52.A0C.CrC(C18180wK.A0Y());
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape19S0201000_I2_5((Object) r52, (Object) activity2, (C146958n9) null, 19), AnonymousClass3J5.A00(r52), 3);
            A00(view);
        }
        C18250wR.A0v(getViewLifecycleOwner(), ((AnonymousClass10W) r6.getValue()).A03, view, this, 4);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    private final void A00(View view) {
        C18240wQ.A12((RecyclerView) view.findViewById(R.id.monetization_product_list_recycler_view), this.A01);
        C18190wL.A1C(getViewLifecycleOwner(), ((AnonymousClass10W) this.A03.getValue()).A04, this, 18);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1194602745);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_monetization_screen, viewGroup, false);
        C14030oh.A09(712119988, A022);
        return inflate;
    }
}
