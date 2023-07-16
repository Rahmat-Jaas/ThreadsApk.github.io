package X;

import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0JS  reason: invalid class name */
public final class AnonymousClass0JS {
    public static List A00(String str, DexFile[] dexFileArr) {
        String str2;
        if (str == null) {
            str2 = "Cannot get pgo methods since no profile was given";
        } else if (dexFileArr == null || dexFileArr.length == 0) {
            str2 = "Cannot get pgo methods since no dex files were given";
        } else {
            File file = new File(str);
            if (!file.exists() || file.length() <= 0) {
                Log.w("PgoUtils", String.format("Cannot get pgo methods since the given profile doesn't exist yet. Profile Path: %s", new Object[]{str}));
            }
            return Collections.emptyList();
        }
        Log.e("PgoUtils", str2);
        return Collections.emptyList();
    }
}
