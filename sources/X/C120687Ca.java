package X;

import java.util.List;

/* renamed from: X.7Ca  reason: invalid class name and case insensitive filesystem */
public final class C120687Ca {
    public static final List A00 = C06750aI.A17('$', '@', '#', '%', '&', '*');

    public static final boolean A01(String str) {
        C04220Ms.A0B(str, 0);
        if (!AnonymousClass8bQ.A0n(str)) {
            int i = 0;
            while (i < str.length()) {
                if (A00.contains(Character.valueOf(str.charAt(i)))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public static final String A00(int i) {
        StringBuilder A0r = C18200wM.A0r();
        if (i < 4) {
            i = 4;
        }
        int i2 = 0;
        do {
            List list = A00;
            A0r.append(((Character) list.get(i2 % list.size())).charValue());
            i2++;
        } while (i2 < i);
        return C18190wL.A0n(A0r);
    }
}
