package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.70W  reason: invalid class name */
public final class AnonymousClass70W {
    public static final void A01(C147188nY r33, List list, int i) {
        C04220Ms.A0B(list, 0);
        C147188nY r11 = r33;
        r11.Cvd(2070366453);
        if (list.size() == 2) {
            long A00 = AnonymousClass6FG.A00(r11, R.color.igds_elevated_background);
            C123327Wm r9 = Modifier.A00;
            Modifier A08 = AnonymousClass7K4.A08(C115656vh.A00(r9, A00), 1);
            Alignment A002 = AnonymousClass7KV.A00(r11);
            C146288ly A003 = C120767Cj.A00(r11, A002, false);
            AnonymousClass534 A0a = C147188nY.A0a(r11);
            Object AEA = r11.AEA(A0a);
            AnonymousClass534 r12 = AnonymousClass7DE.A07;
            Object AEA2 = r11.AEA(r12);
            AnonymousClass534 r8 = AnonymousClass7DE.A0B;
            Object AEA3 = r11.AEA(r8);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(A08);
            AnonymousClass7W3 r6 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r6, r7);
            r6.A0T = false;
            AnonymousClass0YP r5 = AnonymousClass74X.A03;
            AnonymousClass0YP A005 = AnonymousClass7Ak.A00(r11, A003, AEA, r5);
            AnonymousClass0YP r4 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r11, AEA2, r4);
            Integer A05 = AnonymousClass7KP.A05(r11, AEA3, A01, A004);
            r11.Cvb(2058660585);
            AnonymousClass7V3 r2 = AnonymousClass7V3.A00;
            r11.Cvb(-1241591685);
            Modifier A006 = AnonymousClass6EU.A00(r9, 1.0f);
            C146288ly A0h = C147188nY.A0h(r11, A002);
            Object A0s = C147188nY.A0s(r11, A0a);
            Object AEA4 = r11.AEA(r12);
            Object AEA5 = r11.AEA(r8);
            AnonymousClass0YM A007 = C98236Es.A00(A006);
            C147188nY.A0w(r11, r6, r7);
            r6.A0T = false;
            AnonymousClass7Ak.A02(r11, A0h, r5);
            AnonymousClass7Ak.A02(r11, A0s, A005);
            AnonymousClass7Ak.A02(r11, AEA4, r4);
            AnonymousClass7KP.A06(r11, AEA5, A05, A01, A007);
            r11.Cvb(-395174527);
            A00(r11, AnonymousClass7KV.A01(r2, r9), (C101256Qm) AnonymousClass00J.A0C(list), 0, 0);
            C147188nY r24 = r11;
            C97846Dc.A00(r24, (Alignment) null, r2.A86(AnonymousClass7KV.A0B, AnonymousClass7G5.A02(r9, (float) 104)), (C104136bI) null, new AnonymousClass541(A00), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            boolean A11 = AnonymousClass7W3.A11(r6);
            float f = (float) 0;
            Modifier A86 = r2.A86(AnonymousClass7KV.A0A, AnonymousClass7K4.A05(r9, (float) 90, f, f, f));
            C146288ly A0i = C147188nY.A0i(r11, A002);
            Object A0s2 = C147188nY.A0s(r11, A0a);
            Object AEA6 = r11.AEA(r12);
            Object AEA7 = r11.AEA(r8);
            AnonymousClass0YM A008 = C98236Es.A00(A86);
            C147188nY.A0w(r11, r6, r7);
            r6.A0T = false;
            AnonymousClass7Ak.A02(r11, A0i, r5);
            AnonymousClass7Ak.A02(r11, A0s2, A005);
            AnonymousClass7Ak.A02(r11, AEA6, r4);
            AnonymousClass7KP.A06(r11, AEA7, A05, A01, A008);
            r11.Cvb(1781943480);
            A00(r11, (Modifier) null, (C101256Qm) AnonymousClass00J.A0E(list), 0, 2);
            AnonymousClass7W3.A0v(r6, A11);
            AnonymousClass7W3.A0v(r6, A11);
            C147178nW AKE = r11.AKE();
            if (AKE != null) {
                C147178nW.A01(AKE, list, i, 3);
                return;
            }
            return;
        }
        throw C18180wK.A0a("Facepile currently only supports 2 faces");
    }

    public static final void A00(C147188nY r16, Modifier modifier, C101256Qm r18, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C147188nY r3 = r16;
        r3.Cvd(-772165944);
        int i4 = i2;
        C101256Qm r13 = r18;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r3, r13) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r3, modifier2);
        }
        if ((i3 & 91) != 18 || !r3.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            AnonymousClass79L A00 = AnonymousClass79L.A00((float) 1, AnonymousClass6FG.A00(r3, R.color.igds_photo_border));
            if (r13 instanceof C955661f) {
                C115286uo r7 = ((C955661f) r13).A00;
                Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass6EU.A00(modifier2, 2.0f), 96);
                C874352s r1 = AnonymousClass7G5.A00;
                C97846Dc.A00(r3, (Alignment) null, AnonymousClass7Ac.A01(A00, C115826vy.A01(A0F, r1), r1), (C104136bI) null, r7, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            }
        } else {
            r3.CuJ();
        }
        C147178nW AKE = r3.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(r13, i5, modifier2, i4, 26));
        }
    }
}
