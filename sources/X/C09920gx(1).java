package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.0gx  reason: invalid class name and case insensitive filesystem */
public final class C09920gx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public C09920gx(View view, int i, View view2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = view2;
    }

    public final void run() {
        View view = this.A02;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(this.A00);
        Rect rect = new Rect();
        view.getHitRect(rect);
        int i = -dimensionPixelSize;
        rect.inset(i, i);
        this.A01.setTouchDelegate(new TouchDelegate(rect, view));
    }
}
