package X;

import android.graphics.Bitmap;
import java.io.OutputStream;

/* renamed from: X.2Ly  reason: invalid class name and case insensitive filesystem */
public final class C35062Ly {
    public static final boolean A00(Bitmap.CompressFormat compressFormat, Bitmap bitmap, OutputStream outputStream) {
        AnonymousClass0wJ.A1N(bitmap, compressFormat);
        return bitmap.compress(compressFormat, 100, outputStream);
    }
}
