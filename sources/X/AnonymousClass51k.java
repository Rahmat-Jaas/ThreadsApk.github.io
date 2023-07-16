package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.51k  reason: invalid class name */
public final class AnonymousClass51k extends ImageView {
    public static final float A01 = ((float) AnonymousClass6H5.A00(2));
    public float A00 = ((float) AnonymousClass6H5.A00(280));

    public AnonymousClass51k(Context context, int i) {
        super(context);
        this.A00 = (float) AnonymousClass6H5.A00(i);
    }

    public final void draw(Canvas canvas) {
        int i;
        Bitmap createBitmap;
        int i2;
        int A03 = C14030oh.A03(902654691);
        if (isInEditMode()) {
            super.draw(canvas);
            i = 300945811;
        } else {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    createBitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
                        drawable.draw(canvas2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (createBitmap != null && createBitmap.getWidth() > 0 && createBitmap.getHeight() > 0) {
                    int width = createBitmap.getWidth();
                    int height = createBitmap.getHeight();
                    if (width != height) {
                        int min = Math.min(width, height);
                        int i3 = 0;
                        if (width > height) {
                            i3 = (width - height) >> 1;
                        } else if (width < height) {
                            i2 = (height - width) >> 1;
                            C13760oG.A00(createBitmap);
                            createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                        }
                        i2 = 0;
                        C13760oG.A00(createBitmap);
                        createBitmap = Bitmap.createBitmap(createBitmap, i3, i2, min, min);
                    }
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                    float f = this.A00;
                    float max = Math.max(f / ((float) width), f / ((float) height));
                    Matrix A0E = C86164wN.A0E();
                    A0E.setScale(max, max);
                    bitmapShader.setLocalMatrix(A0E);
                    Paint A0F = C86144wL.A0F();
                    Paint A0F2 = C86144wL.A0F();
                    A0F2.setAntiAlias(true);
                    A0F2.setFilterBitmap(true);
                    A0F2.setDither(true);
                    A0F2.setColor(-1);
                    C86134wK.A12(A0F2);
                    A0F2.setStrokeWidth(A01);
                    A0F.setAntiAlias(true);
                    A0F.setFilterBitmap(true);
                    A0F.setDither(true);
                    A0F.setShader(bitmapShader);
                    float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
                    float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
                    float f2 = f / 2.0f;
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, A0F);
                    canvas.drawCircle(measuredWidth, measuredHeight, f2, A0F2);
                    i = -98417357;
                }
            }
            super.draw(canvas);
            i = -98417357;
        }
        C14030oh.A0A(i, A03);
    }
}
