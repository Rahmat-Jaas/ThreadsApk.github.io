package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.KtLambdaShape14S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape50S0200000_I2;

/* renamed from: X.7CA  reason: invalid class name */
public final class AnonymousClass7CA {
    public static final C109656kM A00 = new C109656kM((C112316pN) null, AnonymousClass0ZV.A00);

    public static final Modifier A00(Modifier modifier, Object obj, Object obj2, AnonymousClass0YP r6) {
        AnonymousClass0YY r0;
        C18180wK.A1P(modifier, 0, r6);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86154wM.A0y(r6, obj2, obj, 19);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new KtLambdaShape14S0300000_I2(1, obj2, r6, obj));
    }

    public static final Modifier A01(Modifier modifier, Object obj, AnonymousClass0YP r5) {
        AnonymousClass0YY r0;
        AnonymousClass0wJ.A1M(modifier, 0, r5);
        if (InspectableValueKt.isDebugInspectorInfoEnabled) {
            r0 = C86164wN.A11(obj, r5, 11);
        } else {
            r0 = InspectableValueKt.A00;
        }
        return C120417Am.A02(modifier, r0, new KtLambdaShape50S0200000_I2(14, obj, r5));
    }
}
