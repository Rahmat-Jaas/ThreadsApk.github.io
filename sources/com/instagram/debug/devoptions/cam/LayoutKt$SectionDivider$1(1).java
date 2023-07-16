package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$SectionDivider$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $noPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SectionDivider$1(boolean z, int i, int i2) {
        super(2);
        this.$noPadding = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(C147188nY r4, int i) {
        LayoutKt.SectionDivider(this.$noPadding, r4, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
