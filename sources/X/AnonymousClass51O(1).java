package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: X.51O  reason: invalid class name */
public final class AnonymousClass51O extends FrameLayout {
    public PointF A00 = new PointF();
    public C107226gO A01 = new C107226gO();
    public String A02 = C28174Ezk.A00(249);
    public final Path A03 = C86144wL.A0G();

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    public final void dispatchDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        canvas.save();
        canvas.clipPath(this.A03);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    private final void A00(int i, int i2) {
        Path path = this.A03;
        path.reset();
        RectF A0E = C86134wK.A0E();
        float f = (float) i;
        PointF pointF = this.A00;
        float f2 = pointF.x;
        float f3 = (float) i2;
        float f4 = pointF.y;
        C107226gO r1 = this.A01;
        A0E.set(f2 * f, f4 * f3, (f2 + r1.A01) * f, (f4 + r1.A00) * f3);
        if (C04220Ms.A0I(this.A02, "ellipse")) {
            float f5 = (float) 2;
            float width = A0E.left - ((A0E.width() - f) / f5);
            float height = A0E.top - ((A0E.height() - f3) / f5);
            A0E.set(width, height, A0E.width() + width, A0E.height() + height);
        }
        boolean A0I = C04220Ms.A0I(this.A02, "ellipse");
        Path.Direction direction = Path.Direction.CW;
        if (A0I) {
            path.addOval(A0E, direction);
        } else {
            path.addRect(A0E, direction);
        }
    }

    public final void setMaskShape(String str) {
        this.A02 = str;
        A00(getWidth(), getHeight());
        invalidate();
    }

    public AnonymousClass51O(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C14030oh.A06(1802435030);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        C14030oh.A0D(-1436131389, A06);
    }

    public final void setMaskBounds(PointF pointF, C107226gO r4) {
        AnonymousClass0wJ.A1N(pointF, r4);
        this.A00 = pointF;
        this.A01 = r4;
        A00(getWidth(), getHeight());
        invalidate();
    }
}
