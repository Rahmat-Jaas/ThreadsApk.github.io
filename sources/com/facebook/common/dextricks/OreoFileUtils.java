package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C15020qa;
import android.content.Context;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OreoFileUtils {
    public static native String getOdexKeyValueNative(String str, String str2);

    static {
        C15020qa.A0A("oreofileutils-jni");
    }

    public static List areFilesMapped(List list) {
        return areFilesMapped(list, "/proc/self/maps");
    }

    public static long currentProfileSize(File file) {
        return new File(file.getParentFile(), AnonymousClass00U.A0V("oat/", file.getName(), ".cur.prof")).length();
    }

    public static String getBaseOdexDex2OatCmdLine(Context context) {
        return getBaseOdexKeyValue(context, "dex2oat-cmdline");
    }

    public static String getBaseOdexKeyValue(Context context, String str) {
        File baseOdex = DexStoreUtils.getBaseOdex(context);
        if (!baseOdex.exists()) {
            return "";
        }
        try {
            return getOdexKeyValueNative(baseOdex.getCanonicalPath(), str);
        } catch (IOException | RuntimeException unused) {
            return "";
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileContents(java.io.File r3) {
        /*
            if (r3 == 0) goto L_0x0034
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x002f }
            r0.<init>(r3)     // Catch:{ IOException -> 0x002f }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002f }
        L_0x0017:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0026
            r2.append(r0)     // Catch:{ all -> 0x002a }
            r0 = 10
            r2.append(r0)     // Catch:{ all -> 0x002a }
            goto L_0x0017
        L_0x0026:
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x002f
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0034:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OreoFileUtils.getFileContents(java.io.File):java.lang.String");
    }

    public static String getMegazipOdexDex2OatCmdLine(File file) {
        return getMegazipOdexKeyValue(file, "dex2oat-cmdline");
    }

    public static boolean alreadyExtractedForCloudPgo(File file) {
        return new File(file.getParentFile(), "oat/cloud_pgo_extracted").exists();
    }

    public static boolean alreadyPostColdStartSpeedProfile(File file) {
        return new File(file.getParentFile(), "oat/speed_profile").exists();
    }

    public static boolean alreadyUnpackedForCloudPgo(File file) {
        return new File(file.getParentFile(), "oat/cloud_pgo_unpacked").exists();
    }

    public static DexErrorRecoveryInfoAsync collectAsyncInfoWithSecondary(Context context, File file) {
        Long l;
        Long l2;
        Long l3;
        List usingOptimizedBaseAndMegazipFiles = usingOptimizedBaseAndMegazipFiles(context, file);
        Boolean bool = (Boolean) usingOptimizedBaseAndMegazipFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(2);
        Boolean bool4 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(3);
        Boolean bool5 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(4);
        Boolean bool6 = Boolean.TRUE;
        Long l4 = null;
        if (bool6.equals(bool)) {
            l = Long.valueOf(DexStoreUtils.getBaseOdex(context).length());
        } else {
            l = null;
        }
        if (bool6.equals(bool2)) {
            l2 = Long.valueOf(DexStoreUtils.getBaseVdex(context).length());
        } else {
            l2 = null;
        }
        if (bool6.equals(bool3)) {
            l3 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).length());
        } else {
            l3 = null;
        }
        if (bool6.equals(bool5)) {
            l4 = Long.valueOf(getImageSize(file));
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, bool4, bool5, l, l2, l3, l4);
    }

    public static DexErrorRecoveryInfoAsync collectBaseAsyncInfo(Context context) {
        Long l;
        Long l2;
        List usingOptimizedBaseFiles = usingOptimizedBaseFiles(context);
        Boolean bool = (Boolean) usingOptimizedBaseFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseFiles.get(2);
        Boolean bool4 = Boolean.TRUE;
        Long l3 = null;
        if (bool4.equals(bool)) {
            l = Long.valueOf(DexStoreUtils.getBaseOdex(context).length());
        } else {
            l = null;
        }
        if (bool4.equals(bool2)) {
            l2 = Long.valueOf(DexStoreUtils.getBaseVdex(context).length());
        } else {
            l2 = null;
        }
        if (bool4.equals(bool3)) {
            l3 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).length());
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, l, l2, l3);
    }

    public static String getBaseAppImageName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.art");
    }

    public static String getBaseOdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.odex");
    }

    public static String getBaseVdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.vdex");
    }

    public static long getImageSize(File file) {
        return new File(getIsaDir(file), getZipNameNoSuffix(file).concat(".art")).length();
    }

    public static File getIsaDir(File file) {
        return new File(file.getParentFile(), "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static String getMegazipAppImageName(File file) {
        return getZipNameNoSuffix(file).concat(".art");
    }

    public static String getMegazipOdexKeyValue(File file, String str) {
        File odex = getOdex(file);
        if (!odex.exists()) {
            return "";
        }
        try {
            return getOdexKeyValueNative(odex.getCanonicalPath(), str);
        } catch (IOException | RuntimeException unused) {
            return "";
        }
    }

    public static File getOdex(File file) {
        return new File(getIsaDir(file), getOdexName(file));
    }

    public static long getOdexLastModified(File file) {
        return getOdex(file).lastModified();
    }

    public static String getOdexName(File file) {
        return getZipNameNoSuffix(file).concat(DexManifest.ODEX_EXT);
    }

    public static long getOdexSize(File file) {
        return getOdex(file).length();
    }

    public static File getOptLogFile(File file) {
        File file2 = new File(file.getParent(), "oat/opt_log.txt");
        try {
            Files.deleteIfExists(file2.toPath());
            file2.createNewFile();
            return file2;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File getReferenceProfile(File file) {
        return new File(file.getParentFile(), "oat/".concat(file.getName()).concat(".prof"));
    }

    public static File getVdex(File file) {
        return new File(getIsaDir(file), getVdexName(file));
    }

    public static long getVdexLastModified(File file) {
        return getVdex(file).lastModified();
    }

    public static String getVdexName(File file) {
        return getZipNameNoSuffix(file).concat(".vdex");
    }

    public static long getVdexSize(File file) {
        return getVdex(file).length();
    }

    public static String getZipNameNoSuffix(File file) {
        String name = file.getName();
        return name.substring(0, name.lastIndexOf(46));
    }

    public static boolean hasOdex(File file) {
        if (getOdex(file).length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean hasVdexOdex(File file) {
        if (getVdex(file).length() <= 0 || getOdex(file).length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isTruncated(File file) {
        if (!file.exists() || file.length() < 102400) {
            return true;
        }
        return false;
    }

    public static void markExtractedForCloudPgo(File file) {
        try {
            new File(file.getParentFile(), "oat/cloud_pgo_extracted").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markPostColdStartSpeedProfile(File file) {
        try {
            new File(file.getParentFile(), "oat/speed_profile").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markUnpackedForCloudPgo(File file) {
        try {
            new File(file.getParentFile(), "oat/cloud_pgo_unpacked").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static long referenceProfileSize(File file) {
        return getReferenceProfile(file).length();
    }

    public static List usingOptimizedBaseAndMegazipFiles(Context context, File file) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(5, false);
        }
        return areFilesMapped(new ArrayList(Arrays.asList(new String[]{baseOdexName, baseVdexName, baseAppImageName, getOdexName(file), getMegazipAppImageName(file)})), "/proc/self/maps");
    }

    public static List usingOptimizedBaseFiles(Context context) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(3, false);
        }
        return areFilesMapped(new ArrayList(Arrays.asList(new String[]{baseOdexName, baseVdexName, baseAppImageName})), "/proc/self/maps");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[EDGE_INSN: B:17:0x0057->B:18:? ?: BREAK  , SYNTHETIC, Splitter:B:17:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b A[Catch:{ all -> 0x005b, all -> 0x005f, IOException -> 0x0060 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0057=Splitter:B:17:0x0057, B:23:0x005f=Splitter:B:23:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List areFilesMapped(java.util.List r6, java.lang.String r7) {
        /*
            int r1 = r6.size()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.List r0 = java.util.Collections.nCopies(r1, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x0060 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0060 }
            r0 = 128(0x80, float:1.794E-43)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0060 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x0060 }
            r3 = 0
        L_0x001f:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0057
            int r0 = r6.size()     // Catch:{ all -> 0x005b }
            if (r3 == r0) goto L_0x0057
            r1 = 0
        L_0x002c:
            int r0 = r6.size()     // Catch:{ all -> 0x005b }
            if (r1 >= r0) goto L_0x001f
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0054
            java.lang.Object r0 = r6.get(r1)     // Catch:{ all -> 0x005b }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0054
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x005b }
            r5.set(r1, r0)     // Catch:{ all -> 0x005b }
            int r3 = r3 + 1
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0057:
            r4.close()     // Catch:{ IOException -> 0x0060 }
            return r5
        L_0x005b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OreoFileUtils.areFilesMapped(java.util.List, java.lang.String):java.util.List");
    }
}
