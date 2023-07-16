package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Lr  reason: invalid class name and case insensitive filesystem */
public final class C34992Lr {
    public static final Drawable A00(Context context, Drawable drawable, int i) {
        boolean A1V = C18210wN.A1V(drawable);
        int A01 = C18240wQ.A01(context, i);
        Bitmap createBitmap = Bitmap.createBitmap(A01, A01, Bitmap.Config.ARGB_8888);
        C18220wO.A15(createBitmap, drawable, A1V ? 1 : 0);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
