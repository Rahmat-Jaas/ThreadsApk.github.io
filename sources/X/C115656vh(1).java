package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape4S0100100_I2;

/* renamed from: X.6vh  reason: invalid class name and case insensitive filesystem */
public final class C115656vh {
    public static final Modifier A01(Modifier modifier, C142918fo r8, long j) {
        AnonymousClass0YY r4;
        C142918fo r3 = r8;
        AnonymousClass0wJ.A1M(modifier, 0, r8);
        AnonymousClass7KE A0I = C86134wK.A0I(j);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r4 = new KtLambdaShape4S0100100_I2(j, r8, 4);
        } else {
            r4 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass54y((C111366nD) null, A0I, r3, r4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 6));
    }

    public static Modifier A00(Modifier modifier, long j) {
        return A01(modifier, C102746Wj.A00, j);
    }
}
