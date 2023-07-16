package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;

/* renamed from: X.7Bm  reason: invalid class name and case insensitive filesystem */
public final class C120577Bm {
    public static int A00(AnonymousClass7V3 r10, C147188nY r11, Modifier modifier, Object obj, int i) {
        r11.Cvb(i);
        C97846Dc.A00(r11, (Alignment) null, r10.A00(modifier), (C104136bI) null, A02(r11, ((C90245Lb) obj).A04, (AnonymousClass0ZU) null, 6, 0), AnonymousClass74L.A00, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24632, 104);
        return 511388516;
    }

    public static C115286uo A01(C147188nY r6, ImageUrl imageUrl) {
        return A02(r6, imageUrl, (AnonymousClass0ZU) null, 6, 0);
    }

    public static final C115286uo A02(C147188nY r5, ImageUrl imageUrl, AnonymousClass0ZU r7, int i, long j) {
        r5.Cvb(511741769);
        if ((i & 2) != 0) {
            j = C120537Bh.A00(r5).A0Y;
        }
        if ((i & 4) != 0) {
            r7 = null;
        }
        C11630kW A00 = C1189973c.A00(r5);
        C81784oM A01 = C115806vw.A01(r5, C86134wK.A0I(j));
        boolean A0y = C147188nY.A0y(r5, imageUrl);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r5;
        Object A13 = r4.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new AnonymousClass544(A01, A00, imageUrl, r7);
            r4.A14(A13);
        }
        AnonymousClass7W3.A0w(r4, false);
        C115286uo r3 = (C115286uo) A13;
        AnonymousClass7K5.A04(r5, r3, new KtLambdaShape156S0100000_I2_11(r3, 31));
        AnonymousClass7W3.A0w(r4, false);
        return r3;
    }
}
