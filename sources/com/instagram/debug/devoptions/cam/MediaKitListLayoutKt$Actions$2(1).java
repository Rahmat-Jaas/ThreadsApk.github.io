package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import X.C89865Hh;
import kotlin.Unit;

public final class MediaKitListLayoutKt$Actions$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Delegate $delegate;
    public final /* synthetic */ C89865Hh $mediaKitSummary;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitListLayoutKt$Actions$2(C89865Hh r2, Delegate delegate, int i) {
        super(2);
        this.$mediaKitSummary = r2;
        this.$delegate = delegate;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r4, int i) {
        MediaKitListLayoutKt.Actions(this.$mediaKitSummary, this.$delegate, r4, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
