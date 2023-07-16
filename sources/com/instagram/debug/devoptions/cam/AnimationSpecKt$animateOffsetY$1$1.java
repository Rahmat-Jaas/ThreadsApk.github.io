package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C113506rX;
import X.C114466tL;
import X.C122757Ts;
import X.C86124wJ;
import kotlin.Unit;

public final class AnimationSpecKt$animateOffsetY$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int $delay;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationSpecKt$animateOffsetY$1$1(int i) {
        super(1);
        this.$delay = i;
    }

    public final void invoke(C114466tL r6) {
        C04220Ms.A0B(r6, 0);
        r6.A00 = 1400;
        Float A0g = C86124wJ.A0g();
        C113506rX A00 = r6.A00(A0g, this.$delay + 50);
        C122757Ts r0 = AnimationSpecKt.SlowInFastOutEasing;
        C04220Ms.A0B(r0, 1);
        A00.A00 = r0;
        Float valueOf = Float.valueOf(25.0f);
        C113506rX A002 = r6.A00(valueOf, this.$delay + 50 + 300);
        C122757Ts r02 = AnimationSpecKt.FastInSlowOutEasing;
        C04220Ms.A0B(r02, 1);
        A002.A00 = r02;
        Float valueOf2 = Float.valueOf(50.0f);
        r6.A00(valueOf2, this.$delay + 50 + 600);
        C113506rX A003 = r6.A00(valueOf2, this.$delay + 150 + 600);
        C122757Ts r03 = AnimationSpecKt.SlowInFastOutEasing;
        C04220Ms.A0B(r03, 1);
        A003.A00 = r03;
        C113506rX A004 = r6.A00(valueOf, this.$delay + 150 + 900);
        C122757Ts r04 = AnimationSpecKt.FastInSlowOutEasing;
        C04220Ms.A0B(r04, 1);
        A004.A00 = r04;
        r6.A00(A0g, this.$delay + 150 + 1200);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C114466tL) obj);
        return Unit.A00;
    }
}
