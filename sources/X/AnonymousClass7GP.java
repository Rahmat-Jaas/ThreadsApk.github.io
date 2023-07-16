package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7GP  reason: invalid class name */
public final class AnonymousClass7GP {
    public static Handler A00;
    public static final List A01 = AnonymousClass0wJ.A0v();

    public static synchronized Handler A00() {
        Handler handler;
        synchronized (AnonymousClass7GP.class) {
            handler = A00;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundLayoutPreparer", 5);
                C13820oM.A00(handlerThread);
                handlerThread.getThreadId();
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                A00 = handler;
            }
        }
        return handler;
    }

    public static synchronized void A01(List list, int i) {
        synchronized (AnonymousClass7GP.class) {
            Handler A002 = A00();
            List list2 = A01;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass82J r1 = (AnonymousClass82J) it.next();
                if (r1.A00 == i) {
                    r1.A02 = true;
                    A002.removeCallbacksAndMessages(r1);
                    it.remove();
                }
            }
            AnonymousClass82J r3 = new AnonymousClass82J(list, i);
            list2.add(r3);
            A002.postAtTime(new C135317zE(r3), r3, 0);
        }
    }
}
