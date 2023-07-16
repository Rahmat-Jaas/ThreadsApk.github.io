package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape0S0010001_I2;

/* renamed from: X.7V5  reason: invalid class name */
public final class AnonymousClass7V5 implements C142758fX {
    public static final AnonymousClass7V5 A00 = new AnonymousClass7V5();

    public final Modifier DB5(Modifier modifier, float f, boolean z) {
        AnonymousClass0YY r0;
        C04220Ms.A0B(modifier, 0);
        if (((double) 1.0f) > 0.0d) {
            if (InspectableValueKt.isDebugInspectorInfoEnabled) {
                r0 = new KtLambdaShape0S0010001_I2(1, 1.0f, z);
            } else {
                r0 = InspectableValueKt.A00;
            }
            return modifier.Cx6(new AnonymousClass55J(r0, 1.0f, z));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0Q("invalid weight ", "; must be greater than zero", 1.0f));
    }

    public final Modifier A00(C142878fk r3, Modifier modifier) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1N(modifier, r3);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(r3, 34);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55G(r3, r0));
    }
}
