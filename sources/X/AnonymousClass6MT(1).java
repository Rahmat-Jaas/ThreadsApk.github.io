package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6MT  reason: invalid class name */
public final class AnonymousClass6MT {
    public static final void A00(C147188nY r27, Modifier modifier, AnonymousClass0ZU r29, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r7 = r29;
        C04220Ms.A0B(r7, 0);
        C147188nY r8 = r27;
        r8.Cvd(-600985812);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r8, r7) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r8, modifier2);
        }
        if ((i3 & 91) != 18 || !r8.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            int i7 = (i3 >> 3) & 14;
            C146288ly A06 = AnonymousClass7KV.A06(r8);
            AnonymousClass534 A0a = C147188nY.A0a(r8);
            Object AEA = r8.AEA(A0a);
            AnonymousClass534 r10 = AnonymousClass7DE.A07;
            Object AEA2 = r8.AEA(r10);
            AnonymousClass534 r9 = AnonymousClass7DE.A0B;
            Object AEA3 = r8.AEA(r9);
            AnonymousClass0ZU r6 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i7 << 3) & 112);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r5, r6);
            r5.A0T = false;
            AnonymousClass0YP r4 = AnonymousClass74X.A03;
            AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r8, A06, AEA, r4);
            AnonymousClass0YP r3 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r8, AEA2, r3);
            int A003 = AnonymousClass7KP.A00(r8, AEA3, A012, A00, A01);
            r8.Cvb(-1566316912);
            if (((((i7 >> 6) & 112) | 6) & 81) != 16 || !r8.BCM()) {
                Modifier A0F = AnonymousClass7Kq.A0F(Modifier.A00, 40);
                AnonymousClass799 A004 = AnonymousClass799.A00(0);
                boolean A0y = C147188nY.A0y(r8, r7);
                Object A13 = r5.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0G(r5, r7, 0);
                }
                Modifier A013 = C117646z1.A01(A0F, A004, AnonymousClass7W3.A08(r5, A13, false));
                C146288ly A0h = C147188nY.A0h(r8, AnonymousClass7KV.A09);
                Object A0s = C147188nY.A0s(r8, A0a);
                Object AEA4 = r8.AEA(r10);
                Object AEA5 = r8.AEA(r9);
                AnonymousClass0YM A005 = C98236Es.A00(A013);
                C147188nY.A0w(r8, r5, r6);
                r5.A0T = false;
                AnonymousClass7Ak.A02(r8, A0h, r4);
                AnonymousClass7Ak.A02(r8, A0s, A002);
                C86104wH.A1R(AnonymousClass7KP.A03(r8, AEA4, AEA5, r3, A012), r8, A005, 0);
                r8.Cvb(A003);
                r8.Cvb(-719899754);
                C1190173e.A00(r8, (Modifier) null, AnonymousClass6QP.A00(r8, R.drawable.barcelona_paperclip_outline_24), AnonymousClass7JS.A01(r8, 2131821890), 8, 4, C120537Bh.A00(r8).A0l);
                AnonymousClass7W3.A0f(r5);
            } else {
                r8.CuJ();
            }
            AnonymousClass7W3.A0f(r5);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0202000_I2(modifier2, i5, r7, i4, 15));
        }
    }
}
