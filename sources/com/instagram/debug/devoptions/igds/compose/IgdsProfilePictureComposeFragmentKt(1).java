package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass74X;
import X.AnonymousClass7Ad;
import X.AnonymousClass7I9;
import X.AnonymousClass7K4;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C114236su;
import X.C115686vk;
import X.C120537Bh;
import X.C120547Bi;
import X.C121117Ee;
import X.C121657He;
import X.C121807If;
import X.C122847Ub;
import X.C123327Wm;
import X.C134817yQ;
import X.C146288ly;
import X.C147178nW;
import X.C147188nY;
import X.C98236Es;
import android.graphics.drawable.ColorDrawable;
import androidx.compose.ui.Modifier;

public final class IgdsProfilePictureComposeFragmentKt {
    public static final void IgdsProfilePictureExamples(C147188nY r34, int i) {
        C147188nY r11 = r34;
        r11.Cvd(1270779161);
        int i2 = i;
        if (i != 0 || !r11.BCM()) {
            C122847Ub A00 = AnonymousClass7Ad.A00(r11);
            C123327Wm r6 = Modifier.A00;
            Modifier A01 = AnonymousClass7Ad.A01(A00, AnonymousClass7K4.A07(Modifier.A04(r6), 0));
            C146288ly A05 = AnonymousClass7KV.A05(r11);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r2, r1);
            AnonymousClass7W3.A0a(r11, r2, A05, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A002);
            r11.Cvb(-690563741);
            AnonymousClass7I9.A02(r11, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "Profile picture no spinner", 0, 0, 0, 6, 0, 4094, 0, 0, false);
            ColorDrawable colorDrawable = new ColorDrawable(C121657He.A01(C120537Bh.A00(r11).A0F));
            float f = (float) 56;
            float f2 = (float) 50;
            C120547Bi.A00(colorDrawable, r11, (Modifier) null, (AnonymousClass0YY) null, f, f2, 221624, 72, false, false);
            C115686vk.A00(r11, r6, (float) 12);
            AnonymousClass7I9.A02(r11, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "Profile picture with spinner", 0, 0, 0, 6, 0, 4094, 0, 0, false);
            C120547Bi.A00(colorDrawable, r11, (Modifier) null, (AnonymousClass0YY) null, f, f2, 221624, 72, true, false);
            AnonymousClass7W3.A0v(r2, true);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new IgdsProfilePictureComposeFragmentKt$IgdsProfilePictureExamples$2(i2));
        }
    }
}
