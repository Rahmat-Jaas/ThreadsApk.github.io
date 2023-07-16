package X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;

/* renamed from: X.3WG  reason: invalid class name */
public final class AnonymousClass3WG {
    public static ImageUrl A00(Uri uri) {
        return new SimpleImageUrl(uri.toString(), -1, -1);
    }

    public static boolean A02(ImageUrl imageUrl) {
        String url;
        if (imageUrl == null || (url = imageUrl.getUrl()) == null || url.isEmpty()) {
            return true;
        }
        return false;
    }

    public static ImageUrl A01(File file, int i, int i2) {
        return new SimpleImageUrl(Uri.fromFile(file).toString(), i, i2);
    }
}
