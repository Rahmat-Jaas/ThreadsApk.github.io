package X;

import android.content.Context;
import java.util.Random;

/* renamed from: X.0ir  reason: invalid class name and case insensitive filesystem */
public final class C10740ir {
    public static C10740ir A04;
    public C10720io A00;
    public Random A01 = new Random();
    public final Context A02;
    public volatile C13540ns A03;

    public static synchronized C10720io A02(C10740ir r2) {
        C10720io r1;
        synchronized (r2) {
            r1 = r2.A00;
            if (r1 == null) {
                r1 = new C10720io(r2.A02);
                r2.A00 = r1;
            }
        }
        return r1;
    }

    public static synchronized C10740ir A00() {
        C10740ir r0;
        synchronized (C10740ir.class) {
            r0 = A04;
        }
        return r0;
    }

    public static synchronized C10740ir A01(Context context) {
        C10740ir r0;
        synchronized (C10740ir.class) {
            boolean z = false;
            if (A04 == null) {
                z = true;
            }
            AnonymousClass7Ko.A0B(z);
            r0 = new C10740ir(context);
            A04 = r0;
        }
        return r0;
    }

    public final boolean A03(C15730rn r6, String str) {
        if (r6.A04) {
            return true;
        }
        C10720io A022 = A02(this);
        String str2 = r6.A03;
        if (str2.equals("perf")) {
            return true;
        }
        int A012 = A022.A01(str2, str);
        if (A012 == -2) {
            A012 = 0;
        } else if (A012 == -1) {
            A012 = 1;
        }
        r6.A01 = Integer.valueOf(A012);
        if (A012 == 0) {
            return false;
        }
        if (A012 == 1 || this.A01.nextInt(A012) == 0) {
            return true;
        }
        return false;
    }

    public C10740ir(Context context) {
        this.A02 = context;
    }
}
