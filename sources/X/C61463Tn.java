package X;

import java.util.List;

/* renamed from: X.3Tn  reason: invalid class name and case insensitive filesystem */
public final class C61463Tn {
    public static final C61463Tn A00 = new C61463Tn();

    public final int countBframe(List list) {
        C04220Ms.A0B(list, 0);
        int i = 0;
        long j = Long.MIN_VALUE;
        for (Object A08 : list) {
            long A082 = C18190wL.A08(A08);
            if (A082 > j) {
                j = A082;
            } else {
                i++;
            }
        }
        return i;
    }
}
