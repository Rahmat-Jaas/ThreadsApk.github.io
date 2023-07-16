package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.3mV  reason: invalid class name and case insensitive filesystem */
public final class C64533mV implements TextWatcher {
    public String A00;
    public final TextView.OnEditorActionListener A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final C83064qj A05;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C64533mV(TextView.OnEditorActionListener onEditorActionListener, C83064qj r2, Integer num, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = str2;
        this.A05 = r2;
        this.A01 = onEditorActionListener;
        this.A02 = num;
        this.A04 = z;
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        this.A00 = obj;
        this.A05.onTextChanged(obj);
    }
}
