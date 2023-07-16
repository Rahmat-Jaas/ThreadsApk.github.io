package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: X.4xE  reason: invalid class name */
public final class AnonymousClass4xE extends Drawable {
    public final Paint A00;
    public final Path A01 = C86144wL.A0G();

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        Path path = this.A01;
        path.addCircle(((float) C86124wJ.A0A(this)) / 2.0f, ((float) C86134wK.A08(this)) / 2.0f, ((float) C86124wJ.A0A(this)) / 2.0f, Path.Direction.CW);
        C86114wI.A10(canvas, this);
        canvas.drawPath(path, this.A00);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4xE() {
        Paint A0C = C86114wI.A0C(3);
        A0C.setColor(-1);
        C86134wK.A13(A0C);
        this.A00 = A0C;
    }
}
