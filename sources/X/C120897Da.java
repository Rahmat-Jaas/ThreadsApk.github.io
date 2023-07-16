package X;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.7Da  reason: invalid class name and case insensitive filesystem */
public final class C120897Da {
    public static C120897Da A04;
    public int A00 = 1;
    public AnonymousClass7M4 A01 = new AnonymousClass7M4(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public static final synchronized AnonymousClass7HU A00(C120897Da r1, C113836sE r2) {
        AnonymousClass7HU r0;
        synchronized (r1) {
            C86114wI.A1N("MessengerIpcClient", r2);
            if (!r1.A01.A02(r2)) {
                AnonymousClass7M4 r02 = new AnonymousClass7M4(r1);
                r1.A01 = r02;
                r02.A02(r2);
            }
            r0 = r2.A03.A00;
        }
        return r0;
    }

    public static synchronized C120897Da A01(Context context) {
        C120897Da r1;
        synchronized (C120897Da.class) {
            r1 = A04;
            if (r1 == null) {
                r1 = new C120897Da(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new AnonymousClass85P("MessengerIpcClient"))));
                A04 = r1;
            }
        }
        return r1;
    }

    public C120897Da(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
