package com.instagram.debug.devoptions.igns;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147138nS;
import com.instagram.debug.devoptions.igns.InternalIgNotificationListViewModel;

public final class InternalIgNotificationListFragment$viewModel$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ InternalIgNotificationListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InternalIgNotificationListFragment$viewModel$2(InternalIgNotificationListFragment internalIgNotificationListFragment) {
        super(0);
        this.this$0 = internalIgNotificationListFragment;
    }

    public final C147138nS invoke() {
        return new InternalIgNotificationListViewModel.Factory(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
    }
}
