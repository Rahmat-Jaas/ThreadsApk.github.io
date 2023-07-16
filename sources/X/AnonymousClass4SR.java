package X;

import android.app.Activity;
import android.text.Spanned;
import android.view.View;

/* renamed from: X.4SR  reason: invalid class name */
public final class AnonymousClass4SR implements Runnable {
    public final /* synthetic */ Spanned A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C23361de A02;

    public AnonymousClass4SR(Spanned spanned, View view, C23361de r3) {
        this.A02 = r3;
        this.A00 = spanned;
        this.A01 = view;
    }

    public final void run() {
        C25553Dnn dnn = new C25553Dnn((Activity) this.A02.A00, new C26431qd((CharSequence) this.A00));
        C18230wP.A15(this.A01, dnn);
        dnn.A0B = true;
        dnn.A00 = 3000;
        dnn.A0A = false;
        AnonymousClass4DQ.A01(dnn, this, 8);
    }
}
