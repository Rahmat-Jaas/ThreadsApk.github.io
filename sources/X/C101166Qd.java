package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape1S1102000_I2;

/* renamed from: X.6Qd  reason: invalid class name and case insensitive filesystem */
public final class C101166Qd {
    public static final void A00(C147188nY r36, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        C04220Ms.A0B(str2, 0);
        C147188nY r7 = r36;
        r7.Cvd(-1499458369);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r7, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r7, modifier2);
        }
        if ((i3 & 91) != 18 || !r7.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            Modifier A05 = AnonymousClass7K4.A05(modifier2, AnonymousClass6FH.A00(r7, R.dimen.abc_floating_window_z), AnonymousClass6FH.A00(r7, R.dimen.abc_button_padding_horizontal_material), AnonymousClass6FH.A00(r7, R.dimen.abc_floating_window_z), AnonymousClass6FH.A00(r7, R.dimen.abc_floating_window_z));
            C121807If A01 = AnonymousClass7J9.A01(r7);
            AnonymousClass7I9.A02(r7, A05, C121807If.A00(A01, (C1188372l) null, (C134817yQ) null, A01.A00.A05, (C114316t2) null, (C121117Ee) null, 2097150, AnonymousClass7KB.A03(r7), 0, 0, 0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i3 & 14, 0, 2044, 0, 0, false);
        } else {
            r7.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S1102000_I2(modifier2, str2, i5, i4, 3));
        }
    }
}
