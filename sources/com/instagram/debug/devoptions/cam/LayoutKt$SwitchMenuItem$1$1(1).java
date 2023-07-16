package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import kotlin.Unit;

public final class LayoutKt$SwitchMenuItem$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ AnonymousClass0ZU $onSwitch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SwitchMenuItem$1$1(boolean z, AnonymousClass0ZU r3) {
        super(1);
        this.$loading = z;
        this.$onSwitch = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(AnonymousClass0wJ.A1X(obj));
        return Unit.A00;
    }

    public final void invoke(boolean z) {
        if (!this.$loading) {
            this.$onSwitch.invoke();
        }
    }
}
