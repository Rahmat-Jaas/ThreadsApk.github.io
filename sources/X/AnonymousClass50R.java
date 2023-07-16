package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.50R  reason: invalid class name */
public final class AnonymousClass50R extends View {
    public float A00;
    public ValueAnimator A01;
    public Paint A02 = C86144wL.A0F();
    public Paint A03 = C86144wL.A0F();
    public Path A04;
    public PathMeasure A05;

    public /* synthetic */ AnonymousClass50R(Context context) {
        super(context, (AttributeSet) null, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f});
        C04220Ms.A06(ofFloat);
        this.A01 = ofFloat;
        this.A01.setDuration(2000);
        C86164wN.A15(this.A01);
        Paint paint = this.A03;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.A03.setColor(-1);
        this.A03.setStrokeWidth(5.0f);
        this.A03.setShadowLayer(7.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1);
        this.A02.setStyle(style);
        this.A02.setColor(-14298266);
        this.A02.setStrokeWidth(5.0f);
    }

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        Path path = this.A04;
        if (path != null) {
            canvas.drawPath(path, this.A03);
            Path path2 = this.A04;
            if (path2 != null) {
                canvas.drawPath(path2, this.A02);
                return;
            }
        }
        C04220Ms.A0E(ClientCookie.PATH_ATTR);
        throw null;
    }

    private final Path getOvalPath() {
        float width = ((float) getWidth()) * 0.5f;
        float height = ((float) getHeight()) * 0.7f;
        float width2 = ((float) getWidth()) * 0.25f;
        float height2 = ((float) getHeight()) * 0.15f;
        float f = (0.5f * width) + width2;
        PointF pointF = new PointF(f, height2);
        float f2 = (0.425f * height) + height2;
        PointF pointF2 = new PointF(width2, f2);
        PointF pointF3 = new PointF(width2 + width, f2);
        PointF pointF4 = new PointF(f, height2 + height);
        PointF pointF5 = new PointF(pointF3.x, pointF.y);
        PointF pointF6 = new PointF(pointF3.x, pointF4.y);
        PointF pointF7 = new PointF(pointF2.x, pointF4.y);
        PointF pointF8 = new PointF(pointF2.x, pointF.y);
        Path A0G = C86144wL.A0G();
        A0G.moveTo(pointF.x, pointF.y);
        A0G.quadTo(pointF5.x, pointF5.y, pointF3.x, pointF3.y);
        A0G.quadTo(pointF6.x, pointF6.y, pointF4.x, pointF4.y);
        A0G.quadTo(pointF7.x, pointF7.y, pointF2.x, pointF2.y);
        A0G.quadTo(pointF8.x, pointF8.y, pointF.x, pointF.y);
        A0G.close();
        return A0G;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C14030oh.A06(-536655863);
        if (!(i == i3 && i2 == i4)) {
            Path ovalPath = getOvalPath();
            this.A04 = ovalPath;
            PathMeasure pathMeasure = new PathMeasure(ovalPath, false);
            this.A05 = pathMeasure;
            float length = pathMeasure.getLength();
            this.A00 = length;
            Paint paint = this.A02;
            float[] fArr = {length, length};
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER * length;
            if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            paint.setPathEffect(new DashPathEffect(fArr, length - f));
        }
        super.onSizeChanged(i, i2, i3, i4);
        C14030oh.A0D(975577515, A06);
    }
}
