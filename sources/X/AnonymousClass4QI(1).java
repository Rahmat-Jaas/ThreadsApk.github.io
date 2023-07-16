package X;

import android.widget.TextView;

/* renamed from: X.4QI  reason: invalid class name */
public final class AnonymousClass4QI implements Runnable {
    public final /* synthetic */ C19040yX A00;

    public AnonymousClass4QI(C19040yX r1) {
        this.A00 = r1;
    }

    public final void run() {
        TextView textView = this.A00.A01;
        if (textView.getLineCount() == 1) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(textView.getText());
            textView.setText(C18180wK.A0i(System.getProperty("line.separator"), A0r));
        }
    }
}
