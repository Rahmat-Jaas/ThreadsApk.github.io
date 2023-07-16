package androidx.fragment.app;

import X.AnonymousClass00U;
import X.AnonymousClass01J;
import X.AnonymousClass03Y;
import X.AnonymousClass04K;
import X.AnonymousClass05H;
import X.C006702y;
import X.C04220Ms;
import X.C12560m7;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FragmentContainerView extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C04220Ms.A0B(view, 0);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof Fragment) || tag == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i, layoutParams);
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass03Y A05;
        C04220Ms.A0B(windowInsets, 0);
        AnonymousClass03Y r1 = new AnonymousClass03Y(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C04220Ms.A06(onApplyWindowInsets);
            A05 = new AnonymousClass03Y(onApplyWindowInsets);
        } else {
            A05 = C006702y.A05(this, r1);
        }
        if (!A05.A00.A0H()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C006702y.A04(getChildAt(i), A05);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        if (this.A00) {
            for (View drawChild : this.A02) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        C04220Ms.A0B(canvas, 0);
        C04220Ms.A0B(view, 1);
        if (this.A00) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void endViewTransition(View view) {
        C04220Ms.A0B(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C04220Ms.A0B(windowInsets, 0);
        return windowInsets;
    }

    public final void removeView(View view) {
        C04220Ms.A0B(view, 0);
        A00(view);
        super.removeView(view);
    }

    public final void removeViewInLayout(View view) {
        C04220Ms.A0B(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C04220Ms.A0B(onApplyWindowInsetsListener, 0);
        this.A01 = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        C04220Ms.A0B(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C04220Ms.A06(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C04220Ms.A06(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final Fragment getFragment() {
        return C12560m7.A01(this).A0L(getId());
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C04220Ms.A06(childAt);
                A00(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C04220Ms.A06(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C12560m7 r8) {
        super(context, attributeSet);
        View view;
        String str;
        C04220Ms.A0B(context, 1);
        C04220Ms.A0B(attributeSet, 2);
        C04220Ms.A0B(r8, 3);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass04K.A01, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment A0L = r8.A0L(id);
        if (classAttribute != null && A0L == null) {
            if (id == -1) {
                if (string != null) {
                    str = AnonymousClass00U.A0L(" with tag ", string);
                } else {
                    str = "";
                }
                throw new IllegalStateException(AnonymousClass00U.A0V("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
            }
            Fragment A012 = r8.A0P().A01(context.getClassLoader(), classAttribute);
            C04220Ms.A06(A012);
            A012.onInflate(context, attributeSet, (Bundle) null);
            AnonymousClass01J r1 = new AnonymousClass01J(r8);
            r1.A0G = true;
            A012.mContainer = this;
            r1.A0F(A012, string, getId());
            r1.A09();
        }
        for (AnonymousClass05H r3 : r8.A0T.A02()) {
            Fragment fragment = r3.A02;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                r3.A04();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C04220Ms.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass04K.A01, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(AnonymousClass00U.A0e("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, '\"'));
            }
        }
    }
}
