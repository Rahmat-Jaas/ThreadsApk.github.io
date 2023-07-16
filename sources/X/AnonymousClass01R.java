package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: X.01R  reason: invalid class name */
public class AnonymousClass01R {
    public static int A00(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (C120447Av.A01() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (AnonymousClass7EV.A00(context).A02()) {
                return 0;
            }
            return -1;
        }
    }

    public static ColorStateList A01(Context context, int i) {
        return C37108Jkj.A00(context.getTheme(), context.getResources(), i);
    }
}
