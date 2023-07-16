package X;

import android.widget.EditText;

/* renamed from: X.4PW  reason: invalid class name */
public final class AnonymousClass4PW implements Runnable {
    public final /* synthetic */ C27531sf A00;

    public AnonymousClass4PW(C27531sf r1) {
        this.A00 = r1;
    }

    public final void run() {
        C27531sf r1 = this.A00;
        EditText editText = r1.A00;
        if (editText != null && editText.requestFocus()) {
            C09860go.A0K(r1.A00);
        }
    }
}
