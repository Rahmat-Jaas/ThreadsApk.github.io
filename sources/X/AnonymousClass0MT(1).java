package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0MT  reason: invalid class name */
public final class AnonymousClass0MT extends C15010qZ implements C15090qh {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Set A02;

    public final File A01(String str) {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    public final String A02(String str) {
        for (String str2 : this.A02) {
            Set set = (Set) this.A01.get(str2);
            if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                return AnonymousClass00U.A0V(str2, File.separator, str);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r0 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0116 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(android.os.StrictMode.ThreadPolicy r19, java.lang.String r20, int r21) {
        /*
            r18 = this;
            r6 = r21
            X.0qg r0 = X.C15020qa.A03
            if (r0 == 0) goto L_0x012a
            r7 = r18
            java.util.Set r0 = r7.A02
            java.util.Iterator r17 = r0.iterator()
        L_0x000e:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r8 = r17.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Map r0 = r7.A01
            java.lang.Object r1 = r0.get(r8)
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r5 = " not found on "
            java.lang.String r4 = "SoLoader"
            if (r0 != 0) goto L_0x0109
            if (r1 == 0) goto L_0x0109
            r9 = r20
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x0109
            java.util.Map r11 = r7.A00
            monitor-enter(r11)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r8, r9)     // Catch:{ all -> 0x0125 }
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0125 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0125 }
            monitor-exit(r11)     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x00c2
            r0 = 33
            int r1 = r8.indexOf(r0)
            r0 = 0
            java.lang.String r0 = r8.substring(r0, r1)
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile
            r10.<init>(r0)
            java.util.Enumeration r16 = r10.entries()     // Catch:{ all -> 0x011a }
        L_0x005a:
            boolean r0 = r16.hasMoreElements()     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r2 = r16.nextElement()     // Catch:{ all -> 0x011a }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x005a
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x011a }
            java.lang.String r14 = "/"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r14, r9)     // Catch:{ all -> 0x011a }
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x005a
            X.0RI r12 = new X.0RI     // Catch:{ all -> 0x011a }
            r12.<init>(r2, r10)     // Catch:{ all -> 0x011a }
            java.lang.String[] r13 = X.C15140qn.A03(r12, r9)     // Catch:{ all -> 0x0112 }
            int r3 = r13.length     // Catch:{ all -> 0x0112 }
            r2 = 0
        L_0x0083:
            if (r2 >= r3) goto L_0x00ad
            r1 = r13[r2]     // Catch:{ all -> 0x0112 }
            boolean r0 = r1.startsWith(r14)     // Catch:{ all -> 0x0112 }
            if (r0 != 0) goto L_0x00aa
            monitor-enter(r11)     // Catch:{ all -> 0x0112 }
            java.lang.String r15 = X.AnonymousClass00U.A0L(r8, r9)     // Catch:{ all -> 0x010f }
            boolean r0 = r11.containsKey(r15)     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x00a0
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x010f }
            r0.<init>()     // Catch:{ all -> 0x010f }
            r11.put(r15, r0)     // Catch:{ all -> 0x010f }
        L_0x00a0:
            java.lang.Object r0 = r11.get(r15)     // Catch:{ all -> 0x010f }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x010f }
            r0.add(r1)     // Catch:{ all -> 0x010f }
            monitor-exit(r11)     // Catch:{ all -> 0x010f }
        L_0x00aa:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x00ad:
            r12.close()     // Catch:{ all -> 0x011a }
            goto L_0x005a
        L_0x00b1:
            r10.close()
            monitor-enter(r11)
            java.lang.String r0 = X.AnonymousClass00U.A0L(r8, r9)     // Catch:{ all -> 0x0117 }
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x0117 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0117 }
            monitor-exit(r11)     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00db
        L_0x00c2:
            java.util.Iterator r3 = r0.iterator()
        L_0x00c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r1 = r6 | 1
            r0 = 0
            r10 = r19
            X.C15020qa.A09(r10, r2, r0, r0, r1)
            goto L_0x00c6
        L_0x00db:
            java.lang.String r0 = java.io.File.separator     // Catch:{ UnsatisfiedLinkError -> 0x00e9 }
            java.lang.String r1 = X.AnonymousClass00U.A0V(r8, r0, r9)     // Catch:{ UnsatisfiedLinkError -> 0x00e9 }
            r6 = r6 | 4
            X.0qg r0 = X.C15020qa.A03     // Catch:{ UnsatisfiedLinkError -> 0x00e9 }
            r0.load(r1, r6)     // Catch:{ UnsatisfiedLinkError -> 0x00e9 }
            goto L_0x011f
        L_0x00e9:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r5)
            r1.append(r8)
            java.lang.String r0 = " flag: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0, r2)
            goto L_0x000e
        L_0x0109:
            r0 = 2
            android.util.Log.isLoggable(r4, r0)
            goto L_0x000e
        L_0x010f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0112:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0116 }
        L_0x0116:
            throw r0     // Catch:{ all -> 0x011a }
        L_0x0117:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0117 }
            throw r1
        L_0x011a:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x011e }
        L_0x011e:
            throw r0
        L_0x011f:
            r0 = 3
            android.util.Log.isLoggable(r4, r0)
            r0 = 1
            return r0
        L_0x0125:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0125 }
            throw r1
        L_0x0128:
            r0 = 0
            return r0
        L_0x012a:
            java.lang.String r0 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0MT.A05(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    public final void A06(int i) {
        int indexOf;
        int i2;
        String str = null;
        for (String str2 : this.A02) {
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i2 = indexOf + 2) < str2.length()) {
                str = str2.substring(i2);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry != null && zipEntry.getMethod() == 0 && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so")) {
                            String substring = zipEntry.getName().substring(str.length() + 1);
                            Map map = this.A01;
                            synchronized (map) {
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new HashSet());
                                }
                                ((Set) map.get(str2)).add(substring);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
    }

    public final C15010qZ CZX(Context context) {
        return new AnonymousClass0MT(context);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(this.A02.toString());
        sb.append(']');
        return sb.toString();
    }

    public AnonymousClass0MT(Context context) {
        String A0V;
        String str = context.getApplicationInfo().sourceDir;
        HashSet hashSet = new HashSet();
        ClassLoader classLoader = C15020qa.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                String str2 = (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                if (str2 != null) {
                    for (String str3 : str2.split(":")) {
                        if (str3.contains(".apk!/")) {
                            hashSet.add(str3);
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("SysUtil", "Cannot call getLdLibraryPath", e);
            }
            if (hashSet.isEmpty()) {
                String[] A002 = C15000qX.A00();
                if (!TextUtils.isEmpty(str) && A002.length > 0 && (A0V = AnonymousClass00U.A0V(str, "!/lib/", A002[0])) != null) {
                    hashSet.add(A0V);
                }
            }
            this.A02 = hashSet;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassLoader ");
        String name = classLoader.getClass().getName();
        sb.append(name);
        sb.append(" should be of type BaseDexClassLoader");
        throw new IllegalStateException(AnonymousClass00U.A0V("ClassLoader ", name, " should be of type BaseDexClassLoader"));
    }
}
