package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0X7  reason: invalid class name */
public final class AnonymousClass0X7 implements C04050Mb {
    public static AnonymousClass0X7 A03;
    public static final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Object A00 = new Object();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public static synchronized AnonymousClass0X7 A00() {
        AnonymousClass0X7 r0;
        synchronized (AnonymousClass0X7.class) {
            r0 = A03;
            if (r0 == null) {
                r0 = new AnonymousClass0X7();
                A03 = r0;
            }
        }
        return r0;
    }

    public static void A01(AnonymousClass0MP r2) {
        A04.put(r2.A00, r2);
    }

    public final void A02(String str, String str2) {
        synchronized (this.A00) {
            if (A04.containsKey(str)) {
                this.A02.put(str, str2);
            }
        }
    }

    public final void CWp(C04170Mn r9, AnonymousClass0ND r10) {
        HashMap hashMap;
        HashMap hashMap2;
        Throwable th = r9.A00;
        if (th != null) {
            Object obj = this.A00;
            synchronized (obj) {
                hashMap2 = new HashMap(this.A01);
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                String str = (String) entry.getKey();
                try {
                    String str2 = (String) C04350Ng.A01.submit(new C04280My(str, th, entry)).get(750, TimeUnit.MILLISECONDS);
                    if (str2 == null) {
                        synchronized (obj) {
                            this.A02.remove(str);
                        }
                    } else {
                        A02(str, str2);
                    }
                } catch (Exception unused) {
                    C04790Pd.A00();
                    A02(AnonymousClass00U.A0L(str, "_error"), "timeout");
                }
            }
        }
        synchronized (this.A00) {
            hashMap = new HashMap(this.A02);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Map map = r9.A03;
            if (value == null) {
                value = "unknown";
            }
            map.put(key, value);
        }
    }

    public final Integer Awy() {
        return AnonymousClass006.A06;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
