package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.4xR  reason: invalid class name and case insensitive filesystem */
public final class C86314xR extends Drawable {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final ShapeDrawable A03;
    public final Shape A04;

    public C86314xR(Shape shape, float f, int i, int i2) {
        this.A04 = shape;
        this.A01 = i2;
        Paint A0C = C86114wI.A0C(3);
        this.A02 = A0C;
        C86134wK.A13(A0C);
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        this.A03 = shapeDrawable;
        shapeDrawable.getPaint().setShadowLayer(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, i);
        shapeDrawable.setAlpha(255);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = new Rect(rect);
        rect2.inset(0, this.A01);
        this.A04.resize((float) rect2.width(), (float) rect2.height());
        this.A03.setBounds(rect2);
        this.A00 = null;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A03.draw(new Canvas(createBitmap));
        }
        canvas.drawBitmap(this.A00, (float) bounds.left, (float) bounds.top, this.A02);
    }
}
