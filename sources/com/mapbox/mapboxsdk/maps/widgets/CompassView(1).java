package com.mapbox.mapboxsdk.maps.widgets;

import X.C18210wN;
import X.C18230wP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;

public final class CompassView extends ImageView implements Runnable {
    public boolean A00 = true;

    private void A00(Context context) {
        setEnabled(false);
        int i = (int) (C18230wP.A0E(context).density * 48.0f);
        setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    public final void run() {
        if (this.A00) {
            double abs = (double) Math.abs(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (abs >= 359.0d || abs <= 1.0d) {
                throw C18210wN.A0W("onCompassAnimationFinished");
            }
        }
    }

    public CompassView(Context context) {
        super(context);
        A00(context);
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r3 > 1.0d) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEnabled(boolean r6) {
        /*
            r5 = this;
            super.setEnabled(r6)
            if (r6 == 0) goto L_0x001e
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0027
            r0 = 0
            float r0 = java.lang.Math.abs(r0)
            double r3 = (double) r0
            r1 = 4645023210981556224(0x4076700000000000, double:359.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001e
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0027
        L_0x001e:
            r0 = 0
            r5.setAlpha(r0)
            r0 = 4
        L_0x0023:
            r5.setVisibility(r0)
            return
        L_0x0027:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
            r0 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.widgets.CompassView.setEnabled(boolean):void");
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public CompassView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }
}
