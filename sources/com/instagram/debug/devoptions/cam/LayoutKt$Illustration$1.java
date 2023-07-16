package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class LayoutKt$Illustration$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ int $resId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$Illustration$1(int i, Modifier modifier, int i2, int i3) {
        super(2);
        this.$resId = i;
        this.$modifier = modifier;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(C147188nY r5, int i) {
        LayoutKt.Illustration(this.$resId, this.$modifier, r5, C115796vv.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
