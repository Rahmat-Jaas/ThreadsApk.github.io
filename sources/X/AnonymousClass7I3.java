package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.7I3  reason: invalid class name */
public final class AnonymousClass7I3 {
    public static final RectF A00 = C86134wK.A0E();

    public static final void A01(Activity activity, boolean z) {
        C04220Ms.A0B(activity, 0);
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & -3;
        if (!z) {
            i = systemUiVisibility | 256 | 512 | 2;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    public static final void A02(Activity activity, boolean z) {
        C04220Ms.A0B(activity, 0);
        View decorView = activity.getWindow().getDecorView();
        C04220Ms.A06(decorView);
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            decorView.setSystemUiVisibility(systemUiVisibility & -5);
            activity.getWindow().clearFlags(1024);
            return;
        }
        decorView.setSystemUiVisibility(systemUiVisibility | 260);
        activity.getWindow().setFlags(1024, 1024);
    }

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C04220Ms.A06(baseContext);
        return A00(baseContext);
    }
}
