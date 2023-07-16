package com.facebook.profilo.provider.atrace;

import X.C08120cn;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative();

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative();

    public static synchronized boolean hasHacks(MultiBufferLogger multiBufferLogger) {
        boolean z;
        synchronized (Atrace.class) {
            z = sHasHook;
            if (!z && !sHookFailed) {
                z = installSystraceHook(multiBufferLogger, C08120cn.A00);
                sHasHook = z;
                boolean z2 = false;
                if (!z) {
                    z2 = true;
                }
                sHookFailed = z2;
            }
        }
        return z;
    }
}
