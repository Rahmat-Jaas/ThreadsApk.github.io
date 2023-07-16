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

public final class RepositoryInfoFragment$MemoryCacheStats$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ RepositoryInfoViewModel.MemoryCacheStats $memoryCacheStats;
    public final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$MemoryCacheStats$1(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier) {
        super(2);
        this.$memoryCacheStats = memoryCacheStats;
        this.$modifier = modifier;
    }

    public final void invoke(C147188nY r24, int i) {
        C147188nY r5 = r24;
        if ((i & 11) != 2 || !r5.BCM()) {
            String A0J = AnonymousClass00U.A0J("Hit count: ", this.$memoryCacheStats.hitCount);
            float f = (float) 4;
            float f2 = (float) 0;
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(this.$modifier, f2, f, f, f), AnonymousClass7J9.A01(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A0J, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            String A0J2 = AnonymousClass00U.A0J("Miss count: ", this.$memoryCacheStats.missCount);
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(this.$modifier, f2, f, f, f), AnonymousClass7J9.A01(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A0J2, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            String A0J3 = AnonymousClass00U.A0J("Put count: ", this.$memoryCacheStats.putCount);
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(this.$modifier, f2, f, f, f), AnonymousClass7J9.A01(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A0J3, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            String A0J4 = AnonymousClass00U.A0J("Eviction count: ", this.$memoryCacheStats.evictionCount);
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A05(this.$modifier, f2, f, f, f), AnonymousClass7J9.A01(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A0J4, 0, 0, 0, 0, 0, 2044, 0, 0, false);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
