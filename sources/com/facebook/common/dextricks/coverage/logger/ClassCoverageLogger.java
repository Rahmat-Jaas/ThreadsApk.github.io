package com.facebook.common.dextricks.coverage.logger;

import X.C02640Cf;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ClassCoverageLogger {
    public static final Queue A00 = new ConcurrentLinkedQueue();
    public static volatile String A01 = C02640Cf.A01("fb.throw_on_class_load");
    public static volatile boolean A02 = "true".equals(C02640Cf.A01("fb.enable_class_coverage"));
}
