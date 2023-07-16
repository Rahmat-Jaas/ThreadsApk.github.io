package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2NT  reason: invalid class name */
public final class AnonymousClass2NT {
    public static final Iterable A00(String str) {
        if (str == null) {
            return AnonymousClass0ZV.A00;
        }
        List A02 = C18250wR.A0h(" ").A02(str, 0);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C18220wO.A1P(A0v, it);
        }
        return A0v;
    }
}
