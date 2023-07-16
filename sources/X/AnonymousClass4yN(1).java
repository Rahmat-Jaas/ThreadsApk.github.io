package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.service.session.UserSession;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4yN  reason: invalid class name */
public final class AnonymousClass4yN extends Drawable implements C27931Evh, C39769Kzd, Drawable.Callback, C33775HuD, C33464HoJ {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Resources A0D;
    public final Paint A0E = C86114wI.A0C(1);
    public final Paint A0F = C86114wI.A0C(3);
    public final Paint A0G = C86114wI.A0C(3);
    public final Path A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final Drawable A0K;
    public final Drawable A0L;
    public final UserSession A0M;
    public final F10 A0N;
    public final F10 A0O;
    public final F10 A0P;
    public final F10 A0Q;
    public final AnonymousClass792 A0R;
    public final boolean A0S;
    public final int A0T;
    public final Drawable A0U;
    public final CopyOnWriteArraySet A0V = new CopyOnWriteArraySet();

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public AnonymousClass4yN(Context context, TargetViewSizeProvider targetViewSizeProvider, UserSession userSession, AnonymousClass792 r23) {
        String str;
        CharSequence charSequence;
        Layout.Alignment alignment;
        BitmapDrawable bitmapDrawable;
        ImageUrl A002;
        Path A0G2 = C86144wL.A0G();
        this.A0H = A0G2;
        RectF A0E2 = C86134wK.A0E();
        this.A0J = A0E2;
        Context context2 = context;
        this.A0C = context2;
        this.A0M = userSession;
        Resources resources = context2.getResources();
        this.A0D = resources;
        AnonymousClass792 r1 = r23;
        this.A0R = r1;
        int width = (int) (((float) targetViewSizeProvider.getWidth()) * 0.8f);
        float f = (float) width;
        int i = (int) (f / 0.75f);
        this.A0S = AnonymousClass0hB.A02(context2);
        this.A06 = width;
        this.A05 = i;
        String str2 = r1.A04;
        if (str2 != null) {
            ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str2, width, i);
            AnonymousClass7EW r11 = r1.A03;
            AnonymousClass7EW r5 = r1.A02;
            float A003 = (float) C18250wR.A00(resources);
            this.A0T = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_floating_window_z);
            this.A02 = dimensionPixelSize;
            this.A03 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
            this.A04 = C18250wR.A00(resources);
            int A012 = (int) C86134wK.A01(dimensionPixelSize);
            this.A09 = A012;
            this.A0B = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            this.A0A = resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
            int i2 = width - (dimensionPixelSize << 1);
            this.A07 = i2;
            this.A08 = Color.argb(Math.round(38.25f), 0, 0, 0);
            RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, (float) i);
            this.A0I = rectF;
            float[] fArr = new float[8];
            fArr[0] = A003;
            fArr[1] = A003;
            fArr[2] = A003;
            fArr[3] = A003;
            C86114wI.A11(A0G2, rectF, fArr, A003);
            Drawable drawable = context2.getDrawable(R.drawable.sticker_background_shadow);
            this.A0U = drawable;
            drawable.setCallback(this);
            float dimensionPixelSize2 = (float) this.A0D.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            this.A0J.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, dimensionPixelSize2, dimensionPixelSize2);
            float f2 = (float) i2;
            this.A0N = C86164wN.A0T(context2, (int) ((f2 - A0E2.width()) - ((float) A012)));
            String str3 = r11.A01;
            if (r5 != null) {
                str = r5.A01;
            } else {
                str = null;
            }
            int i3 = r1.A00;
            if (i3 > 0) {
                charSequence = C16370sw.A02(new AnonymousClass0u3(this.A0C.getResources(), R.plurals.standalone_fundraiser_with_cohost_label, i3), str3, String.valueOf(i3));
            } else if (TextUtils.isEmpty(str) || str.equals(str3)) {
                this.A0N.A0L(Typeface.SANS_SERIF, 1);
                charSequence = str3;
            } else {
                charSequence = C16370sw.A01(this.A0C.getResources(), new String[]{str3, str}, 2131836099);
            }
            F10 f10 = this.A0N;
            f10.A0B((float) this.A0D.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal));
            f10.A0H(-1);
            f10.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A08);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            f10.A0M(alignment2);
            f10.A0H = true;
            f10.A0O(charSequence);
            int i4 = (int) (f2 * 0.8f);
            F10 A0T2 = C86164wN.A0T(context2, i4);
            this.A0Q = A0T2;
            Resources resources2 = this.A0D;
            A0T2.A0B((float) resources2.getDimensionPixelSize(R.dimen.add_hashtags_notice_padding_horizontal));
            A0T2.A0D((float) resources2.getDimensionPixelSize(R.dimen.standalone_fundraiser_sticker_title_text_line_spacing), 1.0f);
            A0T2.A0L(C09250f7.A05.A00(this.A0C).A03(C09340fG.A0N), 1);
            A0T2.A0H(-1);
            A0T2.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A08);
            A0T2.A0M(this.A0S ? Layout.Alignment.ALIGN_OPPOSITE : alignment2);
            A0T2.A0I(3, "…");
            A0T2.A0H = true;
            A0T2.A0O(this.A0R.A09);
            F10 A0T3 = C86164wN.A0T(context2, i4);
            this.A0O = A0T3;
            A0T3.A0B((float) this.A0D.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal));
            Typeface typeface = Typeface.SANS_SERIF;
            A0T3.A0L(typeface, 1);
            A0T3.A0H(-1);
            A0T3.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A08);
            if (this.A0S) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            A0T3.A0M(alignment);
            A0T3.A0H = true;
            String str4 = this.A0R.A06;
            str4.getClass();
            A0T3.A0O(str4.toUpperCase(Locale.getDefault()));
            this.A0K = context2.getDrawable(R.drawable.standalone_fundraiser_sticker_donate_button_background);
            F10 A0T4 = C86164wN.A0T(context2, i2);
            this.A0P = A0T4;
            Context context3 = this.A0C;
            A0T4.A0B(C09860go.A03(context3, 14));
            A0T4.A0L(typeface, 1);
            A0T4.A0H(-16777216);
            A0T4.A0M(Layout.Alignment.ALIGN_CENTER);
            A0T4.A0E(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 14.0f);
            A0T4.A0O(context3.getString(C63803iN.A0E(AnonymousClass0TJ.A05, this.A0M, 36321675133983710L) ? 2131836097 : 2131836096));
            if ((r5 == null || !r5.A02) && !r11.A02) {
                bitmapDrawable = null;
            } else {
                Context context4 = this.A0C;
                int A013 = C18220wO.A01(context4, R.dimen.account_section_text_margin_horizontal);
                Bitmap bitmap = ((BitmapDrawable) context4.getDrawable(R.drawable.verified_profile)).getBitmap();
                bitmap.getClass();
                Resources resources3 = context4.getResources();
                C13760oG.A00(bitmap);
                bitmapDrawable = new BitmapDrawable(resources3, Bitmap.createScaledBitmap(bitmap, A013, A013, true));
                bitmapDrawable.setCallback(this);
                C63393hP.A03(context4, bitmapDrawable, R.color.igds_icon_on_color);
                C86124wJ.A1C(bitmapDrawable);
            }
            this.A0L = bitmapDrawable;
            if (TextUtils.isEmpty(r11.A00)) {
                A002 = null;
            } else {
                A002 = AnonymousClass3WG.A00(C15430rJ.A01(r11.A00));
            }
            if (A002 != null) {
                C37030Jj7 A0A2 = C37744K2e.A01().A0A(A002, "standalone_fundraiser_sticker");
                A0A2.A07 = "profile_pic";
                A0A2.A02(this);
                A0A2.A01();
            }
            C37030Jj7 A0A3 = C37744K2e.A01().A0A(extendedImageUrl, "standalone_fundraiser_sticker");
            A0A3.A07 = "media";
            A0A3.A02(this);
            A0A3.A01();
            return;
        }
        throw C18190wL.A0a("Requires cover photo url");
    }

    public final void A6Z(C144648iq r2) {
        this.A0V.add(r2);
    }

    public final void ADE() {
        this.A0V.clear();
    }

    public final String Aab() {
        return this.A0R.A05;
    }

    public final String Ak9() {
        return this.A0R.A07;
    }

    public final NewFundraiserInfo AxH() {
        return this.A0R.A01;
    }

    public final String BFb() {
        return AnonymousClass00U.A0L("standalone_fundraiser_cover_photo_variant_", this.A0R.A07);
    }

    public final boolean BVe() {
        if (this.A00 == null || this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void Cby(C144648iq r2) {
        this.A0V.remove(r2);
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A0E.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0072 A[LOOP:0: B:5:0x006c->B:7:0x0072, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r13, X.L5E r14) {
        /*
            r12 = this;
            java.lang.Object r1 = r14.BFS()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r13.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r2.getClass()
            int r1 = r12.A06
            int r0 = r12.A05
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            r2.getClass()
            r12.A00 = r2
            android.graphics.Paint r1 = r12.A0F
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r11, r11)
            r1.setShader(r0)
            android.graphics.RectF r0 = r12.A0I
            float r5 = r0.width()
            float r8 = r0.height()
            android.graphics.Paint r3 = r12.A0E
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r6 = r8 * r0
            r2 = 4
            r1 = 0
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            int[] r9 = new int[]{r1, r1, r1, r0}
            float[] r10 = new float[r2]
            r10 = {0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setShader(r4)
        L_0x005e:
            X.80K r0 = new X.80K
            r0.<init>(r12)
            X.C63643hy.A04(r0)
        L_0x0066:
            java.util.concurrent.CopyOnWriteArraySet r0 = r12.A0V
            java.util.Iterator r1 = r0.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.8iq r0 = (X.C144648iq) r0
            r0.C5E()
            goto L_0x006c
        L_0x007c:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r13.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.getClass()
            android.graphics.Bitmap r0 = X.C31176Gi6.A02(r0)
            r12.A01 = r0
            goto L_0x005e
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4yN.BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2, X.L5E):void");
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        if (!BVe()) {
            Rect bounds = getBounds();
            this.A0U.draw(canvas);
            canvas.save();
            C86134wK.A11(canvas, bounds);
            canvas.save();
            Path path = this.A0H;
            canvas.drawPath(path, this.A0F);
            canvas.drawPath(path, this.A0E);
            RectF rectF = this.A0J;
            float height = rectF.height();
            float f2 = height / 2.0f;
            int i4 = this.A02;
            float f3 = (float) i4;
            boolean z = this.A0S;
            if (z) {
                canvas.translate((float) (this.A06 - i4), f3);
                canvas.translate(-height, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                canvas.translate(f3, f3);
            }
            Bitmap bitmap = this.A01;
            bitmap.getClass();
            canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0G);
            F10 f10 = this.A0N;
            float f4 = f2 - (((float) f10.A04) / 2.0f);
            int i5 = this.A09;
            if (z) {
                f = (float) ((-i5) - f10.A07);
            } else {
                f = height + ((float) i5);
            }
            canvas.translate(f, f4);
            f10.draw(canvas);
            Drawable drawable = this.A0L;
            if (drawable != null && this.A0R.A00 == 0) {
                float intrinsicHeight = (float) ((f10.A04 - drawable.getIntrinsicHeight()) - this.A0A);
                if (z) {
                    i3 = (-this.A0B) - drawable.getIntrinsicWidth();
                } else {
                    i3 = f10.A07 + this.A0B;
                }
                canvas.translate((float) i3, intrinsicHeight);
                drawable.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            String str = this.A0R.A06;
            str.getClass();
            boolean isEmpty = str.isEmpty();
            int i6 = 0;
            if (isEmpty) {
                i = 0;
                i2 = 0;
            } else {
                F10 f102 = this.A0O;
                i = f102.A04;
                i2 = f102.A07;
                i6 = this.A03;
            }
            int i7 = this.A05 - i4;
            Drawable drawable2 = this.A0K;
            F10 f103 = this.A0Q;
            int i8 = f103.A04;
            int i9 = f103.A07;
            float f5 = (float) ((this.A06 - i4) - i9);
            float f6 = (float) (i8 + i6);
            float f7 = (float) (i9 - i2);
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (((((i7 - drawable2.getIntrinsicHeight()) - this.A04) - i) - i6) - i8));
            if (!z) {
                f5 = f3;
            }
            canvas.translate(f5, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            f103.draw(canvas);
            if (!isEmpty) {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6);
                if (z) {
                    canvas.translate(f7, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                } else {
                    canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                this.A0O.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f3, (float) (i7 - drawable2.getIntrinsicHeight()));
            int i10 = this.A07;
            drawable2.setBounds(0, 0, i10, drawable2.getIntrinsicHeight());
            drawable2.draw(canvas);
            float f8 = (float) (i10 >> 1);
            float intrinsicHeight2 = (float) (drawable2.getIntrinsicHeight() >> 1);
            F10 f104 = this.A0P;
            canvas.translate(f8 - ((float) (f104.A07 >> 1)), intrinsicHeight2 - ((float) (f104.A04 >> 1)));
            f104.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0U;
        int i5 = this.A0T;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
