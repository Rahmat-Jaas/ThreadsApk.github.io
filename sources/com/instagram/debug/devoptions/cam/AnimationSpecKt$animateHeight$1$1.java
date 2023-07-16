package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C04220Ms;
import X.C113506rX;
import X.C114466tL;
import X.C122757Ts;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import kotlin.Unit;

public final class AnimationSpecKt$animateHeight$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int $delay;
    public final /* synthetic */ float $maxHeight;
    public final /* synthetic */ float $minHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationSpecKt$animateHeight$1$1(float f, int i, float f2) {
        super(1);
        this.$minHeight = f;
        this.$delay = i;
        this.$maxHeight = f2;
    }

    public final void invoke(C114466tL r4) {
        C04220Ms.A0B(r4, 0);
        r4.A00 = Rfc3492Idn.damp;
        C113506rX A00 = r4.A00(Float.valueOf(this.$minHeight), this.$delay + 50);
        C122757Ts r0 = AnimationSpecKt.SlowInFastOutEasing;
        C04220Ms.A0B(r0, 1);
        A00.A00 = r0;
        C113506rX A002 = r4.A00(Float.valueOf(this.$maxHeight), this.$delay + 50 + 300);
        C122757Ts r02 = AnimationSpecKt.FastInSlowOutEasing;
        C04220Ms.A0B(r02, 1);
        A002.A00 = r02;
        r4.A00(Float.valueOf(this.$minHeight), this.$delay + 50 + 600);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C114466tL) obj);
        return Unit.A00;
    }
}
