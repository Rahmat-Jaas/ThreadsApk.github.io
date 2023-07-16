package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0S4  reason: invalid class name */
public final class AnonymousClass0S4 extends Thread {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C05210Rw A02;
    public final /* synthetic */ AnonymousClass0RW A03;

    public AnonymousClass0S4(Context context, C05210Rw r2, AnonymousClass0RW r3, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = context;
        this.A03 = r3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("crash_count", Long.valueOf(this.A00));
        hashMap.put("event_name", "instacrash_detected");
        hashMap.put("detection_threshold_count", Integer.valueOf(C05210Rw.A00));
        hashMap.put("detection_threshold_interval_ms", Integer.valueOf(C05210Rw.A01));
        C05210Rw.A00(this.A01, this.A03, hashMap);
    }
}
