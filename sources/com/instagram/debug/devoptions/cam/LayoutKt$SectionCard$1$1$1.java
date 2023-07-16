package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147188nY;
import kotlin.Unit;

public final class LayoutKt$SectionCard$1$1$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ Boolean $showSuccessStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$SectionCard$1$1$1(Boolean bool) {
        super(2);
        this.$showSuccessStatus = bool;
    }

    public final void invoke(C147188nY r3, int i) {
        if ((i & 11) != 2 || !r3.BCM()) {
            Boolean bool = this.$showSuccessStatus;
            if (bool != null) {
                LayoutKt.EligibilityIcon(bool.booleanValue(), r3, 0);
                return;
            }
            return;
        }
        r3.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
