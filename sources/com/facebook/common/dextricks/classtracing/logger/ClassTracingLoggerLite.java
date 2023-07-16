package com.facebook.common.dextricks.classtracing.logger;

import X.AnonymousClass080;
import X.C14220p1;
import com.facebook.common.dextricks.classid.ClassId;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ClassTracingLoggerLite {
    public static final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A01;
    public static volatile boolean A02;

    static {
        C14220p1.A02(new AnonymousClass080());
    }

    public static void classLoaded(Class cls) {
        if (A01 && ClassId.sInitialized) {
            A00.add(Long.valueOf(ClassId.getClassId(cls)));
        }
    }

    public static void classNotFound() {
        if (A01 && ClassId.sInitialized) {
            A00.add(-1L);
        }
    }

    public static void beginClassLoad(String str) {
        boolean z = A01;
    }
}
