package X;

import android.view.View;

/* renamed from: X.81W  reason: invalid class name */
public final class AnonymousClass81W implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C105746dv A01;

    public AnonymousClass81W(View view, C105746dv r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }
}
