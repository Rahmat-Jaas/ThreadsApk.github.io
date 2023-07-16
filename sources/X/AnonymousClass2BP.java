package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.2BP  reason: invalid class name */
public final class AnonymousClass2BP {
    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        Bitmap createBitmap;
        C04220Ms.A0B(drawable, 0);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw C18190wL.A0a("bitmap is null");
            } else if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                createBitmap = bitmapDrawable.getBitmap();
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                C13760oG.A00(bitmap);
                createBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
        } else {
            Rect bounds = drawable.getBounds();
            C04220Ms.A06(bounds);
            int i3 = bounds.left;
            int i4 = bounds.top;
            int i5 = bounds.right;
            int i6 = bounds.bottom;
            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(new Canvas(createBitmap));
            drawable.setBounds(i3, i4, i5, i6);
        }
        C04220Ms.A06(createBitmap);
        return createBitmap;
    }
}
