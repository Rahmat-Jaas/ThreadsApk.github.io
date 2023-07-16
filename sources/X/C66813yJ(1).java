package X;

import android.view.View;

/* renamed from: X.3yJ  reason: invalid class name and case insensitive filesystem */
public final class C66813yJ implements C41706Ma1 {
    public final /* synthetic */ C18340wi A00;

    public C66813yJ(C18340wi r1) {
        this.A00 = r1;
    }

    public final int B2E(View view, int i) {
        int measuredHeight;
        if (view == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        return Math.min(measuredHeight, i);
    }
}
