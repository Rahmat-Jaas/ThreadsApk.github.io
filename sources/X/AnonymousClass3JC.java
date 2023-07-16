package X;

import com.facebook.analytics.util.AnalyticsMemoryUtil;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3JC  reason: invalid class name */
public final class AnonymousClass3JC {
    public static Set A00() {
        String[] loadedLibraries = AnalyticsMemoryUtil.getLoadedLibraries();
        HashSet A0u = C18200wM.A0u();
        for (String str : loadedLibraries) {
            if (!str.startsWith("/system") && !str.startsWith("/vendor")) {
                A0u.add(new File(str).getName());
            }
        }
        return A0u;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set A01(android.content.Context r8, java.lang.String[] r9) {
        /*
            java.util.Set r6 = A00()
            int r5 = r9.length
            r4 = 0
        L_0x0006:
            if (r4 >= r5) goto L_0x0052
            r7 = r9[r4]
            java.io.File r1 = r8.getFilesDir()
            java.lang.String r0 = "nativemetrics"
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
            java.lang.String r0 = "libs_"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x004f
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x0043 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0043 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0043 }
        L_0x0030:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            r6.add(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0030
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x004f
        L_0x003e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r1 = "NativeFilesUtils"
            java.lang.String r0 = "Error reading loaded libraries for process: %s"
            X.AnonymousClass0LU.A0L(r1, r0, r3, r2)
        L_0x004f:
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0052:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3JC.A01(android.content.Context, java.lang.String[]):java.util.Set");
    }
}
