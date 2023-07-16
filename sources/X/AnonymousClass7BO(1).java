package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7BO  reason: invalid class name */
public final class AnonymousClass7BO {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if ("RECOVER_PIN".equalsIgnoreCase(X.AnonymousClass7Hq.A02(r5)) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if ("PIN".equalsIgnoreCase(X.C18190wL.A0j(r5, "AUTH_METHOD_TYPE")) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        if ("FB_ACCESS_TOKEN".equalsIgnoreCase(X.C18190wL.A0j(r5, "AUTH_METHOD_TYPE")) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        throw X.C18190wL.A0a("Not supported operation");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.os.Bundle r5) {
        /*
            if (r5 == 0) goto L_0x0011
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.C18190wL.A0j(r5, r0)
            java.lang.String r0 = "PIN"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.String r4 = "VERIFY_FACTOR"
            if (r0 != 0) goto L_0x0026
            if (r5 == 0) goto L_0x0078
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.C18190wL.A0j(r5, r0)
            java.lang.String r0 = "BIO_OR_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0078
        L_0x0026:
            java.lang.String r0 = X.AnonymousClass7Hq.A01(r5)
            java.lang.String r3 = X.AnonymousClass7Hq.A02(r5)
            java.lang.String r1 = "CONFIRM_PIN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r2 = "RESET_FBPAY_PIN"
            if (r0 != 0) goto L_0x0057
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0057
            java.lang.String r1 = X.AnonymousClass7Hq.A02(r5)
            java.lang.String r0 = "VERIFY_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = X.AnonymousClass7Hq.A02(r5)
            java.lang.String r0 = "RECOVER_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ae
        L_0x0056:
            return r2
        L_0x0057:
            java.lang.String r1 = X.AnonymousClass7Hq.A00(r5)
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0075
            if (r5 == 0) goto L_0x0056
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            boolean r0 = r5.getBoolean(r0)
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            boolean r0 = r5.getBoolean(r0)
            if (r0 == 0) goto L_0x0056
        L_0x0075:
            java.lang.String r2 = "CREATE_FBPAY_PIN"
            return r2
        L_0x0078:
            r5.getClass()
            java.lang.String r2 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.C18190wL.A0j(r5, r2)
            java.lang.String r0 = "CSC"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = X.C18190wL.A0j(r5, r2)
            java.lang.String r0 = "PAYPAL_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = X.C18190wL.A0j(r5, r2)
            java.lang.String r0 = "IG_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r1 = X.C18190wL.A0j(r5, r2)
            java.lang.String r0 = "FB_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ae
        L_0x00ad:
            return r4
        L_0x00ae:
            java.lang.String r0 = "Not supported operation"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BO.A00(android.os.Bundle):java.lang.String");
    }

    public static List A01(Bundle bundle) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
        if (stringArray != null) {
            Collections.addAll(A0v, stringArray);
        }
        return Collections.unmodifiableList(A0v);
    }

    public static void A02(Bundle bundle, String... strArr) {
        HashSet A0u = C18200wM.A0u();
        String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
        if (stringArray != null) {
            Collections.addAll(A0u, stringArray);
        }
        Collections.addAll(A0u, strArr);
        bundle.putStringArray("PTT_UTIL_CAP_NAMES", (String[]) A0u.toArray(new String[0]));
    }
}
