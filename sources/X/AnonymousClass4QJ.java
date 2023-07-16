package X;

import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.4QJ  reason: invalid class name */
public final class AnonymousClass4QJ implements Runnable {
    public final /* synthetic */ EditPhoneNumberView A00;

    public AnonymousClass4QJ(EditPhoneNumberView editPhoneNumberView) {
        this.A00 = editPhoneNumberView;
    }

    public final void run() {
        EditPhoneNumberView editPhoneNumberView = this.A00;
        if (editPhoneNumberView.A01.requestFocus()) {
            C09860go.A0K(editPhoneNumberView.A01);
        }
    }
}
