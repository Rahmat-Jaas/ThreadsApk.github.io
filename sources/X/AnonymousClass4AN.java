package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.4AN  reason: invalid class name */
public final class AnonymousClass4AN implements C33454Ho9 {
    public final WeakReference A00;
    public final int[] A01 = new int[2];

    public final void AXe(Rect rect) {
        C04220Ms.A0B(rect, 0);
        View view = (View) this.A00.get();
        if (view != null) {
            int[] iArr = this.A01;
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], i + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
        }
    }

    public AnonymousClass4AN(View view) {
        this.A00 = new WeakReference(view);
    }
}
