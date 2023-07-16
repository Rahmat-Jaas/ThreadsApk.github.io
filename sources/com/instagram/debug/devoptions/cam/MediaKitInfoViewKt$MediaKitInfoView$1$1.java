package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C147368pE;
import kotlin.Unit;

public final class MediaKitInfoViewKt$MediaKitInfoView$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ C147368pE $jsonInfoState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitInfoViewKt$MediaKitInfoView$1$1(C147368pE r2) {
        super(1);
        this.$jsonInfoState = r2;
    }

    public final void invoke(String str) {
        C04220Ms.A0B(str, 0);
        this.$jsonInfoState.CrC(str);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.A00;
    }
}
