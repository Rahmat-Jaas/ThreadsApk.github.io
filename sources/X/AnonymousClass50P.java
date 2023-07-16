package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.50P  reason: invalid class name */
public final class AnonymousClass50P extends View {
    public float A00;
    public int A01;
    public int A02;
    public float[] A03;
    public String[] A04;
    public float[] A05;
    public String[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Path A0A = C86144wL.A0G();
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        float[] fArr = this.A03;
        String str = "yMarksPositions";
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String[] strArr = this.A06;
                    if (strArr != null) {
                        String str2 = strArr[i2];
                        float f = (float) this.A0D;
                        float[] fArr2 = this.A03;
                        if (fArr2 == null) {
                            break;
                        }
                        canvas.drawText(str2, f, fArr2[i2] + ((float) 10), this.A0G);
                        i2++;
                    } else {
                        str = "yMarks";
                        break;
                    }
                } else {
                    canvas.drawPath(this.A0A, this.A0E);
                    int length2 = getXMarksPositions().length;
                    while (i < length2) {
                        String[] strArr2 = this.A04;
                        if (strArr2 == null) {
                            str = "xMarks";
                        } else {
                            canvas.drawText(strArr2[i], getXMarksPositions()[i] + ((float) (this.A0B >> 1)), this.A00, this.A0F);
                            i++;
                        }
                    }
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setRulersAndMarks(C107946hZ r3) {
        C04220Ms.A0B(r3, 0);
        String[] strArr = r3.A01;
        this.A06 = strArr;
        String[] strArr2 = r3.A00;
        this.A04 = strArr2;
        this.A03 = new float[strArr.length];
        this.A05 = new float[strArr2.length];
    }

    public final float[] getXMarksPositions() {
        float[] fArr = this.A05;
        if (fArr != null) {
            return fArr;
        }
        C04220Ms.A0E("xMarksPositions");
        throw null;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        float f;
        super.onMeasure(i, i2);
        int i5 = this.A07;
        this.A01 = (getMeasuredHeight() - this.A0C) - i5;
        this.A02 = getMeasuredWidth() - this.A0B;
        Path path = this.A0A;
        path.reset();
        float[] fArr = this.A03;
        String str = "yMarksPositions";
        if (fArr != null) {
            int length = fArr.length;
            float f2 = ((float) this.A01) * 1.0f;
            if (length > 1) {
                float f3 = f2 / ((float) (length - 1));
                int i6 = 0;
                while (true) {
                    i4 = this.A09;
                    float f4 = ((float) i4) + (((float) i6) * f3);
                    float[] fArr2 = this.A03;
                    if (fArr2 == null) {
                        break;
                    }
                    fArr2[i6] = f4;
                    i3 = this.A08;
                    f = (float) i3;
                    path.moveTo(f, f4);
                    path.lineTo((float) this.A02, f4);
                    i6++;
                    if (i6 >= length) {
                        break;
                    }
                }
            } else {
                i4 = this.A09;
                float f5 = ((float) i4) + (f2 / ((float) 2));
                fArr[0] = f5;
                i3 = this.A08;
                f = (float) i3;
                path.moveTo(f, f5);
                float f6 = (float) this.A02;
                float[] fArr3 = this.A03;
                if (fArr3 != null) {
                    path.lineTo(f6, fArr3[0]);
                }
            }
            this.A00 = (float) (this.A01 + i5 + i4);
            float f7 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            String[] strArr = this.A04;
            str = "xMarks";
            if (strArr != null) {
                for (String length2 : strArr) {
                    f7 += (float) length2.length();
                }
                float f8 = ((((float) (this.A02 - i3)) - f7) * 1.0f) / ((float) (r3 - 1));
                for (int i7 = 0; i7 < r3; i7++) {
                    getXMarksPositions()[i7] = (((float) i7) * f8) + f;
                }
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public AnonymousClass50P(Context context) {
        super(context);
        Paint A0F2 = C86144wL.A0F();
        this.A0G = A0F2;
        Paint A0F3 = C86144wL.A0F();
        this.A0F = A0F3;
        Paint A0F4 = C86144wL.A0F();
        this.A0E = A0F4;
        A0F4.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
        C86104wH.A18(context, A0F4, R.color.igds_separator);
        C86134wK.A12(A0F4);
        C86104wH.A18(context, A0F2, R.color.igds_secondary_text);
        A0F2.setTextSize((float) context.getResources().getDimensionPixelSize(R.dimen.countdown_sticker_consumption_sheet_subtitle_text_size));
        A0F2.setTextAlign(Paint.Align.RIGHT);
        C86104wH.A18(context, A0F3, R.color.igds_secondary_text);
        A0F3.setTextSize((float) C18220wO.A01(context, R.dimen.countdown_sticker_consumption_sheet_subtitle_text_size));
        A0F3.setTextAlign(Paint.Align.CENTER);
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        this.A08 = dimensionPixelSize;
        this.A0D = dimensionPixelSize - C86124wJ.A09(context2);
        int A052 = C86114wI.A05(context2);
        this.A0C = A052;
        this.A09 = A052;
        this.A07 = context2.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0B = C86114wI.A05(context);
    }
}
