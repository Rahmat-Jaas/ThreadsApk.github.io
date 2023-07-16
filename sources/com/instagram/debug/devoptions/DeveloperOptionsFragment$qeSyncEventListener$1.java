package com.instagram.debug.devoptions;

import X.C14030oh;
import X.C82394pY;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;

public final class DeveloperOptionsFragment$qeSyncEventListener$1 implements C82394pY {
    public final /* synthetic */ DeveloperOptionsFragment this$0;

    public DeveloperOptionsFragment$qeSyncEventListener$1(DeveloperOptionsFragment developerOptionsFragment) {
        this.this$0 = developerOptionsFragment;
    }

    public final void onEvent(DevOptionsRefreshEvent devOptionsRefreshEvent) {
        int A03 = C14030oh.A03(1565079056);
        this.this$0.refreshItems();
        C14030oh.A0A(1462645656, A03);
    }

    public /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C14030oh.A03(578884430);
        onEvent((DevOptionsRefreshEvent) obj);
        C14030oh.A0A(-1375021626, A03);
    }
}
