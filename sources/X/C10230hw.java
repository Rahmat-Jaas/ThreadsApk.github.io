package X;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.0hw  reason: invalid class name and case insensitive filesystem */
public class C10230hw implements TextWatcher {
    public int A00;
    public int A01;
    public long A02;

    public void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A02 == 0 && charSequence.length() != 0) {
            this.A02 = SystemClock.elapsedRealtime();
        }
        boolean z = false;
        if (charSequence.length() < this.A01) {
            z = true;
        }
        this.A01 = charSequence.length();
        if (z) {
            this.A00++;
        }
    }
}
