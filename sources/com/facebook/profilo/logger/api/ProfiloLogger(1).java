package com.facebook.profilo.logger.api;

import X.C08060cf;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

public final class ProfiloLogger {
    public static volatile boolean sHasProfilo;

    public static int classLoadEnd(Class cls) {
        if (!sHasProfilo) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (!TraceEvents.isEnabled(externalProvider.A01) || !ClassId.sInitialized) {
            return -1;
        }
        return externalProvider.A08().A00(6, 81, 0, 0, ClassId.getClassId(cls));
    }

    public static int classLoadFailed() {
        if (!sHasProfilo) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (!TraceEvents.isEnabled(externalProvider.A01) || !ClassId.sInitialized) {
            return -1;
        }
        return externalProvider.A08().A00(6, 82, 0, 0, 0);
    }

    public static int classLoadStart() {
        if (!sHasProfilo) {
            return -1;
        }
        ExternalProvider externalProvider = ExternalProviders.A00;
        if (!TraceEvents.isEnabled(externalProvider.A01) || !ClassId.sInitialized) {
            return -1;
        }
        return externalProvider.A08().A00(6, 80, 0, 0, 0);
    }

    public static void installClassLoadTracer() {
        int i = 0;
        String[] strArr = {"com.facebook.profilo.core.ProvidersRegistry", "com.facebook.profilo.core.TraceEvents", "com.facebook.profilo.entries.EntryType", "com.facebook.profilo.logger.ClassLoadLogger", "com.facebook.profilo.logger.BufferLogger", "com.facebook.profilo.logger.Logger", "com.facebook.profilo.logger.MultiBufferLogger", "com.facebook.profilo.provider.constants.ExternalProvider$MultiBufferLoggerLike", "com.facebook.profilo.provider.constants.ExternalProvider", "com.facebook.profilo.provider.constants.ExternalProviders"};
        do {
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
            }
            i++;
        } while (i < 10);
        ProfiloClassLoadTracer.sTracer = new C08060cf();
    }

    public static int writeLigerMetadata(int i, String str, String str2) {
        if (!sHasProfilo) {
            return -1;
        }
        if (str != null) {
            i = ExternalProviders.A03.A08().A01(0, 56, i, str);
        }
        return ExternalProviders.A03.A08().A01(0, 57, i, str2);
    }
}
