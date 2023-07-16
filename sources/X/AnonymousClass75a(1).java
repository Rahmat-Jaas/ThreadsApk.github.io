package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.75a  reason: invalid class name */
public final class AnonymousClass75a {
    public final C106666fP A00;
    public final String A01;

    public AnonymousClass75a(C106666fP r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }

    public static String A00(Set set) {
        StringBuilder A0r = C18200wM.A0r();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass5s0 r1 = (AnonymousClass5s0) ((AnonymousClass6JJ) it.next());
            A0r.append(r1.A00);
            A0r.append('/');
            A0r.append(r1.A01);
            if (it.hasNext()) {
                A0r.append(' ');
            }
        }
        return A0r.toString();
    }
}
