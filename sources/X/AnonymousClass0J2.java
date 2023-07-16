package X;

import android.os.Handler;
import java.lang.reflect.Field;

/* renamed from: X.0J2  reason: invalid class name */
public final class AnonymousClass0J2 implements Runnable {
    public final /* synthetic */ AnonymousClass0J3 A00;

    public final void run() {
        try {
            Field field = AnonymousClass0J3.A03;
            if (field == null) {
                AnonymousClass0J3 r1 = this.A00;
                r1.A02.set(true);
                synchronized (r1) {
                    r1.notify();
                }
                return;
            }
            AnonymousClass0J3 r2 = this.A00;
            Handler handler = r2.A01;
            Object obj = field.get(handler);
            if (obj != null) {
                r2.A00 = (Handler.Callback) obj;
            }
            field.set(handler, r2);
            r2.A02.set(true);
            synchronized (r2) {
                r2.notify();
            }
        } catch (Error | Exception e) {
            AnonymousClass0LU.A0E("HandlerInterceptor", "Install Handler Callback failed", e);
            AnonymousClass0J3 r12 = this.A00;
            r12.A02.set(true);
            synchronized (r12) {
                r12.notify();
            }
        } catch (Throwable th) {
            th = th;
            AnonymousClass0J3 r13 = this.A00;
            r13.A02.set(true);
            synchronized (r13) {
                try {
                    r13.notify();
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    public AnonymousClass0J2(AnonymousClass0J3 r1) {
        this.A00 = r1;
    }
}
