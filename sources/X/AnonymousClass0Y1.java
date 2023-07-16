package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Y1  reason: invalid class name */
public final class AnonymousClass0Y1 {
    public static AnonymousClass0Y1 A01;
    public final SharedPreferences A00;

    public static AnonymousClass0Y1 A00(Context context) {
        AnonymousClass0Y1 r1;
        if (A01 == null) {
            synchronized (AnonymousClass0Y1.class) {
                if (A01 == null) {
                    if (context instanceof Application) {
                        r1 = new AnonymousClass0Y1((Application) context);
                    } else {
                        r1 = new AnonymousClass0Y1((Application) context.getApplicationContext());
                    }
                    A01 = r1;
                }
            }
        }
        return A01;
    }

    public final void A01(String str, String str2) {
        this.A00.edit().putString(str, str2).apply();
    }

    public AnonymousClass0Y1(Application application) {
        this.A00 = application.getSharedPreferences("lacrima", 0);
    }
}
