package X;

/* renamed from: X.0i2  reason: invalid class name */
public final class AnonymousClass0i2 {
    public static final String A00(String str) {
        if (!AnonymousClass8bP.A0j(str, ":", false)) {
            return str;
        }
        String[] strArr = (String[]) new C134697yC(":").A02(str, 0).toArray(new String[0]);
        if (strArr.length > 1) {
            return strArr[1];
        }
        throw new IllegalStateException("Check failed.");
    }
}
