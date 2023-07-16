package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.List;

/* renamed from: X.65V  reason: invalid class name */
public final class AnonymousClass65V extends C64493mQ {
    public final List A00 = AnonymousClass0wJ.A0v();

    public final void afterTextChanged(Editable editable) {
        for (TextWatcher afterTextChanged : this.A00) {
            afterTextChanged.afterTextChanged(editable);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher beforeTextChanged : this.A00) {
            beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (TextWatcher onTextChanged : this.A00) {
            onTextChanged.onTextChanged(charSequence, i, i2, i3);
        }
    }
}
