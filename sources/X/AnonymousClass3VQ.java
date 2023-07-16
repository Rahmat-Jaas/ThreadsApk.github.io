package X;

import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppReminder;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3VQ  reason: invalid class name */
public final class AnonymousClass3VQ {
    public static final AnonymousClass3VQ A01 = new AnonymousClass3VQ();
    public final AtomicReference A00 = new AtomicReference(new AnonymousClass376());

    public final void A00(AnonymousClass22G r3) {
        AnonymousClass376 r1 = (AnonymousClass376) this.A00.get();
        if (r1 != null) {
            synchronized (r1) {
                TimeInAppControllerWrapper timeInAppControllerWrapper = r1.A00;
                if (timeInAppControllerWrapper != null) {
                    timeInAppControllerWrapper.dispatch(r3);
                } else {
                    r1.A01.add(r3);
                }
            }
        }
    }

    public final void A01(TimeInAppReminder timeInAppReminder, int i) {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        AnonymousClass376 r1 = (AnonymousClass376) this.A00.get();
        if (r1 != null) {
            synchronized (r1) {
                timeInAppControllerWrapper = r1.A00;
            }
            if (timeInAppControllerWrapper != null) {
                timeInAppControllerWrapper.setReminder(timeInAppReminder, i);
            }
        }
    }

    public final int[] A02(long j) {
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        AnonymousClass376 r1 = (AnonymousClass376) this.A00.get();
        if (r1 != null) {
            synchronized (r1) {
                timeInAppControllerWrapper = r1.A00;
            }
            if (timeInAppControllerWrapper != null) {
                return timeInAppControllerWrapper.getDailyTimeInApp(j);
            }
        }
        return new int[0];
    }
}
