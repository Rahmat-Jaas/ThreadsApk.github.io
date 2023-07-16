package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.IDxLambdaShape880S0100000_I2;

/* renamed from: X.0lI  reason: invalid class name and case insensitive filesystem */
public final class C12090lI {
    public static C11780kn A00;
    public static final Object A01 = new Object();
    public static final Set A02 = new LinkedHashSet();

    public static final C11660kZ A00(C10300i6 r3) {
        C12080lH r0;
        C04220Ms.A0B(r3, 0);
        C11780kn r02 = A00;
        if (r02 == null) {
            synchronized (A01) {
                r02 = A00;
                if (r02 == null) {
                    r0 = (C12080lH) r3.A01(C12080lH.class, new IDxLambdaShape880S0100000_I2(r3, 2));
                }
            }
            return r0.A00;
        }
        r0 = (C12080lH) r3.A01(C12080lH.class, new C007003b(r02, r3));
        return r0.A00;
    }
}
