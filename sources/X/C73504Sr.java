package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4Sr  reason: invalid class name and case insensitive filesystem */
public final class C73504Sr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass0ZU A03;

    public C73504Sr(Activity activity, View view, AnonymousClass0ZU r3, int i) {
        this.A01 = activity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = r3;
    }

    public final void run() {
        C25553Dnn A002 = AnonymousClass4DS.A00(this.A01, this.A00);
        A002.A03(D0f.BELOW_ANCHOR);
        View view = this.A02;
        A002.A01(view);
        A002.A02(view, (view.getWidth() >> 1) - 200, view.getHeight() - 16, false);
        A002.A0D = true;
        A002.A0B = true;
        A002.A0A = true;
        AnonymousClass4DQ.A01(A002, this.A03, 5);
    }
}
