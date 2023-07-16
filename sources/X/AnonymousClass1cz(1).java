package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.1cz  reason: invalid class name */
public final class AnonymousClass1cz extends C34640IcN implements C21839C2o, C34 {
    public static final String __redex_internal_original_name = "LiveAttributionSheetFragment";
    public C561135v A00;
    public AnonymousClass3HS A01;
    public final C04530Oa A02;
    public final C04530Oa A03 = C80644m9.A00(this);

    public final String getModuleName() {
        return "live_attribution_sheet_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final Integer B6F() {
        return AnonymousClass006.A1L;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass1cz() {
        KtLambdaShape95S0100000_I2_75 ktLambdaShape95S0100000_I2_75 = new KtLambdaShape95S0100000_I2_75(this, 37);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape95S0100000_I2_75(new KtLambdaShape95S0100000_I2_75(this, 38), 39));
        this.A02 = C18220wO.A0M(new KtLambdaShape95S0100000_I2_75(A012, 40), ktLambdaShape95S0100000_I2_75, new KtLambdaShape32S0200000_I2_16(48, (Object) null, A012), C18210wN.A0l(C19430zr.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1352822554);
        super.onCreate(bundle);
        this.A01 = new AnonymousClass3HS(requireContext(), AnonymousClass0wJ.A0X(this.A03));
        Context requireContext = requireContext();
        AnonymousClass3HS r1 = this.A01;
        if (r1 == null) {
            C04220Ms.A0E("notificationsRowController");
            throw null;
        }
        this.A00 = new C561135v(requireContext, this, r1);
        C14030oh.A09(-255496555, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1921127929);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.live_attribution_sheet_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FastScrollingLinearLayoutManager(recyclerView.getContext()));
            C561135v r0 = this.A00;
            if (r0 == null) {
                C04220Ms.A0E("sheetAdapter");
                throw null;
            }
            recyclerView.setAdapter(r0.A00);
        }
        C18190wL.A1C(getViewLifecycleOwner(), ((C19430zr) this.A02.getValue()).A01, this, 43);
        C14030oh.A09(2064313165, A022);
        return inflate;
    }
}
