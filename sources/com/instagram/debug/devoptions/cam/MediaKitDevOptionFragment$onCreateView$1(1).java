package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass74X;
import X.AnonymousClass7Aj;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C120767Cj;
import X.C123327Wm;
import X.C146288ly;
import X.C147188nY;
import X.C27952Ew2;
import X.C81784oM;
import X.C86164wN;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public final class MediaKitDevOptionFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ MediaKitDevOptionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionFragment$onCreateView$1(MediaKitDevOptionFragment mediaKitDevOptionFragment) {
        super(2);
        this.this$0 = mediaKitDevOptionFragment;
    }

    public final void invoke(C147188nY r11, int i) {
        Unit unit;
        if ((i & 11) != 2 || !r11.BCM()) {
            MediaKitDevOptionFragment mediaKitDevOptionFragment = this.this$0;
            C123327Wm A01 = Modifier.A01(r11);
            boolean z = false;
            C146288ly A00 = C120767Cj.A00(r11, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r3, r1);
            AnonymousClass7W3.A0a(r11, r3, A00, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A002);
            r11.Cvb(-418666458);
            C81784oM A003 = AnonymousClass7Aj.A00(r11, (Object) null, (C27952Ew2) null, mediaKitDevOptionFragment.getMediaKitDevOptionViewModel().mediaKitJsonFlow, 2);
            Object value = A003.getValue();
            r11.Cvb(610970036);
            if (value == null) {
                unit = null;
            } else {
                mediaKitDevOptionFragment.mediaKitJsonValue.CrC(value);
                MediaKitInfoViewKt.MediaKitInfoView(mediaKitDevOptionFragment.mediaKitJsonValue, mediaKitDevOptionFragment.getMediaKitDevOptionViewModel(), r11, 64);
                unit = Unit.A00;
            }
            AnonymousClass7W3.A0w(r3, false);
            if (unit == null) {
                MediaKitListLayoutKt.MediaKitListLayout(mediaKitDevOptionFragment.getMediaKitDevOptionViewModel(), mediaKitDevOptionFragment.delegate, r11, 8);
            }
            if (A003.getValue() == null) {
                z = true;
            }
            mediaKitDevOptionFragment.updateActionBar(z);
            AnonymousClass7W3.A0f(r3);
            return;
        }
        r11.CuJ();
    }

    public static final String invoke$lambda$2$lambda$0(C81784oM r0) {
        return C86164wN.A0e(r0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
