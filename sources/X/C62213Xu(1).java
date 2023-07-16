package X;

import android.content.Context;

/* renamed from: X.3Xu  reason: invalid class name and case insensitive filesystem */
public abstract class C62213Xu {
    public static C62213Xu A00;

    public abstract void startDeviceValidation(Context context, String str);

    public static C62213Xu getInstance() {
        C62213Xu r0 = A00;
        if (r0 != null) {
            return r0;
        }
        C27521se r02 = new C27521se();
        A00 = r02;
        return r02;
    }

    public static void setInstance(C62213Xu r0) {
        A00 = r0;
    }
}
