package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import java.util.ArrayList;

/* renamed from: X.1w9  reason: invalid class name */
public final class AnonymousClass1w9 extends C23411dm {
    public static final String __redex_internal_original_name = "SevereBugDescriptionBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "severe_bug_description_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        boolean z = requireArguments().getBoolean("SevereBugDescriptionBottomSheetFragment.ARGUMENT_INCLUDE_BUTTONS");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63293hC r1 = new C63293hC(2131835598);
        r1.A05 = true;
        r1.A00 = R.style.igds_emphasized_title;
        r1.A01 = R.dimen.abc_floating_window_z;
        A0v.add(r1);
        C63293hC r0 = new C63293hC(2131835597);
        r0.A05 = true;
        A0v.add(r0);
        if (z) {
            A0v.add(new AnonymousClass3T9(C18190wL.A0H(this, 97), requireContext().getString(2131835600), requireContext().getString(2131835600)));
            C63293hC r12 = new C63293hC(2131835599);
            r12.A00 = R.style.rageshake_report_anyway;
            r12.A01 = R.dimen.abc_floating_window_z;
            r12.A03 = C18190wL.A0H(this, 96);
            r12.A05 = true;
            A0v.add(r12);
        }
        setBottomSheetMenuItems(A0v);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }
}
