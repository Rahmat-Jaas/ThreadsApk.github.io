package X;

import android.view.View;

/* renamed from: X.0ht  reason: invalid class name and case insensitive filesystem */
public final class C10200ht implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0ZU A02;

    public C10200ht(View view, AnonymousClass0ZU r2, int i) {
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        View view = this.A01;
        view.setVisibility(this.A00);
        view.setAlpha(1.0f);
    }
}
