package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4SI  reason: invalid class name */
public final class AnonymousClass4SI implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0ZU A02;

    public AnonymousClass4SI(Activity activity, View view, AnonymousClass0ZU r3) {
        this.A00 = activity;
        this.A01 = view;
        this.A02 = r3;
    }

    public final void run() {
        C25553Dnn A002 = AnonymousClass4DS.A00(this.A00, 2131821072);
        A002.A03(D0f.BELOW_ANCHOR);
        View view = this.A01;
        A002.A01(view);
        A002.A02(view, (view.getWidth() >> 1) - 200, view.getHeight() - 16, false);
        A002.A0D = true;
        A002.A0B = true;
        A002.A0A = true;
        AnonymousClass4DQ.A01(A002, this.A02, 4);
    }
}
