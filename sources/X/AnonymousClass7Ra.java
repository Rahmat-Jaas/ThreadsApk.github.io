package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.7Ra  reason: invalid class name */
public final class AnonymousClass7Ra implements View.OnLongClickListener {
    public final /* synthetic */ int A00;

    public AnonymousClass7Ra(int i) {
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        return view.performAccessibilityAction(this.A00, (Bundle) null);
    }
}
