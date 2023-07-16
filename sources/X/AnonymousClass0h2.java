package X;

import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0h2  reason: invalid class name */
public final class AnonymousClass0h2 implements View.OnLayoutChangeListener {
    public final Rect A00;
    public final List A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass0h2(View view, View view2, boolean z) {
        this.A03 = view;
        this.A04 = z;
        this.A02 = view2;
        Rect rect = new Rect();
        this.A00 = rect;
        this.A01 = Collections.singletonList(rect);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Display display = this.A03.getDisplay();
        Rect rect = this.A00;
        display.getRectSize(rect);
        int i9 = rect.left;
        if (this.A04) {
            i3 = rect.right;
        }
        rect.set(i9, i2, i3, i4);
        C006702y.A0F(this.A02, this.A01);
    }
}
