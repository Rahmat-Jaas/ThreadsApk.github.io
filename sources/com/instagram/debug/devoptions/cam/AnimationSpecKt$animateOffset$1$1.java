package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.AnonymousClass6aT;
import X.C02220Ah;
import X.C04220Ms;
import X.C113506rX;
import X.C114466tL;
import X.C142658fN;
import X.C86124wJ;
import kotlin.Unit;

public final class AnimationSpecKt$animateOffset$1$1 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int $directionSign;
    public final /* synthetic */ float $maxOffset;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationSpecKt$animateOffset$1$1(float f, int i) {
        super(1);
        this.$maxOffset = f;
        this.$directionSign = i;
    }

    public final void invoke(C114466tL r6) {
        C04220Ms.A0B(r6, 0);
        r6.A00 = 750;
        Float A0g = C86124wJ.A0g();
        C113506rX A00 = r6.A00(A0g, 0);
        C142658fN r2 = AnonymousClass6aT.A01;
        A00.A00 = r2;
        r6.A00(Float.valueOf(this.$maxOffset * ((float) this.$directionSign)), 250);
        r6.A00(Float.valueOf(this.$maxOffset * ((float) this.$directionSign)), 500).A00 = r2;
        r6.A00(A0g, 750);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C114466tL) obj);
        return Unit.A00;
    }
}
