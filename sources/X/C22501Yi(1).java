package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1Yi  reason: invalid class name and case insensitive filesystem */
public final class C22501Yi extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteCTXEducationBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "promote_ctx_education_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.promote_ctx_bottom_sheet_layout);
        C18200wM.A15(requireActivity(), (TextView) AnonymousClass0wJ.A0J(A0K, R.id.ctx_bottom_sheet_title), 2131833293);
        A00(A0K, R.id.ctx_contact_row, 2131833288, 2131833289, R.drawable.instagram_users_pano_outline_24);
        A00(A0K, R.id.ctx_budget_row, 2131833291, 2131833292, R.drawable.instagram_circle_dollar_pano_outline_24);
        A00(A0K, R.id.ctx_audience_row, 2131833294, 2131833295, R.drawable.instagram_comment_pano_outline_24);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0K = AnonymousClass0wJ.A0K(view, i);
        C18180wK.A0G(A0K, R.id.primary_text).setText(i2);
        C18180wK.A0G(A0K, R.id.secondary_text).setText(i3);
        C18220wO.A0K(A0K, R.id.row_icon).setImageResource(i4);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-937295094);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_ctx_education_bottom_sheet_view, viewGroup, false);
        C14030oh.A09(802644901, A02);
        return inflate;
    }
}
