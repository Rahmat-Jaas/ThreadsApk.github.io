package X;

import android.view.inputmethod.InputMethodManager;

/* renamed from: X.80N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass80N implements Runnable {
    public final /* synthetic */ InputMethodManager A00;
    public final /* synthetic */ C123857Yv A01;

    public /* synthetic */ AnonymousClass80N(InputMethodManager inputMethodManager, C123857Yv r2) {
        this.A00 = inputMethodManager;
        this.A01 = r2;
    }

    public final void run() {
        this.A00.showSoftInput(this.A01.A00, 0);
    }
}
