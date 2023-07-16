package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape2S0200001_I2;

/* renamed from: X.7Ac  reason: invalid class name */
public final class AnonymousClass7Ac {
    public static final Modifier A02(Modifier modifier, C142918fo r4, float f, long j) {
        AnonymousClass0YY r0;
        C04220Ms.A0B(modifier, 0);
        C876253m r2 = new C876253m(j);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = new KtLambdaShape2S0200001_I2(r2, r4, f, 1);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new AnonymousClass8YR(r2, r4, f));
    }

    public static final long A00(float f, long j) {
        return C86104wH.A0C(Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, C86104wH.A00(j) - f), Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Float.intBitsToFloat(C86104wH.A08(j)) - f));
    }

    public static final Modifier A01(AnonymousClass79L r4, Modifier modifier, C142918fo r6) {
        AnonymousClass0YY r0;
        boolean A1Z = AnonymousClass0wJ.A1Z(modifier, r4);
        C04220Ms.A0B(r6, 2);
        float f = r4.A00;
        C111366nD r2 = r4.A01;
        if (C86164wN.A1Q(2, r2)) {
            r0 = new KtLambdaShape2S0200001_I2(r2, r6, f, A1Z ? 1 : 0);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new AnonymousClass8YR(r2, r6, f));
    }
}
