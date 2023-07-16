package X;

import android.view.View;

/* renamed from: X.4Sq  reason: invalid class name and case insensitive filesystem */
public final class C73494Sq implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C61313Ss A01;
    public final /* synthetic */ AnonymousClass3ZL A02;
    public final /* synthetic */ String A03;

    public C73494Sq(View view, C61313Ss r2, AnonymousClass3ZL r3, String str) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void run() {
        C61313Ss r6 = this.A01;
        r6.A00 = true;
        View view = this.A00;
        String A0g = C18190wL.A0g(view.getResources(), 2131834506);
        C61313Ss.A00(view, r6, new C26351qT(r6, this.A02, this.A03), D0f.ABOVE_ANCHOR, A0g);
    }
}
