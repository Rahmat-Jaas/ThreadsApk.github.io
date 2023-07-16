package X;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: X.0h7  reason: invalid class name */
public final class AnonymousClass0h7 {
    public static final float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final int A01(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
