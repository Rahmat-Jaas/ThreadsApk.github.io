package X;

import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: X.4TL  reason: invalid class name */
public final class AnonymousClass4TL implements Runnable {
    public static final AnonymousClass4TL A00 = new AnonymousClass4TL();

    public final void run() {
        if (!C691847d.A05()) {
            C691847d.A02 = C18180wK.A0Y();
            if (Systrace.A0F(1)) {
                C13930oX.A01("notifyAppBackgrounded", 516812932);
            }
            try {
                Iterator it = C691847d.A0E.iterator();
                while (it.hasNext()) {
                    ((C10390iG) it.next()).onAppBackgrounded();
                }
                Queue queue = C691847d.A0C;
                while (true) {
                    AnonymousClass0gG r1 = (AnonymousClass0gG) queue.poll();
                    if (r1 != null) {
                        C691847d.A09.AKp(r1);
                    } else {
                        return;
                    }
                }
            } finally {
                if (Systrace.A0F(1)) {
                    C13930oX.A00(699340368);
                }
            }
        }
    }
}
