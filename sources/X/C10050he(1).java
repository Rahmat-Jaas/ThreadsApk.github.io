package X;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.0he  reason: invalid class name and case insensitive filesystem */
public final class C10050he {
    public static Object A00(Context context, Class cls) {
        Context baseContext;
        while (!cls.isInstance(context)) {
            if (!(context instanceof ContextWrapper) || context == (baseContext = ((ContextWrapper) context).getBaseContext())) {
                return null;
            }
            context = baseContext;
        }
        return cls.cast(context);
    }
}
