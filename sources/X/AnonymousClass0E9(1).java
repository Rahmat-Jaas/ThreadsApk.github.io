package X;

import android.content.Context;
import com.facebook.common.dextricks.MultiDexClassLoader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0E9  reason: invalid class name */
public final class AnonymousClass0E9 implements AnonymousClass0Ht {
    public static AnonymousClass0E9 A08;
    public final Context A00;
    public final C13400nd A01;
    public final ThreadLocal A02;
    public final ThreadLocal A03;
    public final Set A04;
    public volatile C04560Oe A05;
    public volatile C04560Oe A06;
    public volatile boolean A07;

    public static synchronized void A00(Context context, C04560Oe r3) {
        synchronized (AnonymousClass0E9.class) {
            AnonymousClass0E9 r0 = A08;
            if (r0 == null) {
                r0 = new AnonymousClass0E9(context, r3);
                A08 = r0;
            }
            r0.A05 = r3;
            MultiDexClassLoader.sFallbackDexLoader = A08;
        }
    }

    public AnonymousClass0E9(Context context, C04560Oe r8) {
        C13560nu r4;
        C13400nd r1;
        C16920tz A002 = C16920tz.A00(context);
        synchronized (C13700o9.class) {
            r4 = C13700o9.A00;
            if (r4 == null) {
                r4 = new C13560nu(context);
                C13700o9.A00 = r4;
            }
        }
        Context context2 = context;
        synchronized (C13400nd.class) {
            r1 = C13400nd.A03;
            if (r1 == null) {
                Context applicationContext = context.getApplicationContext();
                r1 = new C13400nd(applicationContext != null ? applicationContext : context2, A002, r4);
                C13400nd.A03 = r1;
            } else if (r1.A01 != A002) {
                throw new RuntimeException("Different VoltronModuleLoaders detected!");
            }
        }
        this.A04 = new HashSet();
        this.A03 = new C13710oA(this);
        this.A02 = new ThreadLocal();
        Context applicationContext2 = context.getApplicationContext();
        this.A00 = applicationContext2 != null ? applicationContext2 : context;
        this.A01 = r1;
        this.A05 = r8;
    }
}
