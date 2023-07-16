package X;

import java.util.HashMap;

/* renamed from: X.738  reason: invalid class name */
public final class AnonymousClass738 {
    public static final HashMap A00 = AnonymousClass0wJ.A0y();

    public static final M1U A00(String str) {
        M1U m1u;
        C04220Ms.A0B(str, 0);
        HashMap hashMap = A00;
        synchronized (hashMap) {
            m1u = (M1U) hashMap.get(str);
            if (m1u == null) {
                m1u = new M1U(new AnonymousClass6HL(), str);
                hashMap.put(str, m1u);
            }
        }
        return m1u;
    }
}
