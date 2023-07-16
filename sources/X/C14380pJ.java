package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0pJ  reason: invalid class name and case insensitive filesystem */
public final class C14380pJ {
    public static final C10980jH A03 = C10980jH.A00();
    public AtomicLong A00 = new AtomicLong(300000);
    public final SharedPreferences A01;
    public final C12830mZ A02;

    public final synchronized C09740gb A00(String str) {
        C09740gb r5;
        long j = -1;
        r5 = C12730mO.A00;
        C09740gb r6 = r5;
        C09740gb r7 = r5;
        String str2 = "";
        try {
            SharedPreferences sharedPreferences = this.A01;
            String string = sharedPreferences.getString(str, (String) null);
            if (string != null) {
                C13680o7 A002 = C13680o7.A00(string);
                if (A002 != null) {
                    j = System.currentTimeMillis() - A002.A01;
                    r5 = A002.A03;
                    r6 = A002.A05;
                    str2 = A002.A08;
                    r7 = A002.A04;
                }
                sharedPreferences.edit().remove(str).apply();
                r5 = new C12760mR(new C18160wH(r5, r6, r7, str2, j));
            }
        } catch (ClassCastException e) {
            AnonymousClass0LU.A0K("NotificationDeliveryStoreSharedPreferences", "fail to read notifId %s", e, str);
        }
        return r5;
    }

    public C14380pJ(Context context, C12830mZ r5, String str) {
        this.A01 = context.getSharedPreferences(AnonymousClass00U.A0L("rti.mqtt.fbns_notification_store_", str), 0);
        this.A02 = r5;
    }
}
