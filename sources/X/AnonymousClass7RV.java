package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.7RV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7RV implements View.OnKeyListener {
    public final /* synthetic */ C92325hz A00;

    public /* synthetic */ AnonymousClass7RV(C92325hz r1) {
        this.A00 = r1;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C92325hz r1 = this.A00;
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        if (r1.A04.A0K()) {
            return true;
        }
        r1.A04.A07.A0H(C18180wK.A0Y());
        return true;
    }
}
