package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.4y9  reason: invalid class name and case insensitive filesystem */
public final class C86714y9 extends Drawable implements Drawable.Callback {
    public int A00 = 0;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final Drawable A08;
    public final C86294xP A09;

    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i) {
        String str;
        if (i >= 0) {
            str = String.valueOf(i + 1);
        } else {
            str = null;
        }
        this.A01 = str;
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.A09.setBounds(0, 0, rect.width(), rect.height());
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A07.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A07.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C86714y9(Context context) {
        Paint A0C = C86114wI.A0C(1);
        this.A07 = A0C;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A06 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A05 = resources.getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
        this.A03 = context.getColor(R.color.default_cta_dominate_color);
        this.A02 = context.getColor(R.color.gallery_item_selection_circle_default_color);
        C86294xP r0 = new C86294xP(context.getColor(R.color.gallery_item_selection_circle_shadow_color), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
        this.A09 = r0;
        r0.setCallback(this);
        Drawable drawable = context.getDrawable(R.drawable.checkmark);
        this.A08 = drawable;
        C86154wM.A1B(PorterDuff.Mode.SRC_ATOP, drawable, -1);
        A0C.setTextAlign(Paint.Align.CENTER);
    }

    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        canvas.save();
        C86134wK.A11(canvas, bounds);
        this.A09.draw(canvas);
        float A012 = C86134wK.A01(bounds.width());
        Paint paint = this.A07;
        C86134wK.A13(paint);
        if (this.A01 != null) {
            i = this.A03;
        } else {
            i = this.A02;
        }
        paint.setColor(i);
        canvas.drawCircle(A012, A012, A012, paint);
        paint.setColor(-1);
        int i2 = this.A06;
        String str = this.A01;
        if (str != null && Integer.parseInt(str) >= 10) {
            i2 = this.A05;
        }
        float f = (float) i2;
        paint.setTextSize(f);
        String str2 = this.A01;
        if (str2 != null) {
            if (this.A00 == 0) {
                canvas.drawText(str2, A012, (f / 3.0f) + A012, paint);
            } else {
                int i3 = i2 >> 1;
                int i4 = (int) A012;
                Drawable drawable = this.A08;
                int i5 = i4 - i3;
                int i6 = i4 + i3;
                drawable.setBounds(i5, i5, i6, i6);
                drawable.draw(canvas);
            }
        }
        C86134wK.A12(paint);
        paint.setStrokeWidth((float) this.A04);
        canvas.drawCircle(A012, A012, A012, paint);
        C86134wK.A13(paint);
        canvas.restore();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
