package X;

import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

/* renamed from: X.6rp  reason: invalid class name and case insensitive filesystem */
public final class C113626rp {
    public final C145108jq A00;
    public final AnonymousClass0ZU A01;
    public final Map A02 = C18220wO.A0y();

    public final AnonymousClass0YP A01(Object obj, int i) {
        C04220Ms.A0B(obj, 1);
        Map map = this.A02;
        C110206lI r3 = (C110206lI) map.get(obj);
        Object AZd = ((C147308p8) this.A01.invoke()).AZd(i);
        if (r3 == null || AnonymousClass0wJ.A04(r3.A01.getValue()) != i || !C04220Ms.A0I(r3.A03, AZd)) {
            r3 = new C110206lI(this, obj, AZd, i);
            map.put(obj, r3);
        }
        AnonymousClass0YP r0 = r3.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass7WY A012 = AnonymousClass7WY.A01(new KtLambdaShape48S0200000_I2(2, r3.A04, r3), 1403994769, true);
        r3.A00 = A012;
        return A012;
    }

    public final Object A00(Object obj) {
        C110206lI r0 = (C110206lI) this.A02.get(obj);
        if (r0 != null) {
            return r0.A03;
        }
        C147308p8 r1 = (C147308p8) this.A01.invoke();
        Number A0j = C86124wJ.A0j(obj, r1.Aqt());
        if (A0j != null) {
            return r1.AZd(A0j.intValue());
        }
        return null;
    }

    public C113626rp(C145108jq r2, AnonymousClass0ZU r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
