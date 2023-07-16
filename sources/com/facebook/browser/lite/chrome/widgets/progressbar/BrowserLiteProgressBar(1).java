package com.facebook.browser.lite.chrome.widgets.progressbar;

import X.C86104wH;
import X.C86134wK;
import X.C86144wL;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.instagram.barcelona.R;

public class BrowserLiteProgressBar extends ProgressBar {
    public int A00;
    public Paint A01;
    public Rect A02;

    public final synchronized void onDraw(Canvas canvas) {
        Paint paint;
        Rect rect = this.A02;
        if (!(rect == null || (paint = this.A01) == null)) {
            canvas.drawRect(rect, paint);
        }
        super.onDraw(canvas);
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.A02;
        if (rect == null) {
            rect = C86134wK.A0D();
            this.A02 = rect;
        }
        rect.set(0, 0, getMeasuredWidth(), this.A00);
    }

    public synchronized void setProgress(int i) {
        int i2;
        if (i == 100) {
            i2 = 0;
        } else {
            i2 = Math.max(i, 5);
        }
        super.setProgress(i2);
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Paint A0F = C86144wL.A0F();
        this.A01 = A0F;
        C86134wK.A13(A0F);
        C86104wH.A18(getContext(), this.A01, R.color.black_10_transparent);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.browser_progress_overlay_height);
    }

    public BrowserLiteProgressBar(Context context) {
        super(context);
        A00();
    }

    public BrowserLiteProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
