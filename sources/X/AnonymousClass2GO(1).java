package X;

import java.util.Calendar;

/* renamed from: X.2GO  reason: invalid class name */
public final class AnonymousClass2GO {
    public static final Object A00(C63893iY r5) {
        C04220Ms.A0B(r5, 0);
        long A08 = C18190wL.A08(C63893iY.A0A(r5, 0));
        Calendar instance = Calendar.getInstance();
        C18220wO.A1Q(instance, A08 * 1000);
        Calendar instance2 = Calendar.getInstance();
        int i = instance2.get(1) - instance.get(1);
        if (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) {
            i--;
        }
        return Integer.valueOf(i);
    }
}
