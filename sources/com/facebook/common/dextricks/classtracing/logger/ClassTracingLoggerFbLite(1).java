package com.facebook.common.dextricks.classtracing.logger;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ClassTracingLoggerFbLite {
    public static final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();

    public static void beginClassLoad(String str) {
    }

    public static void classNotFound() {
    }

    public static void classLoaded(Class cls) {
    }
}
