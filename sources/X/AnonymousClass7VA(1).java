package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape0S0010001_I2;

/* renamed from: X.7VA  reason: invalid class name */
public final class AnonymousClass7VA implements C146818mu {
    public static final AnonymousClass7VA A00 = new AnonymousClass7VA();

    public final Modifier DB5(Modifier modifier, float f, boolean z) {
        AnonymousClass0YY r0;
        C04220Ms.A0B(modifier, 0);
        if (((double) f) > 0.0d) {
            if (InspectableValueKt.isDebugInspectorInfoEnabled) {
                r0 = new KtLambdaShape0S0010001_I2(2, f, z);
            } else {
                r0 = InspectableValueKt.A00;
            }
            return modifier.Cx6(new AnonymousClass55J(r0, f, z));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0Q("invalid weight ", "; must be greater than zero", f));
    }

    public final Modifier A00(C141758cu r3, Modifier modifier) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1N(modifier, r3);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86144wL.A16(r3, 41);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return modifier.Cx6(new AnonymousClass55H(r3, r0));
    }
}
