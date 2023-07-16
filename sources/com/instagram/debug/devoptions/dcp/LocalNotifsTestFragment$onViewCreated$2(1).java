package com.instagram.debug.devoptions.dcp;

import X.C14030oh;
import X.C18240wQ;
import android.view.View;
import com.facebook.dcp.model.DcpContext;
import java.util.List;

public final class LocalNotifsTestFragment$onViewCreated$2 implements View.OnClickListener {
    public final /* synthetic */ List $candidates;
    public final /* synthetic */ LocalNotifsTestFragment this$0;

    public LocalNotifsTestFragment$onViewCreated$2(LocalNotifsTestFragment localNotifsTestFragment, List list) {
        this.this$0 = localNotifsTestFragment;
        this.$candidates = list;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-302191942);
        this.this$0.doTraining((DcpContext) C18240wQ.A0b(this.$candidates));
        C14030oh.A0C(-1102348254, A05);
    }
}
