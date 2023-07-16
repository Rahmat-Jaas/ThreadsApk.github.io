package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$MediaKitOptions$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ CamDevOptionsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$MediaKitOptions$2(CamDevOptionsViewModel camDevOptionsViewModel, int i) {
        super(2);
        this.$viewModel = camDevOptionsViewModel;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }

    public final void invoke(C147188nY r3, int i) {
        LayoutKt.MediaKitOptions(this.$viewModel, r3, C115796vv.A00(this.$$changed));
    }
}
