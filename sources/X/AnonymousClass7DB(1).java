package X;

import android.graphics.Path;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape0S0111100_I2;
import kotlin.jvm.internal.KtLambdaShape2S0200100_I2;
import kotlin.jvm.internal.KtLambdaShape2S0201100_I2;
import kotlin.jvm.internal.KtLambdaShape5S0110000_I2;
import kotlin.jvm.internal.KtLambdaShape6S0110000_I2;

/* renamed from: X.7DB  reason: invalid class name */
public final class AnonymousClass7DB {
    public static final float A00 = ((float) 7.5d);
    public static final float A01 = ((float) 5);
    public static final float A02 = ((float) 10);
    public static final float A03 = ((float) 2.5d);
    public static final float A04 = ((float) 40);
    public static final C874352s A05 = AnonymousClass7G5.A00;

    public static final void A00(C147188nY r25, Modifier modifier, C111216my r27, int i, int i2, long j, long j2, boolean z, boolean z2) {
        int i3;
        AnonymousClass0YY r0;
        long j3 = j2;
        long j4 = j;
        C111216my r5 = r27;
        C04220Ms.A0B(r5, 1);
        C147188nY r11 = r25;
        int i4 = i2;
        Modifier A0c = C147188nY.A0c(r11, modifier, 291420436, i4);
        int i5 = i;
        if ((i2 & 8) != 0) {
            j4 = AnonymousClass7KB.A00(r11);
            i3 = i5 & -7169;
        } else {
            i3 = i5;
        }
        if ((i2 & 16) != 0) {
            j3 = AnonymousClass7KB.A02(r11);
            i3 &= -57345;
        }
        boolean A1R = C18240wQ.A1R(i2 & 32, z2);
        Modifier A09 = AnonymousClass7Kq.A09(A0c, A04);
        if (C86134wK.A1Z(A09)) {
            r0 = new KtLambdaShape5S0110000_I2(11, r5, A1R);
        } else {
            r0 = InspectableValueKt.A00;
        }
        boolean z3 = z;
        AnonymousClass70T.A01(AnonymousClass79L.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C120537Bh.A00(r11).A0W), r11, C120417Am.A02(A09, r0, new KtLambdaShape6S0110000_I2(4, r5, A1R)), A05, AnonymousClass7JR.A00(r11, new KtLambdaShape0S0111100_I2(r27, i3, 1, j3, z3), 1301132693), ((i3 >> 3) & 896) | 196656, 8, j4, 0);
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8SE(A0c, r5, i5, i4, j4, j3, z3, A1R));
        }
    }

    public static final void A01(C147188nY r14, Modifier modifier, C111216my r16, int i, long j) {
        r14.Cvd(-677325277);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r14;
        Object A13 = r2.A13();
        AnonymousClass7X1 r13 = A13;
        if (A13 == AnonymousClass7GN.A00) {
            AnonymousClass7X1 r132 = new AnonymousClass7X1(C86144wL.A0G());
            r132.A01.setFillType(Path.FillType.EVEN_ODD);
            r2.A14(r132);
            r13 = r132;
        }
        Modifier modifier2 = modifier;
        C111216my r6 = r16;
        long j2 = j;
        AnonymousClass6DZ.A00(r14, AnonymousClass6FI.A00(modifier, C139358Nq.A00, false), new KtLambdaShape2S0200100_I2(4, j2, r6, r13), 0);
        C147178nW AKE = r14.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape2S0201100_I2(i, 2, j2, r6, modifier2));
        }
    }
}
