package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.6ne  reason: invalid class name and case insensitive filesystem */
public abstract class C111426ne {
    public final void A00(Canvas canvas, Paint paint) {
        if (this instanceof AnonymousClass5FX) {
            C04220Ms.A0B(paint, 1);
            canvas.drawRect(((AnonymousClass5FX) this).A00, paint);
            return;
        }
        AnonymousClass5FY r3 = (AnonymousClass5FY) this;
        C04220Ms.A0B(paint, 1);
        canvas.drawCircle(r3.A00, r3.A01, r3.A02, paint);
    }
}
