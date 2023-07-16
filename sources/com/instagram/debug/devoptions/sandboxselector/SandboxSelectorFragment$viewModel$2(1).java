package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0ZU;
import X.AnonymousClass9K7;
import X.C02220Ah;
import X.C04220Ms;
import X.C147138nS;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import com.instagram.service.session.UserSession;

public final class SandboxSelectorFragment$viewModel$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ SandboxSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SandboxSelectorFragment$viewModel$2(SandboxSelectorFragment sandboxSelectorFragment) {
        super(0);
        this.this$0 = sandboxSelectorFragment;
    }

    public final C147138nS invoke() {
        UserSession session = this.this$0.getSession();
        AnonymousClass9K7 r1 = this.this$0.navigationPerfLogger;
        if (r1 != null) {
            return new SandboxSelectorViewModel.Factory(session, "sandbox_selector", r1);
        }
        C04220Ms.A0E("navigationPerfLogger");
        throw null;
    }
}
