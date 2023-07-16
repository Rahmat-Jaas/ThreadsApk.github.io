package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147138nS;
import com.instagram.debug.devoptions.cam.CamDevOptionsViewModel;

public final class CamDevOptionsFragment$camDevOptionsViewModel$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ CamDevOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsFragment$camDevOptionsViewModel$2(CamDevOptionsFragment camDevOptionsFragment) {
        super(0);
        this.this$0 = camDevOptionsFragment;
    }

    public final C147138nS invoke() {
        return new CamDevOptionsViewModel.Factory(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
    }
}
