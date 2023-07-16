package X;

import android.graphics.Bitmap;

/* renamed from: X.0oG  reason: invalid class name and case insensitive filesystem */
public final class C13760oG {
    public static void A00(Bitmap bitmap) {
        if (bitmap != null && bitmap.isRecycled()) {
            StringBuilder sb = new StringBuilder("Bitmap is recycled: ");
            sb.append(bitmap);
            throw new IllegalStateException(sb.toString());
        }
    }
}
