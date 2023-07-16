package X;

import android.net.Uri;

/* renamed from: X.3Ww  reason: invalid class name and case insensitive filesystem */
public final class C62033Ww {
    public static final C16240si A00 = C18190wL.A0I();

    public static final boolean A01(String str) {
        Uri A002;
        if (str == null || (A002 = C15430rJ.A00(A00, str, true)) == null) {
            return false;
        }
        return A00(A002.getHost());
    }

    public static final boolean A00(String str) {
        if (str == null) {
            return false;
        }
        if (str.equals("instagram.com") || str.endsWith(".instagram.com")) {
            return true;
        }
        return false;
    }
}
