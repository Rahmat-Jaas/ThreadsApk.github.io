package X;

import android.view.View;
import android.widget.EditText;

/* renamed from: X.4Pc  reason: invalid class name and case insensitive filesystem */
public final class C72634Pc implements Runnable {
    public final /* synthetic */ AnonymousClass3Ft A00;

    public C72634Pc(AnonymousClass3Ft r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3Ft r2 = this.A00;
        EditText editText = r2.A01;
        editText.setOnTouchListener((View.OnTouchListener) null);
        editText.removeTextChangedListener(r2.A00);
    }
}
