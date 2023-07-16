package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.03G  reason: invalid class name */
public final class AnonymousClass03G {
    public static void A00(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass03F.A00(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i = systemUiVisibility | 1792;
        if (z) {
            i = systemUiVisibility & -1793;
        }
        decorView.setSystemUiVisibility(i);
    }
}
