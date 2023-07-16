package X;

import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.80I  reason: invalid class name */
public final /* synthetic */ class AnonymousClass80I implements Runnable {
    public final /* synthetic */ ConfirmationCodeEditText A00;

    public /* synthetic */ AnonymousClass80I(ConfirmationCodeEditText confirmationCodeEditText) {
        this.A00 = confirmationCodeEditText;
    }

    public final void run() {
        ConfirmationCodeEditText confirmationCodeEditText = this.A00;
        confirmationCodeEditText.A07 = true;
        confirmationCodeEditText.postInvalidate();
    }
}
