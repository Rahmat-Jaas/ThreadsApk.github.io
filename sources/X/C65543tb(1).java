package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.3tb  reason: invalid class name and case insensitive filesystem */
public final class C65543tb implements View.OnKeyListener {
    public final /* synthetic */ IgEditText A00;

    public C65543tb(IgEditText igEditText) {
        this.A00 = igEditText;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67) {
            return false;
        }
        IgEditText igEditText = this.A00;
        if (!C04220Ms.A0I(AnonymousClass0wJ.A0n(igEditText), igEditText.getContext().getString(2131823251))) {
            return false;
        }
        igEditText.getText().clear();
        return false;
    }
}
