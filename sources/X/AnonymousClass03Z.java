package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.03Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass03Z implements Runnable {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass03Z(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }
}
