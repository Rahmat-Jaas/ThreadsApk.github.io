package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$CamDevOptionsMenuItem$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0ZU $onClick;
    public final /* synthetic */ boolean $showLoading;
    public final /* synthetic */ String $title;
    public final /* synthetic */ CamDevOptionsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$CamDevOptionsMenuItem$2(CamDevOptionsViewModel camDevOptionsViewModel, boolean z, String str, AnonymousClass0ZU r5, int i, int i2) {
        super(2);
        this.$viewModel = camDevOptionsViewModel;
        this.$showLoading = z;
        this.$title = str;
        this.$onClick = r5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r9, int i) {
        LayoutKt.CamDevOptionsMenuItem(this.$viewModel, this.$showLoading, this.$title, this.$onClick, r9, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
