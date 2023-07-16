package com.mapbox.mapboxsdk.text;

import X.C86144wL;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import com.facebook.react.uimanager.BaseViewManager;

public class LocalGlyphRasterizer {
    public final Bitmap bitmap;
    public final Canvas canvas;
    public final Paint paint;

    public Bitmap drawGlyphBitmap(String str, boolean z, char c) {
        this.paint.setTypeface(Typeface.create(str, z ? 1 : 0));
        this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.canvas.drawText(String.valueOf(c), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 20.0f, this.paint);
        return this.bitmap;
    }

    public LocalGlyphRasterizer() {
        Bitmap createBitmap = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        Paint A0F = C86144wL.A0F();
        this.paint = A0F;
        A0F.setAntiAlias(true);
        A0F.setTextSize(24.0f);
        Canvas canvas2 = new Canvas();
        this.canvas = canvas2;
        canvas2.setBitmap(createBitmap);
    }
}
