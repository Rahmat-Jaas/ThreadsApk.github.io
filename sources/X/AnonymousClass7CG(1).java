package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.7CG  reason: invalid class name */
public final class AnonymousClass7CG {
    public static final AnonymousClass7CG A00 = new AnonymousClass7CG();

    public static final Activity A00(Context context, AnonymousClass7CG r2) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C04220Ms.A06(baseContext);
        return A00(baseContext, r2);
    }
}
