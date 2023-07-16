package X;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0101001_I2;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;

/* renamed from: X.6ML  reason: invalid class name */
public final class AnonymousClass6ML {
    public static final void A00(C147188nY r24, Modifier modifier, AnonymousClass0ZU r26, AnonymousClass0ZU r27, AnonymousClass0YP r28, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass0ZU r12 = r26;
        AnonymousClass0ZU r11 = r27;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        AnonymousClass0YP r9 = r28;
        C04220Ms.A0B(r9, 3);
        C147188nY r2 = r24;
        r2.Cvd(-821094599);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A09(r2, r12) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0A(r2, r11);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0H(r2, modifier2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= C147188nY.A0C(r2, r9);
        }
        if ((i3 & 5851) != 1170 || !r2.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            C81784oM A01 = C115806vw.A01(r2, r12);
            C81784oM A012 = C115806vw.A01(r2, r11);
            C147168nV A0j = C147188nY.A0j(r2);
            boolean A0z = C147188nY.A0z(r2, A0j, 1157296644);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r2;
            Object A13 = r5.A13();
            if (A0z || A13 == AnonymousClass7GN.A00) {
                A13 = new ToastDragDismissState(A01, A012, A0j);
                r5.A14(A13);
            }
            AnonymousClass7W3.A0w(r5, false);
            ToastDragDismissState toastDragDismissState = (ToastDragDismissState) A13;
            r2.AEA(AnonymousClass6YT.A00);
            C874352s r17 = AnonymousClass7D5.A00;
            long j = C120537Bh.A00(r2).A0u;
            long j2 = C120537Bh.A00(r2).A0w;
            boolean A0z2 = C147188nY.A0z(r2, toastDragDismissState, 1157296644);
            Object A132 = r5.A13();
            if (A0z2 || A132 == AnonymousClass7GN.A00) {
                A132 = AnonymousClass7W3.A0C(r5, toastDragDismissState, 10);
            }
            Modifier A013 = C115876w3.A01(modifier2, AnonymousClass7W3.A0B(r5, A132, false));
            C142698fR r14 = toastDragDismissState.A01;
            C967266l r19 = C967266l.Horizontal;
            boolean z = !C86104wH.A1X(toastDragDismissState.A06);
            boolean A0z3 = C147188nY.A0z(r2, toastDragDismissState, 1157296644);
            Object A133 = r5.A13();
            if (A0z3 || A133 == AnonymousClass7GN.A00) {
                A133 = new KtSLambdaShape1S0101001_I2(toastDragDismissState, (C146958n9) null, 0);
                r5.A14(A133);
            }
            AnonymousClass7W3.A0w(r5, false);
            Modifier A00 = DraggableKt.A00(r14, r19, (C147258p3) null, A013, (AnonymousClass0YM) A133, 184, z, false);
            C142698fR r10 = toastDragDismissState.A02;
            C967266l r192 = C967266l.Vertical;
            boolean z2 = !C86104wH.A1X(toastDragDismissState.A05);
            boolean A0z4 = C147188nY.A0z(r2, toastDragDismissState, 1157296644);
            Object A134 = r5.A13();
            if (A0z4 || A134 == AnonymousClass7GN.A00) {
                A134 = new KtSLambdaShape1S0101001_I2(toastDragDismissState, (C146958n9) null, A1Z ? 1 : 0);
                r5.A14(A134);
            }
            AnonymousClass7W3.A0w(r5, false);
            AnonymousClass70T.A01((AnonymousClass79L) null, r2, DraggableKt.A00(r10, r192, (C147258p3) null, A00, (AnonymousClass0YM) A134, 184, z2, false), r17, AnonymousClass7JR.A02(r2, r9, i3, 27, -395402088), 196608, 16, j, j2);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0402000_I2(r9, r12, r11, modifier2, i5, i4, 9));
        }
    }
}
