package com.facebook.breakpad;

import X.AnonymousClass0FX;
import X.AnonymousClass0LU;
import X.C14630pr;
import X.C15020qa;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Formatter;
import java.util.TreeMap;

public class BreakpadManager {
    public static volatile File mCrashDirectory;
    public static String mNativeLibraryName;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native long getMinidumpFlags();

    public static native void install(String str, String str2, int i, int i2);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void setMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static native void uninstall();

    public static boolean containsKey(String str) {
        if (mCrashDirectory != null) {
            return nativeContainsKey(str);
        }
        AnonymousClass0LU.A0C("BreakpadManager", "Breakpad is not active (containsKey).");
        return false;
    }

    public static boolean enableCoreDumping(Context context) {
        if (mNativeLibraryName == null) {
            C15020qa.A0A("breakpad");
            mNativeLibraryName = "breakpad";
        }
        if (!isCoreResourceHardUnlimited()) {
            return false;
        }
        return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
    }

    public static File getCrashDirectory() {
        if (mCrashDirectory != null) {
            return mCrashDirectory;
        }
        throw new RuntimeException("Breakpad not installed");
    }

    public static String getCustomData(String str) {
        if (mCrashDirectory != null) {
            return nativeGetCustomData(str);
        }
        AnonymousClass0LU.A0C("BreakpadManager", "Breakpad is not active (getCustomData).");
        return "";
    }

    public static boolean isActive() {
        if (mCrashDirectory != null) {
            return true;
        }
        return false;
    }

    public static void removeCustomData(String str) {
        if (mCrashDirectory != null) {
            nativeRemoveCustomData(str);
        } else {
            AnonymousClass0LU.A0C("BreakpadManager", "Breakpad is not active (removeCustomData).");
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (mCrashDirectory != null) {
            if (objArr.length > 0 && str2 != null) {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = sb.toString();
            }
            nativeSetCustomData(str, str2);
            return;
        }
        AnonymousClass0LU.A0C("BreakpadManager", "Breakpad is not active (setCustomData).");
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property == null || property.startsWith("1.") || property.startsWith("0.")) {
                z2 = false;
            } else {
                z2 = true;
                if (z) {
                    C15020qa.A0A("breakpad_cpp_helper");
                }
            }
            nativeSetJvmStreamEnabled(z2, z);
        }
    }

    public static synchronized void start(Context context, long j, int i, String str) {
        synchronized (BreakpadManager.class) {
            if (mNativeLibraryName == null) {
                C15020qa.A0A("breakpad");
                mNativeLibraryName = "breakpad";
            }
            if (mCrashDirectory == null) {
                File A00 = C14630pr.A00(context, 1874789883);
                A00.mkdirs();
                String absolutePath = A00.getAbsolutePath();
                if (str == null) {
                    str = "";
                }
                install(absolutePath, str, 1536000, Build.VERSION.SDK_INT);
                mCrashDirectory = A00;
                setMinidumpFlags(0 | getMinidumpFlags() | 2 | 4);
                int A01 = AnonymousClass0FX.A01();
                String str2 = Build.FINGERPRINT;
                setVersionInfo(A01, "289.0.0.68.109", str2);
                setCustomData("Fingerprint", str2, new Object[0]);
            }
        }
    }

    public static void start(Context context) {
        start(context, 0, 1536000, (String) null);
    }
}
