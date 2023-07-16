package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.7Yv  reason: invalid class name and case insensitive filesystem */
public final class C123857Yv implements C145138ju {
    public final View A00;

    public final void BPF(InputMethodManager inputMethodManager) {
        C04220Ms.A0B(inputMethodManager, 0);
        inputMethodManager.hideSoftInputFromWindow(this.A00.getWindowToken(), 0);
    }

    public final void Cu0(InputMethodManager inputMethodManager) {
        C04220Ms.A0B(inputMethodManager, 0);
        this.A00.post(new AnonymousClass80N(inputMethodManager, this));
    }

    public C123857Yv(View view) {
        this.A00 = view;
    }
}
