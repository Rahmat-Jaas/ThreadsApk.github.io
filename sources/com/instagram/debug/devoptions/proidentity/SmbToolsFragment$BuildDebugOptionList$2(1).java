package com.instagram.debug.devoptions.proidentity;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class SmbToolsFragment$BuildDebugOptionList$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ SmbToolsFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmbToolsFragment$BuildDebugOptionList$2(SmbToolsFragment smbToolsFragment, int i) {
        super(2);
        this.$tmp0_rcvr = smbToolsFragment;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }

    public final void invoke(C147188nY r3, int i) {
        this.$tmp0_rcvr.BuildDebugOptionList(r3, C115796vv.A00(this.$$changed));
    }
}
