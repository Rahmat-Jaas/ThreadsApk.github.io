package X;

/* renamed from: X.3QX  reason: invalid class name */
public final class AnonymousClass3QX {
    public static final int A00 = ((((byte) 17) | 0) | -256);

    public static AnonymousClass0TN A00(int i) {
        boolean z = false;
        char c = 0;
        if ((i & 16) != 0) {
            c = 2;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = c | z;
        if (!z2) {
            return AnonymousClass0TN.SERVER;
        }
        if (z2) {
            return AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL;
        }
        if (z2) {
            return AnonymousClass0TN.DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID;
        }
        if (z2) {
            return AnonymousClass0TN.DEFAULT__MISSING_SERVER_VALUE;
        }
        AnonymousClass0LU.A0D("MobileConfigTableUtil", "should never reach default case in getValueSource");
        return AnonymousClass0TN.UNKNOWN;
    }
}
