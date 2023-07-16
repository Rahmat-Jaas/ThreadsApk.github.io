package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$SectionCard$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0YP $content;
    public final /* synthetic */ Boolean $showSuccessStatus;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SectionCard$2(String str, Boolean bool, AnonymousClass0YP r4, int i, int i2) {
        super(2);
        this.$title = str;
        this.$showSuccessStatus = bool;
        this.$content = r4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r8, int i) {
        LayoutKt.SectionCard(this.$title, this.$showSuccessStatus, this.$content, r8, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
