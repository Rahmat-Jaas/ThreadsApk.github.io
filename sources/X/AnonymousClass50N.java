package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.50N  reason: invalid class name */
public final class AnonymousClass50N extends View {
    public int A00;
    public C110446lh A01;
    public float[] A02;
    public float A03;
    public final int A04;
    public final int A05 = C86164wN.A0D(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;

    public final void onDraw(Canvas canvas) {
        C110446lh r5;
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        Paint paint = this.A0C;
        paint.setColor(this.A09);
        float f = this.A03;
        int i = this.A04;
        canvas.drawLine(f, (float) i, f, (float) (i + this.A00), paint);
        float[] fArr = this.A02;
        if (fArr != null && (r5 = this.A01) != null) {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                paint.setColor(this.A0A);
                canvas.drawCircle(this.A03, fArr[i2], (float) this.A08, paint);
                paint.setColor(((C107956ha) C18220wO.A0S(r5.A04).get(i2)).A01);
                canvas.drawCircle(this.A03, fArr[i2], (float) this.A07, paint);
            }
        }
    }

    public AnonymousClass50N(Context context) {
        super(context);
        Paint A0F = C86144wL.A0F();
        this.A0C = A0F;
        C86134wK.A13(A0F);
        A0F.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        this.A04 = C86114wI.A05(context);
        this.A08 = C86124wJ.A09(context);
        this.A07 = C86144wL.A06(context);
        this.A09 = context.getColor(R.color.igds_secondary_text);
        this.A0A = context.getColor(R.color.direct_widget_primary_background);
        this.A06 = C86114wI.A05(context);
        this.A0B = C86124wJ.A08(context);
    }

    public final void onMeasure(int i, int i2) {
        C110446lh r7;
        float f;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.A04;
        this.A00 = (measuredHeight - i3) - this.A05;
        C110446lh r6 = this.A01;
        if (r6 != null) {
            int i4 = this.A0B;
            int i5 = r6.A03;
            float measuredWidth = (((float) ((getMeasuredWidth() - this.A06) - i4)) * 1.0f) / ((float) (i5 - 1));
            float[] fArr = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                fArr[i6] = ((float) i6) * measuredWidth;
            }
            this.A03 = fArr[r6.A02] + ((float) i4);
        }
        float[] fArr2 = this.A02;
        if (fArr2 != null && (r7 = this.A01) != null) {
            int length = fArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                float f2 = (float) i3;
                int i8 = this.A00;
                float f3 = ((C107956ha) C18220wO.A0S(r7.A04).get(i7)).A00;
                float f4 = r7.A01;
                float f5 = r7.A00;
                if (f5 < f4) {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                } else {
                    f = ((float) i8) * (((f5 - f3) * 1.0f) / (f5 - f4));
                }
                fArr2[i7] = f2 + f;
            }
        }
    }
}
