package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.3tc  reason: invalid class name and case insensitive filesystem */
public final class C65553tc implements View.OnKeyListener {
    public final /* synthetic */ IgEditText A00;
    public final /* synthetic */ C23071bs A01;

    public C65553tc(IgEditText igEditText, C23071bs r2) {
        this.A01 = r2;
        this.A00 = igEditText;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67) {
            return false;
        }
        C23071bs r3 = this.A01;
        if (r3.A0A.getValue() != AnonymousClass20y.Social) {
            return false;
        }
        IgEditText igEditText = this.A00;
        if (!C04220Ms.A0I(AnonymousClass0wJ.A0n(igEditText), r3.getString(2131825850))) {
            return false;
        }
        igEditText.getText().clear();
        return false;
    }
}
