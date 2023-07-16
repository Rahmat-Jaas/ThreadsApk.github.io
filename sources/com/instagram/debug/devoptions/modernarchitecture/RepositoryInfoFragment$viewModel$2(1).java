package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147138nS;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;

public final class RepositoryInfoFragment$viewModel$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$viewModel$2(RepositoryInfoFragment repositoryInfoFragment) {
        super(0);
        this.this$0 = repositoryInfoFragment;
    }

    public final C147138nS invoke() {
        return new RepositoryInfoViewModel.Factory(AnonymousClass0wJ.A0X(this.this$0.session$delegate));
    }
}
