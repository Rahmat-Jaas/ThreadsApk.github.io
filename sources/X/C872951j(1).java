package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.51j  reason: invalid class name and case insensitive filesystem */
public final class C872951j extends ImageView {
    public ObjectAnimator A00;
    public boolean A01;

    public C872951j(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f}).setDuration(850);
        this.A00 = duration;
        duration.setRepeatMode(1);
        this.A00.setRepeatCount(-1);
        C86164wN.A15(this.A00);
        C18180wK.A0r(context, this, R.drawable.spinner_large);
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(1260640904);
        super.onAttachedToWindow();
        if (isShown()) {
            this.A00.start();
        }
        C14030oh.A0D(777578769, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(-1361385964);
        this.A01 = false;
        this.A00.cancel();
        super.onDetachedFromWindow();
        C14030oh.A0D(1141284911, A06);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01) {
            this.A00.start();
            this.A01 = false;
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i != 0 || getVisibility() != 0) {
                this.A00.cancel();
                z = false;
            } else if (getAnimation() != null) {
                return;
            } else {
                if (getMeasuredWidth() != 0) {
                    this.A00.start();
                    return;
                }
                z = true;
            }
            this.A01 = z;
        }
    }
}
