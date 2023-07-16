package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0i6  reason: invalid class name and case insensitive filesystem */
public abstract class C10300i6 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = new X.C06780aL(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Class r4, X.AnonymousClass0ZU r5) {
        /*
            r3 = this;
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            java.util.concurrent.ConcurrentHashMap r2 = r3.A00
            java.lang.Object r0 = r2.get(r4)
            if (r0 != 0) goto L_0x0018
            X.0aL r1 = new X.0aL
            r1.<init>(r5)
            java.lang.Object r0 = r2.putIfAbsent(r4, r1)
            if (r0 != 0) goto L_0x0018
            r0 = r1
        L_0x0018:
            X.0Oa r0 = (X.C04530Oa) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type Key of com.instagram.common.session.Session.getScopedClass"
            X.C04220Ms.A0C(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10300i6.A01(java.lang.Class, X.0ZU):java.lang.Object");
    }

    public final void A03(Class cls) {
        C04220Ms.A0B(cls, 0);
        this.A00.remove(cls);
    }

    public final void A04(Class cls, Object obj) {
        C04220Ms.A0B(obj, 1);
        this.A00.put(cls, AnonymousClass0B5.A00(obj));
    }

    public abstract String getToken();

    public abstract boolean hasEnded();

    public abstract boolean isLoggedIn();

    public final Object A00(Class cls) {
        Object value;
        C04530Oa r0 = (C04530Oa) this.A00.get(cls);
        if (r0 == null || (value = r0.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final List A02() {
        Object value;
        Collection<C04530Oa> values = this.A00.values();
        C04220Ms.A06(values);
        ArrayList arrayList = new ArrayList();
        for (C04530Oa r1 : values) {
            if (r1.BV5() && (value = r1.getValue()) != null) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }
}
