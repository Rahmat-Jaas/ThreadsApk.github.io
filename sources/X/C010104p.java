package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.04p  reason: invalid class name and case insensitive filesystem */
public final class C010104p extends AnimationSet implements Runnable {
    public boolean A00 = true;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;

    public C010104p(View view, ViewGroup viewGroup, Animation animation) {
        super(false);
        this.A04 = viewGroup;
        this.A03 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.A01 = true;
            C004702d.A00(this.A04, this);
        }
        return true;
    }

    public final void run() {
        if (this.A01 || !this.A00) {
            this.A04.endViewTransition(this.A03);
            this.A02 = true;
            return;
        }
        this.A00 = false;
        this.A04.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation)) {
            this.A01 = true;
            C004702d.A00(this.A04, this);
        }
        return true;
    }
}
