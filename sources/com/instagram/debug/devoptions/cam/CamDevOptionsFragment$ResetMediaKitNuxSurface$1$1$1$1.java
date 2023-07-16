package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import X.C312524w;

public final class CamDevOptionsFragment$ResetMediaKitNuxSurface$1$1$1$1 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C312524w $nux;
    public final /* synthetic */ CamDevOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsFragment$ResetMediaKitNuxSurface$1$1$1$1(CamDevOptionsFragment camDevOptionsFragment, C312524w r3) {
        super(0);
        this.this$0 = camDevOptionsFragment;
        this.$nux = r3;
    }

    public final void invoke() {
        this.this$0.getCamDevOptionsViewModel().resetNux(this.$nux);
    }
}
