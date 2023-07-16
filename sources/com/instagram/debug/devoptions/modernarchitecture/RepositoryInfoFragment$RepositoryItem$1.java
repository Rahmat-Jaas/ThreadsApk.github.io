package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass00U;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7I9;
import X.AnonymousClass7J9;
import X.AnonymousClass7K4;
import X.C02220Ah;
import X.C114236su;
import X.C121117Ee;
import X.C134817yQ;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import kotlin.Unit;

public final class RepositoryInfoFragment$RepositoryItem$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ RepositoryInfoViewModel.RepositoryInfo $repositoryInfo;
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$RepositoryItem$1(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier, RepositoryInfoFragment repositoryInfoFragment) {
        super(2);
        this.$repositoryInfo = repositoryInfo;
        this.$modifier = modifier;
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C147188nY r24, int i) {
        C147188nY r5 = r24;
        if ((i & 11) != 2 || !r5.BCM()) {
            String A0L = AnonymousClass00U.A0L("Feature: ", this.$repositoryInfo.featureTag);
            float f = (float) 4;
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(this.$modifier, (float) 0, f, f, f), AnonymousClass7J9.A01(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A0L, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats = this.$repositoryInfo.memoryCacheStats;
            if (memoryCacheStats != null) {
                this.this$0.MemoryCacheStats(memoryCacheStats, (Modifier) null, r5, 512, 2);
                return;
            }
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
