package com.instagram.ui.igeditseekbar;

import X.AnonymousClass006;
import X.AnonymousClass0hF;
import X.C121907Is;
import X.C18240wQ;
import X.C29934Fwk;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.F5W;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

public class IgVerticalChunkySlider extends F5W {
    public int A00;
    public int A01;
    public Paint A02;
    public Integer A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final Rect A0A;
    public final RectF A0B;
    public final RectF A0C;

    /* JADX INFO: finally extract failed */
    private void setSliderProperties(Context context, TypedArray typedArray) {
        try {
            this.A00 = typedArray.getDimensionPixelSize(0, R.dimen.abc_floating_window_z);
            Paint paint = this.A05;
            Context context2 = getContext();
            int i = R.attr.seekBarActiveColor;
            paint.setColor(typedArray.getColor(2, C121907Is.A00(context2, R.attr.seekBarActiveColor)));
            Paint paint2 = this.A06;
            paint2.setColor(typedArray.getColor(3, C121907Is.A00(context2, R.attr.seekBarInactiveColor)));
            this.A04 = typedArray.getBoolean(1, false);
            typedArray.recycle();
            Resources resources = context.getResources();
            Paint paint3 = this.A07;
            paint3.setColor(-1);
            paint3.setShadowLayer((float) this.A00, this.A0C.left, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -12303292);
            Paint.Style style = Paint.Style.FILL;
            paint3.setStyle(style);
            paint.setStyle(style);
            paint2.setStyle(style);
            Paint A0F = C86144wL.A0F();
            this.A02 = A0F;
            int intValue = this.A03.intValue();
            if (intValue == 0) {
                this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                A0F = this.A02;
                A0F.setColor(C121907Is.A00(context2, i));
            } else if (intValue == 1) {
                this.A01 = 0;
                i = R.attr.seekBarTextColor;
                A0F.setColor(C121907Is.A00(context2, i));
            } else if (intValue == 2) {
                this.A01 = 0;
            }
            this.A02.setTextSize((float) resources.getDimensionPixelSize(R.dimen.auth_title_text_size));
            this.A02.setTextAlign(Paint.Align.CENTER);
            this.A02.setTypeface(Typeface.DEFAULT_BOLD);
            this.A02.setAntiAlias(true);
            setLayerType(1, (Paint) null);
        } catch (Throwable th) {
            typedArray.recycle();
            throw th;
        }
    }

    public final float A03(int i) {
        return ((float) i) / ((float) this.A02);
    }

    public final boolean A04() {
        return true;
    }

    public final boolean BZ8(float f, float f2) {
        return true;
    }

    public int getCurrentPositionAsValue() {
        return Math.round(this.A00 * ((float) this.A02));
    }

    public void setActivePaint(int i) {
        C86104wH.A18(getContext(), this.A05, i);
    }

    public void setThumbPaint(int i) {
        C86104wH.A18(getContext(), this.A07, i);
    }

    /* JADX INFO: finally extract failed */
    public IgVerticalChunkySlider(Context context, AttributeSet attributeSet) {
        super(C121907Is.A03(context, R.attr.seekBarStyle), attributeSet);
        int i;
        this.A0B = C86134wK.A0E();
        this.A0C = C86134wK.A0E();
        this.A08 = C86144wL.A0G();
        this.A06 = C86114wI.A0C(1);
        this.A05 = C86114wI.A0C(1);
        this.A07 = C86114wI.A0C(1);
        this.A0A = C86134wK.A0D();
        this.A09 = C86144wL.A0G();
        Context context2 = getContext();
        int[] iArr = C29934Fwk.A10;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr);
        try {
            int i2 = obtainStyledAttributes.getInt(4, 0);
            for (Integer num : C18240wQ.A1Z()) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    this.A03 = num;
                    obtainStyledAttributes.recycle();
                    setSliderProperties(context, context.obtainStyledAttributes(attributeSet, iArr));
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void A00(Canvas canvas, float f, float f2) {
        String valueOf = String.valueOf(getCurrentPositionAsValue());
        this.A02.getTextBounds(valueOf, 0, valueOf.length(), this.A0A);
        canvas.drawText(valueOf, f, f2, this.A02);
        invalidate();
    }

    public int getLengthPx() {
        return getHeight();
    }

    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        Integer num = this.A03;
        if (num == AnonymousClass006.A00) {
            A00(canvas, ((float) width) / 2.0f, (float) this.A0A.height());
        }
        RectF rectF = this.A0B;
        float f = (float) width;
        float f2 = (float) height;
        rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A01, f, f2);
        if (this.A04) {
            rectF.inset(0.05f * f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        } else {
            Path path = this.A08;
            path.reset();
            float f3 = (float) this.A00;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
        }
        int i = this.A01;
        float f4 = (float) (height - i);
        rectF.bottom = ((float) i) + ((1.0f - this.A00) * f4);
        if (this.A04) {
            Path path2 = this.A09;
            path2.reset();
            path2.moveTo(rectF.left, rectF.bottom);
            path2.lineTo(rectF.left, rectF.top + ((float) this.A00));
            float f5 = rectF.left;
            float f6 = rectF.top;
            path2.quadTo(f5, f6, ((float) this.A00) + f5, f6);
            path2.lineTo(rectF.right - ((float) this.A00), rectF.top);
            float f7 = rectF.right;
            float f8 = rectF.top;
            path2.quadTo(f7, f8, f7, ((float) this.A00) + f8);
            path2.lineTo(rectF.right, rectF.bottom);
            path2.lineTo(rectF.left, rectF.bottom);
            canvas.drawPath(path2, this.A06);
        } else {
            canvas.drawRect(rectF, this.A06);
        }
        rectF.top = ((float) this.A01) + ((1.0f - this.A00) * f4);
        rectF.bottom = f2;
        if (this.A04) {
            Path path3 = this.A09;
            path3.reset();
            path3.moveTo(rectF.left, rectF.top);
            path3.lineTo(rectF.right, rectF.top);
            path3.lineTo(rectF.right, Math.max(rectF.top, rectF.bottom - ((float) this.A00)));
            float f9 = rectF.right;
            float f10 = rectF.bottom;
            path3.quadTo(f9, f10, f9 - ((float) this.A00), f10);
            path3.lineTo(rectF.left + ((float) this.A00), rectF.bottom);
            float f11 = rectF.left;
            float f12 = rectF.bottom;
            path3.quadTo(f11, f12, f11, Math.max(rectF.top, f12 - ((float) this.A00)));
            path3.lineTo(rectF.left, rectF.top);
            canvas.drawPath(path3, this.A05);
        } else {
            canvas.drawRect(rectF, this.A05);
        }
        if (num == AnonymousClass006.A01) {
            A00(canvas, f / 2.0f, 0.9f * f2);
        }
        if (this.A04) {
            float f13 = f4 * 0.04f;
            RectF rectF2 = this.A0C;
            rectF2.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            rectF2.right = f;
            float A002 = AnonymousClass0hF.A00(((float) ((int) rectF.top)) - (f13 / 2.0f), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2 - f13);
            rectF2.top = A002;
            rectF2.bottom = A002 + f13;
            float f14 = (float) this.A00;
            canvas.drawRoundRect(rectF2, f14, f14, this.A07);
        }
    }

    public IgVerticalChunkySlider(Context context) {
        this(context, (AttributeSet) null);
    }
}
