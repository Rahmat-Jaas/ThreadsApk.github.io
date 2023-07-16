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

/* renamed from: X.4xo  reason: invalid class name and case insensitive filesystem */
public final class C86524xo extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E = C86134wK.A0E();
    public final RectF A0F = C86134wK.A0E();
    public final Drawable A0G;
    public final F10 A0H;

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        int i;
        Paint paint;
        if (this.A00) {
            i = (int) (C18190wL.A07() % 4);
        } else {
            i = 0;
        }
        RectF rectF = this.A0F;
        float f = (float) this.A08;
        canvas.drawRoundRect(rectF, f, f, this.A0D);
        this.A0H.draw(canvas);
        canvas.save();
        for (int i2 = 0; i2 < 3; i2++) {
            RectF rectF2 = this.A0E;
            float f2 = (float) this.A03;
            if (i2 == i || (i == 3 && i2 == 1)) {
                paint = this.A0B;
            } else {
                paint = this.A0C;
            }
            canvas.drawRoundRect(rectF2, f2, f2, paint);
            this.A0G.draw(canvas);
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (this.A04 + this.A07));
        }
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return this.A0A + this.A0H.A04 + this.A09 + ((this.A07 + this.A04) * 3) + this.A02;
    }

    public final int getIntrinsicWidth() {
        return (this.A02 << 1) + this.A01;
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        this.A0C.setAlpha(i);
        this.A0B.setAlpha(i);
        this.A0H.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        int i6 = this.A02;
        int i7 = this.A01;
        float f2 = (float) ((i6 << 1) + i7);
        float intrinsicHeight = (float) getIntrinsicHeight();
        float f3 = f - (f2 / 2.0f);
        float f4 = (((float) (i2 + i4)) / 2.0f) - (intrinsicHeight / 2.0f);
        F10 f10 = this.A0H;
        float f5 = (float) f10.A07;
        int i8 = this.A0A;
        float f6 = (float) (i8 + f10.A04 + this.A09);
        float descent = f10.A0R.descent();
        this.A0F.set(f3, f4, f2 + f3, intrinsicHeight + f4);
        float f7 = ((float) i6) + f3;
        float f8 = ((float) this.A07) + f6 + f4;
        this.A0E.set(f7, f8, f7 + ((float) i7), ((float) this.A04) + f8);
        Drawable drawable = this.A0G;
        float f9 = (float) this.A05;
        float f11 = f7 + f9;
        float f12 = f9 + f8;
        float f13 = (float) this.A06;
        drawable.setBounds((int) f11, (int) f12, (int) (f11 + f13), (int) (f12 + f13));
        float f14 = f5 / 2.0f;
        float f15 = descent / 2.0f;
        f10.setBounds((int) (f - f14), (int) (((float) i8) + f4 + f15), (int) (f + f14), (int) ((f4 + f6) - f15));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
        this.A0B.setColorFilter(colorFilter);
        this.A0H.setColorFilter(colorFilter);
    }

    public C86524xo(Context context, UserSession userSession) {
        Context context2 = context;
        Resources resources = context.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A0A = resources.getDimensionPixelSize(AnonymousClass6UO.A00().booleanValue() ? R.dimen.abc_action_bar_elevation_material : R.dimen.abc_button_padding_horizontal_material);
        this.A09 = resources.getDimensionPixelSize(AnonymousClass6UO.A00().booleanValue() ? R.dimen.abc_action_bar_elevation_material : R.dimen.abc_control_corner_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        this.A04 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.audition_flow_footer_button_min_width);
        this.A07 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audition_audio_item_selected_stroke_border_width);
        this.A06 = C18250wR.A00(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.audition_audio_item_selected_stroke_border_width);
        Paint A0C2 = C86114wI.A0C(1);
        this.A0D = A0C2;
        C86104wH.A18(context, A0C2, R.color.canvas_bottom_sheet_description_text_color);
        Paint A0C3 = C86114wI.A0C(1);
        this.A0C = A0C3;
        C86104wH.A18(context, A0C3, R.color.chat_sticker_button_divider_color);
        float f = (float) dimensionPixelSize;
        A0C3.setStrokeWidth(f);
        C86134wK.A12(A0C3);
        Paint A0C4 = C86114wI.A0C(1);
        this.A0B = A0C4;
        AnonymousClass6UO.A00();
        int i = R.color.igds_active_badge;
        C86104wH.A18(context, A0C4, R.color.igds_active_badge);
        A0C4.setStrokeWidth(f);
        A0C4.setStyle(Paint.Style.FILL_AND_STROKE);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
        F10 A0T = C86164wN.A0T(context, (this.A02 << 1) + this.A01);
        this.A0H = A0T;
        A0T.A0O(resources.getString(2131833990));
        C86154wM.A19(context, A0T, !AnonymousClass6UO.A00().booleanValue() ? R.color.countdown_sticker_title_text_color : i);
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        A0T.A0C(0.0625f);
        C31167Ghl.A04(context2, userSession, A0T, (float) dimensionPixelSize2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        Drawable drawable = context.getDrawable(R.drawable.circle_check_filled_8);
        this.A0G = drawable;
        C63393hP.A03(context, drawable.mutate(), R.color.canvas_bottom_sheet_description_text_color);
    }
}
