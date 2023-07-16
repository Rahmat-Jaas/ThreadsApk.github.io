package X;

import java.lang.Thread;

/* renamed from: X.6Vy  reason: invalid class name and case insensitive filesystem */
public final class C102636Vy {
    public static final void A00(Throwable th, C27952Ew2 ew2) {
        Throwable A0h;
        try {
            C148828sF r0 = (C148828sF) ew2.AOA(C148828sF.A00);
            if (r0 != null) {
                r0.BNJ(th, ew2);
                return;
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException A0h2 = C86154wM.A0h("Exception while trying to handle coroutine exception", th2);
                AnonymousClass721.A01(A0h2, th);
                th = A0h2;
            }
        }
        for (C148828sF BNJ : AnonymousClass6Z7.A00) {
            try {
                BNJ.BNJ(th, ew2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    A0h = th;
                } else {
                    A0h = C86154wM.A0h("Exception while trying to handle coroutine exception", th3);
                    AnonymousClass721.A01(A0h, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, A0h);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            AnonymousClass721.A01(th, new AnonymousClass88Z(ew2));
        } catch (Throwable unused) {
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
