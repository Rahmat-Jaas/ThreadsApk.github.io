package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.81y  reason: invalid class name and case insensitive filesystem */
public final class C1362381y implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113176qs A01;

    public C1362381y(C113176qs r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C113176qs r2 = this.A01;
        View view = r2.A03;
        int width = view.getWidth();
        r2.A04.setClipBounds(new Rect(0, 0, (this.A00 * width) / 100, view.getHeight()));
    }
}
