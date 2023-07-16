package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.0S0  reason: invalid class name */
public final class AnonymousClass0S0 extends Thread {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C05210Rw A01;
    public final /* synthetic */ AnonymousClass0RW A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass0S0(Context context, C05210Rw r2, AnonymousClass0RW r3, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "instacrash_resolved");
        hashMap.put("user_is_logged_in", Boolean.valueOf(this.A03));
        C05210Rw.A00(this.A00, this.A02, hashMap);
    }
}
