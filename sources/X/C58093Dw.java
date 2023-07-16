package X;

/* renamed from: X.3Dw  reason: invalid class name and case insensitive filesystem */
public final class C58093Dw {
    public final long A00(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        String[] A1b = C18190wL.A1b(str, "_", 0);
        if (A1b != null && A1b.length > 1) {
            str = A1b[0];
        }
        C04220Ms.A0B(str, 0);
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
