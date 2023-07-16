package X;

import android.widget.EditText;

/* renamed from: X.4PK  reason: invalid class name */
public final class AnonymousClass4PK implements Runnable {
    public final /* synthetic */ AnonymousClass1aA A00;

    public AnonymousClass4PK(AnonymousClass1aA r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1aA r1 = this.A00;
        EditText editText = r1.A02;
        if (editText != null && editText.requestFocus()) {
            C09860go.A0K(r1.A02);
        }
    }
}
