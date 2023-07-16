package X;

import java.util.Map;

/* renamed from: X.6wQ  reason: invalid class name and case insensitive filesystem */
public final class C116096wQ {
    public static final C27219EgD A00(C41259M6w m6w) {
        C04220Ms.A0B(m6w, 0);
        Map map = m6w.backingFieldMap;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            obj = new C141438ba(m6w.getQueryExecutor());
            map.put("QueryDispatcher", obj);
        }
        return (C27219EgD) obj;
    }

    public static final C27219EgD A01(C41259M6w m6w) {
        C04220Ms.A0B(m6w, 0);
        Map map = m6w.backingFieldMap;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            obj = new C141438ba(m6w.getTransactionExecutor());
            map.put("TransactionDispatcher", obj);
        }
        return (C27219EgD) obj;
    }
}
