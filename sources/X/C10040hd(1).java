package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.0hd  reason: invalid class name and case insensitive filesystem */
public final class C10040hd {
    public static final Activity A00(Context context) {
        C04220Ms.A0B(context, 0);
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C04220Ms.A06(context);
        }
        throw new IllegalStateException("no activity");
    }
}
