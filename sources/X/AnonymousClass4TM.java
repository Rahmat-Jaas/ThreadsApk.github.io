package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Iterator;

/* renamed from: X.4TM  reason: invalid class name */
public final class AnonymousClass4TM implements Runnable {
    public static final AnonymousClass4TM A00 = new AnonymousClass4TM();

    public final void run() {
        if (!C18210wN.A1T(C691847d.A03)) {
            C691847d.A03 = C18180wK.A0Y();
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
            C691847d.A00 = awakeTimeSinceBootClock.now() - 500;
            awakeTimeSinceBootClock.nowNanos();
            Iterator it = C691847d.A0F.iterator();
            while (it.hasNext()) {
                ((C10390iG) it.next()).onAppBackgrounded();
            }
        }
    }
}
