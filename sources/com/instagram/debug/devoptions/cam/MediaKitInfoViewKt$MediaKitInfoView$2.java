package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C147368pE;
import kotlin.Unit;

public final class MediaKitInfoViewKt$MediaKitInfoView$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C147368pE $jsonInfoState;
    public final /* synthetic */ MediaKitDevOptionViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitInfoViewKt$MediaKitInfoView$2(C147368pE r2, MediaKitDevOptionViewModel mediaKitDevOptionViewModel, int i) {
        super(2);
        this.$jsonInfoState = r2;
        this.$viewModel = mediaKitDevOptionViewModel;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r4, int i) {
        MediaKitInfoViewKt.MediaKitInfoView(this.$jsonInfoState, this.$viewModel, r4, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
