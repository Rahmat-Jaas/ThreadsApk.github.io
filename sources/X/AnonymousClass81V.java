package X;

import android.view.View;

/* renamed from: X.81V  reason: invalid class name */
public final class AnonymousClass81V implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C105746dv A01;

    public AnonymousClass81V(View view, C105746dv r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }
}
