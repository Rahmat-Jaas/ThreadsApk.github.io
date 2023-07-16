package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3SB  reason: invalid class name */
public final class AnonymousClass3SB {
    public static AnonymousClass3SB A01;
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final SharedPreferences A00;

    public AnonymousClass3SB(Context context) {
        this.A00 = context.getSharedPreferences("NOTIFICATION_CHANNELS", 0);
    }
}
