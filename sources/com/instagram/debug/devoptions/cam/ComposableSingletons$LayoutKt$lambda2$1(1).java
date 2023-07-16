package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass74X;
import X.AnonymousClass79L;
import X.AnonymousClass7Ac;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7Kq;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C102746Wj;
import X.C146288ly;
import X.C147188nY;
import X.C98236Es;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: com.instagram.debug.devoptions.cam.ComposableSingletons$LayoutKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$LayoutKt$lambda2$1 extends C02220Ah implements AnonymousClass0YP {
    public static final ComposableSingletons$LayoutKt$lambda2$1 INSTANCE = new ComposableSingletons$LayoutKt$lambda2$1();

    public ComposableSingletons$LayoutKt$lambda2$1() {
        super(2);
    }

    public final void invoke(C147188nY r9, int i) {
        if ((i & 11) != 2 || !r9.BCM()) {
            Alignment alignment = AnonymousClass7KV.A09;
            Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass7Ac.A01(new AnonymousClass79L(MediaKitListLayoutKt.getGradientBrush(r9, 0), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), Modifier.A00, C102746Wj.A00), 100);
            C146288ly A0h = C147188nY.A0h(r9, alignment);
            Object A0p = C147188nY.A0p(r9);
            Object A0n = C147188nY.A0n(r9);
            Object A0m = C147188nY.A0m(r9);
            AnonymousClass0ZU r2 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A0F);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r9;
            C147188nY.A0w(r9, r1, r2);
            AnonymousClass7W3.A0a(r9, r1, A0h, A0p);
            AnonymousClass7KP.A07(r9, A0n, A0m, A00);
            r9.Cvb(-45001094);
            LayoutKt.SpikeLoading(r9, 0);
            AnonymousClass7W3.A0f(r1);
            return;
        }
        r9.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
