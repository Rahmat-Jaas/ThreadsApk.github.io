package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Lf  reason: invalid class name and case insensitive filesystem */
public final class C03890Lf implements Runnable {
    public final /* synthetic */ C03930Lj A00;

    public C03890Lf(C03930Lj r1) {
        this.A00 = r1;
    }

    public final void run() {
        C03930Lj r7 = this.A00;
        Method method = r7.A07;
        long j = 0;
        if (method != null) {
            try {
                j = ((Number) method.invoke(r7.A04, new Object[0])).longValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                C03930Lj.A00(r7, e);
            }
        }
        if (r7.A00 == -1) {
            r7.A00 = j;
            r7.A01 = j;
        } else {
            r7.A01 = j;
            r7.A05.C05(j - r7.A01);
        }
        C03930Lj.A01(r7, r7.A06);
    }
}
