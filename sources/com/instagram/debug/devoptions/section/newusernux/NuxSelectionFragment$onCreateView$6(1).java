package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C27551sh;
import X.C27601sp;
import X.C63463hW;
import X.C82834qL;
import android.content.Context;
import android.view.View;

public final class NuxSelectionFragment$onCreateView$6 implements View.OnClickListener {
    public final /* synthetic */ NuxSelectionFragment this$0;

    public NuxSelectionFragment$onCreateView$6(NuxSelectionFragment nuxSelectionFragment) {
        this.this$0 = nuxSelectionFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-917088012);
        Context context = this.this$0.getContext();
        if (context != null) {
            NuxSelectionFragment nuxSelectionFragment = this.this$0;
            C27601sp r3 = new C27601sp(nuxSelectionFragment.delegate, nuxSelectionFragment.getSerializableSteps());
            C27551sh A00 = C27551sh.A00(context, AnonymousClass0wJ.A0X(nuxSelectionFragment.userSession$delegate), nuxSelectionFragment.delegate, (C82834qL) null);
            nuxSelectionFragment.logic = A00;
            A00.A07(r3);
            C63463hW.A05(AnonymousClass0wJ.A0X(nuxSelectionFragment.userSession$delegate), nuxSelectionFragment.getContext(), false);
        }
        C14030oh.A0C(2126327907, A05);
    }
}
