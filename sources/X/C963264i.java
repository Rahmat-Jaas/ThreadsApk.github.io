package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Product;

/* renamed from: X.64i  reason: invalid class name and case insensitive filesystem */
public final class C963264i extends F1W implements C39769Kzd, Drawable.Callback {
    public static final CharSequence A0Q = "…";
    public int A00 = -1;
    public Bitmap A01;
    public int A02;
    public Product A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final Paint A07 = C86114wI.A0C(3);
    public final Runnable A08 = new AnonymousClass80G(this);
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final Paint A0H = C86114wI.A0C(1);
    public final Paint A0I = C86114wI.A0C(1);
    public final Paint A0J = C86114wI.A0C(1);
    public final Path A0K = C86144wL.A0G();
    public final Path A0L = C86144wL.A0G();
    public final Drawable A0M;
    public final F10 A0N;
    public final F10 A0O;
    public final boolean A0P;

    public final String A02() {
        return AnonymousClass000.A00(1324);
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A00() {
        return this.A00;
    }

    public final Product A01() {
        return this.A03;
    }

    public final String A03() {
        return this.A04;
    }

    public final void A04(Product product, String str, int i, boolean z, boolean z2, boolean z3) {
        String A052;
        ImageInfo A022;
        this.A03 = product;
        if (str == null) {
            str = product.A00.A0g;
        }
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        if (z) {
            this.A0L.reset();
            this.A0K.reset();
        }
        Paint paint = this.A0J;
        Context context = this.A0G;
        C86104wH.A18(context, paint, R.color.igds_highlight_background);
        C86134wK.A13(paint);
        Path path = this.A0L;
        float f = (float) this.A06;
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f);
        float f2 = (float) this.A0B;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f2, f2, direction);
        F10 f10 = this.A0O;
        f10.A0O(this.A04);
        int color = context.getColor(R.color.grey_9);
        int i2 = -1;
        int i3 = this.A00;
        if (i3 != -1) {
            color = C09760gd.A08(i3, -1);
        }
        f10.A0H(color);
        F10 f102 = this.A0N;
        boolean z4 = this.A0P;
        Product product2 = this.A03;
        if (z4) {
            A052 = product2.A00.A0C.A08;
        } else {
            A052 = product2.A05();
        }
        f102.A0O(A052);
        int color2 = context.getColor(R.color.grey_5);
        int i4 = this.A00;
        if (i4 != -1) {
            color2 = C09760gd.A08(i4, -1);
        }
        f102.A0H(color2);
        this.A02 = this.A0F + Math.max(f10.A07, f102.A07);
        this.A0I.setColor(-1);
        Paint paint2 = this.A0H;
        int i5 = this.A00;
        if (i5 != -1) {
            i2 = i5;
        }
        paint2.setColor(i2);
        Path path2 = this.A0K;
        RectF rectF2 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A02, (float) this.A0A);
        float f3 = (float) this.A09;
        path2.addRoundRect(rectF2, f3, f3, direction);
        if (this.A01 == null && (A022 = this.A03.A02()) != null) {
            C86144wL.A1K(this, C37744K2e.A01(), C122057Ju.A01(A022, AnonymousClass006.A01), (String) null);
        }
        invalidateSelf();
    }

    public final boolean A05() {
        return this.A05;
    }

    public final String BFb() {
        return null;
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        int i = this.A06;
        Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail((Bitmap) ktCSuperShape0S2101000_I2.A01, i, i);
        this.A01 = extractThumbnail;
        C86124wJ.A1B(extractThumbnail, this.A07);
        C63643hy.A04(this.A08);
    }

    public final int getIntrinsicHeight() {
        return this.A0A;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public C963264i(Context context, boolean z) {
        this.A0G = context;
        this.A0P = z;
        int A082 = C09860go.A08(context);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size);
        this.A09 = context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int A062 = C86144wL.A06(context);
        this.A0C = A062;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
        int A052 = C86114wI.A05(context);
        this.A0D = A052;
        this.A0E = C86124wJ.A08(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A06 = dimensionPixelSize2;
        int A083 = C86124wJ.A08(context);
        this.A0B = A083;
        int A063 = C86144wL.A06(context);
        int i = A062 + dimensionPixelSize2 + (A052 << 1);
        this.A0F = i;
        int i2 = A082 - i;
        float f = (float) A063;
        C86604xw r2 = new C86604xw(C09860go.A03(context, 1), f, (float) A083, C86604xw.A00(context, f));
        this.A0M = r2;
        int round = Math.round(f);
        int i3 = -round;
        int i4 = round + dimensionPixelSize2;
        r2.setBounds(i3, i3, i4, i4);
        F10 A0T = C86164wN.A0T(context, i2);
        this.A0O = A0T;
        A0T.setCallback(this);
        float f2 = (float) dimensionPixelSize;
        A0T.A0B(f2);
        A0T.A0L(Typeface.SANS_SERIF, 1);
        A0T.A0I(1, "…");
        F10 A0T2 = C86164wN.A0T(context, i2);
        this.A0N = A0T2;
        A0T2.setCallback(this);
        A0T2.A0B(f2);
        A0T2.A0L(Typeface.SANS_SERIF, 0);
        A0T2.A0I(1, "…");
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Rect bounds = getBounds();
        canvas.save();
        C86134wK.A11(canvas, bounds);
        canvas.drawPath(this.A0K, this.A0H);
        canvas.save();
        int i = this.A0C;
        float f = (float) i;
        canvas.translate(f, f);
        this.A0M.draw(canvas);
        Bitmap bitmap = this.A01;
        Path path = this.A0L;
        if (bitmap != null) {
            canvas.drawPath(path, this.A0I);
            paint = this.A07;
        } else {
            paint = this.A0J;
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f2 = (float) (i + this.A06 + this.A0D);
        int i2 = this.A0A;
        F10 f10 = this.A0O;
        int i3 = f10.A04;
        int i4 = this.A0E;
        F10 f102 = this.A0N;
        canvas.translate(f2, C86134wK.A01(i2 - ((i3 + i4) + f102.A04)));
        f10.draw(canvas);
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) (f10.A04 + i4));
        f102.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
