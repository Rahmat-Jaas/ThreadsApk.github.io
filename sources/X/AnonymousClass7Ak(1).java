package X;

import java.util.List;
import kotlin.jvm.internal.KtLambdaShape50S0200000_I2;

/* renamed from: X.7Ak  reason: invalid class name */
public abstract class AnonymousClass7Ak {
    public static final void A02(C147188nY r2, Object obj, AnonymousClass0YP r4) {
        List list;
        C04220Ms.A0B(r4, 2);
        AnonymousClass7W3 r22 = (AnonymousClass7W3) r2;
        if (r22.A0P || !C04220Ms.A0I(r22.A13(), obj)) {
            r22.A14(obj);
            KtLambdaShape50S0200000_I2 ktLambdaShape50S0200000_I2 = new KtLambdaShape50S0200000_I2(6, obj, r4);
            if (r22.A0P) {
                list = r22.A0l;
            } else {
                AnonymousClass7W3.A0m(r22);
                AnonymousClass7W3.A0l(r22);
                list = r22.A0K;
            }
            list.add(ktLambdaShape50S0200000_I2);
        }
    }

    public static AnonymousClass0YP A00(C147188nY r1, Object obj, Object obj2, AnonymousClass0YP r4) {
        A02(r1, obj, r4);
        AnonymousClass0YP r0 = AnonymousClass74X.A01;
        A02(r1, obj2, r0);
        return r0;
    }

    public static AnonymousClass0YP A01(C147188nY r0, Object obj, AnonymousClass0YP r2) {
        A02(r0, obj, r2);
        return AnonymousClass74X.A05;
    }
}
