package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape2S0000100_I2;

/* renamed from: X.6My  reason: invalid class name and case insensitive filesystem */
public final class C100346My {
    public static final Modifier A00(C147188nY r6, Modifier modifier, boolean z) {
        C04220Ms.A0B(modifier, 0);
        r6.Cvb(-1415121442);
        if (!z) {
            long j = C120537Bh.A00(r6).A0p;
            boolean A0y = C147188nY.A0y(r6, C86134wK.A0I(j));
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r6;
            Object A13 = r4.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = new KtLambdaShape2S0000100_I2(j, 3);
                r4.A14(A13);
            }
            modifier = C115836vz.A00(modifier, AnonymousClass7W3.A0B(r4, A13, false));
        }
        AnonymousClass7W3.A0z(r6, false);
        return modifier;
    }
}
