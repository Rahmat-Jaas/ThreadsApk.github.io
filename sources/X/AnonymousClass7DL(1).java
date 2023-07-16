package X;

import android.os.HandlerThread;

/* renamed from: X.7DL  reason: invalid class name */
public final class AnonymousClass7DL {
    public static AnonymousClass7DL A01;
    public static final Object A02 = C86144wL.A0d();
    public final HandlerThread A00;

    public static AnonymousClass7DL A00() {
        AnonymousClass7DL r0;
        synchronized (A02) {
            r0 = A01;
            if (r0 == null) {
                r0 = new AnonymousClass7DL();
                A01 = r0;
            }
        }
        return r0;
    }

    public AnonymousClass7DL() {
        HandlerThread handlerThread = new HandlerThread("bd_handler_thread", 10);
        C13820oM.A00(handlerThread);
        this.A00 = handlerThread;
        handlerThread.start();
    }
}
