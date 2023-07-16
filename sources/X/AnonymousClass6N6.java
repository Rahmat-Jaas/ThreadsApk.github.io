package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6N6  reason: invalid class name */
public final class AnonymousClass6N6 {
    public static final void A00(C147188nY r15, Modifier modifier, AnonymousClass0ZU r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r12 = r17;
        C04220Ms.A0B(r12, 1);
        r15.Cvd(332620245);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r15, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r15, r12);
        }
        if ((i3 & 91) != 18 || !r15.BCM()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            float f = (float) 16;
            float f2 = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(AnonymousClass73T.A00(r15, AnonymousClass7Kq.A08(modifier2, (float) 160), AnonymousClass687.Start, 4, true), C103106Xv.A00.A00, f2, f, f);
            AnonymousClass534 r8 = AnonymousClass6YT.A00;
            r15.AEA(r8);
            C874352s r7 = AnonymousClass7D5.A00;
            Modifier A01 = C115826vy.A01(A05, r7);
            long j = C120537Bh.A00(r15).A0W;
            r15.AEA(r8);
            Modifier A00 = C115656vh.A00(AnonymousClass7Ac.A02(A01, r7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j), AnonymousClass7KB.A01(r15));
            C146288ly A07 = AnonymousClass7KV.A07(r15, false);
            Object A0p = C147188nY.A0p(r15);
            Object A0n = C147188nY.A0n(r15);
            Object A0m = C147188nY.A0m(r15);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A00);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r15;
            C147188nY.A0w(r15, r5, r1);
            AnonymousClass7W3.A0a(r15, r5, A07, A0p);
            AnonymousClass7KP.A07(r15, A0n, A0m, A002);
            AnonymousClass7V3 r72 = AnonymousClass7V3.A00;
            C123327Wm A02 = Modifier.A02(r15, 741133071);
            AnonymousClass6MF.A00(r15, AnonymousClass7KV.A01(r72, A02), C101296Qq.A00(r15), 0, 0);
            float f3 = (float) 12;
            AnonymousClass6M9.A00(r15, AnonymousClass7K4.A05(r72.A86(AnonymousClass7KV.A0D, A02), f2, f3, f3, f2), r12, 0, 0);
            AnonymousClass7W3.A0v(r5, true);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r15.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i6, r12, i4, 18));
        }
    }
}
