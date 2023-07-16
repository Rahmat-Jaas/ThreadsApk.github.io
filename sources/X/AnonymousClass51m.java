package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.51m  reason: invalid class name */
public final class AnonymousClass51m extends LinearLayout.LayoutParams {
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            this.width = typedArray.getLayoutDimension(i, "layout_width");
        } else {
            this.width = -2;
        }
        if (typedArray.hasValue(i2)) {
            this.height = typedArray.getLayoutDimension(i2, "layout_height");
        } else {
            this.height = -2;
        }
    }

    public AnonymousClass51m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass51m() {
        super(-2, -2);
    }
}
