package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0q4  reason: invalid class name and case insensitive filesystem */
public final class C14740q4 {
    public static String A00(long j) {
        return String.format((Locale) null, "%.3f", new Object[]{Double.valueOf(((double) j) / 1000.0d)});
    }

    public static Map A01(String... strArr) {
        int length = strArr.length;
        if (length % 2 == 0) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i += 2) {
                String str = strArr[i];
                if (str == null) {
                    str = "";
                }
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str, str2);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Map must have an even (or zero) number of parameters");
    }
}
