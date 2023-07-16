package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6HB  reason: invalid class name */
public final class AnonymousClass6HB {
    public static final List A00(Iterable iterable, AnonymousClass0YY r10) {
        if (iterable == null) {
            return AnonymousClass0ZV.A00;
        }
        ArrayList<Object> A0v = AnonymousClass0wJ.A0v();
        for (Object next : iterable) {
            C107136gE r5 = (C107136gE) next;
            if (!(r5.A01 == -1 || r5.A00 == -1)) {
                A0v.add(next);
            }
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
        for (Object invoke : A0v) {
            A0w.add(r10.invoke(invoke));
        }
        return AnonymousClass00J.A0N(A0w);
    }
}
