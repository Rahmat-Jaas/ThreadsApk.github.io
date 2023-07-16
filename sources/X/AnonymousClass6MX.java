package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape1S0412000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0400000_I2;

/* renamed from: X.6MX  reason: invalid class name */
public final class AnonymousClass6MX {
    public static final void A00(C147188nY r32, Modifier modifier, List list, AnonymousClass0ZU r35, AnonymousClass0YY r36, int i, int i2, boolean z) {
        Modifier modifier2 = modifier;
        List list2 = list;
        AnonymousClass0YY r14 = r36;
        boolean A1Z = AnonymousClass0wJ.A1Z(list2, r14);
        AnonymousClass0ZU r13 = r35;
        C04220Ms.A0B(r13, 2);
        C147188nY r0 = r32;
        r0.Cvd(639203183);
        int i3 = i2;
        if ((i2 & 8) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1R = C18240wQ.A1R(i2 & 16, z);
        Object A0o = C147188nY.A0o(r0);
        Object A01 = AnonymousClass7CZ.A01(r0);
        LazyListState A00 = C97946Do.A00(r0, 0, 3);
        boolean A0y = C147188nY.A0y(r0, r13);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
        Object A13 = r2.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7W3.A0G(r2, r13, 4);
        }
        AnonymousClass6DO.A00(r0, AnonymousClass7W3.A09(r2, A13, false), 6, 0, A1Z);
        int i4 = i;
        int i5 = ((i >> 9) & 14) | 384;
        C146288ly A002 = AnonymousClass72M.A00(C147188nY.A0V(r0), r0, AnonymousClass7KV.A00);
        Object A0p = C147188nY.A0p(r0);
        Object A0n = C147188nY.A0n(r0);
        Object A0m = C147188nY.A0m(r0);
        AnonymousClass0ZU r5 = AnonymousClass74X.A00;
        AnonymousClass0YM A003 = C98236Es.A00(modifier2);
        int A012 = C86114wI.A01((i5 << 3) & 112);
        C147188nY.A0w(r0, r2, r5);
        AnonymousClass7W3.A0a(r0, r2, A002, A0p);
        AnonymousClass7KP.A08(r0, A0n, A0m, A003, A012);
        int A05 = C86124wJ.A05(i5);
        r0.Cvb(377517625);
        if ((A05 & 81) != 16 || !r0.BCM()) {
            AnonymousClass70V.A01(r0, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 7, 0);
            C123327Wm r4 = Modifier.A00;
            C147188nY r20 = r0;
            C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, A00, r20, (C142878fk) null, r4, new KtLambdaShape6S0400000_I2(11, A0o, A01, list2, r14), 12582918, 124, false, A1Z);
            if (A1R) {
                float f = (float) 0;
                AnonymousClass6MF.A00(r0, AnonymousClass7K4.A05(r4, f, (float) 16, f, f), C101296Qq.A00(r0), (0 << 3) | 6, 0);
            }
        } else {
            r0.CuJ();
        }
        AnonymousClass7W3.A0v(r2, A1Z);
        C147178nW AKE = r0.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0412000_I2(list2, r14, r13, modifier2, i4, i3, 0, A1R));
        }
    }
}
