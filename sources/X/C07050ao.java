package X;

import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0ao  reason: invalid class name and case insensitive filesystem */
public final class C07050ao {
    public final AnonymousClass0MO A00;
    public final AnonymousClass0Lp A01;
    public final AnonymousClass06H A02;
    public final Map A03 = new HashMap();
    public final RealtimeSinceBootClock A04;
    public final AnonymousClass06Y A05;

    public static void A00(C13120n3 r13, C07050ao r14) {
        boolean z;
        C17540v7 r4;
        C17290ue r3 = r13.A04;
        int i = r13.A01;
        C17630vH r2 = r13.A03;
        String name = r3.name();
        Integer valueOf = Integer.valueOf(i);
        Map map = r14.A03;
        synchronized (map) {
            if (map.get(valueOf) == r13) {
                map.remove(valueOf);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            r14.A00.A06("timeout", r13.A05, (Throwable) null, 1, i, i, r2.A0V);
        } else {
            AnonymousClass0LU.A0O("MqttOperationManager", "operation/timeout/duplicate; id=%d, operation=%s, client=%s", valueOf, name, r2);
        }
        r13.A00();
        boolean equals = r3.equals(C17290ue.PINGRESP);
        if (equals || r3.equals(C17290ue.PUBACK)) {
            TimeoutException timeoutException = new TimeoutException();
            if (equals) {
                r4 = C17540v7.PING;
            } else {
                r4 = C17540v7.PUBLISH;
            }
            synchronized (r2) {
                C17490uz r32 = C17490uz.OPERATION_TIMEOUT;
                if (r2.A04()) {
                    r2.A0J.submit(new C17650vJ(r2, r4, r32, timeoutException));
                }
            }
        }
    }

    public C07050ao(RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0MO r3, AnonymousClass0Lp r4, AnonymousClass06Y r5, AnonymousClass06H r6) {
        this.A05 = r5;
        this.A02 = r6;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = realtimeSinceBootClock;
    }

    public final C13120n3 A01(C17630vH r15, C17290ue r16, String str, int i, int i2) {
        C13120n3 r4;
        C13120n3 r7 = new C13120n3(r15, r16, str, i, SystemClock.elapsedRealtime());
        Map map = this.A03;
        synchronized (map) {
            r4 = (C13120n3) map.put(Integer.valueOf(r7.A01), r7);
        }
        if (r4 != null) {
            r4.A00();
            AnonymousClass0LU.A0N("MqttOperationManager", "operation/add/duplicate; id=%d, name=%s", Integer.valueOf(r4.A01), r4.A04.name());
        }
        AnonymousClass06H r6 = this.A02;
        AnonymousClass0QF r3 = new AnonymousClass0QF(r7, this);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AnonymousClass06P r42 = new AnonymousClass06P(r6, (Object) null, r3);
        AnonymousClass06H.A00(r42, r6, SystemClock.elapsedRealtime() + timeUnit.toMillis((long) i2));
        boolean z = false;
        if (r7.A06 == null) {
            z = true;
        }
        AnonymousClass0g1.A01(z);
        r7.A06 = r42;
        return r7;
    }
}
