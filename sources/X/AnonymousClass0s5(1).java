package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.0s5  reason: invalid class name */
public final class AnonymousClass0s5 {
    public static String A00(Context context) {
        String[] strArr;
        int[] iArr;
        C12530m4 r7 = (C12530m4) C17250ua.A00;
        for (String str : Arrays.asList(new String[]{r7.A05, r7.A04})) {
            if (AnonymousClass0PS.A01(context, str)) {
                C04830Ph A00 = AnonymousClass0PS.A00(context, str, 4160);
                if (A00.A02 == AnonymousClass006.A0u && A00.A01 != null && A00.A01.applicationInfo != null) {
                    PackageInfo packageInfo = A00.A01;
                    int i = packageInfo.applicationInfo.flags;
                    if (((i & 1) != 0 || (i & 128) != 0) && (strArr = packageInfo.requestedPermissions) != null && (iArr = packageInfo.requestedPermissionsFlags) != null) {
                        Set set = r7.A09;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 < strArr.length && i2 < iArr.length) {
                                if (set.contains(strArr[i2])) {
                                    if ((iArr[i2] & 2) == 0) {
                                        continue;
                                        break;
                                    }
                                    i3++;
                                    if (set.size() == i3) {
                                        return str;
                                    }
                                }
                                i2++;
                            }
                        }
                        if (set.size() == i3) {
                            return str;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void A01(Context context, List list, List list2) {
        for (String A00 : ((C12530m4) C17250ua.A00).A08) {
            C04830Ph A002 = AnonymousClass0PS.A00(context, A00, 64);
            if (A002.A02 == AnonymousClass006.A0Y || A002.A02 == AnonymousClass006.A0C || A002.A02 == AnonymousClass006.A0u) {
                list.add(A002.A00);
            }
            if (A002.A02 == AnonymousClass006.A0u) {
                list2.add(A002.A00);
            }
        }
    }

    public static boolean A02(String str) {
        C12530m4 r1 = (C12530m4) C17250ua.A00;
        if (r1.A05.equals(str) || r1.A04.equals(str)) {
            return true;
        }
        return false;
    }
}
