package X;

import com.facebook.redex.IDxSequenceShape671S0100000_2_I2;
import java.util.Iterator;
import kotlin.jvm.internal.KtLambdaShape144S0100000_I2_124;
import kotlin.jvm.internal.KtLambdaShape3S0001000_I2;

/* renamed from: X.8bL  reason: invalid class name */
public class AnonymousClass8bL extends AnonymousClass8bM {
    public static final C146838mw A09(Iterator it) {
        C04220Ms.A0B(it, 0);
        return new AnonymousClass86Z(new IDxSequenceShape671S0100000_2_I2(it, 1));
    }

    public static int A07(C146838mw r1, int i, int i2) {
        Comparable comparable;
        Iterator it = AnonymousClass8bJ.A04(new KtLambdaShape3S0001000_I2(i, i2), r1).iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
        }
        Number number = (Number) comparable;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static final C146838mw A08(Object obj, AnonymousClass0YY r3) {
        C146838mw r1;
        if (obj == null) {
            r1 = C1371686j.A00;
        } else {
            r1 = new C1370986c(new KtLambdaShape144S0100000_I2_124(obj, 4), r3);
        }
        return r1;
    }
}
