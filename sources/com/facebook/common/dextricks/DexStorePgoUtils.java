package com.facebook.common.dextricks;

import X.AnonymousClass0JI;
import X.AnonymousClass0JR;
import X.AnonymousClass0JS;
import android.content.Context;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class DexStorePgoUtils {
    public static final String UNKNOWN_DEX_ID = "NO_DEX_ID";

    public static File getDefaultPgoMixedModeProfileFromApkForDex(Context context, ExpectedFileInfo expectedFileInfo, DexStore.TmpDir tmpDir) {
        String str;
        Object[] objArr;
        String str2;
        DexManifest.Dex dex = expectedFileInfo.dex;
        if (dex != null) {
            str = dex.hash;
        } else {
            Mlog.w("Cannot find dex file to use as an id", new Object[0]);
            str = UNKNOWN_DEX_ID;
        }
        AnonymousClass0JR A00 = AnonymousClass0JR.A00(context);
        File file = tmpDir.directory;
        String format = String.format("TmpPgoProfile_%s_%s", new Object[]{str, AnonymousClass0JR.A02(A00)});
        File file2 = new File(file, format);
        if (file2.exists()) {
            objArr = new Object[]{str, file2.getAbsolutePath()};
            str2 = "Temp PGO profile for %s from APK already exists. Temp File: %s";
        } else if (AnonymousClass0JR.A04(A00.A02, file2)) {
            objArr = new Object[]{str, format};
            str2 = "Successfully created orig mm pgo prof file for %s from APK in tmp dir. Name: %s";
        } else {
            throw new IOException(String.format("Could not create orig mm PGO profile for %s from APK. Temp File: %s", new Object[]{str, file2.getAbsolutePath()}));
        }
        String.format(str2, objArr);
        return file2;
    }

    public static void addCurrentMultidexCodePaths() {
        String[] strArr;
        DexFile[] configuredDexFiles = MultiDexClassLoader.getConfiguredDexFiles();
        if (configuredDexFiles == null) {
            strArr = new String[0];
        } else {
            int length = configuredDexFiles.length;
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = configuredDexFiles[i].getName();
            }
        }
        String.format("Adding the dex code paths to the jit: %s", new Object[]{Arrays.toString(strArr)});
    }

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return AnonymousClass0JR.A00(context).A07(DexStoreUtils.getMainDexStoreLocation(context));
    }

    public static void forceCleanMainDexStoreProfiles(Context context) {
        String str;
        String str2;
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        AnonymousClass0JR A00 = AnonymousClass0JR.A00(context);
        File fileStreamPath = A00.A02.getFileStreamPath(AnonymousClass0JR.A02(A00));
        fileStreamPath.delete();
        if (fileStreamPath.exists()) {
            str = "not ";
        } else {
            str = "";
        }
        String.format("Did %sdelete or was already deleted %s profile %s", new Object[]{str, "current", fileStreamPath.getAbsolutePath()});
        File file = new File(mainDexStoreLocation, "art_pgo_ref_profile.prof");
        file.delete();
        if (file.exists()) {
            str2 = "not ";
        } else {
            str2 = "";
        }
        String.format("Did %sdelete or was already deleted %s profile %s", new Object[]{str2, "reference", file.getAbsolutePath()});
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        if (!mainDexStoreReferencePgoProfile.exists()) {
            return AnonymousClass0JR.A00(context).A06();
        }
        return mainDexStoreReferencePgoProfile;
    }

    public static String getDefaultPgoMixedModeProfileFilePathFromApkForDex(Context context, ExpectedFileInfo expectedFileInfo, DexStore.TmpDir tmpDir) {
        return getDefaultPgoMixedModeProfileFromApkForDex(context, expectedFileInfo, tmpDir).getAbsolutePath();
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        AnonymousClass0JR.A00(context);
        return new File(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }

    public static String getMainDexStoreReferencePgoProfileFilePath(Context context) {
        return getMainDexStoreReferencePgoProfile(context).getAbsolutePath();
    }

    public static AnonymousClass0JI getPgoDataForMainDexStore(Context context, boolean z) {
        DexStoreUtils.getMainDexStoreLocation(context).getAbsolutePath();
        return null;
    }

    public static List getPgoMethodInfoWithDexStore(Context context) {
        String absolutePath;
        DexFile[] configuredDexFiles = MultiDexClassLoader.getConfiguredDexFiles();
        File A06 = AnonymousClass0JR.A00(context).A06();
        if (A06 == null) {
            absolutePath = null;
        } else {
            absolutePath = A06.getAbsolutePath();
        }
        return AnonymousClass0JS.A00(absolutePath, configuredDexFiles);
    }

    public static boolean isMainDexStoreProfileChangeSignificant(Context context, boolean z) {
        DexStoreUtils.getMainDexStoreLocation(context).getAbsolutePath();
        return false;
    }

    public static List getPgoMethodInfoWithDexStore(String str) {
        return AnonymousClass0JS.A00(str, MultiDexClassLoader.getConfiguredDexFiles());
    }
}
