package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.instagram.barcelona.R;

/* renamed from: X.4yJ  reason: invalid class name */
public final class AnonymousClass4yJ extends Drawable implements C39769Kzd, Drawable.Callback {
    public boolean A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Paint A05;
    public final Path A06;
    public final Drawable A07;
    public final Drawable A08;
    public final String A09;
    public final boolean A0A;

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        C04220Ms.A0B(ktCSuperShape0S2101000_I2, 1);
        Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A062 = C31176Gi6.A06(bitmap, i, i, 0, false);
            C04220Ms.A06(A062);
            int i2 = this.A03;
            int i3 = this.A02;
            int i4 = i2 + i3;
            C13760oG.A00(A062);
            Bitmap createBitmap = Bitmap.createBitmap(A062, (i - i4) >> 1, ((i - i2) >> 1) - i3, i4, i4);
            Path path = this.A06;
            float A012 = C86134wK.A01(i2);
            path.addCircle(A012 + ((float) (i3 >> 1)), A012 + ((float) i3), this.A01, Path.Direction.CCW);
            C86124wJ.A1B(createBitmap, this.A05);
            this.A00 = true;
            invalidateDrawable(this);
        }
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Drawable drawable = this.A07;
        int i = this.A02;
        int i2 = i >> 1;
        int i3 = this.A03;
        int i4 = i2 + i3;
        int i5 = i3 + i;
        drawable.setBounds(i2, i, i4, i5);
        drawable.draw(canvas);
        if (!this.A00 && this.A0A) {
            Drawable drawable2 = this.A08;
            drawable2.setBounds(i2, i, i4, i5);
            drawable2.draw(canvas);
        }
        canvas.drawPath(this.A06, this.A05);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public /* synthetic */ AnonymousClass4yJ(Context context, Drawable drawable, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        i2 = (i5 & 8) != 0 ? R.drawable.instagram_facebook_avatars_filled_44 : i2;
        boolean A1Z = C86154wM.A1Z(i5 & 16, z);
        i3 = (i5 & 32) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) : i3;
        i4 = (i5 & 64) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height) : i4;
        GradientDrawable gradientDrawable = drawable;
        if ((i5 & 128) != 0) {
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, C29929Fwf.A06);
            gradientDrawable2.setShape(1);
            gradientDrawable = gradientDrawable2;
        }
        C04220Ms.A0B(gradientDrawable, 8);
        this.A09 = str;
        this.A0A = A1Z;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = gradientDrawable;
        this.A08 = C19587Ayn.A01(context, i2, context.getColor(R.color.canvas_bottom_sheet_description_text_color));
        this.A06 = C86144wL.A0G();
        this.A05 = C86144wL.A0F();
        this.A02 = context.getResources().getDimensionPixelOffset(i);
        this.A01 = C86134wK.A01(i4);
        C86144wL.A1K(this, C37744K2e.A01(), C18250wR.A0K(this.A09), "STORIES_STICKERS_SEARCH");
    }

    public final int getIntrinsicHeight() {
        return this.A03 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03 + this.A02;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
