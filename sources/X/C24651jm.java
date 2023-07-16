package X;

import android.view.View;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1jm  reason: invalid class name and case insensitive filesystem */
public final class C24651jm extends C19819BBt {
    public C23161cb A00;
    public ProgressButton A01;
    public boolean A02;

    public C24651jm(C23161cb r3, ProgressButton progressButton, String str) {
        this.A01 = progressButton;
        if (str != null && !str.isEmpty()) {
            progressButton.setText((CharSequence) str);
        }
        this.A00 = r3;
        this.A02 = false;
        this.A01.setEnabled(true);
    }

    public final void A00() {
        this.A02 = true;
        ProgressButton progressButton = this.A01;
        progressButton.setShowProgressBar(true);
        progressButton.setEnabled(C18180wK.A1W(this.A02 ? 1 : 0));
    }

    public final void Bsd(View view) {
        AnonymousClass0wJ.A16(this.A01, 457, this);
    }
}
