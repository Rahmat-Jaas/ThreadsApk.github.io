package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.direct.ui.DirectShareShimmerView;

/* renamed from: X.4xN  reason: invalid class name */
public final class AnonymousClass4xN extends Drawable {
    public final float A00;
    public final float A01 = (100.0f * this.A08);
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final RectF A0A;
    public final /* synthetic */ DirectShareShimmerView A0B;

    public AnonymousClass4xN(Resources resources, DirectShareShimmerView directShareShimmerView) {
        this.A0B = directShareShimmerView;
        Paint A0C = C86114wI.A0C(1);
        this.A09 = A0C;
        C86134wK.A13(A0C);
        C86104wH.A18(directShareShimmerView.getContext(), A0C, R.color.grey_1);
        this.A08 = resources.getDisplayMetrics().density;
        Resources resources2 = directShareShimmerView.getResources();
        float dimension = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A07 = dimension;
        float f = (float) 2;
        float f2 = dimension / f;
        this.A02 = resources2.getDimension(R.dimen.abc_edit_text_inset_top_material) + f2;
        this.A03 = f2;
        this.A04 = resources2.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) / f;
        this.A00 = resources2.getDimension(R.dimen.account_section_text_margin_horizontal);
        this.A06 = resources2.getDimension(R.dimen.accent_edge_thickness);
        this.A05 = resources2.getDimension(R.dimen.autofill_optimization_title_top_margin);
        this.A0A = C86134wK.A0E();
    }

    public final int getOpacity() {
        return -3;
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
        Rect A0D = C86114wI.A0D(this, canvas);
        float f = (float) A0D.top;
        while (true) {
            float f2 = this.A07;
            if (f2 + f < ((float) A0D.bottom)) {
                float width = (float) A0D.width();
                float f3 = this.A02;
                float f4 = this.A04;
                Paint paint = this.A09;
                canvas.drawCircle(f3, this.A03 + f, f4, paint);
                RectF rectF = this.A0A;
                float f5 = f3 + f4 + this.A00;
                float f6 = f2 / ((float) 3);
                float f7 = this.A05;
                float f8 = this.A01;
                float f9 = this.A06;
                rectF.set(f5, (f6 - f7) + f, width - f8, f6 + f9 + f);
                canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                float f10 = (float) 2;
                float f11 = f6 * f10;
                rectF.set(f5, (f11 - f9) + f, width - (f8 * f10), f11 + f7 + f);
                canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
                f += f2;
            } else {
                return;
            }
        }
    }
}
