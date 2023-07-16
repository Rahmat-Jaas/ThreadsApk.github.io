package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.0NR  reason: invalid class name */
public final class AnonymousClass0NR {
    public final Context A00;
    public final AnonymousClass0PL A01;
    public final String A02;
    public final String A03;

    private String A00(String str) {
        String str2;
        String str3;
        if (str != null) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '&') {
                    str3 = "&amp;";
                } else if (charAt < ' ' || charAt > '~') {
                    sb.append("&#");
                    sb.append(Integer.toString(charAt));
                    str3 = ";";
                } else {
                    sb.append(charAt);
                }
                sb.append(str3);
            }
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        return str2.replace("/", "-").replace(";", "-");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A01() {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x0140
            java.lang.String r19 = "["
            java.lang.String r6 = "FBAN"
            java.lang.String r7 = r0.A02
            java.lang.String r8 = "FBAV"
            X.0PL r1 = r0.A01
            java.lang.String r9 = r1.A01
            java.lang.String r10 = "FBBV"
            java.lang.String r11 = r1.A00
            java.lang.String r12 = "FBDM"
            android.content.Context r5 = r0.A00     // Catch:{ RuntimeException -> 0x007b }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ RuntimeException -> 0x007b }
            android.util.DisplayMetrics r4 = r1.getDisplayMetrics()     // Catch:{ RuntimeException -> 0x007b }
            int r2 = r4.widthPixels     // Catch:{ RuntimeException -> 0x007b }
            int r1 = r4.heightPixels     // Catch:{ RuntimeException -> 0x007b }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x007b }
            r3.<init>(r2, r1)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r2 = "window"
            java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
            java.lang.Object r2 = r5.getSystemService(r2)     // Catch:{ Exception -> 0x003c }
            if (r2 == 0) goto L_0x003c
            boolean r1 = r1.isInstance(r2)     // Catch:{ Exception -> 0x003c }
            if (r1 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x007b }
            if (r2 == 0) goto L_0x004e
            android.view.Display r1 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x007b }
            if (r1 == 0) goto L_0x004e
            android.view.Display r1 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x007b }
            r1.getSize(r3)     // Catch:{ RuntimeException -> 0x007b }
        L_0x004e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x007b }
            r2.<init>()     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r1 = "{density="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            float r1 = r4.density     // Catch:{ RuntimeException -> 0x007b }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r1 = ",width="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            int r1 = r3.x     // Catch:{ RuntimeException -> 0x007b }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r1 = ",height="
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            int r1 = r3.y     // Catch:{ RuntimeException -> 0x007b }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r1 = "}"
            r2.append(r1)     // Catch:{ RuntimeException -> 0x007b }
            java.lang.String r1 = r2.toString()     // Catch:{ RuntimeException -> 0x007b }
            goto L_0x0086
        L_0x007b:
            r2 = move-exception
            java.lang.Throwable r1 = r2.getCause()
            boolean r1 = r1 instanceof android.os.DeadSystemException
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = "{density=0,width=0,height=0}"
        L_0x0086:
            java.lang.String r13 = r0.A00(r1)
            java.lang.String r14 = "FBLC"
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toString()
            java.lang.String r15 = r0.A00(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.lang.String r2 = "%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;"
            r1 = 0
            java.lang.String r20 = java.lang.String.format(r1, r2, r3)
            java.lang.String r5 = "FBCR"
            android.content.Context r1 = r0.A00
            java.lang.Class<android.telephony.TelephonyManager> r4 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "phone"
            java.lang.Object r3 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x00b8 }
            if (r3 == 0) goto L_0x00b8
            boolean r2 = r4.isInstance(r3)     // Catch:{ Exception -> 0x00b8 }
            if (r2 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r3 = 0
        L_0x00b9:
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            if (r3 == 0) goto L_0x00ee
            java.lang.String r2 = r3.getNetworkOperatorName()
        L_0x00c1:
            java.lang.String r6 = r0.A00(r2)
            java.lang.String r7 = "FBMF"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r8 = r0.A00(r2)
            java.lang.String r9 = "FBBD"
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r10 = r0.A00(r2)
            java.lang.String r11 = "FBPN"
            java.lang.String r12 = r1.getPackageName()
            java.lang.String r13 = "FBDV"
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r14 = r0.A00(r2)
            java.lang.String r15 = "FBSV"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r16 = r0.A00(r2)
            java.lang.String r17 = "FBLR"
            goto L_0x00f1
        L_0x00ee:
            java.lang.String r2 = ""
            goto L_0x00c1
        L_0x00f1:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ Exception -> 0x00fc }
            java.lang.String r1 = "android.hardware.ram.low"
            boolean r1 = r2.hasSystemFeature(r1)     // Catch:{ Exception -> 0x00fc }
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            java.lang.String r2 = "1"
            if (r1 == 0) goto L_0x013c
            r1 = r2
        L_0x0102:
            java.lang.String r18 = r0.A00(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.lang.String r1 = "%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;"
            r4 = 0
            java.lang.String r21 = java.lang.String.format(r4, r1, r3)
            java.lang.String r1 = "FBBK"
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r1 = "%s/%s;"
            java.lang.String r22 = java.lang.String.format(r4, r1, r2)
            java.lang.String r3 = "FBCA"
            java.lang.String r1 = android.os.Build.CPU_ABI
            java.lang.String r2 = r0.A00(r1)
            java.lang.String r1 = android.os.Build.CPU_ABI2
            java.lang.String r0 = r0.A00(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r2, r0}
            java.lang.String r0 = "%s/%s:%s;"
            java.lang.String r23 = java.lang.String.format(r4, r0, r1)
            java.lang.String r24 = "]"
            java.lang.String r1 = X.AnonymousClass00U.A0i(r19, r20, r21, r22, r23, r24)
            return r1
        L_0x013c:
            java.lang.String r1 = "0"
            goto L_0x0102
        L_0x013f:
            throw r2
        L_0x0140:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NR.A01():java.lang.String");
    }

    public AnonymousClass0NR(Context context, AnonymousClass0PL r3, String str, Map map) {
        String str2;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = str;
        if (map != null) {
            str2 = (String) map.get("User-Agent");
        } else {
            str2 = null;
        }
        this.A03 = str2;
    }
}
