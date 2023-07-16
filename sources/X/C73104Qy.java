package X;

import android.view.View;

/* renamed from: X.4Qy  reason: invalid class name and case insensitive filesystem */
public final class C73104Qy implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1cM A01;

    public C73104Qy(AnonymousClass1cM r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        View view = this.A01.A01;
        if (view != null) {
            view.scrollBy(0, this.A00);
        }
    }
}
