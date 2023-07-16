package X;

import android.content.Context;
import com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver;
import java.io.File;

/* renamed from: X.0nh  reason: invalid class name and case insensitive filesystem */
public final class C13440nh {
    public static boolean A00(String str, Context context) {
        String A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (A00 != null) {
            return new File(A00).exists();
        }
        return false;
    }
}
