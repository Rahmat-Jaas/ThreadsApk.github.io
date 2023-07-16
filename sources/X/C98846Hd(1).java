package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.6Hd  reason: invalid class name and case insensitive filesystem */
public final class C98846Hd {
    public static final void A00(View view, Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        }
        C006002r.A00(view, AnonymousClass7ZU.A00);
    }
}
