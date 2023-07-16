package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0wJ;
import X.AnonymousClass7Aj;
import X.AnonymousClass7GN;
import X.AnonymousClass7K4;
import X.AnonymousClass7KE;
import X.AnonymousClass7W3;
import X.AnonymousClass7WO;
import X.C04220Ms;
import X.C115656vh;
import X.C121737Hu;
import X.C142488ew;
import X.C147178nW;
import X.C147188nY;
import X.C147258p3;
import X.C147368pE;
import X.C18250wR;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import org.json.JSONArray;

public final class MediaKitInfoViewKt {
    public static final void MediaKitInfoView(C147368pE r14, MediaKitDevOptionViewModel mediaKitDevOptionViewModel, C147188nY r16, int i) {
        AnonymousClass7W3 r2;
        MediaKitDevOptionViewModel mediaKitDevOptionViewModel2 = mediaKitDevOptionViewModel;
        C147368pE r4 = r14;
        boolean A1Y = AnonymousClass0wJ.A1Y(r14, mediaKitDevOptionViewModel);
        C147188nY r6 = r16;
        r6.Cvd(-835283353);
        if (C86104wH.A1X(AnonymousClass7Aj.A01(r6, mediaKitDevOptionViewModel.loadingInfoState))) {
            r6.Cvb(1222889476);
            LayoutKt.LoadingLayout(r6, A1Y);
            r2 = (AnonymousClass7W3) r6;
        } else {
            r6.Cvb(1222889507);
            String str = (String) r14.getValue();
            float f = A1Y ? 1.0f : 0.0f;
            Modifier A00 = C115656vh.A00(AnonymousClass7K4.A05(Modifier.A05(Modifier.A00), f, f, f, (float) 150), AnonymousClass7KE.A05);
            boolean A0y = C147188nY.A0y(r6, r14);
            r2 = (AnonymousClass7W3) r6;
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new MediaKitInfoViewKt$MediaKitInfoView$1$1(r14);
                r2.A14(A13);
            }
            C121737Hu.A00((C147258p3) null, r6, A00, (C142488ew) null, str, "Request Json", AnonymousClass7W3.A0B(r2, A13, A1Y), A1Y, A1Y ? 1 : 0, 384, 496, A1Y);
        }
        AnonymousClass7W3.A0w(r2, A1Y);
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new MediaKitInfoViewKt$MediaKitInfoView$2(r4, mediaKitDevOptionViewModel2, i));
        }
    }

    public static final String formatJson(String str) {
        C04220Ms.A0B(str, 0);
        String jSONObject = C18250wR.A0j(str).toString(2);
        C04220Ms.A06(jSONObject);
        return jSONObject;
    }

    public static final String formatJsonArray(String str) {
        C04220Ms.A0B(str, 0);
        String jSONArray = new JSONArray(str).toString(2);
        C04220Ms.A06(jSONArray);
        return jSONArray;
    }
}
