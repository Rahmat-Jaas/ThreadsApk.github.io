package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.3mU  reason: invalid class name and case insensitive filesystem */
public final class C64523mU implements TextWatcher {
    public int A00;
    public boolean A01;
    public final /* synthetic */ EditText A02;
    public final /* synthetic */ AnonymousClass3GS A03;
    public final /* synthetic */ InlineErrorMessageView A04;

    public final void afterTextChanged(Editable editable) {
        C04220Ms.A0B(editable, 0);
        if (!this.A01) {
            this.A01 = true;
            EditText editText = this.A02;
            editText.setText(this.A03.A01(editable.toString()));
            editText.setSelection(this.A00);
            InlineErrorMessageView inlineErrorMessageView = this.A04;
            if (inlineErrorMessageView.getVisibility() == 0) {
                inlineErrorMessageView.A04();
            }
            this.A01 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i + i3;
    }

    public C64523mU(EditText editText, AnonymousClass3GS r2, InlineErrorMessageView inlineErrorMessageView) {
        this.A02 = editText;
        this.A03 = r2;
        this.A04 = inlineErrorMessageView;
    }
}
