package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.804  reason: invalid class name */
public final class AnonymousClass804 implements Runnable {
    public final /* synthetic */ C110506ln A00;

    public AnonymousClass804(C110506ln r1) {
        this.A00 = r1;
    }

    public final void run() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Map map = this.A00.A02;
        Iterator A14 = C86104wH.A14(map);
        if (A14.hasNext()) {
            A14.next();
            throw C18210wN.A0W("getFirstVisiblePosition");
        }
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
    }
}
