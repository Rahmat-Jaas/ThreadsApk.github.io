package com.facebook.logcatinterceptor.breakpadinstaller;

import X.AnonymousClass6aF;
import X.C04220Ms;
import X.C15020qa;
import X.C18180wK;
import X.C18250wR;
import X.C86164wN;
import android.content.Context;
import java.io.File;

public final class LogcatInterceptor {
    public static final LogcatInterceptor INSTANCE = new LogcatInterceptor();
    public static final String LOGCAT_DIRECTORY = "minidumps";
    public static final String LOGCAT_PERSISTED_FILE = "logcat-intercept.txt";
    public static volatile boolean installed;

    public static final String getLogcatDir(Context context) {
        C04220Ms.A0B(context, 0);
        File dir = context.getDir(LOGCAT_DIRECTORY, 0);
        if (dir != null) {
            String absolutePath = dir.getAbsolutePath();
            C04220Ms.A06(absolutePath);
            return absolutePath;
        }
        throw C18250wR.A0V("Logcat Install failed to create crash directory: minidumps");
    }

    public static final native void nativeInstall(String str, int i, boolean z, String str2);

    public static final native void nativeIntegrateWithBreakpad(boolean z);

    static {
        C15020qa.A0A("logcat-interceptor-breakpad");
    }

    public static final synchronized void install(Context context, int i, boolean z, String str) {
        IllegalStateException th;
        synchronized (LogcatInterceptor.class) {
            C18180wK.A1P(context, 0, str);
            if (!installed) {
                if (!AnonymousClass6aF.A02) {
                    synchronized (AnonymousClass6aF.A01) {
                        try {
                            if (!AnonymousClass6aF.A02) {
                                AnonymousClass6aF.A02 = true;
                                AnonymousClass6aF.A00 = "breakpad";
                            } else {
                                throw C18180wK.A0a(C86164wN.A0i(AnonymousClass6aF.A00, "Another installation type:%s already checked in"));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    nativeInstall(getLogcatDir(context), i, z, str);
                    installed = true;
                } else {
                    th = C18180wK.A0a(C86164wN.A0i(AnonymousClass6aF.A00, "Another installation type:%s already checked in"));
                    throw th;
                }
            }
        }
    }

    public static final void integrateWithBreakpad(boolean z) {
        if (installed) {
            nativeIntegrateWithBreakpad(z);
            return;
        }
        throw C18250wR.A0V("Logcat interceptor not installed");
    }

    public static final void integrateWithBreakpad() {
        integrateWithBreakpad(false);
    }
}
