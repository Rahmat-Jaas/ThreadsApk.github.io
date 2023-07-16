package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.50l  reason: invalid class name */
public final class AnonymousClass50l extends ViewGroup {
    public final HashMap A00 = AnonymousClass0wJ.A0y();
    public final HashMap A01 = AnonymousClass0wJ.A0y();

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onDescendantInvalidated(View view, View view2) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final HashMap getHolderToLayoutNode() {
        return this.A00;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.A01;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator A0t = C86134wK.A0t(this.A00.keySet());
        while (A0t.hasNext()) {
            C872050o r4 = (C872050o) A0t.next();
            r4.layout(r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom());
        }
    }

    public AnonymousClass50l(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (!AnonymousClass0wJ.A1T(View.MeasureSpec.getMode(i), 1073741824)) {
            throw C18190wL.A0a("Failed requirement.");
        } else if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            Iterator A0t = C86134wK.A0t(this.A00.keySet());
            while (A0t.hasNext()) {
                C872050o r3 = (C872050o) A0t.next();
                int i4 = r3.A01;
                if (!(i4 == Integer.MIN_VALUE || (i3 = r3.A00) == Integer.MIN_VALUE)) {
                    r3.measure(i4, i3);
                }
            }
        } else {
            throw C18190wL.A0a("Failed requirement.");
        }
    }

    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AnonymousClass7Y3 r1 = (AnonymousClass7Y3) this.A00.get(childAt);
            if (childAt.isLayoutRequested() && r1 != null) {
                r1.A0P(false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }
}
