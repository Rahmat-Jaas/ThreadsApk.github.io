package X;

/* renamed from: X.0Rw  reason: invalid class name and case insensitive filesystem */
public final class C05210Rw {
    public static int A00;
    public static int A01;

    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0149 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x014e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0153 */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r10, X.AnonymousClass0RW r11, java.util.Map r12) {
        /*
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "i.instagram.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "api/v1/instacrash/log/"
            android.net.Uri$Builder r0 = r1.path(r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 == r0) goto L_0x0175
            if (r11 != 0) goto L_0x0033
            java.lang.String r1 = "InstacrashReporter"
            java.lang.String r0 = "tried to report instacrash without session"
            X.C10450iM.A03(r1, r0)
        L_0x0032:
            return
        L_0x0033:
            r3 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0157 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0157 }
            java.net.URLConnection r2 = r0.openConnection()     // Catch:{ IOException -> 0x0157 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0157 }
            java.lang.String r9 = "Barcelona"
            java.lang.String r1 = X.C10640ig.A00(r10)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "User-Agent"
            r2.addRequestProperty(r0, r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r0 = "gzip"
            r2.addRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r0 = 1
            r2.setDoOutput(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r8 = X.C10380iF.A02(r10)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            X.0ev r0 = X.C09140ev.A02     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = r0.A05(r10)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r5 = r0.toUpperCase()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            int r7 = X.C10380iF.A00()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r3.<init>()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r6 = r11.A00     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r4 = 9
            r1 = 10
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.AnonymousClass00T.A00(r4, r1, r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r3.put(r0, r6)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "app_name"
            r3.put(r0, r9)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "app_version"
            r3.put(r0, r8)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r1 = java.lang.Integer.toString(r7)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "build_number"
            r3.put(r0, r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r6 = 0
            r0 = 90
            java.lang.String r0 = X.AnonymousClass00T.A00(r6, r4, r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r3.put(r0, r5)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            boolean r0 = r11.A00()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = "forced_mitigation"
            r3.put(r0, r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r3.putAll(r12)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r5.<init>()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.util.Set r0 = r3.entrySet()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
        L_0x00ba:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r3 = r4.next()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            int r0 = r5.length()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            if (r0 == 0) goto L_0x00d1
            r0 = 38
            r5.append(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
        L_0x00d1:
            java.lang.Object r0 = r3.getKey()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r5.append(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r0 = 61
            r5.append(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.Object r0 = r3.getValue()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r5.append(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            goto L_0x00ba
        L_0x00f5:
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x014f }
            r4.<init>()     // Catch:{ all -> 0x014f }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x014a }
            r3.<init>(r4)     // Catch:{ all -> 0x014a }
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0145 }
        L_0x0110:
            int r0 = r5.read(r1)     // Catch:{ all -> 0x0145 }
            if (r0 <= 0) goto L_0x011a
            r3.write(r1, r6, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0110
        L_0x011a:
            r3.close()     // Catch:{ all -> 0x0145 }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0145 }
            r3.close()     // Catch:{ all -> 0x014a }
            r4.close()     // Catch:{ all -> 0x014f }
            r5.close()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            int r0 = r1.length     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r2.setFixedLengthStreamingMode(r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r0 = -1573660576(0xffffffffa233d860, float:-2.4373572E-18)
            java.io.OutputStream r0 = X.C13770oH.A01(r2, r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r0.write(r1)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r0 = 1756939018(0x68b8c30a, float:6.980106E24)
            X.C13770oH.A02(r2, r0)     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r2.getResponseCode()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            r2.getResponseMessage()     // Catch:{ IOException -> 0x0154, all -> 0x016d }
            goto L_0x0167
        L_0x0145:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x014e }
        L_0x014e:
            throw r0     // Catch:{ all -> 0x014f }
        L_0x014f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0153 }
        L_0x0153:
            throw r0     // Catch:{ IOException -> 0x0154, all -> 0x016d }
        L_0x0154:
            r1 = move-exception
            r3 = r2
            goto L_0x0158
        L_0x0157:
            r1 = move-exception
        L_0x0158:
            java.lang.Class<X.0Rw> r0 = X.C05210Rw.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x016b }
            X.C10450iM.A07(r0, r1)     // Catch:{ all -> 0x016b }
            if (r3 == 0) goto L_0x0032
            r3.disconnect()
            return
        L_0x0167:
            r2.disconnect()
            return
        L_0x016b:
            r1 = move-exception
            goto L_0x016f
        L_0x016d:
            r1 = move-exception
            r3 = r2
        L_0x016f:
            if (r3 == 0) goto L_0x0174
            r3.disconnect()
        L_0x0174:
            throw r1
        L_0x0175:
            java.lang.String r0 = "Do not call this on the main thread"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05210Rw.A00(android.content.Context, X.0RW, java.util.Map):void");
    }
}
