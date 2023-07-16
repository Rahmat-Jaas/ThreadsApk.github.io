package X;

import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.09h  reason: invalid class name and case insensitive filesystem */
public final class C020009h extends AnonymousClass0J8 {
    public C020009h() {
        super("activity_task", (String) null, (String) null, (String) null);
    }

    public final void A00(Context context, C03470In r9) {
        Field A03;
        Class A01;
        Field A032;
        Class A012;
        Class A013 = r9.A01("android.app.ActivityTaskManager");
        if (A013 != null && (A03 = r9.A03(A013, "IActivityTaskManagerSingleton")) != null) {
            try {
                Object obj = A03.get((Object) null);
                if (obj != null && (A01 = r9.A01("android.util.Singleton")) != null && (A032 = r9.A03(A01, "mInstance")) != null) {
                    Object obj2 = A032.get(obj);
                    if (obj2 != null && (A012 = r9.A01("android.app.IActivityTaskManager")) != null) {
                        A032.set(obj, new AnonymousClass0J7(A012, obj2, this.A03, true).A00);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
