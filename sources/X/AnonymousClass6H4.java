package X;

import android.graphics.RectF;

/* renamed from: X.6H4  reason: invalid class name */
public final class AnonymousClass6H4 {
    public static final C111426ne A00(RectF rectF, AnonymousClass6DN r5) {
        if (r5 == null) {
            return new AnonymousClass5FX(rectF);
        }
        return new AnonymousClass5FY(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f);
    }
}
