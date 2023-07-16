package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6y1  reason: invalid class name and case insensitive filesystem */
public final class C117036y1 {
    public static final void A01(AnonymousClass39V r3) {
        C04220Ms.A0B(r3, 0);
        String str = "managerInstance";
        if (C120917Dc.A05 == null) {
            ReentrantLock reentrantLock = C120917Dc.A04;
            reentrantLock.lock();
            try {
                if (C120917Dc.A05 == null) {
                    C120917Dc.A05 = new C120917Dc();
                    C120917Dc r0 = C120917Dc.A05;
                    if (r0 == null) {
                        C04220Ms.A0E(str);
                        throw null;
                    }
                    r0.A00 = r3;
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            C120917Dc r02 = C120917Dc.A05;
            if (r02 != null) {
                AnonymousClass39V r03 = r02.A00;
                if (r03 == null) {
                    str = "appConfig";
                } else if (r03 != r3) {
                    throw C18180wK.A0a(" W3CConfig is already initialized for the app");
                } else {
                    return;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }

    public static final C120917Dc A00() {
        if (C120917Dc.A05 != null) {
            C120917Dc r0 = C120917Dc.A05;
            if (r0 != null) {
                return r0;
            }
            C04220Ms.A0E("managerInstance");
            throw null;
        }
        throw C18180wK.A0a("W3CAppClient is not initialized yet");
    }
}
