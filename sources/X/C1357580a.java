package X;

import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;

/* renamed from: X.80a  reason: invalid class name and case insensitive filesystem */
public final class C1357580a implements Runnable {
    public final /* synthetic */ AutofillController$InstagramAutofillOptOutCallbackHandler A00;
    public final /* synthetic */ String A01;

    public C1357580a(AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler, String str) {
        this.A00 = autofillController$InstagramAutofillOptOutCallbackHandler;
        this.A01 = str;
    }

    public final void run() {
        String str = this.A01;
        AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = this.A00;
        IF5 if5 = autofillController$InstagramAutofillOptOutCallbackHandler.A02;
        if (TextUtils.equals(str, AnonymousClass7K0.A00(if5.A03()))) {
            autofillController$InstagramAutofillOptOutCallbackHandler.A01.A09(if5);
        }
    }
}
