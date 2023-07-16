package X;

import android.widget.EditText;

/* renamed from: X.4Pq  reason: invalid class name and case insensitive filesystem */
public final class C72774Pq implements Runnable {
    public final /* synthetic */ EditText A00;

    public C72774Pq(EditText editText) {
        this.A00 = editText;
    }

    public final void run() {
        EditText editText = this.A00;
        if (C09860go.A0p(editText)) {
            editText.requestFocus();
            C09860go.A0K(editText);
        }
    }
}
