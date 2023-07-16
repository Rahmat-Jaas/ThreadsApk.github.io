package com.instagram.debug.landingexperiment;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YK;
import X.C05050Qq;
import X.C14030oh;
import X.C18180wK;
import X.C25786Drz;
import android.os.Bundle;
import android.view.View;

public final class LandingExperimentListFragment$onCreate$1 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3YK $experiment;
    public final /* synthetic */ LandingExperimentListFragment this$0;

    public LandingExperimentListFragment$onCreate$1(LandingExperimentListFragment landingExperimentListFragment, AnonymousClass3YK r2) {
        this.this$0 = landingExperimentListFragment;
        this.$experiment = r2;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1366156444);
        Bundle A06 = C18180wK.A06();
        A06.putString(this.this$0.SELECTED_LANDING_EXPERIMENT, this.$experiment.A09);
        C05050Qq.A00(A06, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
        C25786Drz A0Q = C18180wK.A0Q(this.this$0.requireActivity(), AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
        A0Q.A0A(A06, new LandingExperimentDetailFragment());
        A0Q.A05();
        C14030oh.A0C(-1971752880, A05);
    }
}
