package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6oT  reason: invalid class name and case insensitive filesystem */
public final class C111816oT {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final void A00(C120967Dk r3, String str) {
        List list;
        ConcurrentHashMap concurrentHashMap = this.A00;
        if (!concurrentHashMap.contains(str) || (list = (List) concurrentHashMap.get(str)) == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(r3);
            concurrentHashMap.put(str, copyOnWriteArrayList);
            return;
        }
        list.add(r3);
    }
}
