package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class RepositoryInfoFragment$ExpandableColumn$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0YP $content;
    public final /* synthetic */ String $label;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ RepositoryInfoFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$ExpandableColumn$2(RepositoryInfoFragment repositoryInfoFragment, String str, Modifier modifier, AnonymousClass0YP r5, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = repositoryInfoFragment;
        this.$label = str;
        this.$modifier = modifier;
        this.$content = r5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r9, int i) {
        this.$tmp0_rcvr.ExpandableColumn(this.$label, this.$modifier, this.$content, r9, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
