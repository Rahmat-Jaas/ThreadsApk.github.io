package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YY;
import X.AnonymousClass6aT;
import X.C02220Ah;
import X.C04220Ms;
import X.C114466tL;
import X.C86124wJ;
import kotlin.Unit;

public final class AnimationSpecKt$animateRotation$1 extends C02220Ah implements AnonymousClass0YY {
    public static final AnimationSpecKt$animateRotation$1 INSTANCE = new AnimationSpecKt$animateRotation$1();

    public AnimationSpecKt$animateRotation$1() {
        super(1);
    }

    public final void invoke(C114466tL r4) {
        C04220Ms.A0B(r4, 0);
        r4.A00 = 750;
        Float A0g = C86124wJ.A0g();
        r4.A00(A0g, 0);
        r4.A00(A0g, 250).A00 = AnonymousClass6aT.A01;
        Float valueOf = Float.valueOf(180.0f);
        r4.A00(valueOf, 500);
        r4.A00(valueOf, 750);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C114466tL) obj);
        return Unit.A00;
    }
}
