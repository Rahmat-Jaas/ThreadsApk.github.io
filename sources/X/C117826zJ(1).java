package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;
import kotlin.jvm.internal.KtLambdaShape3S2102000_I2;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.6zJ  reason: invalid class name and case insensitive filesystem */
public final class C117826zJ {
    public static final void A01(C147188nY r39, Modifier modifier, AnonymousClass0ZU r41, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r27 = r41;
        C04220Ms.A0B(r27, 0);
        C147188nY r0 = r39;
        r0.Cvd(596503178);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r0, r27) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r0, modifier2);
        }
        if ((i3 & 91) != 18 || !r0.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            C122847Ub A00 = AnonymousClass7Ad.A00(r0);
            String A002 = AnonymousClass7JS.A00(r0);
            Modifier A03 = AnonymousClass7FI.A03(modifier2);
            C145058jl A0V = C147188nY.A0V(r0);
            C142878fk r14 = AnonymousClass7KV.A02;
            C146288ly A003 = AnonymousClass72M.A00(A0V, r0, r14);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r9 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r9);
            AnonymousClass534 r8 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r8);
            AnonymousClass0ZU r20 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(A03);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r5, r20);
            r5.A0T = false;
            AnonymousClass0YP r19 = AnonymousClass74X.A03;
            AnonymousClass0YP A005 = AnonymousClass7Ak.A00(r0, A003, AEA, r19);
            AnonymousClass0YP r7 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r7);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A01, A004);
            r0.Cvb(2058660585);
            r0.Cvb(-1364839724);
            AnonymousClass698 r26 = AnonymousClass698.Cancel;
            C123327Wm r1 = Modifier.A00;
            AnonymousClass54z r4 = AnonymousClass7Kq.A02;
            AnonymousClass6M2.A00(r0, r1.Cx6(r4), r26, r27, C103516Zm.A00, C103516Zm.A01, ((i3 << 3) & 112) | 28038, 96, false, false);
            AnonymousClass70V.A01(r0, r1.Cx6(r4), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 6, 6, 0);
            float f = (float) 0;
            Modifier A012 = AnonymousClass7Ad.A01(A00, AnonymousClass7K4.A05(modifier2, f, (float) 2, f, f));
            C146288ly A0f = C147188nY.A0f(A0V, r0, r14);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r9);
            Object AEA5 = r0.AEA(r8);
            AnonymousClass0YM A006 = C98236Es.A00(A012);
            C147188nY.A0w(r0, r5, r20);
            r5.A0T = false;
            AnonymousClass7Ak.A02(r0, A0f, r19);
            AnonymousClass7Ak.A02(r0, A0s, A005);
            AnonymousClass7Ak.A02(r0, AEA4, r7);
            AnonymousClass7KP.A06(r0, AEA5, A05, A01, A006);
            r0.Cvb(-1298019810);
            C147188nY r6 = r0;
            A00(r6, r1.Cx6(r4), AnonymousClass7JS.A01(r0, 2131822010), AnonymousClass7JS.A02(r0, A002, 2131822006), 1, 3078);
            A00(r6, r1.Cx6(r4), AnonymousClass7JS.A02(r0, A002, 2131822012), AnonymousClass7JS.A02(r0, A002, 2131822008), 2, 3078);
            A00(r6, r1.Cx6(r4), AnonymousClass7JS.A01(r0, 2131822011), AnonymousClass7JS.A02(r0, A002, 2131822007), 3, 3078);
            A00(r6, r1.Cx6(r4), AnonymousClass7JS.A02(r0, A002, 2131822009), AnonymousClass7JS.A02(r0, A002, 2131822005), 4, 3078);
            C115686vk.A00(r0, r1, (float) 16);
            AnonymousClass7W3.A0v(r5, true);
            AnonymousClass7W3.A0v(r5, true);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r27, i4, 19));
        }
    }

    public static final void A00(C147188nY r60, Modifier modifier, String str, String str2, int i, int i2) {
        int i3;
        C147188nY r0 = r60;
        r0.Cvd(-1369150470);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = C147188nY.A03(r0, i5) | i2;
        } else {
            i3 = i4;
        }
        String str3 = str;
        if ((i2 & 112) == 0) {
            i3 |= C147188nY.A0G(r0, str3);
        }
        String str4 = str2;
        if ((i4 & 896) == 0) {
            i3 |= C147188nY.A0H(r0, str4);
        }
        if ((i4 & 7168) == 0) {
            i3 |= C147188nY.A0I(r0, modifier);
        }
        if ((i3 & 5851) != 1170 || !r0.BCM()) {
            float f = (float) 0;
            Modifier A05 = AnonymousClass7K4.A05(modifier, f, (float) 28, f, f);
            C146288ly A06 = AnonymousClass7KV.A06(r0);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r6 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r6);
            AnonymousClass534 r11 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r11);
            AnonymousClass0ZU r12 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(A05);
            AnonymousClass7W3 r3 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r3, r12);
            r3.A0T = false;
            AnonymousClass0YP r14 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A06, AEA, r14);
            AnonymousClass0YP r19 = AnonymousClass74X.A02;
            AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r19);
            Integer A052 = AnonymousClass7KP.A05(r0, AEA3, A01, A00);
            AnonymousClass7VA A0W = C147188nY.A0W(r0);
            r0.Cvb(-907584674);
            String format = NumberFormat.getInstance(Locale.getDefault()).format(Integer.valueOf(i5));
            C04220Ms.A06(format);
            C123327Wm r4 = Modifier.A00;
            float f2 = (float) 24;
            Modifier A04 = AnonymousClass7K4.A04(r4, f2, f);
            long A03 = AnonymousClass7KB.A03(r0);
            long A032 = AnonymousClass7Hi.A03(17);
            C134817yQ r26 = C134817yQ.A05;
            C147188nY r22 = r0;
            AnonymousClass7I9.A02(r22, A04, AnonymousClass7J9.A03(r0).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(19))), (C114236su) null, r26, C121117Ee.A01(5), format, 0, 0, 0, 199728, 0, 1936, A03, A032, false);
            Modifier A053 = AnonymousClass7K4.A05(A0W.DB5(r4, 1.0f, true), f, f, f2, f);
            C146288ly A054 = AnonymousClass7KV.A05(r0);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA4 = r0.AEA(r6);
            Object AEA5 = r0.AEA(r11);
            AnonymousClass0YM A003 = C98236Es.A00(A053);
            C147188nY.A0w(r0, r3, r12);
            r3.A0T = false;
            AnonymousClass7Ak.A02(r0, A054, r14);
            AnonymousClass7Ak.A02(r0, A0s, A002);
            AnonymousClass7Ak.A02(r0, AEA4, r19);
            AnonymousClass7KP.A06(r0, AEA5, A052, A01, A003);
            r0.Cvb(365463764);
            AnonymousClass54z r5 = AnonymousClass7Kq.A02;
            C147188nY r33 = r0;
            C134817yQ r37 = r26;
            String str5 = str3;
            AnonymousClass7I9.A02(r33, AnonymousClass7K4.A05(r4.Cx6(r5), f, f, f, (float) 6), AnonymousClass7J9.A03(r0).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(19))), (C114236su) null, r37, (C121117Ee) null, str5, 0, 0, 0, ((i3 >> 3) & 14) | 199728, 0, 2004, 0, AnonymousClass7Hi.A03(14), false);
            Modifier Cx6 = r4.Cx6(r5);
            long A033 = AnonymousClass7KB.A03(r0);
            long A034 = AnonymousClass7Hi.A03(14);
            C147188nY r262 = r0;
            AnonymousClass7I9.A02(r262, Cx6, AnonymousClass7J9.A03(r0).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 196607, 0, 0, AnonymousClass7Hi.A03(19))), (C114236su) null, C134817yQ.A04, (C121117Ee) null, str4, 0, 0, 0, ((i3 >> 6) & 14) | 199728, 0, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, A033, A034, false);
            AnonymousClass7W3.A0v(r3, true);
            AnonymousClass7W3.A0v(r3, true);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S2102000_I2(modifier, str3, str4, i5, i4, 1));
        }
    }
}
