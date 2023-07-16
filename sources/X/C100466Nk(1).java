package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape30S0201000_I2;

/* renamed from: X.6Nk  reason: invalid class name and case insensitive filesystem */
public final class C100466Nk {
    public static final void A00(C147188nY r50, Modifier modifier, C89905Hm r52, AnonymousClass0ZU r53, AnonymousClass0ZU r54, int i, int i2) {
        Modifier modifier2 = modifier;
        C89905Hm r4 = r52;
        int A02 = C18200wM.A02(0, r4, r53);
        AnonymousClass0ZU r522 = r54;
        C04220Ms.A0B(r522, 3);
        C147188nY r0 = r50;
        r0.Cvd(-1742741653);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        AnonymousClass799 A00 = AnonymousClass799.A00(0);
        boolean A0y = C147188nY.A0y(r0, r522);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
        Object A13 = r1.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7W3.A0K(r1, r522, 32);
        }
        Modifier A022 = AnonymousClass7HZ.A02(modifier2, A00, AnonymousClass7W3.A08(r1, A13, false), 3, false);
        C146288ly A05 = AnonymousClass7KV.A05(r0);
        AnonymousClass534 A0a = C147188nY.A0a(r0);
        Object AEA = r0.AEA(A0a);
        AnonymousClass534 r8 = AnonymousClass7DE.A07;
        Object AEA2 = r0.AEA(r8);
        AnonymousClass534 r7 = AnonymousClass7DE.A0B;
        Object AEA3 = r0.AEA(r7);
        AnonymousClass0ZU r21 = AnonymousClass74X.A00;
        AnonymousClass0YM A002 = C98236Es.A00(A022);
        C147188nY.A0w(r0, r1, r21);
        r1.A0T = false;
        AnonymousClass0YP r15 = AnonymousClass74X.A03;
        AnonymousClass0YP A003 = AnonymousClass7Ak.A00(r0, A05, AEA, r15);
        AnonymousClass0YP r19 = AnonymousClass74X.A02;
        AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r19);
        Integer A052 = AnonymousClass7KP.A05(r0, AEA3, A01, A002);
        r0.Cvb(2058660585);
        r0.Cvb(1035833313);
        ImageUrl imageUrl = r4.A00;
        String str = r4.A05;
        C123327Wm r5 = Modifier.A00;
        AnonymousClass54z r3 = AnonymousClass7Kq.A02;
        int i4 = i;
        C147188nY r24 = r0;
        AnonymousClass6MG.A00(r24, r5.Cx6(r3), AnonymousClass5I4.A04, imageUrl, str, r4.A02, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, AnonymousClass7JR.A00(r0, new KtLambdaShape30S0201000_I2(i4, 9, r53, r4), 826274600), 384, 48, 1760, r4.A0A, false, false, false);
        Modifier Cx6 = r5.Cx6(r3);
        float f = (float) 70;
        float f2 = (float) 0;
        Modifier A053 = AnonymousClass7K4.A05(Cx6, f, f2, f2, f2);
        C146288ly A0e = C147188nY.A0e(AnonymousClass7J3.A01((float) 8), r0, AnonymousClass7KV.A04);
        Object A0s = C147188nY.A0s(r0, A0a);
        Object AEA4 = r0.AEA(r8);
        Object AEA5 = r0.AEA(r7);
        AnonymousClass0YM A004 = C98236Es.A00(A053);
        C147188nY.A0w(r0, r1, r21);
        r1.A0T = false;
        AnonymousClass7Ak.A02(r0, A0e, r15);
        AnonymousClass7Ak.A02(r0, A0s, A003);
        AnonymousClass7Ak.A02(r0, AEA4, r19);
        AnonymousClass7KP.A06(r0, AEA5, A052, A01, A004);
        r0.Cvb(1648879685);
        List list = r4.A06;
        String str2 = r4.A03;
        r0.Cvb(824214838);
        if (list != null) {
            AnonymousClass6MC.A00(r24, AnonymousClass7Kq.A03((Alignment) null, r5, 3), list, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 4);
        }
        AnonymousClass7W3.A0w(r1, false);
        r0.Cvb(487970890);
        if (str2 != null && !AnonymousClass8bQ.A0n(str2)) {
            AnonymousClass7I9.A02(r0, (Modifier) null, AnonymousClass7J9.A02(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 1, A02, 805306368, 6, 510, 0, 0, false);
        }
        AnonymousClass7W3.A0w(r1, false);
        AnonymousClass7W3.A0v(r1, true);
        AnonymousClass70V.A00(r0, AnonymousClass7K4.A05(r5, f, (float) 12, f2, f2));
        AnonymousClass7W3.A0v(r1, true);
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(modifier2, r522, r4, r53, i4, i3, 16));
        }
    }
}
