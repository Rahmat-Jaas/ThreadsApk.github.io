package X;

import java.util.HashSet;

/* renamed from: X.7Cm  reason: invalid class name and case insensitive filesystem */
public final class C120787Cm {
    public static String A00 = "media3.common";
    public static final HashSet A01 = C18200wM.A0u();

    public static synchronized void A00(String str) {
        synchronized (C120787Cm.class) {
            if (A01.add(str)) {
                A00 = AnonymousClass00U.A0V(A00, ", ", str);
            }
        }
    }
}
