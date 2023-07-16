package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C115796vv;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$SwitchMenuItem$2 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ AnonymousClass0ZU $onSwitch;
    public final /* synthetic */ boolean $switchState;
    public final /* synthetic */ String $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SwitchMenuItem$2(String str, boolean z, boolean z2, AnonymousClass0ZU r5, int i) {
        super(2);
        this.$title = str;
        this.$loading = z;
        this.$switchState = z2;
        this.$onSwitch = r5;
        this.$$changed = i;
    }

    public final void invoke(C147188nY r8, int i) {
        LayoutKt.SwitchMenuItem(this.$title, this.$loading, this.$switchState, this.$onSwitch, r8, C115796vv.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
