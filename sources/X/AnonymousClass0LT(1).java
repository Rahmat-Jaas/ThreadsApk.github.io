package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0LT  reason: invalid class name */
public final class AnonymousClass0LT {
    public static volatile Boolean A00;

    public static boolean A02(Context context) {
        if (A00 == null) {
            boolean z = true;
            if (AnonymousClass0SH.A00(context, "mdcd_multiprocess_enable", 0) != 1) {
                z = false;
            }
            A00 = Boolean.valueOf(z);
        }
        return A00.booleanValue();
    }

    public static File A00(Context context) {
        File file = new File(A01(context), AnonymousClass00U.A0S("v", "/", AnonymousClass0FX.A01()));
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File A01(Context context) {
        return new File(J5V.A00(context.getCacheDir()), "ClassTraces/");
    }
}
