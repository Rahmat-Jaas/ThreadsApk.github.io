package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4yR  reason: invalid class name */
public final class AnonymousClass4yR extends Drawable implements C33775HuD, C33464HoJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final UserSession A06;
    public final F10 A07;
    public final F10 A08;
    public final F10 A09;
    public final AnonymousClass792 A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Drawable A0E;
    public final C22502CbD A0F;
    public final List A0G;

    public final int getOpacity() {
        return -3;
    }

    public final String Aab() {
        return this.A0A.A05;
    }

    public final String Ak9() {
        return this.A0A.A07;
    }

    public final NewFundraiserInfo AxH() {
        return this.A0A.A01;
    }

    public final String BFb() {
        return AnonymousClass00U.A0L("standalone_fundraiser_without_cover_photo_variant_", this.A0A.A07);
    }

    public final void draw(Canvas canvas) {
        for (Drawable draw : this.A0G) {
            draw.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        int i = this.A0D;
        F10 f10 = this.A09;
        int i2 = this.A02;
        int i3 = ((i + f10.A04) - f10.A06) - i2;
        return this.A0F.A01 + i3 + (this.A08.A04 - i2) + this.A0C + this.A0B;
    }

    public final int getIntrinsicWidth() {
        return this.A04;
    }

    public final void setAlpha(int i) {
        for (Drawable alpha : this.A0G) {
            alpha.setAlpha(i);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i;
        super.setBounds(i5, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A04) / 2.0f;
        float intrinsicHeight = ((float) getIntrinsicHeight()) / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f2 + intrinsicHeight;
        float f6 = (float) this.A0B;
        float f7 = f5 - f6;
        float f8 = (f6 / 2.0f) + f7;
        C22502CbD cbD = this.A0F;
        int i6 = cbD.A01;
        F10 f10 = this.A09;
        int i7 = f10.A07;
        int i8 = f10.A04;
        int i9 = f10.A06;
        int i10 = this.A0D;
        int i11 = ((i10 + i8) - i9) - this.A02;
        F10 f102 = this.A08;
        int i12 = f102.A07;
        int i13 = f102.A04;
        F10 f103 = this.A07;
        int i14 = f103.A07;
        int i15 = f103.A04;
        int i16 = (int) (f - f3);
        int i17 = (int) (f3 + f);
        cbD.setBounds(i16, (int) f4, i17, (int) f5);
        float f9 = ((float) i7) / 2.0f;
        float f11 = f4 + ((float) i6);
        float f12 = (float) i9;
        float f13 = f11 + ((float) i11);
        f10.setBounds((int) (f - f9), (int) ((((float) i10) + f11) - f12), (int) (f9 + f), (int) (f12 + f13));
        float f14 = ((float) i12) / 2.0f;
        f102.setBounds((int) (f - f14), (int) f13, (int) (f14 + f), (int) (f13 + ((float) i13)));
        int i18 = (int) f7;
        this.A0E.setBounds(i16, i18, i17, i18);
        float f15 = ((float) i14) / 2.0f;
        float f16 = ((float) i15) / 2.0f;
        f103.setBounds((int) (f - f15), (int) (f8 - f16), (int) (f + f15), (int) (f8 + f16));
    }

    public AnonymousClass4yR(Context context, UserSession userSession, AnonymousClass792 r10) {
        ImageUrl A002;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A0G = A0v;
        this.A05 = context;
        this.A06 = userSession;
        this.A0A = r10;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A04 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A0C = dimensionPixelSize2;
        this.A02 = resources.getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0D = resources.getDimensionPixelSize(R.dimen.avatar_viewer_list_image_horizontal_offset);
        this.A01 = resources.getDimensionPixelSize(R.dimen.chat_sticker_button_text_size);
        this.A0B = resources.getDimensionPixelSize(R.dimen.audience_controls_footer_button_radius);
        this.A00 = resources.getDimensionPixelSize(R.dimen.chat_sticker_chat_name_text_size);
        int i = dimensionPixelSize - (dimensionPixelSize2 << 1);
        AnonymousClass4xW r5 = new AnonymousClass4xW(context, (float) resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin), R.color.chat_sticker_button_divider_color, 80);
        this.A0E = r5;
        AnonymousClass792 r0 = this.A0A;
        AnonymousClass7EW r3 = r0.A03;
        AnonymousClass7EW r2 = r0.A02;
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        if (TextUtils.isEmpty(r3.A00)) {
            A002 = null;
        } else {
            A002 = AnonymousClass3WG.A00(C15430rJ.A01(r3.A00));
        }
        A0v2.add(A002);
        if (r2 != null && !r3.equals(r2) && !TextUtils.isEmpty(r2.A00)) {
            A0v2.add(AnonymousClass3WG.A00(C15430rJ.A01(r2.A00)));
        }
        C22502CbD cbD = new C22502CbD(this.A05, A0v2);
        this.A0F = cbD;
        F10 A0T = C86164wN.A0T(context, i);
        this.A09 = A0T;
        F10 A0T2 = C86164wN.A0T(context, i);
        this.A08 = A0T2;
        F10 A0T3 = C86164wN.A0T(context, i);
        this.A07 = A0T3;
        Collections.addAll(A0v, new Drawable[]{cbD, A0T, A0T2, A0T3, r5});
        Context context2 = this.A05;
        F10 f10 = this.A09;
        C31167Ghl.A07(context2, f10, (float) this.A03, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A02);
        C86154wM.A19(context2, f10, R.color.clips_remix_camera_outer_container_default_background);
        f10.A0O(this.A0A.A09);
        F10 f102 = this.A08;
        f102.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A02);
        f102.A0B((float) this.A01);
        f102.A0H(-6710887);
        String str = "";
        if (C63803iN.A0E(AnonymousClass0TJ.A06, this.A06, 36325678043374776L)) {
            String str2 = this.A0A.A06;
            f102.A0O(str2 != null ? C121687Hl.A00(str2.toLowerCase(Locale.getDefault())) : str);
        } else {
            AnonymousClass792 r1 = this.A0A;
            String str3 = r1.A03.A01;
            AnonymousClass7EW r02 = r1.A02;
            f102.A0O(C16370sw.A01(this.A05.getResources(), new String[]{str3, r02 != null ? r02.A01 : str}, 2131827764));
        }
        F10 f103 = this.A07;
        f103.A0L(Typeface.SANS_SERIF, 1);
        Context context3 = this.A05;
        f103.A0O(context3.getString(C63803iN.A0E(AnonymousClass0TJ.A05, this.A06, 36321675133983710L) ? 2131827760 : 2131827759));
        f103.A0B((float) this.A00);
        C86154wM.A19(context3, f103, R.color.igds_primary_button);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }
}
