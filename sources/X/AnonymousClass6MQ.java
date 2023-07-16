package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.jvm.internal.KtLambdaShape0S0322000_I2;

/* renamed from: X.6MQ  reason: invalid class name */
public final class AnonymousClass6MQ {
    public static final void A00(C147188nY r38, Modifier modifier, ImageUrl imageUrl, AnonymousClass0ZU r41, int i, int i2, boolean z, boolean z2) {
        int i3;
        Modifier modifier2 = modifier;
        C04220Ms.A0B(r41, 0);
        C147188nY r0 = r38;
        r0.Cvd(-1695272278);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r0, r41) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        ImageUrl imageUrl2 = imageUrl;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, imageUrl2);
        }
        boolean z3 = z;
        if ((i4 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0N(r0, z3);
        }
        boolean z4 = z2;
        if ((i4 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0O(r0, z4);
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((57344 & i5) == 0) {
            i3 |= C147188nY.A0J(r0, modifier2);
        }
        if ((46811 & i3) != 9362 || !r0.BCM()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 16;
            float f2 = (float) 0;
            Modifier A00 = C117646z1.A00(AnonymousClass6FI.A00(AnonymousClass7K4.A05(AnonymousClass73T.A00(r0, modifier2, AnonymousClass687.End, 2, false), f2, (float) 11.5d, f, (float) 8), C139368Nr.A00, true), AnonymousClass799.A00(0), (String) null, r41, 5, z4);
            C146288ly A0g = C147188nY.A0g(r0, AnonymousClass7KV.A04);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r10 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r10);
            AnonymousClass534 r9 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r9);
            AnonymousClass0ZU r8 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r1, r8);
            r1.A0T = false;
            AnonymousClass0YP r7 = AnonymousClass74X.A03;
            AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r0, A0g, AEA, r7);
            AnonymousClass0YP r6 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r6);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A002);
            r0.Cvb(2058660585);
            C123327Wm A02 = Modifier.A02(r0, 244097222);
            Modifier A04 = AnonymousClass7Kq.A04(A02);
            Alignment alignment = AnonymousClass7KV.A09;
            r0.Cvb(733328855);
            C146288ly A004 = C120767Cj.A00(r0, alignment, false);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r10);
            Object AEA5 = r0.AEA(r9);
            AnonymousClass0YM A005 = C98236Es.A00(A04);
            C147188nY.A0w(r0, r1, r8);
            r1.A0T = false;
            AnonymousClass7Ak.A02(r0, A004, r7);
            AnonymousClass7Ak.A02(r0, A0s, A003);
            A005.invoke(AnonymousClass7KP.A03(r0, AEA4, AEA5, r6, A01), r0, A05);
            r0.Cvb(2058660585);
            r0.Cvb(-1398176256);
            C147188nY r21 = r0;
            C97846Dc.A00(r21, (Alignment) null, AnonymousClass7G5.A02(A02, (float) 18), (C104136bI) null, C120577Bm.A02(r0, imageUrl2, (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            AnonymousClass7W3.A0v(r1, true);
            int i8 = 2131821885;
            if (z) {
                i8 = 2131821884;
            }
            AnonymousClass7I9.A02(r21, (Modifier) null, (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, AnonymousClass7JS.A01(r0, i8), 0, 0, 0, 0, 0, 4090, AnonymousClass7KB.A03(r0), 0, false);
            AnonymousClass7W3.A0v(r1, true);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0322000_I2(imageUrl2, r41, modifier2, i5, i4, 1, z3, z4));
        }
    }
}
