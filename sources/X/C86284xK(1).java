package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4xK  reason: invalid class name and case insensitive filesystem */
public final class C86284xK extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final Paint A05;
    public final GradientDrawable A06;
    public final boolean A07;

    public C86284xK(Context context, boolean z) {
        this.A07 = z;
        float A032 = C09860go.A03(context, 3);
        this.A03 = A032;
        this.A00 = C09860go.A03(context, 18);
        this.A02 = C09860go.A03(context, 18);
        this.A01 = C09860go.A03(context, 4);
        Paint A0C = C86114wI.A0C(1);
        C86104wH.A18(context, A0C, R.color.igds_status_pill_ripple);
        C86134wK.A12(A0C);
        A0C.setStrokeWidth(A032);
        this.A05 = A0C;
        Paint A0C2 = C86114wI.A0C(1);
        C86104wH.A18(context, A0C2, R.color.igds_status_pill_ripple);
        C86134wK.A13(A0C2);
        this.A04 = A0C2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A032 / 2.0f);
        gradientDrawable.setColor(context.getColor(R.color.igds_status_pill_ripple));
        this.A06 = gradientDrawable;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect A0D = C86114wI.A0D(this, canvas2);
        float f = this.A03 / 2.0f;
        float f2 = f + ((float) A0D.top);
        float f3 = ((float) A0D.bottom) - f;
        float f4 = ((float) (A0D.left + A0D.right)) / 2.0f;
        Paint paint = this.A04;
        canvas2.drawCircle(f4, f2, f, paint);
        if (this.A07) {
            float f5 = this.A00;
            float f6 = this.A01;
            float f7 = f3 - ((f6 * 2.0f) + f5);
            Path A0G = C86144wL.A0G();
            float f8 = this.A02;
            A0G.moveTo(f8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0G.cubicTo(f8, f5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f5 / 2.0f);
            A0G.cubicTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f8, f5);
            float f9 = f7 + f6;
            Paint paint2 = this.A05;
            canvas2.drawLine(f4, f2, f4, f9, paint2);
            canvas2.save();
            canvas2.translate(f4 - f8, f9);
            canvas2.drawPath(A0G, paint2);
            canvas2.restore();
            canvas2.drawLine(f4, f7 + f5 + f6, f4, f3, paint2);
        } else {
            canvas2.drawLine(f4, f2, f4, f3, this.A05);
        }
        canvas2.drawCircle(f4, f3, f, paint);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }
}
