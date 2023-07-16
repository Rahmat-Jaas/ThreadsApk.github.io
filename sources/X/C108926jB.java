package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.6jB  reason: invalid class name and case insensitive filesystem */
public final class C108926jB {
    public final C007103c A00;
    public final View A01;
    public final Window A02;

    public C108926jB(View view, Window window) {
        C007103c r0;
        C04220Ms.A0B(view, 1);
        this.A01 = view;
        this.A02 = window;
        if (window != null) {
            r0 = new C007103c(view, window);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
