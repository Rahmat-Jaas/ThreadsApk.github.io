package X;

import android.widget.EditText;

/* renamed from: X.4PU  reason: invalid class name */
public final class AnonymousClass4PU implements Runnable {
    public final /* synthetic */ C23031bo A00;

    public AnonymousClass4PU(C23031bo r1) {
        this.A00 = r1;
    }

    public final void run() {
        C23031bo r2 = this.A00;
        EditText editText = r2.A01;
        if (editText != null) {
            if (editText.requestFocus()) {
                EditText editText2 = r2.A01;
                if (editText2 != null) {
                    C09860go.A0K(editText2);
                    return;
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E("password");
        throw null;
    }
}
