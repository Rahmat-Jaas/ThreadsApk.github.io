package X;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0qA  reason: invalid class name and case insensitive filesystem */
public final class C14790qA {
    public static final String A00 = AnonymousClass00U.A0J("disable_compaction", AnonymousClass0FX.A01());
    public static final Set A01 = new HashSet(Arrays.asList(new String[]{"armeabi", "armeabi-v7a", "arm64-v8a"}));

    public static File A00(Context context) {
        File A002 = C14630pr.A00(context, 1224234478);
        if (A002.exists() && !A002.isDirectory()) {
            A002.delete();
        }
        if (!A002.exists()) {
            A002.mkdir();
        }
        if (A002.isDirectory()) {
            return A002;
        }
        throw new RuntimeException("could not create compactSoSource directory");
    }
}
