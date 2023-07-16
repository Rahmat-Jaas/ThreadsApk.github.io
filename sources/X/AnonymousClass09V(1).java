package X;

import android.app.ActivityManager;
import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.09V  reason: invalid class name */
public final class AnonymousClass09V extends AnonymousClass0J8 {
    public AnonymousClass09V() {
        super("activity", (String) null, (String) null, (String) null);
    }

    public final void A00(Context context, C03470In r9) {
        Class A01;
        Field A03;
        Class A012;
        Field A032 = r9.A03(ActivityManager.class, "IActivityManagerSingleton");
        Object obj = null;
        if (A032 != null) {
            try {
                obj = A032.get((Object) null);
            } catch (Exception unused) {
            }
            if (obj != null && (A01 = r9.A01("android.util.Singleton")) != null && (A03 = r9.A03(A01, "mInstance")) != null) {
                try {
                    Object obj2 = A03.get(obj);
                    if (obj2 != null && (A012 = r9.A01("android.app.IActivityManager")) != null) {
                        A03.set(obj, new AnonymousClass0J7(A012, obj2, this.A03, true).A00);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }
}
