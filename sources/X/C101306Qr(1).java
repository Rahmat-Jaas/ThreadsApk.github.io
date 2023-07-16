package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.6Qr  reason: invalid class name and case insensitive filesystem */
public final class C101306Qr {
    public static final void A00(int i, Modifier modifier, C147188nY r27, int i2, int i3) {
        int i4;
        String A01;
        Modifier modifier2 = modifier;
        C147188nY r12 = r27;
        r12.Cvd(-2003772229);
        int i5 = i3;
        int i6 = i3 & 1;
        int i7 = i2;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = C147188nY.A0F(r12, modifier2) | i2;
        } else {
            i4 = i7;
        }
        int i8 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= C147188nY.A04(r12, i8);
        }
        if ((i4 & 91) != 18 || !r12.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            C115286uo A00 = AnonymousClass6QP.A00(r12, R.drawable.list_badge_small);
            Alignment alignment = AnonymousClass7KV.A09;
            C123327Wm A012 = Modifier.A01(r12);
            C146288ly A002 = C120767Cj.A00(r12, alignment, false);
            Object A0p = C147188nY.A0p(r12);
            Object A0n = C147188nY.A0n(r12);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r7 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A012);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r0, r7);
            AnonymousClass7W3.A0a(r12, r0, A002, A0p);
            AnonymousClass7KP.A07(r12, A0n, A0m, A003);
            r12.Cvb(-1532956043);
            C97846Dc.A00(r12, (Alignment) null, AnonymousClass7Kq.A0F(modifier2, 20), (C104136bI) null, A00, (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
            r12.Cvb(-629868449);
            if (i8 < 10) {
                A01 = String.valueOf(i8);
            } else {
                A01 = AnonymousClass7JS.A01(r12, 2131835999);
            }
            AnonymousClass7W3.A0w(r0, false);
            AnonymousClass7I9.A02(r12, (Modifier) null, AnonymousClass7J9.A02(r12), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A01, 0, 0, 0, 0, 0, 2042, C120537Bh.A00(r12).A0w, 0, false);
            AnonymousClass7W3.A0f(r0);
        } else {
            r12.CuJ();
        }
        C147178nW AKE = r12.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8R6(i8, modifier2, i7, i5));
        }
    }
}
