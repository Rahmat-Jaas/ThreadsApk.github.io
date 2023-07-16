package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* renamed from: X.49x  reason: invalid class name and case insensitive filesystem */
public final class C697549x implements C10270i0 {
    public static final C697549x A00 = new C697549x();
    public static final WeakHashMap A01 = new WeakHashMap();

    public final void Bks(C10300i6 r12) {
        long j;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            WeakHashMap weakHashMap = A01;
            ArrayList<Pair> A0k = C18240wQ.A0k(weakHashMap.size());
            Iterator A0u = C18190wL.A0u(weakHashMap);
            while (A0u.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0u);
                Long l = (Long) A0o.getValue();
                Float valueOf = Float.valueOf((((float) ((Bitmap) A0o.getKey()).getAllocationByteCount()) / 1024.0f) / 1024.0f);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C04220Ms.A04(l);
                A0k.add(C18180wK.A0p(valueOf, Long.valueOf(timeUnit.toSeconds(elapsedRealtime - l.longValue()))));
            }
            double d = 0.0d;
            for (Pair pair : A0k) {
                d += (double) C18240wQ.A00(pair.A00);
            }
            Iterator it = A0k.iterator();
            if (it.hasNext()) {
                Long valueOf2 = Long.valueOf(C18190wL.A08(((Pair) it.next()).A01));
                while (it.hasNext()) {
                    Long valueOf3 = Long.valueOf(C18190wL.A08(((Pair) it.next()).A01));
                    if (valueOf2.compareTo(valueOf3) < 0) {
                        valueOf2 = valueOf3;
                    }
                }
                if (valueOf2 != null) {
                    j = valueOf2.longValue();
                    if (d > 5.0d && j > 60) {
                        StringBuilder A0r = C18200wM.A0r();
                        A0r.append("total size MB: ");
                        A0r.append(d);
                        A0r.append(", size to age: ");
                        C10450iM.A03("bitmap_leak_after_eviction", C18200wM.A0m(A0k, A0r));
                    }
                }
            }
            j = 0;
            StringBuilder A0r2 = C18200wM.A0r();
            A0r2.append("total size MB: ");
            A0r2.append(d);
            A0r2.append(", size to age: ");
            C10450iM.A03("bitmap_leak_after_eviction", C18200wM.A0m(A0k, A0r2));
        }
    }

    public final void Bku(C10300i6 r1) {
    }
}
