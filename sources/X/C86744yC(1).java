package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.4yC  reason: invalid class name and case insensitive filesystem */
public final class C86744yC extends Drawable implements Drawable.Callback, C33464HoJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;
    public final Path A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final F10 A0E;
    public final F10 A0F;

    public final String BFb() {
        return C28174Ezk.A00(820);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public C86744yC(Context context, TargetViewSizeProvider targetViewSizeProvider) {
        Path A0G = C86144wL.A0G();
        this.A0B = A0G;
        Paint A0C2 = C86114wI.A0C(1);
        this.A09 = A0C2;
        Paint A0C3 = C86114wI.A0C(1);
        this.A0A = A0C3;
        int width = targetViewSizeProvider.getWidth();
        Context context2 = context;
        int height = targetViewSizeProvider.getHeight() - C18240wQ.A01(context2, 56);
        int i = (int) (((float) width) * 0.75f);
        this.A08 = i;
        float f = (float) i;
        float f2 = f;
        int i2 = (int) (f / 0.75f);
        this.A00 = i2;
        this.A03 = (width - i) / 2;
        this.A04 = (height - i2) / 2;
        int A012 = C18240wQ.A01(context2, 16);
        this.A05 = A012;
        this.A07 = C18240wQ.A01(context2, 8);
        int A013 = C18240wQ.A01(context2, 12);
        this.A01 = A013;
        this.A02 = C18240wQ.A01(context2, 4);
        this.A06 = C18240wQ.A01(context2, 2);
        float A032 = C09860go.A03(context2, 12);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        float f3 = (float) i2;
        float f4 = f3;
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, f3);
        float[] fArr = new float[8];
        fArr[0] = A032;
        fArr[1] = A032;
        fArr[2] = A032;
        fArr[3] = A032;
        C86114wI.A11(A0G, rectF, fArr, A032);
        int[] iArr = {context2.getColor(R.color.voting_info_center_background_start), context2.getColor(R.color.voting_info_center_background_center), context2.getColor(R.color.voting_info_sticker_gradient_end)};
        float[] fArr2 = {BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.5f, 1.0f};
        Paint paint = A0C2;
        paint.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f4, f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr, fArr2, Shader.TileMode.CLAMP));
        float A033 = C09860go.A03(context2, 16);
        int color = context2.getColor(R.color.black_30_transparent);
        A0C3.setColor(color);
        A0C3.setShadowLayer(A033, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, color);
        Drawable drawable = context2.getDrawable(R.drawable.instagram_election_pin_filled_24);
        this.A0D = drawable;
        drawable.setCallback(this);
        C86124wJ.A1C(drawable);
        C63393hP.A03(context2, drawable, R.color.design_dark_default_color_on_background);
        int i3 = i - (A012 << 1);
        F10 A0T = C86164wN.A0T(context2, i3);
        this.A0F = A0T;
        A0T.A0B(C09860go.A03(context2, 26));
        A0T.A0D(C09860go.A02(context2, 2.0f), 1.0f);
        A0T.A0L(Typeface.SANS_SERIF, 1);
        A0T.A0H(-1);
        A0T.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0T.A0M(alignment);
        A0T.A0I(3, "…");
        A0T.A0O(context2.getResources().getString(2131838000));
        Drawable drawable2 = context2.getDrawable(R.drawable.ig_logo);
        this.A0C = drawable2;
        drawable2.setCallback(this);
        C63393hP.A03(context2, drawable2, R.color.design_dark_default_color_on_background);
        drawable2.setBounds(0, 0, A013, A013);
        Typeface A0C4 = C86154wM.A0C(context2);
        F10 A0T2 = C86164wN.A0T(context2, i3);
        this.A0E = A0T2;
        A0T2.A0B(C09860go.A03(context2, 14));
        A0T2.A0K(A0C4);
        A0T2.A0H(-1);
        A0T2.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, argb);
        A0T2.A0M(alignment);
        A0T2.A0O(context2.getResources().getString(2131837999));
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        int i = this.A03;
        int i2 = this.A04;
        canvas.translate((float) i, (float) i2);
        Path path = this.A0B;
        canvas.drawPath(path, this.A0A);
        canvas.drawPath(path, this.A09);
        int i3 = this.A05;
        float f = (float) i3;
        canvas.translate(f, f);
        this.A0D.draw(canvas);
        canvas.restore();
        canvas.save();
        float f2 = (float) (i + i3);
        int i4 = (i2 + this.A00) - i3;
        int i5 = this.A01;
        canvas.translate(f2, (float) (i4 - i5));
        this.A0C.draw(canvas);
        canvas.translate((float) (i5 + this.A02), (float) (-this.A06));
        F10 f10 = this.A0E;
        f10.draw(canvas);
        canvas.restore();
        canvas.save();
        F10 f102 = this.A0F;
        canvas.translate(f2, (float) (((i4 - f10.A04) - this.A07) - f102.A04));
        f102.draw(canvas);
        canvas.restore();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
