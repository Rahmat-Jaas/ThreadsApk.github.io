package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass3z1;
import X.C14030oh;
import android.app.job.JobParameters;
import android.content.Context;
import android.view.View;

public final class LocalNotificationsFragment$onViewCreated$1 implements View.OnClickListener {
    public final /* synthetic */ LocalNotificationsFragment this$0;

    public LocalNotificationsFragment$onViewCreated$1(LocalNotificationsFragment localNotificationsFragment) {
        this.this$0 = localNotificationsFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1063394447);
        AnonymousClass3z1.A00((JobParameters) null, (Context) null, this.this$0, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), true);
        C14030oh.A0C(-1063924978, A05);
    }
}
