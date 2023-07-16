package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Cu  reason: invalid class name and case insensitive filesystem */
public final class C120847Cu {
    public static final float A00 = ((float) 6);
    public static final float A01 = ((float) 4);

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, int] */
    public static final void A00(C147188nY r41, Modifier modifier, AnonymousClass8s2 r43, int i) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass8s2 r39 = r43;
        ? A1Z = AnonymousClass0wJ.A1Z(r39, modifier2);
        C147188nY r0 = r41;
        r0.Cvd(2014368606);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r0, r39) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r0, modifier2);
        }
        if ((i2 & 91) != 18 || !r0.BCM()) {
            AnonymousClass534 r7 = AnonymousClass6YT.A00;
            r0.AEA(r7);
            C874352s r6 = AnonymousClass7D5.A02;
            long j = C102736Wi.A00;
            Modifier A002 = AnonymousClass6EW.A00(modifier2, r6, (float) 6, j, AnonymousClass6FG.A00(r0, R.color.igds_bottom_button_shadow), A1Z);
            long j2 = C120537Bh.A00(r0).A07;
            r0.AEA(r7);
            Modifier A012 = C115656vh.A01(A002, r6, j2);
            C146288ly A02 = AnonymousClass7KV.A02(AnonymousClass7J3.A01((float) -20), r0);
            AnonymousClass534 A0b = C147188nY.A0b(r0, -1323940314);
            Object AEA = r0.AEA(A0b);
            AnonymousClass534 r10 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r10);
            AnonymousClass534 r24 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r24);
            AnonymousClass0ZU r23 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A012);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass0YP r22 = AnonymousClass74X.A03;
            AnonymousClass0YP A004 = AnonymousClass7Ak.A00(r0, A02, AEA, r22);
            AnonymousClass0YP r20 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r0, AEA2, r20);
            Integer A05 = AnonymousClass7KP.A05(r0, AEA3, A013, A003);
            r0.Cvb(2058660585);
            r0.Cvb(-1095769478);
            r0.Cvb(-339515945);
            if (C18190wL.A1a(r39)) {
                A01(r0, (ImageUrl) r39.get(0), 0);
            }
            AnonymousClass7W3.A0w(r2, false);
            r0.Cvb(-339515860);
            if (r39.size() > A1Z) {
                A01(r0, (ImageUrl) r39.get(A1Z), 0);
            }
            AnonymousClass7W3.A0w(r2, false);
            r0.Cvb(-339515779);
            if (r39.size() > 2) {
                A01(r0, (ImageUrl) r39.get(2), 0);
            }
            AnonymousClass7W3.A0w(r2, false);
            C123327Wm r62 = Modifier.A00;
            Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass7K4.A04(r62, A00, A01), 28);
            long A005 = AnonymousClass7KB.A00(r0);
            C874352s r18 = AnonymousClass7G5.A00;
            Modifier A014 = C115656vh.A01(A0F, r18, A005);
            r0.Cvb(733328855);
            Alignment alignment = AnonymousClass7KV.A0E;
            C146288ly A006 = C120767Cj.A00(r0, alignment, false);
            Object A0t = C147188nY.A0t(r0, A0b, -1323940314);
            Object AEA4 = r0.AEA(r10);
            Object AEA5 = r0.AEA(r24);
            AnonymousClass0YM A007 = C98236Es.A00(A014);
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A006, r22);
            AnonymousClass7Ak.A02(r0, A0t, A004);
            A007.invoke(AnonymousClass7KP.A03(r0, AEA4, AEA5, r20, A013), r0, A05);
            r0.Cvb(2058660585);
            AnonymousClass7V3 r14 = AnonymousClass7V3.A00;
            r0.Cvb(39916852);
            Modifier A015 = C115656vh.A01(AnonymousClass7K4.A08(r14.A00(r62), 2), r18, AnonymousClass7KB.A02(r0));
            C146288ly A0i = C147188nY.A0i(r0, alignment);
            Object A0s = C147188nY.A0s(r0, A0b);
            Object AEA6 = r0.AEA(r10);
            Object AEA7 = r0.AEA(r24);
            AnonymousClass0YM A008 = C98236Es.A00(A015);
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A0i, r22);
            AnonymousClass7Ak.A02(r0, A0s, A004);
            A008.invoke(AnonymousClass7KP.A03(r0, AEA6, AEA7, r20, A013), r0, A05);
            r0.Cvb(2058660585);
            r0.Cvb(-1366650258);
            C115286uo A009 = AnonymousClass6QP.A00(r0, R.drawable.barcelona_outline_arrow_back_24);
            Modifier A0F2 = AnonymousClass7Kq.A0F(r62, 24);
            C04220Ms.A0B(A0F2, 0);
            C874352s r63 = r18;
            C147188nY r64 = r0;
            C1190173e.A00(r64, C115656vh.A01(AnonymousClass7KV.A01(r14, AnonymousClass7K4.A08(A0F2.Cx6(new GraphicsLayerModifierNodeElement(C102746Wj.A00, 1.0f, 1.0f, 1.0f, 90.0f, AnonymousClass79F.A01, j, j, false)), 4)), r63, AnonymousClass7KB.A02(r0)), A009, (String) null, 56, 0, AnonymousClass7KB.A00(r0));
            AnonymousClass7W3.A0v(r2, A1Z);
            AnonymousClass7W3.A0v(r2, A1Z);
            AnonymousClass7W3.A0v(r2, A1Z);
        } else {
            r0.CuJ();
        }
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r39, modifier2, i3, 30);
        }
    }

    public static final void A01(C147188nY r18, ImageUrl imageUrl, int i) {
        int i2;
        C147188nY r11 = r18;
        r11.Cvd(-1717004169);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r11, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r11.BCM()) {
            C123327Wm r7 = Modifier.A00;
            Modifier A0F = AnonymousClass7Kq.A0F(AnonymousClass7K4.A04(r7, A00, A01), 28);
            long A002 = AnonymousClass7KB.A00(r11);
            C874352s r6 = AnonymousClass7G5.A00;
            Modifier A012 = C115656vh.A01(A0F, r6, A002);
            C146288ly A07 = AnonymousClass7KV.A07(r11, false);
            Object A0p = C147188nY.A0p(r11);
            Object A0n = C147188nY.A0n(r11);
            Object A0m = C147188nY.A0m(r11);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A012);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r11;
            C147188nY.A0w(r11, r4, r1);
            AnonymousClass7W3.A0a(r11, r4, A07, A0p);
            AnonymousClass7KP.A07(r11, A0n, A0m, A003);
            AnonymousClass7V3 r12 = AnonymousClass7V3.A00;
            r11.Cvb(-983021187);
            C97846Dc.A00(r11, (Alignment) null, AnonymousClass7KV.A01(r12, C115826vy.A01(AnonymousClass7Kq.A0F(r7, 24), r6)), (C104136bI) null, C120577Bm.A01(r11, imageUrl2), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            AnonymousClass7W3.A0f(r4);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, imageUrl2, i3, 25);
        }
    }
}
