package X;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.7Rr  reason: invalid class name */
public final class AnonymousClass7Rr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AZA A00;

    public AnonymousClass7Rr(AZA aza) {
        this.A00 = aza;
    }

    public final boolean onPreDraw() {
        StringBuilder A0r;
        TextView textView = this.A00.A02;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        if (textView.getLineCount() > 1) {
            Layout layout = textView.getLayout();
            layout.getClass();
            int lineVisibleEnd = layout.getLineVisibleEnd(0);
            String charSequence = textView.getText().subSequence(0, lineVisibleEnd).toString();
            String trim = textView.getText().subSequence(lineVisibleEnd, textView.getText().length()).toString().trim();
            if (charSequence.endsWith("·")) {
                A0r = C18200wM.A0r();
                A0r.append(charSequence.substring(0, charSequence.length() - 1));
                A0r.append(trim);
            } else if (trim.startsWith("·")) {
                A0r = C18200wM.A0r();
                A0r.append(charSequence);
                A0r.append(trim.substring(1));
            }
            textView.setText(A0r.toString());
        }
        return true;
    }
}
