package com.facebook.papaya.client.platform;

import X.AnonymousClass00U;
import X.C18190wL;
import com.facebook.redex.IDxTFactoryShape159S0000000_2_I2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class PlatformThreadUtil {
    public static ScheduledExecutorService createExecutor(String str) {
        if (str.equals("scheduling_thread")) {
            return Executors.newSingleThreadScheduledExecutor(new IDxTFactoryShape159S0000000_2_I2(0));
        }
        if (str.equals("random_thread")) {
            return Executors.newScheduledThreadPool(5, new IDxTFactoryShape159S0000000_2_I2(1));
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("No executor for type ", str));
    }
}
