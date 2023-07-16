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

/* renamed from: X.4xm  reason: invalid class name and case insensitive filesystem */
public final class C86504xm extends Drawable {
    public final F10 A00;
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
    public final RectF A0B = C86134wK.A0E();
    public final RectF A0C = C86134wK.A0E();

    public C86504xm(Context context, UserSession userSession) {
        Context context2 = context;
        Resources resources = context2.getResources();
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.A08 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A07 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A06 = resources.getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
        this.A05 = resources.getDimensionPixelSize(R.dimen.avatar_viewer_list_image_horizontal_offset);
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        Paint A0C2 = C86114wI.A0C(1);
        this.A09 = A0C2;
        C86104wH.A18(context2, A0C2, R.color.canvas_bottom_sheet_description_text_color);
        Paint A0C3 = C86114wI.A0C(1);
        this.A0A = A0C3;
        C86104wH.A18(context2, A0C3, R.color.chat_sticker_button_divider_color);
        String A0g = C18190wL.A0g(resources, 2131824457);
        F10 A0T = C86164wN.A0T(context2, getIntrinsicWidth() - (resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) << 1));
        this.A00 = A0T;
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        A0T.A0O(A0g);
        C86154wM.A19(context2, A0T, R.color.igds_creation_tools_lavender);
        Resources resources2 = context2.getResources();
        int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
        F10 f10 = this.A00;
        float f = (float) dimensionPixelSize;
        UserSession userSession2 = userSession;
        C31167Ghl.A04(context2, userSession2, f10, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        if (f10.A0D.getLineCount() != 1) {
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            C31167Ghl.A04(context2, userSession2, f10, (float) dimensionPixelSize2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (f10.A0D.getLineCount() <= 1) {
                while (dimensionPixelSize2 < dimensionPixelSize) {
                    int ceil = ((int) Math.ceil((double) C86134wK.A01(dimensionPixelSize - dimensionPixelSize2))) + dimensionPixelSize2;
                    C31167Ghl.A04(context2, userSession2, f10, (float) ceil, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    if (f10.A0D.getLineCount() == 1) {
                        dimensionPixelSize2 = ceil;
                    } else {
                        dimensionPixelSize = ceil - 1;
                    }
                }
                f = (float) dimensionPixelSize2;
            }
            C31167Ghl.A04(context2, userSession2, f10, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        RectF rectF = this.A0B;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A09);
        this.A00.draw(canvas);
        canvas.save();
        int i = 0;
        do {
            RectF rectF2 = this.A0C;
            float f2 = (float) this.A03;
            canvas.drawRoundRect(rectF2, f2, f2, this.A0A);
            canvas.translate((float) (this.A06 + this.A04), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            i++;
        } while (i < 4);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A08 + this.A00.A04 + this.A07 + this.A05 + this.A02;
    }

    public final int getIntrinsicWidth() {
        return (this.A02 << 1) + (this.A06 << 2) + (this.A04 * 3);
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A00.setAlpha(i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float intrinsicWidth = (float) getIntrinsicWidth();
        float intrinsicHeight = (float) getIntrinsicHeight();
        float f2 = f - (intrinsicWidth / 2.0f);
        float f3 = (((float) (i2 + i4)) / 2.0f) - (intrinsicHeight / 2.0f);
        F10 f10 = this.A00;
        float f4 = (float) f10.A07;
        int i5 = this.A08;
        float f5 = (float) (i5 + f10.A04 + this.A07);
        float descent = f10.A0R.descent();
        float f6 = ((float) this.A02) + f2;
        float f7 = f5 + f3;
        this.A0B.set(f2, f3, intrinsicWidth + f2, intrinsicHeight + f3);
        this.A0C.set(f6, f7, ((float) this.A06) + f6, ((float) this.A05) + f7);
        float f8 = f4 / 2.0f;
        float f9 = descent / 2.0f;
        f10.setBounds((int) (f - f8), (int) (f3 + ((float) i5) + f9), (int) (f + f8), (int) (f7 - f9));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A0A.setColorFilter(colorFilter);
        this.A00.setColorFilter(colorFilter);
    }
}
