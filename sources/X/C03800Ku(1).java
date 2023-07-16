package X;

/* renamed from: X.0Ku  reason: invalid class name and case insensitive filesystem */
public final class C03800Ku {
    public static String A00(Class cls) {
        String str;
        try {
            str = (String) cls.getDeclaredField("__redex_internal_original_name").get(cls);
        } catch (NoSuchFieldException unused) {
            str = cls.getName();
        } catch (Exception e) {
            throw new Error(e);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        if (lastIndexOf != str.length()) {
            try {
                return str.substring(lastIndexOf + 1);
            } catch (Exception e2) {
                throw new Error(e2);
            }
        } else {
            throw new Error(AnonymousClass00U.A0V("Unexpected string ", str, " in __redex_internal_original_name"));
        }
    }
}
