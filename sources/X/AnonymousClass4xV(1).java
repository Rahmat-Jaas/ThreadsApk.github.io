package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.4xV  reason: invalid class name */
public final class AnonymousClass4xV extends Drawable {
    public List A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final RectF A08;
    public final C86604xw A09;
    public final float[] A0A;
    public final int[] A0B;

    public AnonymousClass4xV(Context context, boolean z) {
        int[] iArr;
        float[] fArr;
        C86604xw r0;
        boolean A052 = C63173fJ.A05(AnonymousClass0TJ.A06, 18301796246621212L);
        Paint A0F = C86144wL.A0F();
        C86104wH.A18(context, A0F, C86104wH.A0G(context, R.attr.fastScrubberLineColor).resourceId);
        A0F.setAntiAlias(true);
        this.A07 = A0F;
        Paint A0F2 = C86144wL.A0F();
        C86104wH.A18(context, A0F2, C86104wH.A0G(context, R.attr.fastScrubberDotColor).resourceId);
        A0F2.setAntiAlias(true);
        if (A052) {
            C86104wH.A18(context, A0F2, R.color.igds_creation_tools_pink);
        }
        A0F2.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        C86134wK.A12(A0F2);
        this.A06 = A0F2;
        this.A08 = C86134wK.A0E();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = dimensionPixelSize;
        float A012 = C86134wK.A01(dimensionPixelSize);
        this.A01 = A012;
        float A013 = (float) C18220wO.A01(context, R.dimen.abc_control_corner_material);
        this.A02 = A013;
        float dimension = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A03 = dimension;
        if (A052) {
            iArr = new int[]{context.getColor(R.color.igds_creation_tools_pink), context.getColor(R.color.igds_creation_tools_pink)};
        } else {
            iArr = new int[5];
            C25703DqR.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        }
        this.A0B = iArr;
        if (A052) {
            fArr = new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
        } else {
            fArr = new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.27f, 0.51f, 0.75f, 1.0f};
        }
        this.A0A = fArr;
        Paint A0F3 = C86144wL.A0F();
        float f = -A013;
        A0F3.setShader(new LinearGradient(f, f, A013, f, iArr, fArr, Shader.TileMode.CLAMP));
        this.A05 = A0F3;
        this.A00 = AnonymousClass0ZV.A00;
        if (z) {
            r0 = new C86604xw(C09860go.A03(context, 1), dimension, A012, C86604xw.A00(context, dimension));
        } else {
            r0 = null;
        }
        this.A09 = r0;
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        C86604xw r0 = this.A09;
        if (r0 != null) {
            r0.draw(canvas);
        }
        RectF rectF = this.A08;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A07);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            canvas.save();
            float f2 = this.A02;
            canvas.translate((C18240wQ.A00(this.A00.get(i)) * rectF.width()) - f2, rectF.centerY());
            canvas.drawCircle(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, this.A06);
            canvas.drawCircle(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, this.A05);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = (float) rect.left;
        float centerY = (float) rect.centerY();
        float A012 = C86134wK.A01(this.A04);
        rectF.set(f, centerY - A012, (float) rect.right, ((float) rect.centerY()) + A012);
        C86604xw r2 = this.A09;
        if (r2 != null) {
            float f2 = rectF.left;
            float f3 = this.A03;
            AnonymousClass8bA.A05(rectF, r2, f2, f3, f3);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        this.A07.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        C86604xw r0 = this.A09;
        if (!(r0 == null || (mutate = r0.mutate()) == null)) {
            mutate.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }
}
