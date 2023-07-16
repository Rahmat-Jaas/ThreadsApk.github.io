package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape1S0420000_I2;
import kotlin.jvm.internal.KtLambdaShape2S0510000_I2;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.6E2  reason: invalid class name */
public final class AnonymousClass6E2 {
    public static final Modifier A00(C142668fO r16, C147258p3 r17, Modifier modifier, AnonymousClass799 r19, AnonymousClass0YY r20, boolean z, boolean z2) {
        AnonymousClass0YY r7;
        AnonymousClass20W r5;
        AnonymousClass0YY r15;
        Modifier modifier2 = modifier;
        C04220Ms.A0B(modifier2, 0);
        C147258p3 r8 = r17;
        AnonymousClass0YY r11 = r20;
        C18230wP.A1R(r8, 2, r11);
        C142668fO r9 = r16;
        AnonymousClass799 r10 = r19;
        boolean z3 = z;
        boolean z4 = z2;
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r7 = new KtLambdaShape1S0420000_I2(r8, r9, r10, r11, 1, z3, z4);
        } else {
            r7 = InspectableValueKt.A00;
        }
        C123327Wm r3 = Modifier.A00;
        if (z) {
            r5 = AnonymousClass20W.On;
        } else {
            r5 = AnonymousClass20W.Off;
        }
        KtLambdaShape4S0110000_I2 ktLambdaShape4S0110000_I2 = new KtLambdaShape4S0110000_I2(1, r11, z3);
        if (C86164wN.A1Q(1, r5)) {
            AnonymousClass20W r172 = r5;
            r15 = new KtLambdaShape2S0510000_I2(r16, r172, r10, ktLambdaShape4S0110000_I2, r8, 2, z2);
        } else {
            r15 = InspectableValueKt.A00;
        }
        return InspectableValueKt.A00(modifier2, InspectableValueKt.A00(r3, AnonymousClass6FI.A00(AnonymousClass7HZ.A00(r16, r8, r3, r10, (String) null, ktLambdaShape4S0110000_I2, z2), C86154wM.A0z(r5, 11), false), r15), r7);
    }
}
