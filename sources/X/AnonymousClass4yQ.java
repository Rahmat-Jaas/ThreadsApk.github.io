package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;

/* renamed from: X.4yQ  reason: invalid class name */
public final class AnonymousClass4yQ extends Drawable implements C33680HsR {
    public Drawable A00;
    public Integer A01;
    public float A02;
    public final Context A03;
    public final Paint A04;

    public final float AZz() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final void CjT(float f) {
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        if (this.A01 != AnonymousClass006.A0C) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), this.A02, this.A04);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        this.A02 = ((float) Math.min(C86134wK.A08(this), C86124wJ.A0A(this))) / ((float) 5);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(A00(rect));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4yQ(Context context) {
        this.A03 = context;
        Paint A0F = C86144wL.A0F();
        C86104wH.A18(context, A0F, R.color.igds_secondary_button_on_media);
        this.A04 = A0F;
        this.A01 = AnonymousClass006.A0C;
        this.A01 = AnonymousClass006.A00;
        Rect bounds = getBounds();
        C04220Ms.A06(bounds);
        Rect A002 = A00(bounds);
        Context context2 = this.A03;
        Drawable drawable = context2.getDrawable(R.drawable.instagram_pause_pano_filled_24);
        if (drawable != null) {
            C63393hP.A03(context2, drawable, R.color.canvas_bottom_sheet_description_text_color);
            drawable.setBounds(A002);
            this.A00 = drawable;
            invalidateSelf();
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final Rect A00(Rect rect) {
        int min = Math.min(rect.height(), rect.width()) / 5;
        int height = rect.top + ((rect.height() - min) >> 1);
        int width = rect.left + ((rect.width() - min) >> 1);
        return C86164wN.A0F(width, height, width + min, min + height);
    }
}
