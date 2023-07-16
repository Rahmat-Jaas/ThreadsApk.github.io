package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.3Cf  reason: invalid class name and case insensitive filesystem */
public final class C57723Cf {
    public C15780rs A00;
    public AnonymousClass3YU A01 = new AnonymousClass3YU();
    public C84644tb A02;
    public AnonymousClass3ZN A03;
    public AnonymousClass3E0 A04 = new AnonymousClass3E0();

    public C57723Cf() {
        List<C62273Yb> list = C60983Rj.A03;
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        for (C62273Yb r0 : list) {
            A0x.add(C18180wK.A0p(r0.A01, r0.A02));
        }
        LinkedHashMap A0y = C18220wO.A0y();
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = ((Pair) next).A00;
            Object obj2 = A0y.get(obj);
            if (obj2 == null) {
                obj2 = AnonymousClass0wJ.A0v();
                A0y.put(obj, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList A0k = C18240wQ.A0k(A0y.size());
        Iterator A0u = C18190wL.A0u(A0y);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            Object key = A0o.getKey();
            Iterable<Pair> iterable = (Iterable) A0o.getValue();
            ArrayList A0x2 = AnonymousClass0wJ.A0x(iterable, 10);
            for (Pair pair : iterable) {
                A0x2.add(pair.A01);
            }
            A0k.add(C18180wK.A0p(key, AnonymousClass00J.A0c(A0x2)));
        }
        this.A00 = new C15780rs(AnonymousClass4WJ.A0B(A0k));
        this.A02 = new AnonymousClass4VD();
        this.A03 = new C81114nB();
    }
}
