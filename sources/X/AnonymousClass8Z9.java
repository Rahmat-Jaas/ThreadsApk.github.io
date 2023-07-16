package X;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import com.instagram.barcelona.common.ui.bottomsheet.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0200001_I2;
import kotlin.jvm.internal.KtLambdaShape0S0000002_I2;
import kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape1S0101100_I2;
import kotlin.jvm.internal.KtLambdaShape2S0200001_I2;
import kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2;

/* renamed from: X.8Z9  reason: invalid class name */
public final class AnonymousClass8Z9 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C967266l A04;
    public final /* synthetic */ C142918fo A05;
    public final /* synthetic */ C107786hJ A06;
    public final /* synthetic */ C109936kr A07;
    public final /* synthetic */ AnonymousClass0YP A08;
    public final /* synthetic */ AnonymousClass0YM A09;
    public final /* synthetic */ C83224qz A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z9(C967266l r2, C142918fo r3, C107786hJ r4, C109936kr r5, AnonymousClass0YP r6, AnonymousClass0YM r7, C83224qz r8, int i, long j, long j2, long j3) {
        super(3);
        this.A07 = r5;
        this.A04 = r2;
        this.A05 = r3;
        this.A02 = j;
        this.A03 = j2;
        this.A00 = i;
        this.A08 = r6;
        this.A01 = j3;
        this.A0A = r8;
        this.A06 = r4;
        this.A09 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        AnonymousClass0YY r0;
        AnonymousClass0YY r02;
        C147278p5 r2 = (C147278p5) obj;
        C147188nY r5 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(r2, 0);
        if ((A042 & 14) == 0) {
            i = C147188nY.A0F(r5, r2) | A042;
        } else {
            i = A042;
        }
        if ((i & 91) != 18 || !r5.BCM()) {
            float A012 = (float) Constraints.A01(((AnonymousClass7V4) r2).A00);
            C123327Wm r13 = Modifier.A00;
            Modifier A052 = Modifier.A05(r13);
            AnonymousClass0YP r3 = this.A08;
            int i2 = this.A00;
            long j = this.A01;
            C109936kr r9 = this.A07;
            C83224qz r8 = this.A0A;
            C146288ly A072 = AnonymousClass7KV.A07(r5, false);
            Object A0p = C147188nY.A0p(r5);
            Object A0n = C147188nY.A0n(r5);
            Object A0m = C147188nY.A0m(r5);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A052);
            AnonymousClass7W3 r12 = (AnonymousClass7W3) r5;
            C147188nY.A0w(r5, r12, r1);
            AnonymousClass7W3.A0a(r5, r12, A072, A0p);
            AnonymousClass7KP.A07(r5, A0n, A0m, A002);
            r5.Cvb(368460967);
            C86104wH.A1S(r5, r3, i2 >> 24);
            KtLambdaShape18S0200000_I2_2 ktLambdaShape18S0200000_I2_2 = new KtLambdaShape18S0200000_I2_2(38, r8, r9);
            AnonymousClass7A5 r11 = r9.A01;
            Object value = r11.A09.getValue();
            AnonymousClass67T r4 = AnonymousClass67T.Hidden;
            C147188nY r14 = r5;
            KtLambdaShape18S0200000_I2_2 ktLambdaShape18S0200000_I2_22 = ktLambdaShape18S0200000_I2_2;
            AnonymousClass7GX.A02(r14, ktLambdaShape18S0200000_I2_22, (i2 >> 21) & 14, j, C18240wQ.A1Y(value, r4));
            boolean A11 = AnonymousClass7W3.A11(r12);
            Modifier A86 = r2.A86(AnonymousClass7KV.A0C, r13);
            float f = AnonymousClass7GX.A00;
            if (C86164wN.A1Q(0, A86)) {
                r0 = new KtLambdaShape0S0000002_I2(5, Float.NaN, f);
            } else {
                r0 = InspectableValueKt.A00;
            }
            boolean z = true;
            Modifier Cx6 = A86.Cx6(new AnonymousClass55A(r0, Float.NaN, Float.NaN, f, Float.NaN, A11));
            C04220Ms.A0B(Cx6, 0);
            Modifier A043 = Modifier.A04(Cx6);
            C967266l r15 = this.A04;
            boolean A10 = C147188nY.A10(r5, r11, r15, 511388516);
            Object A13 = r12.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                A13 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(r15, r11);
                r12.A14(A13);
            }
            AnonymousClass7W3.A0w(r12, false);
            Modifier A003 = C98186En.A00(A043, (C146088lc) A13, (NestedScrollDispatcher) null);
            KtLambdaShape150S0100000_I2_5 A0s = C86164wN.A0s(r9, 47);
            if (C86164wN.A1Q(0, A003)) {
                r02 = C86144wL.A16(A0s, 39);
            } else {
                r02 = InspectableValueKt.A00;
            }
            Modifier Cx62 = A003.Cx6(new AnonymousClass557(A0s, r02, A11));
            boolean A1Y = C18240wQ.A1Y(r11.A04.getValue(), r4);
            AnonymousClass0wJ.A1M(Cx62, 0, r15);
            C142698fR r42 = r11.A01;
            if (r11.A03.getValue() == null) {
                z = false;
            }
            Modifier A004 = AnonymousClass6FI.A00(C98256Eu.A00(DraggableKt.A00(r42, r15, (C147258p3) null, Cx62, new KtSLambdaShape1S0200001_I2(r11, (C146958n9) null, A11 ? 1 : 0), 32, A1Y, z), new KtLambdaShape2S0200001_I2(this.A06, r9, A012, 5)), new KtLambdaShape41S0200000_I2_2(20, (Object) r9, (Object) r8), false);
            C142918fo r10 = this.A05;
            long j2 = this.A02;
            long j3 = this.A03;
            int i3 = i2 >> 9;
            C147188nY r112 = r5;
            AnonymousClass70T.A01((AnonymousClass79L) null, r112, A004, r10, AnonymousClass7JR.A00(r5, new KtLambdaShape1S0101100_I2(j2, i2, A11 ? 1 : 0, this.A09), 1815362030), (i3 & 7168) | 196608 | ((i2 >> 6) & 112) | (i3 & 896), 16, j2, j3);
        } else {
            r5.CuJ();
        }
        return Unit.A00;
    }
}
