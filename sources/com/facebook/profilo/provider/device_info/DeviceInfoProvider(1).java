package com.facebook.profilo.provider.device_info;

import X.AnonymousClass00U;
import X.C03990Lu;
import X.C04000Lv;
import X.C07970cW;
import X.C08000cZ;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;

public final class DeviceInfoProvider extends C07970cW {
    public final Context A00;

    public DeviceInfoProvider(Context context) {
        super((String) null);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.A00 = applicationContext;
        } else {
            this.A00 = context;
        }
    }

    public static void A00(Buffer buffer, int i, long j) {
        BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, i, 0, j);
    }

    public static void A01(Buffer buffer, String str, String str2, int i) {
        Buffer buffer2 = buffer;
        int writeStandardEntry = BufferLogger.writeStandardEntry(buffer2, 6, 52, 0, 0, i, 0, 0);
        if (str != null) {
            writeStandardEntry = BufferLogger.writeBytesEntry(buffer2, 0, 56, writeStandardEntry, str);
        }
        BufferLogger.writeBytesEntry(buffer2, 0, 57, writeStandardEntry, str2);
    }

    static {
        ProvidersRegistry.A00.A02("device_info");
    }

    public final void logOnTraceEnd(TraceContext traceContext, C08000cZ r7) {
        long j;
        Buffer buffer = traceContext.A09;
        A01(buffer, "os_ver", Build.VERSION.RELEASE, 8126483);
        A01(buffer, "device_type", Build.MODEL, 8126478);
        A01(buffer, "brand", Build.BRAND, 8126479);
        A01(buffer, "manufacturer", Build.MANUFACTURER, 8126480);
        Context context = this.A00;
        A01(buffer, "year_class", Integer.toString(C04000Lv.A00(context)), 8126481);
        A01(buffer, "os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126537);
        A00(buffer, 8126503, (long) C03990Lu.A00());
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        A00(buffer, 8126502, memoryInfo.totalMem);
        try {
            A01(buffer, "Kernel version", System.getProperty("os.version", "undefined"), 8126527);
        } catch (SecurityException e) {
            Log.w("Profilo/DeviceInfo", AnonymousClass00U.A0L("SecurityException: ", e.getMessage()));
        }
        if (new File("/proc/sys/kernel/perf_event_paranoid").exists()) {
            j = 1;
        } else {
            j = 0;
        }
        A00(buffer, 8126490, j);
    }
}
