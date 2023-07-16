package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4RA  reason: invalid class name */
public final class AnonymousClass4RA implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C25977Dws A01;

    public AnonymousClass4RA(View view, C25977Dws dws) {
        this.A01 = dws;
        this.A00 = view;
    }

    public final void run() {
        Activity activity = this.A01.A0s;
        View view = this.A00;
        C25553Dnn A002 = AnonymousClass4DS.A00(activity, 2131821765);
        C18250wR.A0r(view, A002);
        A002.A04(AnonymousClass3TC.A06);
        A002.A0B = true;
        A002.A00 = 5000;
        A002.A0A = true;
        C18200wM.A1Q(A002);
    }
}
