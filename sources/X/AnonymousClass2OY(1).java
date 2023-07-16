package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.2OY  reason: invalid class name */
public final class AnonymousClass2OY {
    public static Drawable A00(Context context, int i, int i2, int i3) {
        ColorFilter colorFilter;
        Resources resources = context.getResources();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) context.getDrawable(i);
        bitmapDrawable.setGravity(51);
        if (i3 != 0) {
            colorFilter = C63393hP.A00(i3);
        } else {
            colorFilter = null;
        }
        bitmapDrawable.setColorFilter(colorFilter);
        bitmapDrawable.setBounds(0, 0, (int) TypedValue.applyDimension(1, (float) i2, resources.getDisplayMetrics()), bitmapDrawable.getIntrinsicHeight());
        return bitmapDrawable;
    }
}
