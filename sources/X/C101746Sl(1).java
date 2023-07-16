package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;

/* renamed from: X.6Sl  reason: invalid class name and case insensitive filesystem */
public final class C101746Sl {
    public static final void A00(C147188nY r38, Modifier modifier, ImageUrl imageUrl, AnonymousClass0ZU r41, int i) {
        int i2;
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r36 = r41;
        boolean A1Z = AnonymousClass0wJ.A1Z(r36, modifier2);
        C147188nY r0 = r38;
        r0.Cvd(-1385326851);
        int i4 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A09(r0, r36) | i;
        } else {
            i2 = i4;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r0, modifier2);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i4 & 896) == 0) {
            i2 |= C147188nY.A0H(r0, imageUrl2);
        }
        if ((i2 & 731) != 146 || !r0.BCM()) {
            int i5 = (i2 >> 3) & 14;
            C146288ly A05 = AnonymousClass7KV.A05(r0);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r9 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r9);
            AnonymousClass534 r8 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r8);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i5 << 3) & 112);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r7);
            r2.A0T = false;
            AnonymousClass0YP r6 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A05, AEA, r6);
            AnonymousClass0YP r5 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r0, AEA2, r5);
            C147188nY.A0x(r0, AnonymousClass7KP.A04(r0, AEA3, A012), A00, (A01 >> 3) & 112);
            int A052 = C86124wJ.A05(i5);
            r0.Cvb(-1894142989);
            if ((A052 & 81) != 16 || !r0.BCM()) {
                C147188nY r21 = r0;
                Modifier A003 = AnonymousClass70U.A00(r21, AnonymousClass7Kq.A0F(modifier2, 86), (AnonymousClass799) null, r36, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 255, false);
                if (imageUrl != null) {
                    r0.Cvb(-1946392589);
                    C115286uo A02 = C120577Bm.A02(r0, imageUrl2, (AnonymousClass0ZU) null, 6, 0);
                    Modifier A013 = C115826vy.A01(A003, AnonymousClass7G5.A00);
                    i3 = 2131823206;
                    C147188nY r26 = r0;
                    C97846Dc.A00(r26, (Alignment) null, A013, (C104136bI) null, A02, AnonymousClass74L.A00, AnonymousClass7JS.A01(r0, 2131823206), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24584, 104);
                } else {
                    Modifier A014 = C115656vh.A01(A003, AnonymousClass7G5.A00, C120537Bh.A01(r0, -1946392318).A08);
                    C146288ly A0h = C147188nY.A0h(r0, AnonymousClass7KV.A09);
                    Object A0s = C147188nY.A0s(r0, A0a);
                    Object AEA4 = r0.AEA(r9);
                    Object AEA5 = r0.AEA(r8);
                    AnonymousClass0YM A004 = C98236Es.A00(A014);
                    C147188nY.A0w(r0, r2, r7);
                    r2.A0T = false;
                    AnonymousClass7Ak.A02(r0, A0h, r6);
                    AnonymousClass7Ak.A02(r0, A0s, A002);
                    C147188nY.A0x(r0, AnonymousClass7KP.A03(r0, AEA4, AEA5, r5, A012), A004, 0);
                    r0.Cvb(-806072035);
                    i3 = 2131823206;
                    C1190173e.A00(r21, (Modifier) null, AnonymousClass6QP.A00(r0, R.drawable.instagram_add_pano_outline_24), AnonymousClass7JS.A01(r0, 2131823206), 8, 4, AnonymousClass7KB.A04(r0));
                    AnonymousClass7W3.A0v(r2, A1Z);
                }
                AnonymousClass7W3.A0w(r2, false);
                AnonymousClass70P.A00((C147258p3) null, r21, AnonymousClass7K4.A04(Modifier.A00, (float) 0, (float) 8), (C968666z) null, AnonymousClass5MT.A00(r0), AnonymousClass7JS.A01(r0, i3), r36, (i2 & 14) | 384, 216, false, false);
            } else {
                r0.CuJ();
            }
            AnonymousClass7W3.A0v(r2, A1Z);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i4, 31, modifier2, r36, imageUrl2));
        }
    }
}
