package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$SectionCardHeader$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0YP $icon;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SectionCardHeader$2(String str, AnonymousClass0YP r3, int i, int i2) {
        super(2);
        this.$title = str;
        this.$icon = r3;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r5, int i) {
        LayoutKt.SectionCardHeader(this.$title, this.$icon, r5, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
