package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0202000_I2;

/* renamed from: X.6Lu  reason: invalid class name and case insensitive filesystem */
public final class C100056Lu {
    public static final void A00(List list, Modifier modifier, C147188nY r28, int i, int i2) {
        C147178nW AKE;
        int i3;
        Modifier modifier2 = modifier;
        List list2 = list;
        C04220Ms.A0B(list2, 0);
        C147188nY r12 = r28;
        r12.Cvd(-1247642950);
        int i4 = i2;
        if ((i2 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        int i5 = i;
        if (list2.size() != 4) {
            AKE = r12.AKE();
            if (AKE != null) {
                i3 = 6;
            } else {
                return;
            }
        } else {
            int i6 = ((i >> 3) & 14) | 48;
            C146288ly A0h = C147188nY.A0h(r12, AnonymousClass7KV.A0E);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(modifier2);
            int A01 = C86114wI.A01((i6 << 3) & 112);
            AnonymousClass7W3 r11 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r11, r1);
            AnonymousClass7W3.A0a(r12, r11, A0h, A0p);
            C147188nY.A0x(r12, AnonymousClass7KP.A01(r12, A0n, A0m), A00, (A01 >> 3) & 112);
            int A05 = C86124wJ.A05(i6);
            r12.Cvb(235145716);
            if ((A05 & 81) != 16 || !r12.BCM()) {
                C147188nY r25 = r12;
                C115286uo A02 = C120577Bm.A02(r25, (ImageUrl) list2.get(0), (AnonymousClass0ZU) null, 6, 0);
                C123327Wm r13 = Modifier.A00;
                float f = (float) 19;
                float f2 = (float) 16;
                Modifier A002 = C97906Dk.A00(AnonymousClass7Kq.A09(r13, f), f2, (float) -2);
                C874352s r0 = AnonymousClass7G5.A00;
                C97846Dc.A00(r12, (Alignment) null, C115826vy.A01(A002, r0), (C104136bI) null, A02, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                C97846Dc.A00(r12, (Alignment) null, C115826vy.A01(C97906Dk.A00(AnonymousClass7Kq.A0F(r13, 11), (float) 0, (float) 2), r0), (C104136bI) null, C120577Bm.A02(r25, (ImageUrl) list2.get(1), (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                C97846Dc.A00(r12, (Alignment) null, C115826vy.A01(C97906Dk.A00(AnonymousClass7Kq.A09(r13, f2), (float) 1, f), r0), (C104136bI) null, C120577Bm.A02(r25, (ImageUrl) list2.get(2), (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
                C97846Dc.A00(r12, (Alignment) null, C115826vy.A01(C97906Dk.A00(AnonymousClass7Kq.A0F(r13, 10), (float) 22, (float) 23), r0), (C104136bI) null, C120577Bm.A02(r25, (ImageUrl) list2.get(3), (AnonymousClass0ZU) null, 6, 0), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            } else {
                r12.CuJ();
            }
            AnonymousClass7W3.A0f(r11);
            AKE = r12.AKE();
            if (AKE != null) {
                i3 = 7;
            } else {
                return;
            }
        }
        AnonymousClass7WO.A00(AKE, new KtLambdaShape2S0202000_I2(list2, i5, modifier2, i4, i3));
    }
}
