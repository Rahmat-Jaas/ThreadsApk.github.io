package X;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0100001_I2;

/* renamed from: X.7BT  reason: invalid class name */
public final class AnonymousClass7BT {
    public static final void A00(C147188nY r8, int i) {
        r8.Cvd(1387826154);
        if (i != 0 || !r8.BCM()) {
            C123327Wm A01 = Modifier.A01(r8);
            C146288ly A00 = C120767Cj.A00(r8, AnonymousClass7KV.A0E, false);
            Object A0p = C147188nY.A0p(r8);
            Object A0n = C147188nY.A0n(r8);
            Object A0m = C147188nY.A0m(r8);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A01);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r8;
            C147188nY.A0w(r8, r2, r1);
            AnonymousClass7W3.A0a(r8, r2, A00, A0p);
            AnonymousClass7KP.A07(r8, A0n, A0m, A002);
            AnonymousClass7KV.A08(AnonymousClass7V3.A00, r8, A01, -869683292);
            AnonymousClass7W3.A0f(r2);
        } else {
            r8.CuJ();
        }
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A00(AKE, i, 0);
        }
    }

    public static final void A01(C147188nY r27, Modifier modifier, String str, int i) {
        int i2;
        C147188nY r13 = r27;
        r13.Cvd(1071882367);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r13, str2) | i;
        } else {
            i2 = i3;
        }
        Modifier modifier2 = modifier;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r13, modifier2);
        }
        if ((i2 & 91) != 18 || !r13.BCM()) {
            C123327Wm r10 = Modifier.A00;
            Modifier Cx6 = modifier2.Cx6(C115656vh.A00(AnonymousClass7K4.A08(r10, 2), C120537Bh.A00(r13).A0L));
            C146288ly A07 = AnonymousClass7KV.A07(r13, false);
            Object A0p = C147188nY.A0p(r13);
            Object A0n = C147188nY.A0n(r13);
            Object A0m = C147188nY.A0m(r13);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A00 = C98236Es.A00(Cx6);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r13;
            C147188nY.A0w(r13, r2, r1);
            AnonymousClass7W3.A0a(r13, r2, A07, A0p);
            AnonymousClass7KP.A07(r13, A0n, A0m, A00);
            AnonymousClass7V3 r12 = AnonymousClass7V3.A00;
            r13.Cvb(850878085);
            AnonymousClass7I9.A02(r13, AnonymousClass7KV.A01(r12, r10), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 0, 0, i2 & 14, 0, 4092, 0, 0, false);
            AnonymousClass7W3.A0f(r2);
        } else {
            r13.CuJ();
        }
        C147178nW AKE = r13.AKE();
        if (AKE != null) {
            C147178nW.A06(AKE, modifier2, str2, i3, 0);
        }
    }

    public static final void A02(C147188nY r14, List list, int i) {
        C147188nY r8 = r14;
        r14.Cvd(-1370815356);
        Context A0T = C147188nY.A0T(r14);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r14);
        Object A13 = A0Y.A13();
        if (A13 == AnonymousClass7GN.A00) {
            C09860go.A0D(A0T);
            A13 = Float.valueOf(0.5625f);
            A0Y.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        float A00 = C18240wQ.A00(A13);
        C97956Dp.A00((C142708fS) null, (C145048jk) null, AnonymousClass7J3.A06, (C145068jm) null, new AnonymousClass7VM(), (LazyGridState) null, r8, (Modifier) null, new KtLambdaShape2S0100001_I2(list, A00, 1), 196608, 478, false, false);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, list, i, 16);
        }
    }
}
