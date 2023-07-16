package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.4xn  reason: invalid class name and case insensitive filesystem */
public final class C86514xn extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final F10 A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A = C86134wK.A0E();
    public final RectF A0B = C86134wK.A0E();
    public final RectF A0C = C86134wK.A0E();
    public final Interpolator A0D = new DecelerateInterpolator(2.0f);
    public final UserSession A0E;

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            boolean r0 = r7.A00
            r5 = 0
            if (r0 == 0) goto L_0x009b
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 4200(0x1068, double:2.075E-320)
            long r3 = r3 % r0
            r1 = 350(0x15e, double:1.73E-321)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
            float r1 = (float) r3
            r0 = 1135542272(0x43af0000, float:350.0)
            float r1 = X.AnonymousClass0hF.A01(r1, r5, r0, r5, r6)
            android.view.animation.Interpolator r0 = r7.A0D
            float r6 = r0.getInterpolation(r1)
        L_0x0021:
            int r0 = r7.A01
            float r0 = (float) r0
            float r6 = r6 * r0
        L_0x0025:
            r8.save()
            int r0 = r7.A01
            float r0 = (float) r0
            float r0 = r0 + r6
            r8.translate(r5, r0)
            android.graphics.RectF r1 = r7.A0B
            int r0 = r7.A04
            float r3 = (float) r0
            android.graphics.Paint r0 = r7.A08
            r8.drawRoundRect(r1, r3, r3, r0)
            float r2 = -r6
            r8.translate(r5, r2)
            android.graphics.RectF r1 = r7.A0A
            android.graphics.Paint r0 = r7.A07
            r8.drawRoundRect(r1, r3, r3, r0)
            r8.translate(r5, r2)
            android.graphics.RectF r2 = r7.A0C
            int r0 = r7.A06
            float r1 = (float) r0
            android.graphics.Paint r0 = r7.A09
            r8.drawRoundRect(r2, r1, r1, r0)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18301796246621212(0x41056300080c1c, double:1.8936537656961655E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x006a
            X.F10 r0 = r7.A03
            android.text.TextPaint r0 = r0.A0R
            float r0 = r0.descent()
            float r0 = -r0
            r8.translate(r5, r0)
        L_0x006a:
            X.F10 r0 = r7.A03
            r0.draw(r8)
            r8.restore()
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0079
            r7.invalidateSelf()
        L_0x0079:
            return
        L_0x007a:
            r1 = 2100(0x834, double:1.0375E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            r1 = 2450(0x992, double:1.2105E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0099
            float r2 = (float) r3
            r1 = 1157840896(0x45034000, float:2100.0)
            r0 = 1159274496(0x45192000, float:2450.0)
            float r1 = X.AnonymousClass0hF.A01(r2, r1, r0, r5, r6)
            android.view.animation.Interpolator r0 = r7.A0D
            float r0 = r0.getInterpolation(r1)
            float r6 = r6 - r0
            goto L_0x0021
        L_0x0099:
            r6 = 0
            goto L_0x0025
        L_0x009b:
            int r0 = r7.A01
            float r6 = (float) r0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86514xn.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        return this.A02 + (this.A01 << 1);
    }

    public final int getIntrinsicWidth() {
        return this.A03.A07;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A08.setAlpha(i);
        this.A09.setAlpha(i);
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
        this.A09.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public C86514xn(Context context, UserSession userSession) {
        Context context2 = context;
        Resources resources = context.getResources();
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        this.A04 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A01 = C18250wR.A00(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        this.A02 = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        Paint A0C2 = C86114wI.A0C(1);
        this.A07 = A0C2;
        C86104wH.A18(context, A0C2, R.color.chat_sticker_chat_bubble_color);
        Paint A0C3 = C86114wI.A0C(1);
        this.A08 = A0C3;
        C86104wH.A18(context, A0C3, R.color.direct_light_mode_glyph_color_tertiary);
        Paint A0C4 = C86114wI.A0C(1);
        this.A09 = A0C4;
        C86104wH.A18(context, A0C4, R.color.canvas_bottom_sheet_description_text_color);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        String string = resources.getString(2131833914);
        F10 A0T = C86164wN.A0T(context, C09860go.A08(context));
        this.A03 = A0T;
        A0T.A0M(Layout.Alignment.ALIGN_CENTER);
        if (C63173fJ.A05(AnonymousClass0TJ.A05, 18301796246621212L)) {
            A0T.A0O(string);
            C86154wM.A19(context, A0T, R.color.igds_creation_tools_lavender);
        } else {
            SpannableStringBuilder A0E2 = C18200wM.A0E(string);
            A0E2.setSpan(new AnonymousClass7QJ(BQS.A01), 0, string.length(), 33);
            A0T.A0N(A0E2);
        }
        float f = (float) dimensionPixelSize;
        C31167Ghl.A04(context2, userSession2, A0T, (float) dimensionPixelSize2, f, f);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        F10 f10 = this.A03;
        float f2 = (float) f10.A07;
        int i5 = this.A02;
        float f3 = f2 / 2.0f;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = (((float) (i2 + i4)) / 2.0f) - (((float) ((this.A01 << 1) + i5)) / 2.0f);
        RectF rectF = this.A0A;
        int i6 = this.A05;
        float f7 = (float) i6;
        float f8 = ((float) i5) + f6;
        rectF.set(f7 + f4, f6, f5 - f7, f8);
        float f9 = (float) (i6 << 1);
        this.A0B.set(f9 + f4, f6, f5 - f9, f8);
        this.A0C.set(f4, f6, f5, f8);
        int i7 = (int) f6;
        f10.setBounds((int) f4, i7, (int) f5, i5 + i7);
    }
}
