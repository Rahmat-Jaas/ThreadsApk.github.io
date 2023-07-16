package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.0IJ  reason: invalid class name */
public final class AnonymousClass0IJ implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C000200d A01;

    public AnonymousClass0IJ(Pair pair, C000200d r2) {
        this.A01 = r2;
        this.A00 = pair;
    }

    public final void run() {
        C17630vH r5;
        C17630vH r6;
        C000200d r2 = this.A01;
        Pair pair = this.A00;
        List list = (List) pair.first;
        if (list != null && !list.isEmpty() && (r6 = r2.A0s) != null && r6.A04()) {
            try {
                int andIncrement = C17630vH.A0f.getAndIncrement() & 65535;
                r2.A0O.A01(r6, C17290ue.SUBACK, "callSub", andIncrement, r2.A0E.A00().A0L);
                synchronized (r6) {
                    if (r6.A04()) {
                        r6.A0J.execute(new C17690vN(r6, list, andIncrement));
                    } else {
                        Integer num = AnonymousClass006.A15;
                        throw new C17450uv(num, C17470ux.A01(num), (Throwable) null);
                    }
                }
            } catch (C17450uv e) {
                AnonymousClass0LU.A0H(r2.A0U, "exception/subscribe", e);
                r2.A07(r6, C17490uz.SEND_FAILURE, AnonymousClass006.A01);
            }
        }
        List list2 = (List) pair.second;
        if (list2 != null && !list2.isEmpty() && (r5 = r2.A0s) != null && r5.A04()) {
            try {
                int andIncrement2 = C17630vH.A0f.getAndIncrement() & 65535;
                r2.A0O.A01(r5, C17290ue.UNSUBACK, "callUnSub", andIncrement2, r2.A0E.A00().A0L);
                synchronized (r5) {
                    if (r5.A04()) {
                        r5.A0J.execute(new C17680vM(r5, list2, andIncrement2));
                    } else {
                        Integer num2 = AnonymousClass006.A15;
                        throw new C17450uv(num2, C17470ux.A01(num2), (Throwable) null);
                    }
                }
            } catch (C17450uv e2) {
                AnonymousClass0LU.A0H(r2.A0U, "exception/unsubscribe", e2);
                r2.A07(r5, C17490uz.SEND_FAILURE, AnonymousClass006.A01);
            }
        }
    }
}
