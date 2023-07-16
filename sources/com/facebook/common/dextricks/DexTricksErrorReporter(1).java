package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass08H;
import X.AnonymousClass0MN;
import X.AnonymousClass0NV;
import android.os.Process;
import java.util.HashMap;
import java.util.Random;

public class DexTricksErrorReporter {
    public static final int ALWAYS_REPORT = 1;
    public static final int DEFAULT_SOFT_ERROR_REPORTING_FREQUENCY = 1000;
    public static final int I_WANT_MORE_SOFT_ERRORS_FREQUENCY = 100;
    public static final Random RANDOM = new Random();

    public static String formatCategorySampling(String str, int i) {
        if (i != 1) {
            return AnonymousClass00U.A04(i, str, " [freq=", "]");
        }
        return str;
    }

    public static boolean randomSamplingCoinflip(int i) {
        return i == 1 || RANDOM.nextInt(i) == 0;
    }

    public static void reportSampledSoftError(final String str, final String str2, final int i, Throwable th) {
        Mlog.e(th, "SOFT ERROR %s: %s", str, str2);
        if (randomSamplingCoinflip(i)) {
            final AnonymousClass08H r0 = new AnonymousClass08H(AnonymousClass00U.A0V(str, " | ", str2), th);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        HashMap hashMap = new HashMap();
                        hashMap.put("stack_trace", AnonymousClass0MN.A01(AnonymousClass08H.this));
                        String formatCategorySampling = DexTricksErrorReporter.formatCategorySampling(str, i);
                        String str = str2;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.putAll(hashMap);
                        AnonymousClass0NV.A03((String) null, (String) null, (String) null, (String) null, hashMap2);
                        AnonymousClass0NV.A04(formatCategorySampling, str, hashMap2);
                        AnonymousClass0NV.A00().A05("android_large_soft_error", hashMap2);
                    } catch (Throwable th) {
                        Mlog.w(th, "Unable to report soft error", new Object[0]);
                    }
                }
            }, "dexTrickError").start();
        }
    }

    public static void reportSampledSoftError(String str, String str2, Throwable th) {
        reportSampledSoftError(str, str2, 1000, th);
    }
}
