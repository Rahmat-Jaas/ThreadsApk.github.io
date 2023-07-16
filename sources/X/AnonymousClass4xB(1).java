package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xB  reason: invalid class name */
public final class AnonymousClass4xB extends Drawable {
    public StaticLayout A00;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public AnonymousClass4xB(Context context, SpannableString spannableString, int i) {
        TextPaint textPaint = new TextPaint();
        textPaint.density = C18230wP.A0E(context).density;
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setFilterBitmap(true);
        textPaint.setColor(-65536);
        textPaint.setTextSize(48.0f);
        this.A00 = new StaticLayout(spannableString, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
    }
}
