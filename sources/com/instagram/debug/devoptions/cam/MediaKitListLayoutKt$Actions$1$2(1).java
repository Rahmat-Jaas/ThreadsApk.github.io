package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public final class MediaKitListLayoutKt$Actions$1$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ Delegate $delegate;
    public final /* synthetic */ String $id;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitListLayoutKt$Actions$1$2(Delegate delegate, String str) {
        super(0);
        this.$delegate = delegate;
        this.$id = str;
    }

    public final void invoke() {
        this.$delegate.duplicateMediaKit(this.$id);
    }
}
