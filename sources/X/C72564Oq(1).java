package X;

import android.widget.EditText;

/* renamed from: X.4Oq  reason: invalid class name and case insensitive filesystem */
public final class C72564Oq implements Runnable {
    public final /* synthetic */ AnonymousClass1Z9 A00;

    public C72564Oq(AnonymousClass1Z9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1Z9 r2 = this.A00;
        EditText editText = r2.A00;
        if (editText != null) {
            editText.requestFocus();
            EditText editText2 = r2.A00;
            if (editText2 != null) {
                C09860go.A0K(editText2);
                return;
            }
        }
        C04220Ms.A0E("titleEditText");
        throw null;
    }
}
