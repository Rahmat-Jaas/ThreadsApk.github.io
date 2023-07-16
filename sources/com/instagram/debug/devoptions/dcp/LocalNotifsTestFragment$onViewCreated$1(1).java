package com.instagram.debug.devoptions.dcp;

import X.C14030oh;
import android.view.View;
import java.util.List;

public final class LocalNotifsTestFragment$onViewCreated$1 implements View.OnClickListener {
    public final /* synthetic */ List $candidates;
    public final /* synthetic */ LocalNotifsTestFragment this$0;

    public LocalNotifsTestFragment$onViewCreated$1(LocalNotifsTestFragment localNotifsTestFragment, List list) {
        this.this$0 = localNotifsTestFragment;
        this.$candidates = list;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(67480280);
        this.this$0.doPrediction(this.$candidates);
        C14030oh.A0C(-1303986949, A05);
    }
}
