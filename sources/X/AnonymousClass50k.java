package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.50k  reason: invalid class name */
public class AnonymousClass50k extends ViewGroup {
    public boolean A00;

    public AnonymousClass50k(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, true);
    }

    public void dispatchDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        int childCount = super.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C04220Ms.A0C(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((AnonymousClass50g) childAt).A00) {
                this.A00 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.A00 = false;
                }
            } else {
                i++;
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void A00(View view, C146678mg r3, long j) {
        super.drawChild(((C123447Wy) r3).A00, view, j);
    }

    public int getChildCount() {
        if (this.A00) {
            return super.getChildCount();
        }
        return 0;
    }
}
