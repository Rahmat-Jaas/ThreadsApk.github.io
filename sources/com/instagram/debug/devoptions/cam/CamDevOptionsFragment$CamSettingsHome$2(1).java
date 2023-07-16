package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class CamDevOptionsFragment$CamSettingsHome$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ CamDevOptionsFragment $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsFragment$CamSettingsHome$2(CamDevOptionsFragment camDevOptionsFragment, int i) {
        super(2);
        this.$tmp0_rcvr = camDevOptionsFragment;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }

    public final void invoke(C147188nY r3, int i) {
        this.$tmp0_rcvr.CamSettingsHome(r3, C115796vv.A00(this.$$changed));
    }
}
