package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.7SB  reason: invalid class name */
public final class AnonymousClass7SB implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass564 A00;

    public AnonymousClass7SB(AnonymousClass564 r1) {
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        AnonymousClass56X r3 = this.A00.A09;
        if (r3 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        } else if ((keyEvent == null || keyEvent.getAction() != 0) && i != 6) {
            return false;
        } else {
            if (r3.A05.A08() == C969967n.ValidInput) {
                r3.A09();
            }
            return true;
        }
    }
}
