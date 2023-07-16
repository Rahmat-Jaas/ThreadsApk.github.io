package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C147188nY;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.cam.ComposableSingletons$LayoutKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$LayoutKt$lambda1$1 extends C02220Ah implements AnonymousClass0YP {
    public static final ComposableSingletons$LayoutKt$lambda1$1 INSTANCE = new ComposableSingletons$LayoutKt$lambda1$1();

    public ComposableSingletons$LayoutKt$lambda1$1() {
        super(2);
    }

    public final void invoke(C147188nY r3, int i) {
        if ((i & 11) == 2 && r3.BCM()) {
            r3.CuJ();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
