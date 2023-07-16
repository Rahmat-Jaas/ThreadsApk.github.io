package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4xl  reason: invalid class name and case insensitive filesystem */
public final class C86494xl extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02;
    public final PointF A03 = new PointF();
    public final PointF A04 = new PointF();
    public final PointF A05 = new PointF();

    public C86494xl(Context context) {
        Paint A0F = C86144wL.A0F();
        this.A01 = A0F;
        Path A0G = C86144wL.A0G();
        this.A02 = A0G;
        A0F.setFlags(1);
        A0F.setColor(-1);
        float A002 = C09860go.A00(context, 1.5f);
        this.A00 = A002 / ((float) 2);
        A0F.setShadowLayer(A002, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.black_50_transparent));
        A0F.setPathEffect(new CornerPathEffect(A002));
        A0G.setFillType(Path.FillType.EVEN_ODD);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        float min = ((float) Math.min(rect.height(), rect.width())) + this.A00;
        float height = (((float) rect.height()) - min) / 2.0f;
        PointF pointF = this.A05;
        float width = ((((float) rect.width()) - min) / 2.0f) + (0.2f * min);
        pointF.set(width, height);
        PointF pointF2 = this.A03;
        pointF2.set(width, height + min);
        PointF pointF3 = this.A04;
        pointF3.set(width + (0.75f * min), height + (min / 2.0f));
        Path path = this.A02;
        path.rewind();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.close();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect A0D = C86114wI.A0D(this, canvas);
        canvas.save();
        C86134wK.A11(canvas, A0D);
        canvas.drawPath(this.A02, this.A01);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return C86134wK.A08(this);
    }

    public final int getIntrinsicWidth() {
        return C86124wJ.A0A(this);
    }
}
