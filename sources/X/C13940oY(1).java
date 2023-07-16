package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.0oY  reason: invalid class name and case insensitive filesystem */
public final class C13940oY {
    public static Bitmap A00(BitmapFactory.Options options, byte[] bArr, int i) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        C37178Jlz A00 = C37178Jlz.A00();
        if (!(A00 == null || decodeByteArray == null)) {
            A00.A02(decodeByteArray);
        }
        return decodeByteArray;
    }
}
