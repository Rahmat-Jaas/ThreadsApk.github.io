package X;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.0qG  reason: invalid class name and case insensitive filesystem */
public final class C14850qG {
    public static Context A00;
    public static ArrayList A01;
    public static boolean A02;

    public static AnonymousClass0q9 A00(AssetManager assetManager, String str) {
        if (str.isEmpty()) {
            return null;
        }
        try {
            assetManager.open(AnonymousClass00U.A0d("lib", File.separator, "libs", str)).close();
            AnonymousClass0q9 r0 = (AnonymousClass0q9) AnonymousClass0q9.A02.get(str);
            if (r0 != null) {
                return r0;
            }
            throw new RuntimeException(AnonymousClass00U.A0L("FbSoLoader unable to determine compression algorithm for ", str));
        } catch (IOException unused) {
            return null;
        }
    }
}
