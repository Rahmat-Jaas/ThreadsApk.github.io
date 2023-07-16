package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;

public final class RepositoryInfoFragment$RepositoryList$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ List $repositoriesInfo;
    public final /* synthetic */ RepositoryInfoFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryList$2(RepositoryInfoFragment repositoryInfoFragment, List list, Modifier modifier, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = repositoryInfoFragment;
        this.$repositoriesInfo = list;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r8, int i) {
        this.$tmp0_rcvr.RepositoryList(this.$repositoriesInfo, this.$modifier, r8, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
