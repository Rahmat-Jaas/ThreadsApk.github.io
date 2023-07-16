package X;

import android.view.View;

/* renamed from: X.3yM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3yM implements C41706Ma1 {
    public static final /* synthetic */ AnonymousClass3yM A00 = new AnonymousClass3yM();

    public final int B2E(View view, int i) {
        int measuredHeight;
        if (view == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        return Math.min(measuredHeight, (int) (((float) i) * 0.75f));
    }
}
