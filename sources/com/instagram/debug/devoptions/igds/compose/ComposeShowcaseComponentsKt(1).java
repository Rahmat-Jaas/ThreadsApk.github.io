package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass7I9;
import X.AnonymousClass7J9;
import X.AnonymousClass7K4;
import X.AnonymousClass7WO;
import X.C04220Ms;
import X.C114236su;
import X.C115656vh;
import X.C120537Bh;
import X.C121117Ee;
import X.C134817yQ;
import X.C147178nW;
import X.C147188nY;
import androidx.compose.ui.Modifier;

public final class ComposeShowcaseComponentsKt {
    public static final void ShowcaseSectionHeader(String str, C147188nY r21, int i) {
        int i2;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C147188nY r5 = r21;
        r5.Cvd(1255530641);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r5, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r5.BCM()) {
            Modifier A00 = C115656vh.A00(Modifier.A00, C120537Bh.A00(r5).A0L);
            C04220Ms.A0B(A00, 0);
            AnonymousClass7I9.A02(r5, AnonymousClass7K4.A08(Modifier.A04(A00), 8), AnonymousClass7J9.A00(r5), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i2 & 14, 0, 2044, 0, 0, false);
        } else {
            r5.CuJ();
        }
        C147178nW AKE = r5.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new ComposeShowcaseComponentsKt$ShowcaseSectionHeader$1(str2, i3));
        }
    }
}
