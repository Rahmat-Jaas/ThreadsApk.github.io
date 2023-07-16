package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7Tp  reason: invalid class name and case insensitive filesystem */
public final class C122727Tp implements C147208oy {
    public final C114466tL A00;

    /* renamed from: A00 */
    public final AnonymousClass7U5 DAO(AnonymousClass8cW r8) {
        C04220Ms.A0B(r8, 0);
        C114466tL r6 = this.A00;
        Map map = r6.A01;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            Object key = A0o.getKey();
            C113506rX r2 = (C113506rX) A0o.getValue();
            A0v.put(key, C18180wK.A0p(((AnonymousClass7U0) r8).A01.invoke(r2.A01), r2.A00));
        }
        return new AnonymousClass7U5(A0v, r6.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C122727Tp) || !C04220Ms.A0I(this.A00, ((C122727Tp) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C122727Tp(C114466tL r1) {
        this.A00 = r1;
    }
}
