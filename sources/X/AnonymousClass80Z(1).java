package X;

import android.widget.Toast;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;

/* renamed from: X.80Z  reason: invalid class name */
public final class AnonymousClass80Z implements Runnable {
    public final /* synthetic */ AutofillController$InstagramAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass80Z(AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler, boolean z) {
        this.A00 = autofillController$InstagramAutofillOptOutCallbackHandler;
        this.A01 = z;
    }

    public final void run() {
        Toast.makeText(this.A00.A00, AnonymousClass00U.A0o("Autofill Opt Out: ", this.A01), 0).show();
    }
}
