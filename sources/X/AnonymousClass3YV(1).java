package X;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3YV  reason: invalid class name */
public final class AnonymousClass3YV {
    public static AnonymousClass3YV A00;
    public static final long A01 = TimeUnit.HOURS.toMillis(12);

    public final synchronized Integer A01() {
        Integer A002;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass3U0 r5 = AnonymousClass3U0.A00;
            long j = currentTimeMillis - C08340dC.A01("age_verification_settings_preferences").getLong("age_verification_settings_cooldown_start_time", -1);
            if (r5.A00() == AnonymousClass006.A0C && j > A01) {
                AnonymousClass0wJ.A11(C18220wO.A0C("age_verification_settings_preferences"), "age_verification_settings_blocked_state", 0);
            }
            A002 = r5.A00();
        }
        return A002;
    }

    public final synchronized void A02() {
        Integer num;
        int i;
        if (AnonymousClass3U0.A00.A00().intValue() == 0) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A0C;
        }
        SharedPreferences.Editor A0C = C18220wO.A0C("age_verification_settings_preferences");
        if (1 - num.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        AnonymousClass0wJ.A11(A0C, "age_verification_settings_blocked_state", i);
        AnonymousClass0wJ.A12(C18220wO.A0C("age_verification_settings_preferences"), "age_verification_settings_cooldown_start_time", System.currentTimeMillis());
    }

    public static synchronized AnonymousClass3YV A00() {
        AnonymousClass3YV r0;
        synchronized (AnonymousClass3YV.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new AnonymousClass3YV();
                A00 = r0;
            }
        }
        return r0;
    }
}
