package androidx.appcompat.widget;

import X.AnonymousClass0wJ;
import X.AnonymousClass8cQ;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C40601Ljf;
import X.C86144wL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public LayoutInflater A00;
    public int A01;
    public int A02;
    public AnonymousClass8cQ A03;
    public WeakReference A04;

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public int getInflatedId() {
        return this.A01;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A00;
    }

    public int getLayoutResource() {
        return this.A02;
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw C18180wK.A0a("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            A00();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40601Ljf.A0R, i, 0);
        this.A01 = obtainStyledAttributes.getResourceId(2, -1);
        this.A02 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View A00() {
        Throwable th;
        int i;
        int A032 = C14030oh.A03(1504530888);
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            th = C18180wK.A0a("ViewStub must have a non-null ViewGroup viewParent");
            i = 1643734244;
        } else if (this.A02 != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.A00;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, this.A02);
            int i2 = this.A01;
            if (i2 != -1) {
                A0H.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(A0H, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(A0H, indexOfChild);
            }
            this.A04 = C86144wL.A0w(A0H);
            C14030oh.A0A(-1902474706, A032);
            return A0H;
        } else {
            th = C18190wL.A0a("ViewStub must have a valid layoutResource");
            i = 1567170971;
        }
        C14030oh.A0A(i, A032);
        throw th;
    }

    public final void draw(Canvas canvas) {
        C14030oh.A0A(-215613566, C14030oh.A03(-1876331023));
    }

    public void setInflatedId(int i) {
        this.A01 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A02 = i;
    }

    public void setOnInflateListener(AnonymousClass8cQ r1) {
        this.A03 = r1;
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
