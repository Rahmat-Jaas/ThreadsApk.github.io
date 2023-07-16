package X;

import android.content.Context;
import android.net.Uri;

/* renamed from: X.3W8  reason: invalid class name */
public final class AnonymousClass3W8 {
    public static Uri A00(Context context, Uri uri) {
        if (!C34822La.A00(context) || uri.getQueryParameter("theme") != null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("theme", "dark");
        return buildUpon.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r6 = X.C10380iF.A02(r6)
            java.lang.String r5 = "#"
            r2 = 2
            java.lang.String[] r1 = r7.split(r5, r2)
            r0 = 0
            r0 = r1[r0]
            java.lang.StringBuilder r4 = X.C18190wL.A0s(r0)
            int r0 = r1.length
            if (r0 != r2) goto L_0x002d
            r0 = 1
            r3 = r1[r0]
        L_0x0018:
            java.lang.String r0 = "?"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "?android=1"
        L_0x0022:
            r4.append(r0)
            java.lang.String r1 = "&instagram_android_version="
            if (r6 == 0) goto L_0x0036
            goto L_0x002f
        L_0x002a:
            java.lang.String r0 = "&android=1"
            goto L_0x0022
        L_0x002d:
            r3 = 0
            goto L_0x0018
        L_0x002f:
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r6, r0)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            X.C18240wQ.A1P(r1, r0, r4)
            java.lang.String r2 = "&android_version="
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            X.C18240wQ.A1P(r2, r0, r4)
            java.lang.String r2 = "&android_sdk="
            java.lang.String r1 = android.os.Build.VERSION.SDK
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            X.C18240wQ.A1P(r2, r0, r4)
            java.lang.String r2 = "&android_device_model="
            java.lang.String r1 = android.os.Build.MODEL
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0069 }
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            X.C18240wQ.A1P(r2, r0, r4)
            java.lang.String r2 = "&android_device_manuf="
            java.lang.String r1 = android.os.Build.MANUFACTURER
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            X.C18240wQ.A1P(r2, r0, r4)
            java.lang.String r2 = "&android_device_brand="
            java.lang.String r1 = android.os.Build.BRAND
            if (r1 == 0) goto L_0x008b
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            X.C18240wQ.A1P(r2, r0, r4)
            java.lang.String r2 = "&android_device_name="
            java.lang.String r1 = android.os.Build.DEVICE
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            X.C18240wQ.A1P(r2, r0, r4)
            if (r3 == 0) goto L_0x00a8
            r4.append(r5)
            r4.append(r3)
        L_0x00a8:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3W8.A01(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A02(Context context, String str) {
        if (!C34822La.A00(context)) {
            return str;
        }
        return A00(context, C15430rJ.A01(str)).toString();
    }
}
