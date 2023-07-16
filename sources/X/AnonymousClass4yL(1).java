package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductDetailsProductItemDict;

/* renamed from: X.4yL  reason: invalid class name */
public final class AnonymousClass4yL extends Drawable implements C39769Kzd, C33464HoJ {
    public Bitmap A00;
    public Bitmap A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Paint A05 = C86114wI.A0C(3);
    public final Paint A06 = C86114wI.A0C(3);
    public final Product A07;
    public final Runnable A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Path A0J;
    public final Path A0K;
    public final Path A0L;
    public final Path A0M;
    public final Path A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Layout A0Q;
    public final TextPaint A0R;
    public final TextPaint A0S;
    public final String A0T;

    public final String BFb() {
        return C28174Ezk.A00(699);
    }

    public final void C1y(L5E l5e, KHQ khq) {
    }

    public final void C25(L5E l5e, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass4yL(Context context, ImageUrl imageUrl, Product product, float f) {
        CharSequence ellipsize;
        float f2 = f;
        TextPaint textPaint = new TextPaint(1);
        this.A0S = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A0R = textPaint2;
        Paint A0C2 = C86114wI.A0C(3);
        this.A0E = A0C2;
        Paint A0C3 = C86114wI.A0C(3);
        this.A0I = A0C3;
        Paint A0C4 = C86114wI.A0C(3);
        this.A0G = A0C4;
        Paint A0C5 = C86114wI.A0C(3);
        this.A0H = A0C5;
        Paint A0C6 = C86114wI.A0C(3);
        this.A0F = A0C6;
        Rect A0D2 = C86134wK.A0D();
        this.A0P = A0D2;
        Rect A0D3 = C86134wK.A0D();
        this.A0O = A0D3;
        Path A0G2 = C86144wL.A0G();
        this.A0K = A0G2;
        Path A0G3 = C86144wL.A0G();
        this.A0M = A0G3;
        Path A0G4 = C86144wL.A0G();
        this.A0L = A0G4;
        Path A0G5 = C86144wL.A0G();
        this.A0J = A0G5;
        Path A0G6 = C86144wL.A0G();
        this.A0N = A0G6;
        this.A08 = new C135727zx(this);
        Product product2 = product;
        Product product3 = product2;
        this.A07 = product3;
        ProductDetailsProductItemDict productDetailsProductItemDict = product3.A00;
        String str = productDetailsProductItemDict.A0g;
        Context context2 = context;
        String A0l = AnonymousClass0wJ.A0l(context2, productDetailsProductItemDict.A0C.A08, 2131832868);
        A0C2.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        A0C2.setStyle(style);
        A0C3.setColor(-1);
        A0C3.setShadowLayer(14.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context2.getColor(R.color.black_15_transparent));
        textPaint.setTextSize(C09860go.A03(context2, 14));
        textPaint.setColor(-16777216);
        textPaint.setTypeface(C86154wM.A0C(context2));
        textPaint2.setTextSize(C09860go.A03(context2, 14));
        C86104wH.A18(context2, textPaint2, R.color.grey_5);
        A0C4.setColor(-16777216);
        C86104wH.A18(context2, A0C5, R.color.igds_highlight_background);
        A0C5.setStyle(style);
        C86104wH.A18(context2, A0C6, R.color.grey_2);
        A0C6.setStyle(style);
        textPaint.getTextBounds(str, 0, AnonymousClass0hA.A01(str), A0D2);
        textPaint2.getTextBounds(A0l, 0, AnonymousClass0hA.A01(A0l), A0D3);
        this.A03 = f2;
        this.A02 = f2;
        int A022 = (int) C09860go.A02(context2, 2.0f);
        float A032 = C09860go.A03(context2, 12);
        this.A0B = A032;
        float A033 = C09860go.A03(context2, 6);
        this.A0C = A033;
        float A034 = C09860go.A03(context2, 12);
        float A035 = C09860go.A03(context2, 34);
        this.A04 = A035;
        float height = ((float) (A0D2.height() + A0D3.height())) + (A032 * 2.0f) + A033;
        this.A0A = height;
        float A002 = C09860go.A00(context2, 0.5f);
        this.A09 = A002;
        float f3 = (A002 * 2.0f) + A035;
        this.A0D = f3;
        float f4 = f3 / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        A0G2.addRoundRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, f2), new float[]{A034, A034, A034, A034, 0.0f, 0.0f, 0.0f, 0.0f}, direction);
        float f5 = A035 / 2.0f;
        A0G3.addCircle(f5, f5, f5, direction);
        A0G4.addCircle(f4, f4, f4, direction);
        A0G5.addRoundRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, height), new float[]{0.0f, 0.0f, 0.0f, 0.0f, A034, A034, A034, A034}, direction);
        A0G6.addRoundRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2, f + height), A034, A034, direction);
        float f6 = (f - A035) - (A032 * 3.0f);
        C36409JTs jTs = new C36409JTs(Layout.Alignment.ALIGN_NORMAL, textPaint, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, (int) f6, false);
        if (product2.A0A()) {
            ellipsize = C19524Axl.A03(context2, jTs, str, A022, 1);
        } else {
            ellipsize = TextUtils.ellipsize(str, textPaint, f6, TextUtils.TruncateAt.END);
        }
        this.A0T = TextUtils.ellipsize(A0l, textPaint2, f6, TextUtils.TruncateAt.END).toString();
        this.A0Q = jTs.A00(ellipsize);
        C37030Jj7 A0A2 = C37744K2e.A01().A0A(imageUrl, (String) null);
        A0A2.A07 = "product_image";
        A0A2.A02(this);
        A0A2.A01();
        C37030Jj7 A0A3 = C37744K2e.A01().A0A(product2.A00.A0C.A02, (String) null);
        A0A3.A07 = "profile_pic";
        A0A3.A02(this);
        A0A3.A01();
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A02 + this.A0A);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A03);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
        this.A05.setAlpha(i);
        this.A0E.setAlpha(i);
        this.A0S.setAlpha(i);
        this.A0R.setAlpha(i);
        this.A0G.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        this.A0E.setColorFilter(colorFilter);
        this.A0S.setColorFilter(colorFilter);
        this.A0R.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void BmZ(KtCSuperShape0S2101000_I2 ktCSuperShape0S2101000_I2, L5E l5e) {
        Bitmap createScaledBitmap;
        Paint paint;
        Object BFS = l5e.BFS();
        if ("product_image".equals(BFS)) {
            Bitmap bitmap = (Bitmap) ktCSuperShape0S2101000_I2.A01;
            bitmap.getClass();
            int round = Math.round(this.A03);
            int round2 = Math.round(this.A02);
            C13760oG.A00(bitmap);
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, true);
            this.A00 = createScaledBitmap;
            paint = this.A05;
        } else if ("profile_pic".equals(BFS)) {
            Bitmap bitmap2 = (Bitmap) ktCSuperShape0S2101000_I2.A01;
            bitmap2.getClass();
            int round3 = Math.round(this.A04);
            C13760oG.A00(bitmap2);
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, round3, round3, true);
            this.A01 = createScaledBitmap;
            paint = this.A06;
        } else {
            return;
        }
        C86124wJ.A1B(createScaledBitmap, paint);
        C63643hy.A04(this.A08);
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas.save();
        C86134wK.A11(canvas, bounds);
        canvas.drawPath(this.A0N, this.A0I);
        Path path = this.A0K;
        if (this.A00 != null) {
            paint = this.A05;
        } else {
            paint = this.A0H;
        }
        canvas.drawPath(path, paint);
        float f = this.A02;
        float f2 = this.A09;
        float f3 = this.A03;
        Paint paint3 = this.A0F;
        canvas2.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f - f2, f3, f, paint3);
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
        canvas.drawPath(this.A0J, this.A0E);
        canvas.save();
        float f4 = this.A0B;
        float f5 = this.A0A / 2.0f;
        canvas.translate(f4 - f2, f5 - (this.A0D / 2.0f));
        canvas.drawPath(this.A0L, paint3);
        canvas.restore();
        canvas.save();
        float f6 = this.A04;
        canvas.translate(f4, f5 - (f6 / 2.0f));
        Path path2 = this.A0M;
        if (this.A01 != null) {
            paint2 = this.A06;
        } else {
            paint2 = this.A0H;
        }
        canvas.drawPath(path2, paint2);
        canvas.restore();
        canvas.save();
        float f7 = f6 + (f4 * 2.0f);
        Rect rect = this.A0P;
        float f8 = this.A0C;
        canvas.translate(f7, (f4 - ((float) rect.bottom)) - (0.5f * f8));
        this.A0Q.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f7, ((f4 + ((float) rect.height())) + f8) - ((float) this.A0O.top));
        canvas.drawText(this.A0T, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A0R);
        canvas.restore();
        canvas.restore();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
