package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.7QC  reason: invalid class name */
public final class AnonymousClass7QC implements TextWatcher {
    public EditText A00;
    public AnonymousClass3HX A01;
    public C127397h3 A02;
    public C109326jp A03;
    public boolean A04 = false;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.A04) {
            this.A04 = true;
            if (!(this.A02 == null || this.A00 == null || this.A03 == null || this.A01 == null)) {
                String obj = editable.toString();
                C127397h3 r3 = this.A02;
                C109326jp r2 = this.A03;
                String str = (String) C122047Jt.A03(this.A01, r3, C86104wH.A0W(obj), r2);
                if (!obj.equals(str)) {
                    editable.replace(0, editable.length(), str);
                    this.A00.setSelection(editable.length());
                }
            }
            this.A04 = false;
        }
    }
}
