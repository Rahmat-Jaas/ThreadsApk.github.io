package X;

/* renamed from: X.88m  reason: invalid class name and case insensitive filesystem */
public final class C1374188m extends Thread {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1374188m(Runnable runnable, String str) {
        super(runnable, str);
        C04220Ms.A0B(str, 2);
    }

    public final synchronized void start() {
        Throwable th;
        int i = 0;
        while (true) {
            try {
                super.start();
            } catch (OutOfMemoryError e) {
                if (!isAlive()) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    AnonymousClass0wJ.A1Y(message, "pthread_create");
                    if (!message.startsWith("pthread_create") || !message.endsWith("failed: Try again")) {
                        break;
                    } else if (i < 3) {
                        if (i > 0) {
                            try {
                                Thread.sleep((long) (i * 500));
                            } catch (InterruptedException e2) {
                                th = C86114wI.A0k(e2);
                                throw th;
                            }
                        }
                        i++;
                    } else {
                        th = new OutOfMemoryError(AnonymousClass00U.A0R(e.getMessage(), " JavaThreads:", Thread.activeCount()));
                        th.initCause(e);
                        throw th;
                    }
                } else {
                    break;
                }
                throw e;
            }
        }
        throw e;
    }
}
