package X;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2LZ  reason: invalid class name */
public final class AnonymousClass2LZ {
    public static final Integer A00(Date date, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        Calendar instance2 = Calendar.getInstance();
        long time = j - instance.getTime().getTime();
        if (time < 0) {
            C18220wO.A1Q(instance2, j);
            if (!(instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1))) {
                C18220wO.A1Q(instance2, TimeUnit.DAYS.toMillis(1) + j);
                if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
                    return AnonymousClass006.A01;
                }
                C18220wO.A1Q(instance2, j);
                if (instance.get(1) != instance2.get(1)) {
                    return AnonymousClass006.A00;
                }
                return AnonymousClass006.A0j;
            }
        } else {
            TimeUnit timeUnit = TimeUnit.DAYS;
            if (time < timeUnit.toMillis(7)) {
                C18220wO.A1Q(instance2, j);
                if (instance.get(5) != instance2.get(5)) {
                    C18220wO.A1Q(instance2, j - timeUnit.toMillis(1));
                    if (instance.get(5) == instance2.get(5)) {
                        return AnonymousClass006.A0N;
                    }
                    C18220wO.A1Q(instance2, j);
                    if (instance2.get(7) != instance.get(7)) {
                        return AnonymousClass006.A0Y;
                    }
                }
            }
            C18220wO.A1Q(instance2, j);
            if (instance.get(1) != instance2.get(1)) {
                return AnonymousClass006.A0u;
            }
            return AnonymousClass006.A0j;
        }
        return AnonymousClass006.A0C;
    }
}
