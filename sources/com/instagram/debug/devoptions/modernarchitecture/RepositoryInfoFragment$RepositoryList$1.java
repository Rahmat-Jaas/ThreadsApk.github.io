package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.C02220Ah;
import X.C04220Ms;
import X.C145078jn;
import java.util.List;
import kotlin.Unit;

public final class RepositoryInfoFragment$RepositoryList$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ List $repositoriesInfo;
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryList$1(List list, RepositoryInfoFragment repositoryInfoFragment) {
        super(1);
        this.$repositoriesInfo = list;
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C145078jn r7) {
        C04220Ms.A0B(r7, 0);
        List list = this.$repositoriesInfo;
        RepositoryInfoFragment repositoryInfoFragment = this.this$0;
        RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$1 repositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$1 = RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$1.INSTANCE;
        r7.Ba5((AnonymousClass0YY) null, new RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$3(repositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$1, list), AnonymousClass7WY.A00(new RepositoryInfoFragment$RepositoryList$1$invoke$$inlined$items$default$4(list, repositoryInfoFragment), -632812321), list.size());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C145078jn) obj);
        return Unit.A00;
    }
}
