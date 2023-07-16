package X;

import java.lang.ref.WeakReference;

/* renamed from: X.0ku  reason: invalid class name and case insensitive filesystem */
public final class C11850ku {
    public static C11830ks A00;
    public static C11860kv A01;

    public static synchronized C11860kv A00() {
        C11860kv r0;
        synchronized (C11850ku.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C11860kv();
                A01 = r0;
            }
        }
        return r0;
    }

    public static synchronized C11660kZ A01(C11780kn r4, C10300i6 r5) {
        C15810rv r2;
        synchronized (C11850ku.class) {
            C11830ks r1 = A00;
            if (r1 == null) {
                r1 = new C11830ks();
                A00 = r1;
            }
            A00().A00 = r1;
            r2 = (C15810rv) r4.Anj(r4, r5);
            A00().A01.add(new WeakReference(r2));
        }
        return r2;
    }
}
