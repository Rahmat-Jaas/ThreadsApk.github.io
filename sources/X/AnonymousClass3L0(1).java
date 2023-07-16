package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.3L0  reason: invalid class name */
public final class AnonymousClass3L0 {
    public static File A00(Context context, String str, String str2) {
        File file = new File(context.getCacheDir(), C28174Ezk.A00(563));
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file.getCanonicalPath(), AnonymousClass00U.A0V(str, Long.toString(System.currentTimeMillis()), str2));
    }
}
