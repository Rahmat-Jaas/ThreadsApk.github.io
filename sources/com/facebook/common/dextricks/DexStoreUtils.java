package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass0JR;
import android.content.Context;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public final class DexStoreUtils {
    public static int CANARY_IDX = 2;
    public static int HASH_IDX = 1;
    public static final String IGNORE_DIRTY_CHECK_PREFIX = "IGNORE_DIRTY_";
    public static final String MAIN_DEX_STORE_ID = "dex";
    public static final boolean OREO_OR_NEWER = true;
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";

    public static String getMainDexStoreId() {
        return MAIN_DEX_STORE_ID;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List getDexInfoFromManifest(android.content.Context r6) {
        /*
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            android.content.res.AssetManager r1 = r6.getAssets()
            java.lang.String r0 = "secondary-program-dex-jars/metadata.txt"
            java.io.InputStream r4 = r1.open(r0)
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0043 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0043 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0043 }
            r3.<init>(r0)     // Catch:{ all -> 0x0043 }
        L_0x001b:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = " "
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ all -> 0x003e }
            int r1 = r2.length     // Catch:{ all -> 0x003e }
            r0 = 3
            if (r1 != r0) goto L_0x001b
            r5.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x001b
        L_0x0037:
            r3.close()     // Catch:{ all -> 0x0043 }
            r4.close()
            return r5
        L_0x003e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            r4.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStoreUtils.getDexInfoFromManifest(android.content.Context):java.util.List");
    }

    public static DexManifest getSecondaryDexManifest(ResProvider resProvider, boolean z) {
        return DexManifest.loadManifestFrom(resProvider, SECONDARY_DEX_MANIFEST, z);
    }

    public static boolean isIgnoreDirtyFile(File file) {
        if (file == null) {
            return false;
        }
        return isIgnoreDirtyFileName(file.getName());
    }

    public static boolean isIgnoreDirtyFileName(String str) {
        if (str == null || !str.startsWith(IGNORE_DIRTY_CHECK_PREFIX)) {
            return false;
        }
        return true;
    }

    public static boolean isMainDexStoreId(String str) {
        return MAIN_DEX_STORE_ID.equals(str);
    }

    public static boolean isSecondaryDexManifest(String str) {
        return SECONDARY_DEX_MANIFEST.equals(str);
    }

    public static File makeIgnoreDirtyCheckFile(File file, String str) {
        return new File(file, AnonymousClass00U.A0L(IGNORE_DIRTY_CHECK_PREFIX, str));
    }

    public static InputStream openSecondaryDexManifest(ResProvider resProvider) {
        return resProvider.open(SECONDARY_DEX_MANIFEST);
    }

    public static String sha1ForFile(String str) {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return toHex(instance.digest());
                }
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = "0123456789abcdef".toCharArray();
        for (byte b : bArr) {
            sb.append(charArray[(b >> 4) & 15]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString();
    }

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return AnonymousClass0JR.A00(context).A07(getMainDexStoreLocation(context));
    }

    public static File getApkDir(Context context) {
        return new File(context.getApplicationInfo().publicSourceDir).getParentFile();
    }

    public static File getBaseAppImage(Context context) {
        return new File(getBaseIsaDir(context), "base.art");
    }

    public static long getBaseAppImageSize(Context context) {
        return getBaseAppImage(context).length();
    }

    public static File getBaseIsaDir(Context context) {
        File apkDir = getApkDir(context);
        if (apkDir == null) {
            return null;
        }
        return new File(apkDir, "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static File getBaseOdex(Context context) {
        return new File(getBaseIsaDir(context), "base.odex");
    }

    public static long getBaseOdexSize(Context context) {
        return getBaseOdex(context).length();
    }

    public static File getBaseVdex(Context context) {
        return new File(getBaseIsaDir(context), "base.vdex");
    }

    public static long getBaseVdexSize(Context context) {
        return getBaseVdex(context).length();
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        if (!mainDexStoreReferencePgoProfile.exists()) {
            return AnonymousClass0JR.A00(context).A06();
        }
        return mainDexStoreReferencePgoProfile;
    }

    public static File getMainDexStoreLocation(Context context) {
        String realpath;
        String str = context.getApplicationInfo().dataDir;
        if (OREO_OR_NEWER) {
            realpath = str;
        } else {
            realpath = DalvikInternals.realpath(str);
        }
        if (!str.equals(realpath)) {
            Mlog.safeFmt("resolved non-canonical data directory %s to %s", str, realpath);
        }
        return new File(realpath, MAIN_DEX_STORE_ID);
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = getMainDexStoreLocation(context);
        AnonymousClass0JR.A00(context);
        return new File(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }
}
