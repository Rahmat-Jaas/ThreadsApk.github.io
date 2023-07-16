package X;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: X.0cL  reason: invalid class name and case insensitive filesystem */
public final class C07880cL implements AnonymousClass0UL {
    public File A00;
    public File A01;
    public Integer A02 = AnonymousClass006.A00;
    public AnonymousClass0UJ A03;
    public volatile boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0122, code lost:
        if (r3.renameTo(r1) == false) goto L_0x0086;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0UJ Ak0() {
        /*
            r8 = this;
            X.0UJ r0 = r8.A03
            if (r0 != 0) goto L_0x0128
            java.lang.Integer r0 = r8.A02
            int r0 = r0.intValue()
            r4 = 0
            if (r0 == r4) goto L_0x0010
            java.io.File r1 = r8.A00
            goto L_0x0033
        L_0x0010:
            java.io.File r2 = r8.A01
            java.lang.String r0 = "ProfiloInitFileConfig.json"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "ProfiloInitFileConfig.json.bak"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
        L_0x0026:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "ProfiloOverride.json"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
        L_0x0033:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x005b }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x005b }
            long r1 = r1.length()     // Catch:{ all -> 0x0056 }
            int r0 = (int) r1     // Catch:{ all -> 0x0056 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0056 }
            r3.read(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0056 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0056 }
            r3.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x005c
        L_0x0056:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r6 = 0
        L_0x005c:
            java.lang.Integer r0 = r8.A02
            int r0 = r0.intValue()
            java.io.File r2 = r8.A01
            java.lang.String r5 = "ProfiloInitFileConfig.json"
            if (r0 == r4) goto L_0x00f7
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r5)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x007f
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x007f
            r1.deleteOnExit()
            r1.getAbsolutePath()
        L_0x007f:
            java.lang.String r4 = "ProfiloInitFileConfig.json.bak"
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r4)
        L_0x0086:
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0098
            boolean r0 = r3.delete()
            if (r0 != 0) goto L_0x0098
            r3.deleteOnExit()
            r3.getAbsolutePath()
        L_0x0098:
            if (r6 != 0) goto L_0x00c7
            X.0UJ r1 = X.C07870cK.A00
        L_0x009c:
            r8.A03 = r1
            X.0UJ r0 = X.C07870cK.A00
            if (r1 == r0) goto L_0x00b8
            java.lang.Integer r0 = r8.A02
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00b5
            java.io.File r1 = r8.A00
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r5)
            r1.renameTo(r0)
        L_0x00b5:
            X.0UJ r0 = r8.A03
            return r0
        L_0x00b8:
            java.lang.Integer r1 = r8.A02
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x00b5
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r4)
            r0.delete()
            goto L_0x00b5
        L_0x00c7:
            com.facebook.profilo.config.v2.ConfigParser r0 = new com.facebook.profilo.config.v2.ConfigParser     // Catch:{ ConfigException -> 0x00d9 }
            r0.<init>(r6)     // Catch:{ ConfigException -> 0x00d9 }
            com.facebook.profilo.config.v2.Config r1 = r0.parseConfig()     // Catch:{ ConfigException -> 0x00d9 }
            boolean r0 = r1.isDisablingConfig()     // Catch:{ ConfigException -> 0x00d9 }
            if (r0 == 0) goto L_0x009c
            X.0UJ r1 = X.C07870cK.A00     // Catch:{ ConfigException -> 0x00d9 }
            goto L_0x009c
        L_0x00d9:
            r7 = move-exception
            java.lang.String r6 = "Profilo/ProfiloConfigProvider"
            java.lang.String r3 = "Failed to parse config. Mode = "
            java.lang.Integer r0 = r8.A02     // Catch:{ all -> 0x0126 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = "FILE"
        L_0x00e8:
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass00U.A0V(r3, r1, r0)     // Catch:{ all -> 0x0126 }
            android.util.Log.w(r6, r0, r7)     // Catch:{ all -> 0x0126 }
            X.0UJ r1 = X.C07870cK.A00     // Catch:{ all -> 0x0126 }
            goto L_0x009c
        L_0x00f4:
            java.lang.String r1 = "INIT"
            goto L_0x00e8
        L_0x00f7:
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r5)
            java.lang.String r4 = "ProfiloInitFileConfig.json.bak"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r4)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x011e
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x011e
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x011e
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x011e
            r1.deleteOnExit()
        L_0x011e:
            boolean r0 = r3.renameTo(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x0086
        L_0x0126:
            r0 = move-exception
            throw r0
        L_0x0128:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07880cL.Ak0():X.0UJ");
    }

    public C07880cL(Context context) {
        File file = new File(context.getFilesDir(), "profilo");
        this.A01 = file;
        if (!file.exists() && !this.A01.mkdir()) {
            this.A03 = C07870cK.A00;
            Log.w("Profilo/ProfiloConfigProvider", AnonymousClass00U.A0L("Failed to mkdir ", this.A01.getName()));
        }
    }
}
