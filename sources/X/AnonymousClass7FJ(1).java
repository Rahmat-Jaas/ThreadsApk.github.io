package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.IDxLambdaShape2S0120000_2_I2;
import kotlin.jvm.internal.KtLambdaShape0S0321100_I2;
import kotlin.jvm.internal.KtLambdaShape1S0221000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0201100_I2;

/* renamed from: X.7FJ  reason: invalid class name */
public final class AnonymousClass7FJ {
    public static final C146868n0 A00(AnonymousClass7ZH r27, float f) {
        float f2 = f;
        int A03 = C86124wJ.A03(f2) << 1;
        C146868n0 r13 = AnonymousClass6DK.A01;
        C146678mg r1 = AnonymousClass6DK.A00;
        AnonymousClass7XA r14 = AnonymousClass6DK.A02;
        if (r13 == null || r1 == null || A03 > ((C31336Gmy) r13).A00.getWidth() || A03 > ((C31336Gmy) r13).A00.getHeight()) {
            r13 = C29102Fi4.A00(A03, A03, 1, 24);
            AnonymousClass6DK.A01 = r13;
            r1 = C98086Ed.A00(r13);
            AnonymousClass6DK.A00 = r1;
        }
        if (r14 == null) {
            r14 = new AnonymousClass7XA();
            AnonymousClass6DK.A02 = r14;
        }
        AnonymousClass7ZH r12 = r27;
        AnonymousClass69J layoutDirection = r12.A00.getLayoutDirection();
        Bitmap bitmap = ((C31336Gmy) r13).A00;
        long A0C = C86104wH.A0C((float) bitmap.getWidth(), (float) bitmap.getHeight());
        C121167El r0 = r14.A02;
        C147168nV r10 = r0.A02;
        AnonymousClass69J r9 = r0.A03;
        C146678mg r8 = r0.A01;
        long j = r0.A00;
        r0.A02 = r12;
        C04220Ms.A0B(layoutDirection, 0);
        r0.A03 = layoutDirection;
        r0.A01 = r1;
        r0.A00 = A0C;
        r1.Cfm();
        long j2 = AnonymousClass7KE.A01;
        long BCH = r14.BCH();
        long j3 = AnonymousClass7KC.A03;
        C877353x r16 = C877353x.A00;
        r14.AJA((C104136bI) null, r16, 1.0f, 0, j2, j3, BCH);
        r14.AJA((C104136bI) null, r16, 1.0f, 3, C121657He.A02(4278190080L), j3, C86104wH.A0C(f2, f2));
        r14.AIp((C104136bI) null, r16, f2, 1.0f, 3, C121657He.A02(4278190080L), C86104wH.A0C(f2, f2));
        C121167El.A01(r1, r0, r10, r9);
        r0.A01 = r8;
        r0.A00 = j;
        return r13;
    }

    public static final void A01(AnonymousClass67A r14, C147188nY r15, AnonymousClass0YP r16, int i, long j) {
        int i2;
        AnonymousClass67A r6 = r14;
        AnonymousClass0YP r142 = r16;
        int A02 = C18200wM.A02(1, r6, r142);
        C147188nY r10 = r15;
        r15.Cvd(-1409050158);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r15, j2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0G(r15, r6);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0B(r15, r142);
        }
        if ((i2 & 731) != 146 || !r15.BCM()) {
            long A00 = AnonymousClass7Hh.A00(AnonymousClass8bA.A02(AnonymousClass7KC.A01(j2)), AnonymousClass8bA.A02(AnonymousClass7KC.A02(j2)));
            boolean A11 = C147188nY.A11(r15, new C121127Eg(A00), C147188nY.A0z(r15, r6, 511388516));
            AnonymousClass7W3 r9 = (AnonymousClass7W3) r10;
            Object A13 = r9.A13();
            if (A11 || A13 == AnonymousClass7GN.A00) {
                A13 = new AnonymousClass7ZO(r6, A00);
                r9.A14(A13);
            }
            AnonymousClass7W3.A0w(r9, false);
            C1188572n.A00(r10, (AnonymousClass7ZO) A13, new C1201478v(15, true), (AnonymousClass0ZU) null, r142, ((i2 << 3) & 7168) | 384, A02);
        } else {
            r15.CuJ();
        }
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            int i4 = i3;
            AKE.D9d(new KtLambdaShape2S0201100_I2(i4, 1, j2, r6, r142));
        }
    }

    public static final void A02(C147188nY r9, Modifier modifier, C967466n r11, int i, boolean z, boolean z2) {
        int i2;
        Modifier modifier2 = modifier;
        C967466n r3 = r11;
        AnonymousClass0wJ.A1M(modifier, 0, r11);
        r9.Cvd(47957398);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C147188nY.A0F(r9, modifier) | i;
        } else {
            i2 = i;
        }
        boolean z3 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r9, z);
        }
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0H(r9, r11);
        }
        boolean z4 = z2;
        if ((i & 7168) == 0) {
            i2 |= C147188nY.A0O(r9, z2);
        }
        if ((i2 & 5851) != 1170 || !r9.BCM()) {
            Modifier A0D = AnonymousClass7Kq.A0D(modifier, AnonymousClass746.A01, AnonymousClass746.A00);
            C04220Ms.A0B(A0D, 0);
            C115686vk.A01(r9, C120417Am.A02(A0D, InspectableValueKt.A00, new IDxLambdaShape2S0120000_2_I2(r11, 1, z, z2)), 0);
        } else {
            r9.CuJ();
        }
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0221000_I2(r3, modifier2, i3, 0, z3, z4));
        }
    }

    public static final void A03(C147188nY r14, Modifier modifier, C967466n r16, AnonymousClass0YP r17, int i, long j, boolean z, boolean z2) {
        int i2;
        boolean z3;
        AnonymousClass67A r13;
        Modifier modifier2 = modifier;
        C967466n r4 = r16;
        C18180wK.A1Q(r4, 2, modifier);
        r14.Cvd(-616295642);
        int i3 = i;
        long j2 = j;
        if ((i & 14) == 0) {
            i2 = C147188nY.A05(r14, j2) | i;
        } else {
            i2 = i3;
        }
        boolean z4 = z;
        if ((i & 112) == 0) {
            i2 |= C147188nY.A0M(r14, z4);
        }
        if ((i3 & 896) == 0) {
            i2 |= C147188nY.A0H(r14, r4);
        }
        boolean z5 = z2;
        if ((i3 & 7168) == 0) {
            i2 |= C147188nY.A0O(r14, z5);
        }
        if ((57344 & i) == 0) {
            i2 |= C147188nY.A0J(r14, modifier);
        }
        AnonymousClass0YP r6 = r17;
        if ((458752 & i) == 0) {
            i2 |= C147188nY.A0E(r14, r6);
        }
        if ((374491 & i2) != 74898 || !r14.BCM()) {
            if ((r4 != C967466n.Ltr || z2) && (r4 != C967466n.Rtl || !z2)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z ? z3 : !z3) {
                r13 = AnonymousClass67A.TopLeft;
            } else {
                r13 = AnonymousClass67A.TopRight;
            }
            A01(r13, r14, AnonymousClass7JR.A00(r14, new KtLambdaShape0S0321100_I2(r4, modifier2, r6, i2, 0, j2, z4, z5), 732099485), (i2 & 14) | 384, j2);
        } else {
            r14.CuJ();
        }
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape0S0321100_I2(r4, modifier2, r6, i3, 1, j, z, z2));
        }
    }
}
