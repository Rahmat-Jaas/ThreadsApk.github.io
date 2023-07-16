package X;

import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.0er  reason: invalid class name and case insensitive filesystem */
public final class C09100er {
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0061 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.instagram.service.session.UserSession r10, java.lang.String r11, long[] r12) {
        /*
            if (r12 == 0) goto L_0x00b5
            int r9 = r12.length
            if (r9 == 0) goto L_0x00b5
            java.lang.Class<com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger> r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.class
            long r6 = com.facebook.common.dextricks.classid.ClassId.getClassId(r0)
            r5 = 0
            r4 = 0
        L_0x000d:
            r3 = 1
            if (r4 >= r9) goto L_0x0020
            r1 = r12[r4]
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            java.lang.String r1 = "dead_code_detection"
            java.lang.String r0 = "Found ClassTracingLogger in class list"
            X.C10450iM.A04(r1, r0, r3)
        L_0x001d:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0020:
            X.H1T r3 = new X.H1T
            r3.<init>(r10)
            java.lang.Integer r4 = X.AnonymousClass006.A01
            r3.A0F(r4)
            java.lang.String r0 = "android_dead_code/upload/"
            r3.A0J(r0)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006c }
            r8.<init>()     // Catch:{ IOException -> 0x006c }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0067 }
            r7.<init>(r8)     // Catch:{ all -> 0x0067 }
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ all -> 0x0062 }
            r6.<init>(r7)     // Catch:{ all -> 0x0062 }
            r2 = 0
        L_0x003f:
            if (r2 >= r9) goto L_0x0049
            r0 = r12[r2]     // Catch:{ all -> 0x005d }
            r6.writeLong(r0)     // Catch:{ all -> 0x005d }
            int r2 = r2 + 1
            goto L_0x003f
        L_0x0049:
            r6.flush()     // Catch:{ all -> 0x005d }
            r7.close()     // Catch:{ all -> 0x005d }
            byte[] r0 = r8.toByteArray()     // Catch:{ all -> 0x005d }
            r6.close()     // Catch:{ all -> 0x0062 }
            r7.close()     // Catch:{ all -> 0x0067 }
            r8.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0076
        L_0x005d:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r2 = move-exception
            java.lang.String r1 = "IgDeadCodeUploader"
            java.lang.String r0 = "Exception in writing to stream"
            X.AnonymousClass0LU.A0E(r1, r0, r2)
            byte[] r0 = new byte[r5]
        L_0x0076:
            java.lang.String r2 = "class_ids"
            r3.A0S(r2, r0)
            java.lang.String r0 = "process_name"
            r3.A0O(r0, r11)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "device_os_version"
            r3.A0O(r0, r1)
            int r0 = X.AnonymousClass0FX.A01()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "app_build_number"
            r3.A0O(r0, r1)
            java.lang.Class<X.4vo> r1 = X.C85814vo.class
            java.lang.Class<X.3Za> r0 = X.AnonymousClass3Za.class
            r3.A0B(r1, r0)
            r3.A0D(r4)
            java.lang.String[] r0 = new java.lang.String[]{r2}
            r3.A0U(r0)
            X.H8c r1 = r3.A02()
            java.lang.String r0 = r1.toString()
            if (r0 == 0) goto L_0x00b2
            r1.toString()
        L_0x00b2:
            X.C31155GhB.A02(r1)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09100er.A00(com.instagram.service.session.UserSession, java.lang.String, long[]):void");
    }

    public static void A01(UserSession userSession, Map map, long[] jArr) {
        long[] jArr2;
        C63643hy.A01();
        A00(userSession, AnonymousClass0KY.A00().toString(), jArr);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                for (AnonymousClass0Hq r0 : (List) entry.getValue()) {
                    if (r0 != null) {
                        jArr2 = r0.A01;
                    } else {
                        jArr2 = null;
                    }
                    A00(userSession, str, jArr2);
                }
            }
        }
    }
}
