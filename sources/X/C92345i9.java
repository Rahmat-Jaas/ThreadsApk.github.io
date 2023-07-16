package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;

/* renamed from: X.5i9  reason: invalid class name and case insensitive filesystem */
public final class C92345i9 extends AnonymousClass56B {
    public final void A03() {
        ListSectionWithFeSelectorViewModel listSectionWithFeSelectorViewModel;
        super.A03();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            int i = bundle.getInt("fe_selector_view_model_class_id", -1);
            if (i == -1 || this.mParentFragment == null) {
                listSectionWithFeSelectorViewModel = null;
            } else {
                C115366uw A06 = AnonymousClass7Kz.A06();
                Fragment requireParentFragment = requireParentFragment();
                while (requireParentFragment instanceof AnonymousClass5qp) {
                    requireParentFragment = requireParentFragment.requireParentFragment();
                }
                C62793ak A01 = A06.A01(requireParentFragment, i);
                C04220Ms.A0C(A01, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterEntryPointOwner");
                listSectionWithFeSelectorViewModel = (ListSectionWithFeSelectorViewModel) A01;
            }
            ListSectionViewModel A02 = A02();
            C04220Ms.A0C(A02, "null cannot be cast to non-null type com.facebookpay.msc.filter.controller.FilterOwner");
            ((C143548gv) A02).BQ1(listSectionWithFeSelectorViewModel);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
