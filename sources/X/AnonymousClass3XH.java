package X;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3XH  reason: invalid class name */
public final class AnonymousClass3XH {
    public static Future A00;
    public static final ScheduledExecutorService A01 = AnonymousClass0gE.A00().A00;

    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        long j;
        Calendar instance;
        long timeInMillis;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        Object A0B = C63893iY.A0B(r12, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        ((Number) A0B).longValue();
        List list = r12.A00;
        C109326jp A0R = C18190wL.A0R(list, A1Z ? 1 : 0);
        C04220Ms.A0C(A0R, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        C109326jp A0R2 = C18190wL.A0R(list, 2);
        C04220Ms.A0C(A0R2, "null cannot be cast to non-null type com.instagram.common.lispy.lang.Expression");
        String A0D = C63893iY.A0D(r12, 4);
        Object A0B2 = C63893iY.A0B(r12, 5);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean A1X = AnonymousClass0wJ.A1X(A0B2);
        long A08 = C18190wL.A08(C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.Number", 6));
        if (AnonymousClass0wJ.A1X(C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.Boolean", 7))) {
            Future future = A00;
            if (future != null) {
                future.cancel(A1Z);
            }
            A00 = null;
            return null;
        }
        if (A0D.equals("Until I change it")) {
            timeInMillis = 120000;
        } else if (A0D.equals("For 1 hour")) {
            timeInMillis = 3600000;
        } else if (A0D.equals("For 4 hours")) {
            timeInMillis = 14400000;
        } else {
            if (A0D.equals("Until 8:00 AM")) {
                instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                int i = instance.get(11);
                int i2 = instance.get(5);
                if (i >= 8) {
                    i2++;
                }
                instance2.set(5, i2);
                instance2.set(11, 8);
                C18190wL.A1W(instance2);
                j = instance2.getTimeInMillis();
            } else {
                j = A08 * ((long) 1000);
                instance = Calendar.getInstance();
            }
            timeInMillis = j - instance.getTimeInMillis();
        }
        A00 = A01.schedule(new C73484Sp(r11, A0R, A0R2, A1X), timeInMillis, TimeUnit.MILLISECONDS);
        return null;
    }
}
