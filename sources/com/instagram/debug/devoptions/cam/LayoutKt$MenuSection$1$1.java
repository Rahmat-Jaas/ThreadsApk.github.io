package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$MenuSection$1$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ CamDevOptionsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$MenuSection$1$1(CamDevOptionsViewModel camDevOptionsViewModel) {
        super(2);
        this.$viewModel = camDevOptionsViewModel;
    }

    public final void invoke(C147188nY r3, int i) {
        if ((i & 11) != 2 || !r3.BCM()) {
            LayoutKt.BrandedContentOptions(this.$viewModel, r3, 8);
        } else {
            r3.CuJ();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
