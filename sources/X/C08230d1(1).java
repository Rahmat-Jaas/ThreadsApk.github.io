package X;

import android.content.Context;
import kotlin.Pair;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

/* renamed from: X.0d1  reason: invalid class name and case insensitive filesystem */
public final class C08230d1 {
    public static Pair A00;

    public static final synchronized Pair A00() {
        Pair pair;
        synchronized (C08230d1.class) {
            pair = A00;
            if (pair == null) {
                Context context = C10600ic.A00;
                C04220Ms.A06(context);
                String A03 = C07960cV.A03(C08960ea.A00(18867267345383674L));
                C04220Ms.A06(A03);
                C07990cY.A00().longValue();
                pair = C05760Vw.A02(context, A03, new IDxLambdaShape880S0100000_I2(context, 5), C08040cd.A00().booleanValue(), C08050ce.A00().booleanValue());
                A00 = pair;
            }
        }
        return pair;
    }

    public static final boolean A01() {
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        String A03 = C07960cV.A03(C08960ea.A00(18867267345383674L));
        C04220Ms.A06(A03);
        return C05760Vw.A03(A03, C05760Vw.A00(context));
    }

    public static final synchronized boolean A02() {
        boolean booleanValue;
        synchronized (C08230d1.class) {
            booleanValue = ((Boolean) A00().A00()).booleanValue();
        }
        return booleanValue;
    }
}
