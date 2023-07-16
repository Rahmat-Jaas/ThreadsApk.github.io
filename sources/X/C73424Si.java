package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.4Si  reason: invalid class name and case insensitive filesystem */
public final class C73424Si implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C28161tl A01;
    public final /* synthetic */ C19000yP A02;

    public C73424Si(View view, C28161tl r2, C19000yP r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        C19000yP r0 = this.A02;
        C25553Dnn A012 = AnonymousClass4DS.A01((Activity) r0.getContext(), r0.getResources().getString(2131838150));
        C18230wP.A15(this.A00, A012);
        AnonymousClass4DQ.A01(A012, this, 18);
    }
}
