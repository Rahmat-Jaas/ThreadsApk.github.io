package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.service.session.UserSession;

/* renamed from: X.4xv  reason: invalid class name and case insensitive filesystem */
public final class C86594xv extends Drawable {
    public float A00;
    public int A01;
    public Shader A02;
    public final int A03;
    public final Matrix A04;
    public final Matrix A05;
    public final Paint A06 = C86144wL.A0F();
    public final Path A07 = C86144wL.A0G();
    public final Path A08 = C86144wL.A0G();
    public final Path A09 = C86144wL.A0G();
    public final Path A0A;
    public final RectF A0B = C86134wK.A0E();
    public final RectF A0C = new RectF(-171.0f, -171.0f, 171.0f, 171.0f);
    public final RectF A0D = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 360.0f, 360.0f);
    public final RectF A0E = C86134wK.A0E();
    public final RectF A0F = C86134wK.A0E();
    public final boolean A0G;
    public final RectF A0H;

    public final int getOpacity() {
        return -3;
    }

    private void A00(float f) {
        Paint paint = this.A06;
        paint.reset();
        paint.setFlags(1);
        paint.setStrokeWidth(f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeMiter(10.0f);
        C86134wK.A12(paint);
    }

    public final void draw(Canvas canvas) {
        float f;
        Paint paint;
        float f2;
        float f3;
        float f4;
        int i = this.A01;
        boolean z = false;
        boolean A1W = C18180wK.A1W(i);
        boolean A1T = AnonymousClass0wJ.A1T(i, this.A03 - 1);
        float f5 = this.A00;
        if (f5 < 0.49f && A1W) {
            z = true;
        }
        float f6 = f5 * -360.0f;
        Canvas canvas2 = canvas;
        canvas2.save();
        RectF rectF = this.A0F;
        canvas2.translate(rectF.left, rectF.top);
        float width = rectF.width();
        RectF rectF2 = this.A0D;
        canvas2.scale(width / rectF2.width(), rectF.height() / rectF2.height());
        if (z) {
            canvas2.save();
            canvas2.clipRect(rectF2.width() / 2.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, rectF2.width(), rectF2.height());
        }
        float f7 = this.A00;
        if (A1T) {
            float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(6.0f, ((f7 - 0.5f) / 0.25f) * 6.0f)) * 3.0f;
            RectF rectF3 = this.A0B;
            canvas2.save();
            canvas2.translate(180.0f, 180.0f);
            canvas2.rotate(-90.0f);
            float f8 = ((max / 2.0f) - 60.0f) - 120.0f;
            float f9 = (120.0f - max) + f8 + 240.0f;
            rectF3.set(f8, f8, f9, f9);
            if (!this.A0G) {
                this.A07.reset();
            }
            Path path = this.A07;
            if ((-f6) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f4 = ((float) Math.ceil((double) (f6 / 360.0f))) * 360.0f;
            } else {
                f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            path.addArc(rectF3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f4 - f6);
            Shader shader = this.A02;
            Matrix matrix = this.A05;
            shader.getLocalMatrix(matrix);
            Matrix matrix2 = this.A04;
            matrix2.set(matrix);
            matrix2.postRotate(90.0f - (180.0f + f6));
            this.A02.setLocalMatrix(matrix2);
            A00(max);
            paint = this.A06;
            paint.setShader(this.A02);
            canvas2.drawPath(path, paint);
            canvas2.restore();
            this.A02.setLocalMatrix(matrix);
            f2 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, (this.A00 - 0.5f) / 0.25f));
        } else {
            float A002 = AnonymousClass0hF.A00((f7 - 0.65f) / 0.1f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f) * 0.5f;
            canvas2.save();
            canvas2.translate(rectF2.width() / 2.0f, rectF2.height() / 2.0f);
            canvas2.rotate(-90.0f);
            Path path2 = this.A08;
            path2.reset();
            RectF rectF4 = this.A0C;
            float f10 = -f6;
            if (BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER < f10) {
                f = ((float) Math.ceil((double) (f10 / 360.0f))) * 360.0f;
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            path2.addArc(rectF4, f10, f + f6);
            A00(18.0f);
            paint = this.A06;
            paint.setColor(-7829368);
            paint.setAlpha((int) (A002 * 255.0f));
            canvas2.drawPath(path2, paint);
            canvas2.restore();
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        canvas2.save();
        canvas2.translate(180.0f, 180.0f);
        float f11 = -(f6 + 180.0f);
        canvas2.rotate(f11);
        Path path3 = this.A09;
        path3.reset();
        path3.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -180.0f);
        Path path4 = path3;
        path4.cubicTo(0.13f, -180.0f, 1.11f, -180.0f, 1.11f, -180.0f);
        path4.cubicTo(1.85f, -179.99f, 2.59f, -179.98f, 3.33f, -179.97f);
        Path path5 = path3;
        path5.cubicTo(101.2f, -178.19f, 180.0f, -98.3f, 180.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        path5.cubicTo(180.0f, 99.41f, 99.41f, 180.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 180.0f);
        path5.cubicTo(-4.97f, 180.0f, -9.0f, 175.97f, -9.0f, 171.0f);
        path3.cubicTo(-9.0f, 166.03f, -4.97f, 162.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 162.0f);
        path3.cubicTo(94.44f, 162.0f, 171.0f, (1.3400002f * f2) + 28.48f + 56.96f, (f2 * -3.0f) + 57.0f + 114.0f, ((3.0f * f2) - 1.5f) - 6.0f);
        path3.cubicTo(171.0f, ((f2 * 4.290001f) - 0.120878905f) - 68.22f, 92.9f, -178.22f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((f2 * 6.0f) - 0.0703125f) - 120.0f);
        path5.cubicTo(-0.74f, -180.01f, 1.85f, -179.99f, 1.11f, -179.99f);
        path4.cubicTo(1.11f, -179.99f, 0.14f, -180.0f, 0.01f, -180.0f);
        path3.lineTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -180.0f);
        path3.close();
        paint.reset();
        paint.setFlags(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(this.A02);
        canvas2.drawPath(path3, paint);
        canvas2.restore();
        if (z) {
            canvas2.restore();
        }
        if (A1W) {
            float f12 = this.A00;
            if (f12 < 0.5f) {
                f3 = (((float) Math.cos((double) (((f12 * 360.0f) * 3.1415927f) / 180.0f))) / 2.0f) + 0.5f;
            } else {
                f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            canvas2.save();
            canvas2.translate(180.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            canvas2.scale(f3, f3);
            Shader shader2 = this.A02;
            Matrix matrix3 = this.A05;
            shader2.getLocalMatrix(matrix3);
            Matrix matrix4 = this.A04;
            matrix4.set(matrix3);
            matrix4.postRotate(f11);
            matrix4.postTranslate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 180.0f);
            this.A02.setLocalMatrix(matrix4);
            paint.reset();
            paint.setFlags(1);
            paint.setStyle(style);
            paint.setShader(this.A02);
            canvas2.drawPath(this.A0A, paint);
            canvas2.restore();
            this.A02.setLocalMatrix(matrix3);
        }
        canvas2.restore();
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86594xv(UserSession userSession, int i) {
        boolean z;
        RectF rectF = new RectF(-9.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 9.0f, 18.0f);
        this.A0H = rectF;
        Path A0G2 = C86144wL.A0G();
        this.A0A = A0G2;
        this.A05 = C86164wN.A0E();
        this.A04 = C86164wN.A0E();
        this.A03 = i;
        if (userSession != null) {
            z = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323238502145772L);
        } else {
            z = false;
        }
        this.A0G = z;
        A0G2.addOval(rectF, Path.Direction.CW);
    }
}
