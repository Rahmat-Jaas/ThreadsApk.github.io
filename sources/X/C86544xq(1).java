package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4xq  reason: invalid class name and case insensitive filesystem */
public final class C86544xq extends Drawable {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final float A03 = 0.25f;
    public final float A04 = 0.75f;
    public final int A05 = 2;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final UserSession A0H;
    public final F10 A0I;

    public C86544xq(Context context, UserSession userSession) {
        this.A02 = context;
        this.A0H = userSession;
        this.A06 = C18220wO.A01(context, R.dimen.abc_button_inset_vertical_material);
        this.A00 = C18220wO.A01(this.A02, R.dimen.abc_button_inset_vertical_material);
        this.A0B = C18220wO.A01(this.A02, R.dimen.abc_button_inset_vertical_material);
        this.A0A = C18220wO.A01(this.A02, R.dimen.account_recs_header_image_margin);
        this.A07 = C18220wO.A01(this.A02, R.dimen.abc_edit_text_inset_bottom_material);
        this.A08 = C18220wO.A01(this.A02, R.dimen.abc_edit_text_inset_top_material);
        this.A01 = C18220wO.A01(this.A02, R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A09 = C18220wO.A01(this.A02, R.dimen.abc_button_inset_vertical_material);
        int A012 = C18220wO.A01(this.A02, R.dimen.autofill_optimization_title_top_margin);
        Paint A0C2 = C86114wI.A0C(1);
        C86104wH.A18(context, A0C2, R.color.canvas_bottom_sheet_description_text_color);
        this.A0C = A0C2;
        Paint A0C3 = C86114wI.A0C(1);
        C86104wH.A18(context, A0C3, R.color.poll_v2_sticker_tray_answer_row);
        A0C3.setStrokeWidth((float) A012);
        A0C3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0D = A0C3;
        Paint A0C4 = C86114wI.A0C(1);
        C86104wH.A18(context, A0C4, R.color.canvas_bottom_sheet_description_text_color);
        C86134wK.A13(A0C4);
        this.A0E = A0C4;
        this.A0F = C86134wK.A0E();
        this.A0G = C86134wK.A0E();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
        F10 A0T = C86164wN.A0T(context, (this.A00 << 1) + this.A01);
        this.A0I = A0T;
        A0T.A0O(resources.getString(2131832617));
        C86154wM.A19(context, A0T, R.color.clips_remix_camera_outer_container_default_background);
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        A0T.A0C(0.0625f);
        C31167Ghl.A05(context, A0T, (float) dimensionPixelSize, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A0F;
        float f = (float) this.A06;
        canvas.drawRoundRect(rectF, f, f, this.A0C);
        this.A0I.draw(canvas);
        canvas.save();
        RectF rectF2 = this.A0G;
        float f2 = (float) this.A07;
        Paint paint = this.A0D;
        canvas.drawRoundRect(rectF2, f2, f2, paint);
        float f3 = rectF2.left;
        float f4 = this.A03;
        float f5 = (float) this.A01;
        canvas.clipRect(f3 + (f4 * f5), rectF2.top, rectF2.right, rectF2.bottom);
        Paint paint2 = this.A0E;
        canvas.drawRoundRect(rectF2, f2, f2, paint2);
        canvas.restore();
        canvas.save();
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (this.A08 + this.A09));
        canvas.drawRoundRect(rectF2, f2, f2, paint);
        canvas.clipRect(rectF2.left + (this.A04 * f5), rectF2.top, rectF2.right, rectF2.bottom);
        canvas.drawRoundRect(rectF2, f2, f2, paint2);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A0B + this.A0I.A04 + this.A0A + ((this.A09 + this.A08) * this.A05) + this.A00;
    }

    public final int getIntrinsicWidth() {
        return (this.A00 << 1) + this.A01;
    }

    public final void setAlpha(int i) {
        this.A0C.setAlpha(i);
        this.A0D.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0I.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        int i6 = this.A00;
        int i7 = this.A01;
        float f2 = (float) ((i6 << 1) + i7);
        float intrinsicHeight = (float) getIntrinsicHeight();
        float f3 = f - (f2 / 2.0f);
        float f4 = (((float) (i2 + i4)) / 2.0f) - (intrinsicHeight / 2.0f);
        F10 f10 = this.A0I;
        float f5 = (float) f10.A07;
        int i8 = this.A0B;
        float f6 = (float) (i8 + f10.A04 + this.A0A);
        float descent = f10.A0R.descent();
        this.A0F.set(f3, f4, f2 + f3, intrinsicHeight + f4);
        float f7 = ((float) i6) + f3;
        float f8 = ((float) this.A09) + f6 + f4;
        this.A0G.set(f7, f8, f7 + ((float) i7), ((float) this.A08) + f8);
        float f9 = f5 / 2.0f;
        float f11 = descent / 2.0f;
        f10.setBounds((int) (f - f9), (int) (((float) i8) + f4 + f11), (int) (f + f9), (int) ((f4 + f6) - f11));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0C.setColorFilter(colorFilter);
        this.A0D.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A0I.setColorFilter(colorFilter);
    }
}
