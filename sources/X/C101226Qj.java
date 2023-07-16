package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.6Qj  reason: invalid class name and case insensitive filesystem */
public final class C101226Qj {
    public static final void A00(Modifier modifier, C147188nY r14, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r7 = r14;
        r14.Cvd(2133264874);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r14, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !r14.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            C115286uo A00 = AnonymousClass6QP.A00(r14, R.drawable.instagram_verified_pano_filled_24);
            C97846Dc.A00(r7, (Alignment) null, AnonymousClass7Kq.A0F(modifier2, 14), C115866w2.A01(C121657He.A04(C86154wM.A0G(C120537Bh.A00(r14).A0D), AnonymousClass7KE.A03(C120537Bh.A00(r14).A0D), AnonymousClass7KE.A02(C120537Bh.A00(r14).A0D), AnonymousClass7KE.A01(C120537Bh.A00(r14).A0D), C18240wQ.A00(r14.AEA(AnonymousClass6YR.A00)))), A00, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 56);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            C147178nW.A03(AKE, modifier2, i4, i6, 10);
        }
    }
}
