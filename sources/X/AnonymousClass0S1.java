package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0S1  reason: invalid class name */
public final class AnonymousClass0S1 extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05210Rw A01;
    public final /* synthetic */ AnonymousClass0RW A02;

    public AnonymousClass0S1(Context context, C05210Rw r2, AnonymousClass0RW r3) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "instacrash_mitigated");
        C05210Rw.A00(this.A00, this.A02, hashMap);
    }
}
