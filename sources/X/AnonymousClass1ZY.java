package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0301000_I2_3;

/* renamed from: X.1ZY  reason: invalid class name */
public final class AnonymousClass1ZY extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "FanClubCustomizedBenefitsEditFragment";
    public C150388wA A00;
    public RecyclerView A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.customized_benefits_selection_recycler_view);
        this.A01 = recyclerView;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C150388wA r0 = this.A00;
            if (r0 == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(r0);
                AnonymousClass061 r4 = AnonymousClass061.STARTED;
                AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0301000_I2_3((Object) viewLifecycleOwner, (Object) r4, (Object) this, (C146958n9) null, 42), AnonymousClass067.A00(viewLifecycleOwner), 3);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public AnonymousClass1ZY() {
        C75854cv r5 = C75854cv.A00;
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C18250wR.A0f(C18250wR.A0f(this, 0), 1));
        this.A03 = C18220wO.A0M(C18250wR.A0f(A012, 2), r5, C18250wR.A0d(A012, (Object) null, 37), C18210wN.A0l(C19420zq.class));
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A05(r3);
        r3.Cqb(2131824717);
        r3.CpF(getString(2131824715), (View.OnClickListener) null);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(356746379);
        super.onCreate(bundle);
        this.A00 = C18220wO.A0Z(C18220wO.A0Y(this), new AnonymousClass1lL());
        C14030oh.A09(-547211970, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1067751824);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_customized_benefits_edit, viewGroup, false);
        C14030oh.A09(-2119383945, A022);
        return inflate;
    }
}
