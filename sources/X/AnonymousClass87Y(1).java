package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.87Y  reason: invalid class name */
public final class AnonymousClass87Y implements C146048lX {
    public final int getLoadPriority() {
        return Integer.MAX_VALUE;
    }

    public final String hintOnError() {
        return null;
    }

    public final C141478bg createDispatcher(List list) {
        Object next;
        C27219EgD egD;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next2 : list) {
            if (next2 != this) {
                A0v.add(next2);
            }
        }
        Iterator it = A0v.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((C146048lX) next).getLoadPriority();
                do {
                    Object next3 = it.next();
                    int loadPriority2 = ((C146048lX) next3).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next3;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        }
        C146048lX r3 = (C146048lX) next;
        if (r3 == null) {
            r3 = AnonymousClass87Z.A00;
        }
        try {
            egD = r3.createDispatcher(A0v);
        } catch (Throwable th) {
            egD = new C141448bd(th, r3.hintOnError());
        }
        return new AnonymousClass8bc(egD);
    }
}
