package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.7Yy  reason: invalid class name and case insensitive filesystem */
public final class C123887Yy implements C141828dA {
    public final View A00;
    public final C145138ju A01;
    public final C04530Oa A02 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C86154wM.A13(this, 34));

    public C123887Yy(View view) {
        C145138ju r0;
        this.A00 = view;
        if (Build.VERSION.SDK_INT < 30) {
            r0 = new C123857Yv(view);
        } else {
            r0 = new C123867Yw(view);
        }
        this.A01 = r0;
    }
}
