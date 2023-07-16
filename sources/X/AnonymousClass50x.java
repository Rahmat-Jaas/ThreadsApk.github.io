package X;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* renamed from: X.50x  reason: invalid class name */
public final class AnonymousClass50x extends AutofillManager.AutofillCallback {
    public final void onAutofillEvent(View view, int i, int i2) {
        C04220Ms.A0B(view, 0);
        onAutofillEvent(view, i2);
    }

    public final void onAutofillEvent(View view, int i) {
        AnonymousClass0ZU r0;
        C04220Ms.A0B(view, 0);
        if (i == 1 && (view instanceof BaseAutoCompleteTextView) && (r0 = ((BaseAutoCompleteTextView) view).A03) != null) {
            r0.invoke();
        }
    }
}
