package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* renamed from: X.0jg  reason: invalid class name and case insensitive filesystem */
public final class C11190jg {
    public static C11190jg A03;
    public AnonymousClass3FH A00;
    public final SharedPreferences A01;
    public final Context A02;

    private synchronized void A01(C10300i6 r14) {
        synchronized (this) {
            SharedPreferences sharedPreferences = this.A01;
            String string = sharedPreferences.getString("analytics_device_id", (String) null);
            long j = sharedPreferences.getLong("analytic_device_timestamp", Long.MAX_VALUE);
            String string2 = sharedPreferences.getString("origin", (String) null);
            if (string == null || j == Long.MAX_VALUE) {
                if (sharedPreferences.getBoolean("phone_id_synced", false)) {
                    string = UUID.randomUUID().toString();
                    j = System.currentTimeMillis();
                    string2 = C37105Jkf.A00(this.A02.getPackageName());
                    sharedPreferences.edit().putString("analytics_device_id", string).putBoolean("analytics_device_id_external", false).putString("origin", string2).putLong("analytic_device_timestamp", j).apply();
                    if (r14 != null) {
                        C15730rn A012 = C15730rn.A01("phoneid_update", (String) null);
                        A012.A0D("custom_uuid", C09140ev.A02.A04(C10600ic.A00));
                        A012.A0D("new_id", string);
                        A012.A0C("new_ts", Long.valueOf(j));
                        A012.A0D("type", "initial_create");
                        new Handler(Looper.getMainLooper()).post(new C11200jh(A012, this, r14));
                    }
                }
            }
            this.A00 = new AnonymousClass3FH(string, j, string2);
        }
    }

    public final synchronized AnonymousClass3FH A02(C10300i6 r2) {
        if (this.A00 == null) {
            A01(r2);
        }
        return this.A00;
    }

    public final synchronized String A03(C10300i6 r2) {
        String str;
        AnonymousClass3FH A022 = A02(r2);
        if (A022 != null) {
            str = A022.A01;
        } else {
            str = null;
        }
        return str;
    }

    public final synchronized void A04(AnonymousClass3FH r5) {
        this.A00 = r5;
        this.A01.edit().putString("analytics_device_id", r5.A01).putBoolean("analytics_device_id_external", true).putLong("analytic_device_timestamp", r5.A00).putString("origin", r5.A02).apply();
    }

    public static synchronized C11190jg A00(Context context) {
        C11190jg r0;
        synchronized (C11190jg.class) {
            r0 = A03;
            if (r0 == null) {
                r0 = new C11190jg(context);
                A03 = r0;
            }
        }
        return r0;
    }

    public C11190jg(Context context) {
        this.A01 = context.getSharedPreferences("analyticsprefs", 0);
        this.A02 = context;
    }
}
