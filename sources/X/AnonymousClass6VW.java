package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6VW  reason: invalid class name */
public final class AnonymousClass6VW {
    public static final List A00(List list, AnonymousClass0YM r15, AnonymousClass0YM r16) {
        C04220Ms.A0B(list, 0);
        List A0R = AnonymousClass00J.A0R(AnonymousClass00J.A0K(list), 2, 2);
        ArrayList A0x = AnonymousClass0wJ.A0x(A0R, 10);
        int i = 0;
        for (Object next : A0R) {
            int i2 = i + 1;
            if (i >= 0) {
                Iterable iterable = (Iterable) next;
                Integer valueOf = Integer.valueOf(i);
                ArrayList A0x2 = AnonymousClass0wJ.A0x(iterable, 10);
                int i3 = 0;
                for (Object next2 : iterable) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        A0x2.add(r16.invoke(Integer.valueOf(i), Integer.valueOf(i3), next2));
                        i3 = i4;
                    }
                }
                boolean z = true;
                if (i != C86144wL.A0C(A0R, 1)) {
                    z = false;
                }
                A0x.add(r15.invoke(valueOf, A0x2, new C106616fK(z)));
                i = i2;
            }
            C06750aI.A1A();
            throw null;
        }
        return A0x;
    }
}
