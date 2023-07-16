package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.65S  reason: invalid class name */
public final class AnonymousClass65S extends C64493mQ {
    public CharSequence A00 = "";
    public final int A01;
    public final EditText A02;

    public final void afterTextChanged(Editable editable) {
        EditText editText = this.A02;
        if (editText.getLineCount() > this.A01) {
            editText.getText().replace(0, editText.getText().length(), this.A00);
        }
        this.A00 = C18200wM.A0E(editText.getText());
    }

    public AnonymousClass65S(EditText editText, int i) {
        this.A02 = editText;
        this.A01 = i;
    }
}
