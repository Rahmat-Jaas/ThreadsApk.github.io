package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7C0  reason: invalid class name */
public final class AnonymousClass7C0 {
    public static final AnonymousClass8s2 A00(Iterable iterable) {
        C04220Ms.A0B(iterable, 0);
        Iterable iterable2 = iterable;
        if (!(iterable instanceof AnonymousClass8s2)) {
            iterable2 = null;
        }
        AnonymousClass8s2 r0 = (AnonymousClass8s2) iterable2;
        if (r0 == null) {
            return A01(iterable);
        }
        return r0;
    }

    public static final C148878sK A01(Iterable iterable) {
        Iterable iterable2 = iterable;
        if (!(iterable instanceof C148878sK)) {
            iterable2 = null;
        }
        C148878sK r0 = (C148878sK) iterable2;
        if (r0 == null) {
            Iterable iterable3 = iterable;
            if (!(iterable instanceof AnonymousClass8s1)) {
                iterable3 = null;
            }
            AnonymousClass8s1 r02 = (AnonymousClass8s1) iterable3;
            if (r02 == null || (r0 = r02.AB7()) == null) {
                AnonymousClass8bW r2 = AnonymousClass8bW.A01;
                if (iterable instanceof Collection) {
                    return r2.A5a((Collection) iterable);
                }
                AnonymousClass8AO r03 = new AnonymousClass8AO(r2, r2.A00);
                C000300e.A0r(iterable, r03);
                return r03.AB7();
            }
        }
        return r0;
    }

    public static final C148878sK A02(Object... objArr) {
        AnonymousClass8bW r1 = AnonymousClass8bW.A01;
        List asList = Arrays.asList(objArr);
        C04220Ms.A06(asList);
        return r1.A5a(asList);
    }
}
