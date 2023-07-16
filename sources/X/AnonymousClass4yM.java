package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4yM  reason: invalid class name */
public abstract class AnonymousClass4yM extends Drawable implements C27931Evh, C39769Kzd, Drawable.Callback, C33464HoJ {
    public Bitmap A00;
    public Bitmap A01;
    public final int A02;
    public final int A03;
    public final Paint A04 = C86114wI.A0C(1);
    public final Paint A05 = C86114wI.A0C(3);
    public final RectF A06;
    public final Runnable A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final Paint A0G = C86114wI.A0C(3);
    public final Path A0H;
    public final RectF A0I;
    public final Drawable A0J;
    public final Drawable A0K;
    public final Drawable A0L;
    public final F10 A0M;
    public final F10 A0N;
    public final F10 A0O;
    public final CopyOnWriteArraySet A0P = new CopyOnWriteArraySet();
    public final boolean A0Q;

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

    public AnonymousClass4yM(Context context, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        int i4 = i;
        Path A0G2 = C86144wL.A0G();
        this.A0H = A0G2;
        RectF A0E2 = C86134wK.A0E();
        this.A0I = A0E2;
        this.A07 = new C135717zw(this);
        Context context2 = context;
        this.A0F = context2;
        this.A0Q = AnonymousClass0hB.A02(context2);
        this.A03 = i4;
        int i5 = i2;
        this.A02 = i5;
        float A032 = C09860go.A03(context2, 8);
        float A072 = (float) C86144wL.A07(context2, 24);
        this.A0B = C18240wQ.A01(context2, 4);
        int A073 = C86144wL.A07(context2, 16);
        this.A09 = A073;
        this.A0A = C86144wL.A07(context2, 8);
        this.A08 = C86144wL.A07(context2, 4);
        this.A0C = C86144wL.A07(context2, 8);
        int i6 = (int) (((float) A073) / 2.0f);
        this.A0D = i6;
        this.A0E = C86144wL.A07(context2, 2);
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i4, (float) i5);
        this.A06 = rectF;
        float[] fArr = new float[8];
        fArr[0] = A032;
        fArr[1] = A032;
        fArr[2] = A032;
        fArr[3] = A032;
        C86114wI.A11(A0G2, rectF, fArr, A032);
        int i7 = i3;
        if (i7 != -1) {
            Drawable drawable = context2.getDrawable(i7);
            this.A0J = drawable;
            drawable.setCallback(this);
            C86124wJ.A1C(drawable);
        } else {
            this.A0J = null;
        }
        Drawable drawable2 = context2.getDrawable(R.drawable.sticker_background_shadow);
        this.A0K = drawable2;
        drawable2.setCallback(this);
        A0E2.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A072, A072);
        float f = (float) (i - (A073 << 1));
        int i8 = (int) (0.8f * f);
        int argb = Color.argb(Math.round(38.25f), 0, 0, 0);
        F10 A0T = C86164wN.A0T(context2, (int) ((f - A0E2.width()) - ((float) i6)));
        this.A0O = A0T;
        A0T.A0B(C09860go.A03(context2, 12));
        Typeface typeface = Typeface.SANS_SERIF;
        A0T.A0L(typeface, 1);
        A0T.A0H(-1);
        A0T.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, argb);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0T.A0M(alignment);
        A0T.A0H = true;
        String str4 = str2;
        if (str2 != null) {
            A0T.A0O(str4);
        }
        F10 A0T2 = C86164wN.A0T(context2, i8);
        this.A0N = A0T2;
        A0T2.A0B(C09860go.A03(context2, 24));
        A0T2.A0D(C09860go.A02(context2, 2.0f), 1.0f);
        A0T2.A0L(typeface, 1);
        A0T2.A0H(-1);
        A0T2.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, argb);
        A0T2.A0M(alignment);
        A0T2.A0I(3, "…");
        A0T2.A0H = true;
        String str5 = str;
        if (str != null) {
            A0T2.A0O(str5);
        }
        F10 A0T3 = C86164wN.A0T(context2, i8);
        this.A0M = A0T3;
        A0T3.A0B(C09860go.A03(context2, 12));
        A0T3.A0L(typeface, 1);
        A0T3.A0H(-1);
        A0T3.A0F(10.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, argb);
        A0T3.A0M(alignment);
        A0T3.A0H = true;
        A0T3.A0O(str3);
        if (z) {
            Drawable drawable3 = context2.getDrawable(R.drawable.verified_profile);
            this.A0L = drawable3;
            drawable3.setCallback(this);
            C63393hP.A03(context2, drawable3, R.color.blue_5);
            C86124wJ.A1C(drawable3);
        } else {
            this.A0L = null;
        }
        C37030Jj7 A0A2 = C37744K2e.A01().A0A(imageUrl2, (String) null);
        A0A2.A07 = "profile_pic";
        A0A2.A02(this);
        A0A2.A01();
        C37744K2e A012 = C37744K2e.A01();
        ImageUrl imageUrl3 = imageUrl;
        imageUrl3.getClass();
        C37030Jj7 A0A3 = A012.A0A(imageUrl3, (String) null);
        A0A3.A07 = "media";
        A0A3.A02(this);
        A0A3.A01();
    }

    public final void A6Z(C144648iq r2) {
        this.A0P.add(r2);
    }

    public final void ADE() {
        this.A0P.clear();
    }

    public final boolean BVe() {
        if (this.A00 == null || this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void Cby(C144648iq r2) {
        this.A0P.remove(r2);
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A0G.setAlpha(i);
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0069 A[LOOP:0: B:5:0x0063->B:7:0x0069, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2 r13, X.L5E r14) {
        /*
            r12 = this;
            java.lang.Object r1 = r14.BFS()
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0073
            java.lang.Object r2 = r13.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            int r1 = r12.A03
            int r0 = r12.A02
            android.graphics.Bitmap r2 = android.media.ThumbnailUtils.extractThumbnail(r2, r1, r0)
            r12.A00 = r2
            android.graphics.Paint r1 = r12.A05
            r2.getClass()
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r11, r11)
            r1.setShader(r0)
            android.graphics.RectF r0 = r12.A06
            float r5 = r0.width()
            float r8 = r0.height()
            android.graphics.Paint r3 = r12.A04
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            r2 = 4
            r1 = 0
            r0 = 1184197120(0x46956a00, float:19125.0)
            int r0 = java.lang.Math.round(r0)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            int[] r9 = new int[]{r1, r1, r1, r0}
            float[] r10 = new float[r2]
            r10 = {0, 1048576000, 1056964608, 1065353216} // fill-array
            r6 = 0
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setShader(r4)
        L_0x0058:
            java.lang.Runnable r0 = r12.A07
            X.C63643hy.A04(r0)
        L_0x005d:
            java.util.concurrent.CopyOnWriteArraySet r0 = r12.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r1.next()
            X.8iq r0 = (X.C144648iq) r0
            r0.C5E()
            goto L_0x0063
        L_0x0073:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r13.A01
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.getClass()
            android.graphics.Bitmap r0 = X.C31176Gi6.A02(r0)
            r12.A01 = r0
            goto L_0x0058
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4yM.BmZ(com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2101000_I2, X.L5E):void");
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        if (!BVe()) {
            float height = this.A06.height();
            RectF rectF = this.A0I;
            float height2 = rectF.height();
            float f2 = height2 / 2.0f;
            Rect bounds = getBounds();
            this.A0K.draw(canvas);
            int save = canvas.save();
            C86134wK.A11(canvas, bounds);
            canvas.save();
            Path path = this.A0H;
            canvas.drawPath(path, this.A05);
            canvas.drawPath(path, this.A04);
            Drawable drawable = this.A0J;
            if (drawable != null) {
                int i2 = this.A0A;
                float f3 = (float) i2;
                if (this.A0Q) {
                    canvas.translate((float) ((this.A03 - i2) - drawable.getIntrinsicWidth()), f3);
                } else {
                    canvas.translate(f3, f3);
                }
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            int i3 = this.A09;
            float f4 = (float) i3;
            float f5 = (height - f4) - height2;
            boolean z = this.A0Q;
            if (z) {
                f4 = (float) (this.A03 - i3);
            }
            canvas.translate(f4, f5);
            canvas.save();
            if (z) {
                canvas.translate(-height2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, this.A0G);
            }
            F10 f10 = this.A0O;
            float f6 = f2 - (((float) f10.A04) / 2.0f);
            int i4 = this.A0D;
            if (z) {
                f = (float) ((-i4) - f10.A07);
            } else {
                f = height2 + ((float) i4);
            }
            canvas.translate(f, f6);
            f10.draw(canvas);
            Drawable drawable2 = this.A0L;
            if (drawable2 != null) {
                float intrinsicHeight = (((float) f10.A04) / 2.0f) - (((float) drawable2.getIntrinsicHeight()) / 2.0f);
                if (z) {
                    i = (-this.A0E) - drawable2.getIntrinsicWidth();
                } else {
                    i = f10.A07 + this.A0E;
                }
                canvas.translate((float) i, intrinsicHeight);
                drawable2.draw(canvas);
            }
            canvas.restore();
            F10 f102 = this.A0N;
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) ((-this.A0C) - f102.A04));
            canvas.save();
            if (z) {
                canvas.translate((float) (-f102.A07), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            f102.draw(canvas);
            canvas.restore();
            F10 f103 = this.A0M;
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) ((-this.A08) - f103.A04));
            if (z) {
                canvas.translate((float) (-f103.A07), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            } else {
                canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            f103.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0K;
        int i5 = this.A0B;
        drawable.setBounds(i - i5, i2 - i5, i3 + i5, i4 + i5);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
