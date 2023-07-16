package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.DexLibLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* renamed from: X.0JR  reason: invalid class name */
public final class AnonymousClass0JR {
    public static AnonymousClass0JR A05;
    public static final boolean A06;
    public static final String[] A07;
    public static final Object A08 = new Object();
    public String A00 = null;
    public boolean A01 = false;
    public final Context A02;
    public final Object A03 = new Object();
    public volatile boolean A04 = false;

    static {
        String str;
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 30) {
            z = true;
        }
        A06 = z;
        String[] strArr = new String[3];
        A07 = strArr;
        if (z) {
            str = "zyte_v9.prof";
        } else {
            str = "zyte_v7.prof";
        }
        strArr[0] = str;
        strArr[1] = "zyte.prof";
        strArr[2] = "art_pgo_input.txt";
    }

    public static AnonymousClass0JR A00(Context context) {
        AnonymousClass0JR r0;
        AnonymousClass0JR r02 = A05;
        if (r02 != null) {
            return r02;
        }
        synchronized (A08) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            r0 = new AnonymousClass0JR(context);
            A05 = r0;
        }
        return r0;
    }

    public static InputStream A01(Context context, String str, boolean z) {
        String A0V;
        if (str == null) {
            A0V = null;
        } else {
            A0V = AnonymousClass00U.A0V(DexLibLoader.ApkResProvider.SECONDARY_PROGRAM_DEX_JARS, File.separator, str);
        }
        if (A0V == null) {
            return null;
        }
        if (z) {
            A0V = AnonymousClass00U.A0L(A0V, ".xz");
        }
        try {
            return context.getAssets().open(A0V);
        } catch (IOException e) {
            String.format("Cannot read %s [check is xz'ed: %s] from from assets. Error: %s", new Object[]{A0V, Boolean.valueOf(z), e.getMessage()});
            return null;
        }
    }

    public static String A02(AnonymousClass0JR r4) {
        String str;
        String replace;
        String str2 = r4.A00;
        if (str2 != null) {
            return str2;
        }
        Context context = r4.A02;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str = UUID.randomUUID().toString();
            Log.e("PGOProfileUtil", String.format("Could not find package name %s. Using UUID: %s", new Object[]{packageName, str}), e);
        }
        if (str == null) {
            replace = null;
        } else {
            replace = str.replace('.', '_');
        }
        String format = String.format("%s_AV%d_%s%s", new Object[]{"art_pgo_profile", Integer.valueOf(Build.VERSION.SDK_INT), replace, ".prof"});
        r4.A00 = format;
        return format;
    }

    public static boolean A03() {
        int i = Build.VERSION.SDK_INT;
        if (i == 29 || i == 28) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082 A[Catch:{ all -> 0x008d, all -> 0x0091, all -> 0x0092 }, LOOP:2: B:37:0x007c->B:39:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086 A[EDGE_INSN: B:40:0x0086->B:41:? ?: BREAK  , SYNTHETIC, Splitter:B:40:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(android.content.Context r8, java.io.File r9) {
        /*
            java.lang.String[] r6 = A07
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()     // Catch:{ IOException -> 0x009e }
            java.lang.String r0 = r0.sourceDir     // Catch:{ IOException -> 0x009e }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x009e }
            r7.<init>(r0)     // Catch:{ IOException -> 0x009e }
            int r2 = r6.length     // Catch:{ IOException -> 0x009e }
            r5 = 0
            r3 = 0
        L_0x0010:
            r4 = 1
            if (r3 >= r2) goto L_0x0045
            r1 = r6[r3]     // Catch:{ IOException -> 0x009e }
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = ".xz"
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r0)     // Catch:{ IOException -> 0x009e }
            java.util.zip.ZipEntry r0 = r7.getEntry(r0)     // Catch:{ IOException -> 0x009e }
            if (r0 == 0) goto L_0x002f
            X.0JQ r1 = new X.0JQ     // Catch:{ IOException -> 0x009e }
            r1.<init>(r0, r4)     // Catch:{ IOException -> 0x009e }
        L_0x0028:
            java.util.zip.ZipEntry r0 = r1.A00     // Catch:{ IOException -> 0x009e }
            java.io.InputStream r3 = r7.getInputStream(r0)     // Catch:{ IOException -> 0x009e }
            goto L_0x003e
        L_0x002f:
            java.util.zip.ZipEntry r0 = r7.getEntry(r1)     // Catch:{ IOException -> 0x009e }
            if (r0 == 0) goto L_0x003b
            X.0JQ r1 = new X.0JQ     // Catch:{ IOException -> 0x009e }
            r1.<init>(r0, r5)     // Catch:{ IOException -> 0x009e }
            goto L_0x0028
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x003e:
            boolean r0 = r1.A01     // Catch:{ IOException -> 0x0097 }
            if (r3 == 0) goto L_0x00a4
            if (r0 == 0) goto L_0x0073
            goto L_0x006d
        L_0x0045:
            java.lang.String r0 = java.util.Arrays.toString(r6)     // Catch:{ IOException -> 0x009e }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ IOException -> 0x009e }
            java.lang.String r0 = "Could not find zip profile entries at %s"
            java.lang.String.format(r0, r1)     // Catch:{ IOException -> 0x009e }
            r1 = 0
        L_0x0053:
            if (r1 >= r2) goto L_0x00a4
            r0 = r6[r1]     // Catch:{ IOException -> 0x009e }
            if (r0 == 0) goto L_0x006a
            r0 = r6[r1]     // Catch:{ IOException -> 0x009e }
            java.io.InputStream r3 = A01(r8, r0, r4)     // Catch:{ IOException -> 0x009e }
            if (r3 != 0) goto L_0x006d
            r0 = r6[r1]     // Catch:{ IOException -> 0x009e }
            java.io.InputStream r3 = A01(r8, r0, r5)     // Catch:{ IOException -> 0x009e }
            if (r3 == 0) goto L_0x006a
            goto L_0x0073
        L_0x006a:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x006d:
            com.facebook.xzdecoder.XzInputStream r0 = new com.facebook.xzdecoder.XzInputStream     // Catch:{ IOException -> 0x0097 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0097 }
            r3 = r0
        L_0x0073:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0092 }
            r2.<init>(r9)     // Catch:{ all -> 0x0092 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x008d }
        L_0x007c:
            int r0 = r3.read(r1)     // Catch:{ all -> 0x008d }
            if (r0 <= 0) goto L_0x0086
            r2.write(r1, r5, r0)     // Catch:{ all -> 0x008d }
            goto L_0x007c
        L_0x0086:
            r2.close()     // Catch:{ all -> 0x0092 }
            r3.close()     // Catch:{ IOException -> 0x008c }
        L_0x008c:
            return r4
        L_0x008d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            throw r0
        L_0x0097:
            r1 = move-exception
            if (r3 == 0) goto L_0x009f
            r3.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x009f
        L_0x009e:
            r1 = move-exception
        L_0x009f:
            java.lang.String r0 = "PGOProfileUtilextractProfileStreamFromApk failure"
            android.util.Log.w(r0, r1)
        L_0x00a4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JR.A04(android.content.Context, java.io.File):boolean");
    }

    public static boolean A05(AnonymousClass0JR r7) {
        boolean z;
        Object[] objArr;
        String str;
        if (!r7.A04) {
            synchronized (r7.A03) {
                if (!r7.A04) {
                    String A022 = A02(r7);
                    Context context = r7.A02;
                    File fileStreamPath = context.getFileStreamPath(A022);
                    if (fileStreamPath.exists()) {
                        objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                        str = "Already have profile, using that instead. Path: %s";
                    } else {
                        C03670Kf A002 = C03670Kf.A00(context);
                        if (!(!C03670Kf.A00(context).A1F) || A002.A2l) {
                            try {
                                String.format("Extracting PGO profile  from APK to path %s", new Object[]{fileStreamPath.getAbsolutePath()});
                                z = A04(context, fileStreamPath);
                            } catch (IOException e) {
                                Log.w("PGOProfileUtil", AnonymousClass00U.A0L("Cannot read profile from apk. Error: ", e.getMessage()), e);
                                z = false;
                            }
                            r7.A01 = z;
                            r7.A04 = true;
                        } else {
                            objArr = new Object[]{fileStreamPath.getAbsolutePath()};
                            str = "Not using default PGO profile from APK. Using empty PGO profile at path: %s";
                        }
                    }
                    String.format(str, objArr);
                    z = true;
                    r7.A01 = z;
                    r7.A04 = true;
                }
            }
        }
        return r7.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r4 != false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b A[Catch:{ all -> 0x0082 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A07(java.io.File r10) {
        /*
            r9 = this;
            java.lang.String r0 = "art_pgo_ref_profile.prof"
            java.io.File r5 = new java.io.File
            r5.<init>(r10, r0)
            java.lang.String r6 = "Cleaning up failed snapshot pgo at %s"
            r8 = 0
            java.io.File r7 = r9.A06()
            if (r7 == 0) goto L_0x008e
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x008e
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = r7.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Snapshot file %s already exists. Overwriting with %s."
            java.lang.String.format(r0, r1)
            r5.delete()
        L_0x0030:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x007c }
            r2.<init>(r7)     // Catch:{ all -> 0x007c }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0074 }
            r1.<init>(r5)     // Catch:{ all -> 0x0074 }
            int r0 = X.C03370Ia.A00(r2, r1, r0)     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ all -> 0x0082 }
            r1.close()     // Catch:{ all -> 0x0082 }
            r4 = 0
            if (r0 <= 0) goto L_0x004b
            r4 = 1
        L_0x004b:
            java.lang.String r3 = "Got ret val %d of copy snapshot of prof %s to %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ all -> 0x006e }
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}     // Catch:{ all -> 0x006e }
            java.lang.String.format(r3, r0)     // Catch:{ all -> 0x006e }
            if (r4 != 0) goto L_0x006d
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String.format(r6, r0)
            r5.delete()
            return r8
        L_0x006d:
            return r5
        L_0x006e:
            r1 = move-exception
            if (r4 != 0) goto L_0x008d
            goto L_0x0083
        L_0x0072:
            r0 = move-exception
            goto L_0x0076
        L_0x0074:
            r0 = move-exception
            r1 = r8
        L_0x0076:
            r2.close()     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0081
            goto L_0x007e
        L_0x007c:
            r0 = move-exception
            goto L_0x0081
        L_0x007e:
            r1.close()     // Catch:{ all -> 0x0082 }
        L_0x0081:
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
        L_0x0083:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String.format(r6, r0)
            r5.delete()
        L_0x008d:
            throw r1
        L_0x008e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JR.A07(java.io.File):java.io.File");
    }

    public AnonymousClass0JR(Context context) {
        this.A02 = context;
    }

    public final File A06() {
        if (!A05(this)) {
            return null;
        }
        return this.A02.getFileStreamPath(A02(this));
    }
}
