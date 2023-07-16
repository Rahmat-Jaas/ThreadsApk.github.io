package X;

import android.view.View;

/* renamed from: X.3yN  reason: invalid class name */
public final class AnonymousClass3yN implements C41706Ma1 {
    public static final AnonymousClass3yN A00 = new AnonymousClass3yN();

    public final int B2E(View view, int i) {
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > i) {
            return i;
        }
        return measuredHeight;
    }
}
