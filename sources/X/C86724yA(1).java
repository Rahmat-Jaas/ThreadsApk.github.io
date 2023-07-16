package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4yA  reason: invalid class name and case insensitive filesystem */
public final class C86724yA extends Drawable implements Drawable.Callback {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public Drawable A05;
    public Drawable A06;
    public boolean A07 = false;
    public long A08;
    public Paint A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final Rect A0E;
    public final RectF A0F;
    public final C25812DsR A0G;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private void A00(int i) {
        Context context = this.A0D;
        float A032 = C09860go.A03(context, 12);
        TextPaint textPaint = new TextPaint(1);
        this.A09 = textPaint;
        textPaint.setStrokeWidth((float) this.A0A);
        C86104wH.A18(context, this.A09, i);
        this.A09.setTypeface(C09250f7.A05.A00(context).A03(C09340fG.A0i));
        this.A09.setTextSize(A032);
        this.A09.setTextAlign(Paint.Align.CENTER);
    }

    public final void draw(Canvas canvas) {
        String A022;
        C25812DsR dsR = this.A0G;
        float f = (float) dsR.A09.A00;
        Rect bounds = getBounds();
        float exactCenterX = bounds.exactCenterX() + ((float) bounds.left);
        float exactCenterY = bounds.exactCenterY() + ((float) bounds.top);
        float A012 = AnonymousClass0hF.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 1.0f, 0.7f);
        int A023 = (int) AnonymousClass0hF.A02(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, 255.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (A023 > 0) {
            canvas.save();
            canvas.scale(A012, A012, exactCenterX, exactCenterY);
            Drawable drawable = this.A06;
            canvas.translate(exactCenterX - (((float) C86124wJ.A0A(drawable)) / 2.0f), exactCenterY - (((float) C86134wK.A08(drawable)) / 2.0f));
            drawable.setAlpha(A023);
            drawable.draw(canvas);
            canvas.restore();
        }
        float max = Math.max(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        int A024 = (int) AnonymousClass0hF.A02(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 255.0f);
        if (A024 > 0) {
            canvas.save();
            canvas.scale(max, max, exactCenterX, exactCenterY);
            Drawable drawable2 = this.A06;
            canvas.translate(exactCenterX - (((float) C86124wJ.A0A(drawable2)) / 2.0f), exactCenterY - (((float) C86134wK.A08(drawable2)) / 2.0f));
            drawable2.setAlpha(A024);
            drawable2.draw(canvas);
            canvas.restore();
        }
        int level = getLevel();
        if (level < 1) {
            A022 = "";
        } else {
            int i = this.A03;
            if (level <= i) {
                A022 = String.valueOf(level);
            } else {
                A022 = AnonymousClass00U.A02(i, "+");
            }
        }
        if (!(this.A05 == null && A022 == null)) {
            Paint paint = this.A09;
            int length = A022.length();
            Rect rect = this.A0E;
            paint.getTextBounds(A022, 0, length, rect);
            Drawable drawable3 = this.A05;
            if (drawable3 != null) {
                if (C86124wJ.A0A(drawable3) == 0) {
                    Drawable drawable4 = this.A05;
                    drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), this.A05.getIntrinsicHeight());
                }
                rect.set(this.A05.getBounds());
            } else {
                int i2 = -this.A0C;
                rect.inset(i2, i2);
                if (rect.height() > rect.width()) {
                    rect.inset((rect.height() - rect.width()) / -2, 0);
                }
            }
            float f2 = this.A00;
            if (((float) rect.height()) != f2) {
                rect.inset(0, (int) Math.ceil((double) ((-(f2 - ((float) rect.height()))) / 2.0f)));
            }
            float f3 = this.A00;
            if (((float) rect.width()) < f3) {
                rect.inset((int) Math.ceil((double) ((-(f3 - ((float) rect.width()))) / 2.0f)), 0);
            }
            canvas.save();
            canvas.scale(max, max, exactCenterX, exactCenterY);
            canvas.translate((((float) bounds.right) - (((float) rect.width()) / 2.0f)) + ((float) this.A01), (((float) bounds.top) + (((float) rect.height()) / 2.0f)) - ((float) this.A02));
            RectF rectF = this.A0F;
            rectF.set(((float) rect.width()) / -2.0f, ((float) rect.height()) / -2.0f, ((float) rect.width()) / 2.0f, ((float) rect.height()) / 2.0f);
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.A04);
            if (this.A07) {
                C86134wK.A12(this.A09);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.A09);
                C86134wK.A13(this.A09);
            }
            if (this.A05 != null) {
                canvas.save();
                Rect bounds2 = this.A05.getBounds();
                canvas.translate(((float) (-bounds2.width())) / 2.0f, ((float) (-bounds2.height())) / 2.0f);
                this.A05.draw(canvas);
                canvas.restore();
            } else {
                canvas.drawText(A022, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((this.A09.descent() - this.A09.ascent()) / 2.0f) - this.A09.descent(), this.A09);
            }
            canvas.restore();
        }
        if (!dsR.A0G()) {
            invalidateSelf();
        }
        if (this.A08 == 0) {
            this.A08 = System.currentTimeMillis();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A0B;
    }

    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public C86724yA(Context context, int i) {
        Drawable A012 = C19587Ayn.A01(context, i, context.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color));
        this.A0D = context;
        this.A06 = A012;
        A012.setCallback(this);
        this.A0B = C86144wL.A07(context, 24);
        this.A00 = C09860go.A03(context, 18);
        this.A0C = C86144wL.A07(context, 5);
        this.A01 = C86144wL.A07(context, 8);
        this.A02 = C86144wL.A07(context, 8);
        this.A0A = Math.round(C09860go.A00(context, 2.0f));
        Paint A0C2 = C86114wI.A0C(1);
        this.A04 = A0C2;
        C86134wK.A13(A0C2);
        C86104wH.A18(this.A0D, this.A04, R.color.igds_creation_tools_red);
        this.A0E = C86134wK.A0D();
        this.A0F = C86134wK.A0E();
        Drawable drawable = this.A06;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.A06.getIntrinsicHeight());
        this.A0G = C86134wK.A0O();
        A00(R.color.igds_icon_on_color);
        this.A03 = 99;
    }

    public final void A01() {
        Paint A0C2 = C86114wI.A0C(1);
        this.A04 = A0C2;
        C86134wK.A13(A0C2);
        C86104wH.A18(this.A0D, this.A04, R.color.direct_widget_primary_background);
        A00(R.color.igds_primary_text);
        this.A07 = true;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        float f;
        int[] state = getState();
        int length = state.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (state[i] == 16843518) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        super.onStateChange(iArr);
        int[] state2 = getState();
        int length2 = state2.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                break;
            } else if (state2[i2] == 16843518) {
                z2 = true;
                f = 1.0f;
                break;
            } else {
                i2++;
            }
        }
        long j = this.A08;
        if (j == 0 || C18240wQ.A09(j) < 100) {
            this.A0G.A09((double) f);
        } else {
            this.A0G.A0A((double) f);
        }
        invalidateSelf();
        if (z != z2) {
            return true;
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
