package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.04W  reason: invalid class name */
public final class AnonymousClass04W implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass010 A02;
    public final /* synthetic */ AnonymousClass05Y A03;

    public AnonymousClass04W(Rect rect, View view, AnonymousClass010 r3, AnonymousClass05Y r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = view;
        this.A00 = rect;
    }

    public final void run() {
        AnonymousClass05Y.A00(this.A01, this.A00);
    }
}
