package X;

import android.text.TextUtils;

/* renamed from: X.3hZ  reason: invalid class name and case insensitive filesystem */
public final class C63483hZ {
    public static String A00(AnonymousClass3XX r1) {
        Throwable th;
        if (r1 == null || (th = r1.A01) == null || !(th instanceof AnonymousClass6CK)) {
            return null;
        }
        C146138lh A00 = ((AnonymousClass6CK) th).A00();
        A00.getClass();
        return A00.getDescription();
    }

    public static String A01(AnonymousClass3XX r0) {
        Object obj = r0.A00;
        if (obj != null) {
            return ((C85814vo) obj).getErrorType();
        }
        return null;
    }

    public static String A02(AnonymousClass3XX r2) {
        Object obj = r2.A00;
        if (obj != null) {
            C85814vo r1 = (C85814vo) obj;
            if (!TextUtils.isEmpty(r1.getErrorMessage())) {
                return r1.getErrorMessage();
            }
        }
        Throwable th = r2.A01;
        if (th == null || TextUtils.isEmpty(th.getMessage())) {
            return "";
        }
        return th.getMessage();
    }

    public static String A03(AnonymousClass3XX r1, String str) {
        String str2;
        Throwable th;
        C146138lh A00;
        if (r1 == null || (th = r1.A01) == null || !(th instanceof AnonymousClass6CK) || (A00 = ((AnonymousClass6CK) th).A00()) == null) {
            str2 = str;
        } else {
            str2 = A00.getDescription();
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public static String A04(AnonymousClass3XX r1, String str) {
        Object obj = r1.A00;
        if (obj == null) {
            return str;
        }
        C85814vo r12 = (C85814vo) obj;
        if (!TextUtils.isEmpty(r12.getErrorMessage())) {
            return r12.getErrorMessage();
        }
        return str;
    }

    public static boolean A05(C10300i6 r2) {
        if (C04660Oo.A00(r2) == null || C04660Oo.A00(r2).A0g() != AnonymousClass266.A04) {
            return false;
        }
        return true;
    }

    public static boolean A06(C10300i6 r2) {
        if (C04660Oo.A00(r2) == null || C04660Oo.A00(r2).A0g() != AnonymousClass266.A05) {
            return false;
        }
        return true;
    }

    public static boolean A07(C10300i6 r1) {
        if (A05(r1) || A06(r1)) {
            return true;
        }
        return false;
    }
}
