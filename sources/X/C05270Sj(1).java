package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Sj  reason: invalid class name and case insensitive filesystem */
public final class C05270Sj {
    public static final SparseArray A00 = new C05320Ss();
    public static final Map A01 = new HashMap();

    static {
        int i = 0;
        while (true) {
            SparseArray sparseArray = A00;
            if (i < sparseArray.size()) {
                A01.put(sparseArray.valueAt(i), Integer.valueOf(sparseArray.keyAt(i)));
                i++;
            } else {
                return;
            }
        }
    }

    public static String A00(String str) {
        if (str.startsWith("/")) {
            return str;
        }
        try {
            return (String) A00.get(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
