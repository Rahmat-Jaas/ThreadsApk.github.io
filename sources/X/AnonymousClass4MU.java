package X;

import android.widget.TextView;

/* renamed from: X.4MU  reason: invalid class name */
public final class AnonymousClass4MU implements C83874s8 {
    public final /* synthetic */ C29281xg A00;

    public final void registerTextViewLogging(TextView textView) {
        C04220Ms.A0B(textView, 0);
        CharSequence text = textView.getText();
        C04220Ms.A06(text);
        if (text.length() > 0) {
            textView.requestFocus();
        }
    }

    public final void searchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        C29341xn r0 = this.A00.A00;
        if (r0 == null) {
            C04220Ms.A0E("filteringAdapter");
            throw null;
        } else {
            r0.getFilter().filter(str);
        }
    }

    public AnonymousClass4MU(C29281xg r1) {
        this.A00 = r1;
    }
}
