package X;

import android.os.Process;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0KK  reason: invalid class name */
public final class AnonymousClass0KK {
    public long A00 = Long.MIN_VALUE;
    public Map A01 = new HashMap();
    public final AnonymousClass0KO A02;

    public final synchronized void A00(int i) {
        String A002;
        if (!(i == this.A02.A00 || (A002 = AnonymousClass0KP.A00(i)) == null)) {
            this.A01.put(Integer.valueOf(i), new AnonymousClass0KO(i, A002));
        }
    }

    public AnonymousClass0KK() {
        int myPid = Process.myPid();
        String A002 = AnonymousClass0KP.A00(myPid);
        this.A02 = new AnonymousClass0KO(myPid, A002 == null ? "" : A002);
    }
}
