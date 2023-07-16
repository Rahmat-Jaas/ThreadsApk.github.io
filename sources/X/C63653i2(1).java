package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.3i2  reason: invalid class name and case insensitive filesystem */
public final class C63653i2 {
    public static final Intent A03(Context context, Bundle bundle, String str, String str2) {
        C04220Ms.A0B(context, 0);
        Intent className = C18230wP.A0B().setClassName(context, str);
        C04220Ms.A06(className);
        if (bundle != null) {
            className.putExtras(bundle);
        }
        return className.putExtra("key_uri", str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent A04(android.content.Context r11, java.lang.String r12, java.lang.String r13, char[] r14, int r15, boolean r16) {
        /*
            r5 = 0
            X.C04220Ms.A0B(r11, r5)
            int r2 = r15 + 1
            int r4 = r14.length
            r3 = 63
            if (r2 >= r4) goto L_0x005b
            char r1 = r14[r15]
            r0 = 47
            if (r1 != r0) goto L_0x005b
            char r0 = r14[r2]
            if (r0 != r3) goto L_0x005b
            int r2 = r15 + 2
        L_0x0017:
            r1 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r5 = r6
            if (r2 < 0) goto L_0x0068
            int r4 = r4 - r2
            java.lang.String r7 = X.C18180wK.A0l(r14, r2, r4)
            r3 = 0
            r10 = 0
        L_0x0026:
            if (r1 >= r4) goto L_0x0064
            r0 = 61
            r9 = 4
            int r8 = X.AnonymousClass8bP.A0G(r7, r0, r1, r9)
            if (r8 < 0) goto L_0x0068
            java.lang.String r2 = X.C18230wP.A0s(r7, r1, r8)
            r0 = 38
            int r1 = X.AnonymousClass8bP.A0G(r7, r0, r8, r9)
            int r0 = r8 + 1
            if (r1 <= 0) goto L_0x004f
            java.lang.String r0 = X.C18230wP.A0s(r7, r0, r1)
            int r1 = r1 + 1
        L_0x0045:
            android.os.Bundle r0 = A06(r2, r0, r3)
            if (r0 == 0) goto L_0x004d
            r3 = r0
            goto L_0x0026
        L_0x004d:
            r10 = 1
            goto L_0x0026
        L_0x004f:
            java.lang.String r0 = r7.substring(r0)
            X.C04220Ms.A06(r0)
            int r1 = r7.length()
            goto L_0x0045
        L_0x005b:
            if (r15 >= r4) goto L_0x0062
            char r0 = r14[r15]
            if (r0 != r3) goto L_0x0062
            goto L_0x0017
        L_0x0062:
            r2 = -1
            goto L_0x0017
        L_0x0064:
            if (r10 == 0) goto L_0x0070
            if (r16 != 0) goto L_0x0070
        L_0x0068:
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L_0x0072
            r0 = 0
            return r0
        L_0x0070:
            r6 = r3
            goto L_0x0068
        L_0x0072:
            android.content.Intent r0 = X.C18230wP.A0B()
            android.content.Intent r1 = r0.setClassName(r11, r12)
            X.C04220Ms.A06(r1)
            java.lang.String r0 = "key_uri"
            android.content.Intent r0 = r1.putExtra(r0, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63653i2.A04(android.content.Context, java.lang.String, java.lang.String, char[], int, boolean):android.content.Intent");
    }

    public static final void A07(Bundle bundle, String str, char[] cArr, int i, int i2) {
        bundle.putString(str, C18180wK.A0l(cArr, i, i2 - i));
    }

    public static final boolean A09(String str, char[] cArr, int i) {
        int length = cArr.length;
        int length2 = str.length();
        if (length > i) {
            int i2 = 0;
            while (i < length && i2 < length2) {
                if (cArr[i] == str.charAt(i2)) {
                    i++;
                    i2++;
                }
            }
            if (length2 <= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final int[] A0A(Bundle bundle, String str, char[] cArr, int i) {
        int length = cArr.length;
        int i2 = i;
        while (length > i2 && (r1 = cArr[i2]) != '/' && r1 != '?') {
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        String A0l = C18180wK.A0l(cArr, i, i2 - i);
        if (str == null) {
            return null;
        }
        bundle.putString(str, A0l);
        return new int[]{i2, 3};
    }

    public static Intent A00(Context context, Bundle bundle, String str) {
        return A03(context, bundle, "com.instagram.urlhandlers.infocenter.InfoCenterExternalUrlHandlerActivity", str);
    }

    public static Intent A01(Context context, Bundle bundle, String str) {
        return A03(context, bundle, "com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity", str);
    }

    public static boolean A08(String str, char[] cArr) {
        return A09(str, cArr, 24);
    }

    public static Intent A02(Context context, Bundle bundle, String str, String str2) {
        Intent A03 = A03(context, bundle, str, str2);
        if (A03 != null) {
            A03.putExtra("access_scope", "SAME_APP");
            A03.putExtra("enforce_scope", "false");
            A03.putExtra("access_domains", "[]");
            A03.putExtra("caller_scope", "PUBLIC");
            A03.putExtra("access_fbpermissions", "[]");
            A03.putExtra("access_fbpermissions_allow_single", "false");
        }
        return A03;
    }

    public static Bundle A05(String str, String str2, Bundle bundle) {
        Bundle A06 = A06(str, str2, bundle);
        if (A06 != null) {
            return A06;
        }
        return bundle;
    }

    public static final Bundle A06(String str, String str2, Bundle bundle) {
        String str3;
        switch (str.hashCode()) {
            case -1483898950:
                str3 = "__tn__";
                break;
            case -983972142:
                str3 = "pn_ref";
                break;
            case 2931858:
                if (!str.equals("_ft_")) {
                    return null;
                }
                break;
            case 3151469:
                str3 = "fref";
                break;
            default:
                return null;
        }
        if (!str.equals(str3)) {
            return null;
        }
        if (bundle == null) {
            bundle = C18180wK.A07();
        }
        bundle.putString(str, str2);
        return bundle;
    }
}
