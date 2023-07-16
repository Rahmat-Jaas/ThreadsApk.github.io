package X;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: X.03c  reason: invalid class name and case insensitive filesystem */
public final class C007103c {
    public final C006903a A00;

    public C007103c(View view, Window window) {
        C006903a r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new AnonymousClass02R(window, this);
        } else {
            r0 = new AnonymousClass09W(view, window);
        }
        this.A00 = r0;
    }
}
