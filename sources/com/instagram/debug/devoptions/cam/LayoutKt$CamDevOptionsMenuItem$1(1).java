package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public final class LayoutKt$CamDevOptionsMenuItem$1 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ AnonymousClass0ZU $onClick;
    public final /* synthetic */ boolean $showLoading;
    public final /* synthetic */ CamDevOptionsViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$CamDevOptionsMenuItem$1(boolean z, CamDevOptionsViewModel camDevOptionsViewModel, AnonymousClass0ZU r4) {
        super(0);
        this.$showLoading = z;
        this.$viewModel = camDevOptionsViewModel;
        this.$onClick = r4;
    }

    public final void invoke() {
        if (this.$showLoading) {
            this.$viewModel.showLoading();
        }
        this.$onClick.invoke();
    }
}
