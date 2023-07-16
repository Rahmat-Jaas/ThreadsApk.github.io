package com.facebook.common.dextricks.classtracing.logger;

import X.AnonymousClass07y;
import X.C14220p1;
import com.facebook.common.dextricks.classid.ClassId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class ClassTracingLogger {
    public static final Class TAG = ClassTracingLogger.class;
    public static volatile boolean sEnabled;
    public static volatile boolean sEverEnabled;
    public static volatile boolean sLoggerEnabled;
    public static volatile boolean sNativeEnabled;
    public static volatile boolean sSystraceEnabled;

    static {
        C14220p1.A02(new AnonymousClass07y());
    }

    public static void beginClassLoad(String str) {
        if (sEnabled) {
            ClassTracingLoggerNativeHolder.classLoadStarted(str);
        }
    }

    public static void classLoaded(Class cls) {
        long classId;
        if (sEnabled) {
            if (!ClassId.sInitialized) {
                classId = -1;
            } else {
                classId = ClassId.getClassId(cls);
                if ((-281474976710656L & classId) == 0) {
                    Thread currentThread = Thread.currentThread();
                    if (currentThread != null) {
                        classId |= (currentThread.getId() & 65535) << 48;
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            ClassTracingLoggerNativeHolder.classLoaded(classId);
        }
    }

    public static void classNotFound() {
        if (sEnabled) {
            ClassTracingLoggerNativeHolder.classLoadCancelled();
        }
    }

    public static long[] getLoadedClassIdsInternal() {
        if (!sEverEnabled) {
            return new long[0];
        }
        long[] loadedClassIds = ClassTracingLoggerNativeHolder.loadedClassIds();
        HashMap hashMap = new HashMap();
        int i = 0;
        boolean z = false;
        for (long j : loadedClassIds) {
            if (j != -1) {
                int i2 = (int) (j & 4294967295L);
                if (i2 != 1505373456 && i2 != 1215735889) {
                    z = true;
                } else if (!hashMap.containsKey(Long.valueOf(j)) || z) {
                    z = false;
                }
                int i3 = i + 1;
                loadedClassIds[i] = j;
                if (i2 == 1505373456 || i2 == 1215735889) {
                    hashMap.put(Long.valueOf(j), true);
                }
                i = i3;
            }
        }
        return Arrays.copyOf(loadedClassIds, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initialize() {
        /*
            boolean r2 = sNativeEnabled
            boolean r0 = sLoggerEnabled
            r3 = 0
            r1 = 1
            if (r0 != 0) goto L_0x000f
            boolean r0 = sSystraceEnabled
            if (r0 != 0) goto L_0x000f
            r0 = 0
            if (r2 == 0) goto L_0x0025
        L_0x000f:
            sEverEnabled = r1
            r0 = r2 ^ 1
            boolean r2 = sLoggerEnabled
            boolean r1 = sSystraceEnabled
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "classtracing"
            X.C15020qa.A0A(r0)     // Catch:{ UnsatisfiedLinkError -> 0x001f }
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0025
        L_0x0021:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder.configureTracing(r2, r1)
            r0 = 1
        L_0x0025:
            sNativeEnabled = r0
            boolean r0 = sNativeEnabled
            if (r0 == 0) goto L_0x0030
            boolean r0 = com.facebook.common.dextricks.classid.ClassId.sInitialized
            if (r0 == 0) goto L_0x0030
            r3 = 1
        L_0x0030:
            sEnabled = r3
            boolean r0 = sEnabled
            X.AnonymousClass0Hr.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.initialize():void");
    }

    public static Map getThreadIdToNameMapping() {
        Thread[] threadArr = new Thread[(Thread.activeCount() + 20)];
        int enumerate = Thread.enumerate(threadArr);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < enumerate; i++) {
            hashMap.put(Long.valueOf(threadArr[i].getId()), threadArr[i].getName());
        }
        return hashMap;
    }
}
