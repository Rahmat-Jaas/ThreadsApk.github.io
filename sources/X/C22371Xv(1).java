package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Xv  reason: invalid class name and case insensitive filesystem */
public final class C22371Xv extends C34640IcN {
    public static final String __redex_internal_original_name = "BoostAudienceLocationExpansionLearnMoreBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "location_expansion_learn_more_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0V = AnonymousClass00U.A0V(getString(2131822433), "\n\n", getString(2131822434));
        C04220Ms.A06(A0V);
        AnonymousClass0wJ.A0L(view, R.id.learn_more_content).setText(A0V);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(831117030);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.boost_audience_location_expansion_learn_more_bottom_sheet, viewGroup, false);
        C14030oh.A09(1934235414, A02);
        return inflate;
    }
}
