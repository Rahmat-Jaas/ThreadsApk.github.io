package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4St  reason: invalid class name and case insensitive filesystem */
public final class C73524St implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C84334sy A02;
    public final /* synthetic */ String A03;

    public C73524St(Activity activity, View view, C84334sy r3, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A03 = str;
        this.A02 = r3;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C25553Dnn A012 = AnonymousClass4DS.A01(this.A00, this.A03);
            C18230wP.A15(view, A012);
            A012.A04(AnonymousClass3TC.A05);
            A012.A0B = false;
            A012.A05 = this.A02;
            C18200wM.A1Q(A012);
        }
    }
}
