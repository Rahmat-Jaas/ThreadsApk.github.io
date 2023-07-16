package com.instagram.ui.widget.tooltippopup;

import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

public class MaskingFrameLayout extends FrameLayout {
    public float A00;
    public Bitmap A01;
    public final Paint A02 = C86114wI.A0C(1);
    public final Rect A03 = C86134wK.A0D();
    public final Rect A04 = C86134wK.A0D();

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.A01 != null) {
            Rect rect = this.A04;
            getGlobalVisibleRect(rect);
            float f = this.A00;
            rect.set(Math.round(((float) rect.left) / f), Math.round(((float) rect.top) / f), Math.round(((float) rect.right) / f), Math.round(((float) rect.bottom) / f));
            Rect rect2 = this.A03;
            rect2.set(0, 0, getWidth(), getHeight());
            Bitmap bitmap = this.A01;
            Paint paint = this.A02;
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            paint.setAlpha(51);
            canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight(), paint);
            paint.setAlpha(255);
        }
    }

    private void A00() {
        Paint paint = this.A02;
        C86104wH.A18(getContext(), paint, R.color.grey_5);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        C86144wL.A18(paint, PorterDuff.Mode.SRC_ATOP);
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public MaskingFrameLayout(Context context) {
        super(context);
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
