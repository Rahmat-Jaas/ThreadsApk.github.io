package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCCallbackShape484S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67;

/* renamed from: X.4y5  reason: invalid class name and case insensitive filesystem */
public final class C86674y5 extends Drawable {
    public Bitmap A00;
    public List A01;
    public Paint A02;
    public Picture A03;
    public RectF A04;
    public Drawable A05;
    public final Context A06;
    public final C39769Kzd A07 = new IDxCCallbackShape484S0100000_2_I2(this, 3);
    public final C04530Oa A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final RectF A0H;
    public final C39769Kzd A0I = new IDxCCallbackShape484S0100000_2_I2(this, 2);
    public final boolean A0J;

    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        C04220Ms.A0B(canvas, 0);
        boolean z = this.A0J;
        if (z) {
            canvas.saveLayer((RectF) null, (Paint) null);
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        List list = this.A01;
        if (list != null && list.size() > 1) {
            int A0A2 = C86124wJ.A0A(this);
            int A082 = C86134wK.A08(this);
            Bitmap createBitmap = Bitmap.createBitmap(A0A2, A082, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            int size = list.size();
            if (size == 2) {
                Bitmap bitmap = (Bitmap) list.get(0);
                Bitmap bitmap2 = (Bitmap) list.get(1);
                if (!(bitmap == null || bitmap2 == null)) {
                    int i = A0A2 >> 1;
                    canvas2.drawBitmap(A00(bitmap), (Rect) null, new Rect(0, 0, i, A082), (Paint) null);
                    canvas2.drawBitmap(A00(bitmap2), (Rect) null, C86164wN.A0F(i, 0, A0A2, A082), (Paint) null);
                }
                this.A00 = null;
                A01(this);
                invalidateSelf();
            } else if (size == 3) {
                Bitmap bitmap3 = (Bitmap) list.get(0);
                Bitmap bitmap4 = (Bitmap) list.get(1);
                Bitmap bitmap5 = (Bitmap) list.get(2);
                if (!(bitmap3 == null || bitmap4 == null || bitmap5 == null)) {
                    int i2 = A0A2 >> 1;
                    canvas2.drawBitmap(A00(bitmap3), (Rect) null, new Rect(0, 0, i2, A082), (Paint) null);
                    int i3 = A082 >> 1;
                    canvas2.drawBitmap(bitmap4, (Rect) null, C86164wN.A0F(i2, 0, A0A2, i3), (Paint) null);
                    canvas2.drawBitmap(bitmap5, (Rect) null, C86164wN.A0F(i2, i3, A0A2, A082), (Paint) null);
                }
                this.A00 = null;
                A01(this);
                invalidateSelf();
            } else if (size == 4) {
                Bitmap bitmap6 = (Bitmap) list.get(0);
                Bitmap bitmap7 = (Bitmap) list.get(1);
                Bitmap bitmap8 = (Bitmap) list.get(2);
                Bitmap bitmap9 = (Bitmap) list.get(3);
                if (!(bitmap6 == null || bitmap7 == null || bitmap8 == null || bitmap9 == null)) {
                    int i4 = A0A2 >> 1;
                    int i5 = A082 >> 1;
                    canvas2.drawBitmap(bitmap6, (Rect) null, new Rect(0, 0, i4, i5), (Paint) null);
                    canvas2.drawBitmap(bitmap7, (Rect) null, C86164wN.A0F(i4, 0, A0A2, i5), (Paint) null);
                    canvas2.drawBitmap(bitmap8, (Rect) null, C86164wN.A0F(0, i5, i4, A082), (Paint) null);
                    canvas2.drawBitmap(bitmap9, (Rect) null, C86164wN.A0F(i4, i5, A0A2, A082), (Paint) null);
                }
                this.A00 = null;
                A01(this);
                invalidateSelf();
            }
            this.A00 = createBitmap;
            A01(this);
            invalidateSelf();
        }
        canvas.save();
        int i6 = getBounds().left;
        int i7 = this.A0E;
        int i8 = this.A0B;
        canvas.translate((float) (i6 + i7 + i8), (float) (getBounds().top + i7 + i8));
        RectF rectF = this.A0H;
        int i9 = this.A0D;
        float f = (float) (i9 - i8);
        if (this.A00 == null || (paint = this.A0F) == null) {
            paint = this.A0G;
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.restore();
        RectF rectF2 = this.A04;
        if (!(rectF2 == null || (paint2 = this.A02) == null)) {
            float f2 = (float) i9;
            canvas.drawRoundRect(rectF2, f2, f2, paint2);
        }
        if (z) {
            Picture picture = this.A03;
            if (picture != null) {
                canvas.drawPicture(picture);
            }
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        super.onBoundsChange(rect);
        int i = rect.right;
        int i2 = rect.bottom;
        if (this.A0J) {
            int i3 = this.A0C;
            i -= i3;
            i2 -= i3;
        }
        Rect A0F2 = C86164wN.A0F(rect.left, rect.top, i, i2);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(A0F2);
        }
        RectF rectF = this.A0H;
        float f = (float) this.A0A;
        rectF.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f);
        RectF rectF2 = this.A04;
        if (rectF2 != null) {
            rectF2.set(A0F2);
            float f2 = this.A09;
            rectF2.inset(f2, f2);
        }
        invalidateSelf();
    }

    public C86674y5(Context context, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Paint paint;
        Context context2 = context;
        this.A06 = context2;
        int i7 = i2;
        this.A0D = i7;
        int i8 = i3;
        this.A0B = i8;
        int i9 = i5;
        this.A0E = i9;
        this.A0J = z;
        Paint A0C2 = C86114wI.A0C(1);
        this.A0G = A0C2;
        this.A0F = C86114wI.A0C(1);
        this.A0H = C86134wK.A0E();
        float f = (float) i8;
        float f2 = f / 2.0f;
        float f3 = (float) i9;
        float f4 = f3 + f2;
        this.A09 = f4;
        this.A0A = i - i3;
        this.A08 = AnonymousClass0OY.A02(new KtLambdaShape87S0100000_I2_67(this, 37));
        this.A0C = (int) f2;
        Drawable drawable = null;
        int i10 = i4;
        if (i5 > 0) {
            this.A04 = C86134wK.A0E();
            paint = C86114wI.A0C(1);
            C86134wK.A12(paint);
            paint.setStrokeWidth(f);
            paint.setColor(i10);
            this.A02 = paint;
        } else {
            this.A04 = null;
            this.A02 = null;
            paint = null;
        }
        if (z) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            int i11 = (int) f4;
            if (AnonymousClass74G.A00 == null) {
                int i12 = i >> 1;
                int i13 = i + i11;
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
                int i14 = (i - (dimensionPixelSize >> 1)) + (i3 >> 1);
                Picture picture = new Picture();
                AnonymousClass74G.A00 = picture;
                Canvas beginRecording = picture.beginRecording(intrinsicWidth, intrinsicHeight);
                C04220Ms.A06(beginRecording);
                float f5 = (float) i13;
                beginRecording.drawCircle(f5, f5, (float) i12, AnonymousClass74G.A02);
                if (paint != null) {
                    int i15 = i13 - i12;
                    float f6 = (float) i15;
                    float f7 = ((float) (i12 << 1)) + f6;
                    Paint paint2 = paint;
                    Canvas canvas = beginRecording;
                    canvas.drawArc(new RectF(f6, f6, f7, f7), 180.0f, 90.0f, false, paint2);
                    float f8 = (float) (i15 - i3);
                    float f9 = (float) (i13 - i3);
                    float f10 = f8 + f;
                    float f11 = f + f9;
                    canvas.drawArc(new RectF(f8, f9, f10, f11), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 90.0f, false, paint2);
                    canvas.drawArc(new RectF(f9, f8, f11, f10), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 90.0f, false, paint2);
                }
                Drawable drawable2 = AnonymousClass74G.A01;
                if (drawable2 == null) {
                    Drawable drawable3 = context2.getDrawable(R.drawable.instagram_music_pano_filled_24);
                    if (drawable3 != null) {
                        drawable2 = drawable3.mutate();
                        if (drawable2 != null) {
                            int i16 = dimensionPixelSize + i14;
                            drawable2.setBounds(i14, i14, i16, i16);
                            drawable2.setColorFilter(i10, PorterDuff.Mode.SRC_OVER);
                        }
                    } else {
                        drawable2 = null;
                    }
                    AnonymousClass74G.A01 = drawable2;
                }
                if (drawable2 != null) {
                    drawable2.draw(beginRecording);
                }
                picture.endRecording();
            }
            this.A03 = AnonymousClass74G.A00;
        }
        C86104wH.A18(context2, A0C2, R.color.cds_white_a20);
        if (i5 > 0 && i6 != -1) {
            if (i6 != 0) {
                drawable = new C86604xw(C09860go.A03(context2, 1), f3, (float) i7, C86604xw.A00(context2, f3));
            } else {
                drawable = new C86614xx(C86604xw.A00(context2, f3), f3, (float) i7);
            }
        }
        this.A05 = drawable;
        A01(this);
    }

    public static final void A01(C86674y5 r6) {
        Bitmap bitmap = r6.A00;
        if (bitmap != null) {
            Matrix A0E2 = C86164wN.A0E();
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            float f = (float) r6.A0A;
            A0E2.setScale(f / width, f / height);
            A0E2.mapRect(new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, width, height));
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(A0E2);
            r6.A0F.setShader(bitmapShader);
        }
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0A + (this.A0B << 1) + (this.A0E << 1);
        if (this.A0J) {
            i = this.A0C;
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final int getIntrinsicWidth() {
        int i;
        int i2 = this.A0A + (this.A0B << 1) + (this.A0E << 1);
        if (this.A0J) {
            i = this.A0C;
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A0F.setAlpha(i);
        Paint paint = this.A02;
        if (paint != null) {
            paint.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0F.setColorFilter(colorFilter);
        Paint paint = this.A02;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public static final Bitmap A00(Bitmap bitmap) {
        int height = bitmap.getHeight();
        C13760oG.A00(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, bitmap.getWidth() >> 2, 0, bitmap.getWidth() >> 1, height);
        C04220Ms.A06(createBitmap);
        return createBitmap;
    }

    public final void A02(ImageUrl imageUrl) {
        if (AnonymousClass3WG.A02(imageUrl)) {
            this.A00 = (Bitmap) C18190wL.A0f(this.A08);
            A01(this);
            invalidateSelf();
        } else {
            this.A00 = null;
            A01(this);
            invalidateSelf();
            if (imageUrl != null) {
                C37030Jj7 A0A2 = C37744K2e.A01().A0A(imageUrl, "AlbumArtDrawable");
                A0A2.A02(this.A0I);
                A0A2.A01();
            }
        }
        invalidateSelf();
    }
}
