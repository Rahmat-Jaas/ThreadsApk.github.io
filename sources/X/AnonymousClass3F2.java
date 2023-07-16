package X;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

/* renamed from: X.3F2  reason: invalid class name */
public final class AnonymousClass3F2 {
    public final C560935t A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape95S0100000_I2_75(this, 19));

    public final Set A00(Set set) {
        C04220Ms.A0B(set, 0);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A00.A00, 36323547739594645L)) {
            return set;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : set) {
            if (((Set) this.A01.getValue()).contains(next)) {
                A0v.add(next);
            }
        }
        return AnonymousClass00J.A0c(A0v);
    }

    public AnonymousClass3F2(C560935t r3) {
        this.A00 = r3;
    }
}
