package X;

import android.os.Handler;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.4QT  reason: invalid class name */
public final class AnonymousClass4QT implements Runnable {
    public final /* synthetic */ C696349j A00;

    public AnonymousClass4QT(C696349j r1) {
        this.A00 = r1;
    }

    public final void run() {
        C696349j r2 = this.A00;
        if (!C696349j.A0F("time_spent_fully_blocking_screen", "com.instagram.wellbeing.timespent.fragment.TimeSpentReminderFullyBlockingFragment") && !C696349j.A0F("extension_request_fragment", "extension_request_fragment")) {
            return;
        }
        if (C696349j.A0E(r2)) {
            C63433hT.A02();
            r2.A0I();
            r2.A0H();
            r2.A03 = null;
            if (C696349j.A0B(r2) || C63193gy.A01(r2.A02) != null) {
                r2.A04 = true;
            }
            r2.A0L();
            return;
        }
        Handler handler = r2.A0C;
        Runnable runnable = r2.A0E;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
    }
}
