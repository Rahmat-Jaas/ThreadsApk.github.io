package X;

import android.widget.TextView;

/* renamed from: X.805  reason: invalid class name */
public final class AnonymousClass805 implements Runnable {
    public final /* synthetic */ M5O A00;

    public AnonymousClass805(M5O m5o) {
        this.A00 = m5o;
    }

    public final void run() {
        TextView textView = ((C28296F8l) this.A00).A03;
        if (textView.getLineCount() == 1) {
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(textView.getText());
            textView.setText(C18180wK.A0i(System.getProperty("line.separator"), A0r));
        }
    }
}
