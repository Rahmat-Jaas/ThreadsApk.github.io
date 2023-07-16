package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.0hi  reason: invalid class name and case insensitive filesystem */
public final class C10090hi {
    public static void A00(Bundle bundle, ClassLoader classLoader, Set set) {
        if (!set.contains(bundle)) {
            bundle.setClassLoader(classLoader);
            set.add(bundle);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    A00((Bundle) obj, classLoader, set);
                }
            }
        }
    }
}
