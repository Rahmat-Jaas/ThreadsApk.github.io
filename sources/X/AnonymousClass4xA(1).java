package X;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* renamed from: X.4xA  reason: invalid class name */
public final class AnonymousClass4xA extends Canvas {
    public Canvas A00;

    public static Canvas A00(AnonymousClass4xA r1, Object obj) {
        C04220Ms.A0B(obj, 0);
        return r1.A00;
    }

    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        Paint paint2 = paint;
        C04220Ms.A0B(paint2, 7);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawArc(f, f2, f3, f4, f5, f6, z, paint2);
        }
    }

    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        Bitmap bitmap2 = bitmap;
        float[] fArr2 = fArr;
        C18180wK.A1P(bitmap, 0, fArr);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawBitmapMesh(bitmap2, i, i2, fArr2, i3, iArr, i4, paint);
        }
    }

    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        C04220Ms.A0B(paint, 3);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawCircle(f, f2, f3, paint);
        }
    }

    public final void drawColor(int i, BlendMode blendMode) {
        C04220Ms.A0B(blendMode, 1);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawColor(i, blendMode);
        }
    }

    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        RectF rectF3 = rectF;
        RectF rectF4 = rectF2;
        C18180wK.A1P(rectF, 0, rectF2);
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 6);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawDoubleRoundRect(rectF3, f, f2, rectF4, f3, f4, paint2);
        }
    }

    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        AnonymousClass0wJ.A1M(iArr, 0, fArr);
        Font font2 = font;
        Paint paint2 = paint;
        C18230wP.A1R(font, 5, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawGlyphs(iArr2, i, fArr2, i2, i3, font2, paint2);
        }
    }

    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 4);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawLine(f, f2, f3, f4, paint2);
        }
    }

    public final void drawPoint(float f, float f2, Paint paint) {
        C04220Ms.A0B(paint, 2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 6);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint2);
        }
    }

    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        C18190wL.A1S(charSequence, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawText(charSequence2, i, i2, f, f2, paint2);
        }
    }

    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        char[] cArr2 = cArr;
        Path path2 = path;
        C18180wK.A1P(cArr, 0, path);
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 6);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawTextOnPath(cArr2, i, i2, path2, f, f2, paint2);
        }
    }

    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        MeasuredText measuredText2 = measuredText;
        Paint paint2 = paint;
        C18210wN.A1M(measuredText, 0, paint2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawTextRun(measuredText2, i, i2, i3, i4, f, f2, z, paint2);
        }
    }

    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        Canvas.VertexMode vertexMode2 = vertexMode;
        float[] fArr3 = fArr;
        AnonymousClass0wJ.A1M(vertexMode, 0, fArr3);
        Paint paint2 = paint;
        C04220Ms.A0B(paint2, 11);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawVertices(vertexMode2, i, fArr3, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint2);
        }
    }

    public final boolean getClipBounds(Rect rect) {
        C04220Ms.A0B(rect, 0);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    public static void A01() {
        C04220Ms.A0E("nativeCanvas");
    }

    public final void concat(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.concat(matrix);
        }
    }

    public final void disableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.disableZ();
        }
    }

    public final void drawARGB(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawARGB(i, i2, i3, i4);
        }
    }

    public final void drawRGB(int i, int i2, int i3) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRGB(i, i2, i3);
        }
    }

    public final void enableZ() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.enableZ();
        }
    }

    public final int getDensity() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDensity();
        }
        A01();
        throw null;
    }

    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        A01();
        throw null;
    }

    public final int getHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getHeight();
        }
        A01();
        throw null;
    }

    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        A01();
        throw null;
    }

    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        A01();
        throw null;
    }

    public final int getSaveCount() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        A01();
        throw null;
    }

    public final int getWidth() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.getWidth();
        }
        A01();
        throw null;
    }

    public final boolean isOpaque() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        A01();
        throw null;
    }

    public final void restore() {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.restore();
        }
    }

    public final void restoreToCount(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.restoreToCount(i);
        }
    }

    public final void rotate(float f) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.rotate(f);
        }
    }

    public final int save() {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.save();
        }
        A01();
        throw null;
    }

    public final int saveLayer(RectF rectF, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i);
        }
        A01();
        throw null;
    }

    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i, i2);
        }
        A01();
        throw null;
    }

    public final void scale(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.scale(f, f2);
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.setBitmap(bitmap);
        }
    }

    public final void setDensity(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.setDensity(i);
        }
    }

    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.setDrawFilter(drawFilter);
        }
    }

    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.setMatrix(matrix);
        }
    }

    public final void skew(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.skew(f, f2);
        }
    }

    public final void translate(float f, float f2) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.translate(f, f2);
        }
    }

    public final boolean clipOutPath(Path path) {
        Canvas A002 = A00(this, path);
        if (A002 != null) {
            return A002.clipOutPath(path);
        }
        A01();
        throw null;
    }

    public final boolean clipOutRect(Rect rect) {
        Canvas A002 = A00(this, rect);
        if (A002 != null) {
            return A002.clipOutRect(rect);
        }
        A01();
        throw null;
    }

    public final boolean clipPath(Path path, Region.Op op) {
        AnonymousClass0wJ.A1N(path, op);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        A01();
        throw null;
    }

    public final boolean clipRect(Rect rect, Region.Op op) {
        AnonymousClass0wJ.A1N(rect, op);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        A01();
        throw null;
    }

    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        AnonymousClass0wJ.A1N(bitmap, matrix);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, matrix, paint);
        }
    }

    public final void drawLines(float[] fArr, Paint paint) {
        AnonymousClass0wJ.A1N(fArr, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawLines(fArr, paint);
        }
    }

    public final void drawOval(RectF rectF, Paint paint) {
        AnonymousClass0wJ.A1N(rectF, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawOval(rectF, paint);
        }
    }

    public final void drawPaint(Paint paint) {
        Canvas A002 = A00(this, paint);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawPaint(paint);
        }
    }

    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        AnonymousClass0wJ.A1N(ninePatch, rect);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPatch(ninePatch, rect, paint);
        }
    }

    public final void drawPath(Path path, Paint paint) {
        AnonymousClass0wJ.A1N(path, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public final void drawPicture(Picture picture, Rect rect) {
        AnonymousClass0wJ.A1N(picture, rect);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPicture(picture, rect);
        }
    }

    public final void drawPoints(float[] fArr, Paint paint) {
        AnonymousClass0wJ.A1N(fArr, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPoints(fArr, paint);
        }
    }

    public final void drawPosText(String str, float[] fArr, Paint paint) {
        AnonymousClass0wJ.A1N(str, fArr);
        C04220Ms.A0B(paint, 2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPosText(str, fArr, paint);
        }
    }

    public final void drawRect(Rect rect, Paint paint) {
        AnonymousClass0wJ.A1N(rect, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRect(rect, paint);
        }
    }

    public final void drawRenderNode(RenderNode renderNode) {
        Canvas A002 = A00(this, renderNode);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawRenderNode(renderNode);
        }
    }

    public final void getMatrix(Matrix matrix) {
        Canvas A002 = A00(this, matrix);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.getMatrix(matrix);
        }
    }

    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        AnonymousClass0wJ.A1N(path, edgeType);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        A01();
        throw null;
    }

    public final boolean clipOutRect(RectF rectF) {
        Canvas A002 = A00(this, rectF);
        if (A002 != null) {
            return A002.clipOutRect(rectF);
        }
        A01();
        throw null;
    }

    public final boolean clipPath(Path path) {
        Canvas A002 = A00(this, path);
        if (A002 != null) {
            return A002.clipPath(path);
        }
        A01();
        throw null;
    }

    public final boolean clipRect(Rect rect) {
        Canvas A002 = A00(this, rect);
        if (A002 != null) {
            return A002.clipRect(rect);
        }
        A01();
        throw null;
    }

    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        RectF rectF2 = rectF;
        Paint paint2 = paint;
        C18180wK.A1Q(rectF, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawArc(rectF2, f, f2, z, paint2);
        }
    }

    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        Canvas A002 = A00(this, iArr);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawBitmap(iArr2, i, i2, f, f2, i3, i4, z, paint);
        }
    }

    public final void drawColor(int i) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawColor(i);
        }
    }

    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        RectF rectF3 = rectF;
        float[] fArr3 = fArr;
        AnonymousClass0wJ.A1N(rectF, fArr);
        RectF rectF4 = rectF2;
        float[] fArr4 = fArr2;
        AnonymousClass0wJ.A1Q(rectF2, fArr2);
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 4);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawDoubleRoundRect(rectF3, fArr3, rectF4, fArr4, paint2);
        }
    }

    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        C18180wK.A1P(fArr, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawLines(fArr, i, i2, paint);
        }
    }

    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 4);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawOval(f, f2, f3, f4, paint2);
        }
    }

    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        AnonymousClass0wJ.A1N(ninePatch, rectF);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPatch(ninePatch, rectF, paint);
        }
    }

    public final void drawPicture(Picture picture) {
        Canvas A002 = A00(this, picture);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawPicture(picture);
        }
    }

    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        C04220Ms.A0B(paint, 3);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPoints(fArr, i, i2, paint);
        }
    }

    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        char[] cArr2 = cArr;
        C04220Ms.A0B(cArr, 0);
        float[] fArr2 = fArr;
        Paint paint2 = paint;
        AnonymousClass0wJ.A1R(fArr, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPosText(cArr2, i, i2, fArr2, paint2);
        }
    }

    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 4);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRect(f, f2, f3, f4, paint2);
        }
    }

    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        C18180wK.A1P(rectF, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRoundRect(rectF, f, f2, paint);
        }
    }

    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        String str2 = str;
        Paint paint2 = paint;
        C18190wL.A1S(str, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawText(str2, i, i2, f, f2, paint2);
        }
    }

    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        String str2 = str;
        Path path2 = path;
        AnonymousClass0wJ.A1N(str, path);
        Paint paint2 = paint;
        C04220Ms.A0B(paint, 4);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawTextOnPath(str2, path2, f, f2, paint2);
        }
    }

    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        C18210wN.A1M(charSequence, 0, paint2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawTextRun(charSequence2, i, i2, i3, i4, f, f2, z, paint2);
        }
    }

    public final boolean quickReject(Path path) {
        Canvas A002 = A00(this, path);
        if (A002 != null) {
            return A002.quickReject(path);
        }
        A01();
        throw null;
    }

    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint);
        }
        A01();
        throw null;
    }

    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        A01();
        throw null;
    }

    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(f, f2, f3, f4);
        }
        A01();
        throw null;
    }

    public final boolean clipRect(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4);
        }
        A01();
        throw null;
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        AnonymousClass0wJ.A1M(bitmap, 0, rect2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        }
    }

    public final void drawColor(int i, PorterDuff.Mode mode) {
        C04220Ms.A0B(mode, 1);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawColor(i, mode);
        }
    }

    public final void drawPicture(Picture picture, RectF rectF) {
        AnonymousClass0wJ.A1N(picture, rectF);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawPicture(picture, rectF);
        }
    }

    public final void drawRect(RectF rectF, Paint paint) {
        AnonymousClass0wJ.A1N(rectF, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawRect(rectF, paint);
        }
    }

    public final void drawText(String str, float f, float f2, Paint paint) {
        C18180wK.A1P(str, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawText(str, f, f2, paint);
        }
    }

    public final boolean quickReject(float f, float f2, float f3, float f4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4);
        }
        A01();
        throw null;
    }

    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        A01();
        throw null;
    }

    public final int saveLayerAlpha(RectF rectF, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        A01();
        throw null;
    }

    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        char[] cArr2 = cArr;
        Paint paint2 = paint;
        C18210wN.A1M(cArr, 0, paint2);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawTextRun(cArr2, i, i2, i3, i4, f, f2, z, paint2);
        }
    }

    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipOutRect(i, i2, i3, i4);
        }
        A01();
        throw null;
    }

    public final boolean clipRect(RectF rectF, Region.Op op) {
        AnonymousClass0wJ.A1N(rectF, op);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        A01();
        throw null;
    }

    public final void drawColor(long j, BlendMode blendMode) {
        C04220Ms.A0B(blendMode, 1);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawColor(j, blendMode);
        }
    }

    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        char[] cArr2 = cArr;
        Paint paint2 = paint;
        C18190wL.A1S(cArr, 0, paint);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawText(cArr2, i, i2, f, f2, paint2);
        }
    }

    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        AnonymousClass0wJ.A1N(rectF, edgeType);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        A01();
        throw null;
    }

    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayer(f, f2, f3, f4, paint, i);
        }
        A01();
        throw null;
    }

    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i, i2);
        }
        A01();
        throw null;
    }

    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        int[] iArr2 = iArr;
        Canvas A002 = A00(this, iArr);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawBitmap(iArr2, i, i2, i3, i4, i5, i6, z, paint);
        }
    }

    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        Region.Op op2 = op;
        C04220Ms.A0B(op, 4);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(f, f2, f3, f4, op2);
        }
        A01();
        throw null;
    }

    public final void drawColor(long j) {
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawColor(j);
        }
    }

    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        Canvas.EdgeType edgeType2 = edgeType;
        C04220Ms.A0B(edgeType, 4);
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.quickReject(f, f2, f3, f4, edgeType2);
        }
        A01();
        throw null;
    }

    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        AnonymousClass0wJ.A1M(bitmap, 0, rectF);
        Canvas canvas = this.A00;
        if (canvas == null) {
            A01();
            throw null;
        } else {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        }
    }

    public final boolean clipRect(int i, int i2, int i3, int i4) {
        Canvas canvas = this.A00;
        if (canvas != null) {
            return canvas.clipRect(i, i2, i3, i4);
        }
        A01();
        throw null;
    }

    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        Canvas A002 = A00(this, bitmap);
        if (A002 == null) {
            A01();
            throw null;
        } else {
            A002.drawBitmap(bitmap, f, f2, paint);
        }
    }

    public final boolean quickReject(RectF rectF) {
        Canvas A002 = A00(this, rectF);
        if (A002 != null) {
            return A002.quickReject(rectF);
        }
        A01();
        throw null;
    }

    public final boolean clipRect(RectF rectF) {
        Canvas A002 = A00(this, rectF);
        if (A002 != null) {
            return A002.clipRect(rectF);
        }
        A01();
        throw null;
    }
}
