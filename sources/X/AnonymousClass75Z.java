package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.75Z  reason: invalid class name */
public final class AnonymousClass75Z {
    public final Map A00 = Collections.synchronizedMap(new WeakHashMap());
    public final Map A01 = Collections.synchronizedMap(new WeakHashMap());

    public static final void A00(Status status, AnonymousClass75Z r5, boolean z) {
        HashMap A0j;
        HashMap A0j2;
        Map map = r5.A00;
        synchronized (map) {
            A0j = C86164wN.A0j(map);
        }
        Map map2 = r5.A01;
        synchronized (map2) {
            A0j2 = C86164wN.A0j(map2);
        }
        Iterator A0u = C18190wL.A0u(A0j);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            if (z || AnonymousClass0wJ.A1X(A0o.getValue())) {
                ((BasePendingResult) A0o.getKey()).A08(status);
            }
        }
        Iterator A0u2 = C18190wL.A0u(A0j2);
        while (A0u2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0u2);
            if (z || AnonymousClass0wJ.A1X(A0o2.getValue())) {
                ((C113426rN) A0o2.getKey()).A00(new C32102Af(status));
            }
        }
    }
}
