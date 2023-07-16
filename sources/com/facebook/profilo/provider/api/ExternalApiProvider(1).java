package com.facebook.profilo.provider.api;

import X.AnonymousClass00U;
import X.AnonymousClass0Uk;
import X.C08000cZ;
import X.C14030oh;
import android.util.Log;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;

public final class ExternalApiProvider extends AnonymousClass0Uk {
    public static final int PROVIDERS_MASK;
    public static final ExternalProvider[] PROVIDERS_TO_REGISTER;

    static {
        int i = 0;
        ExternalProvider[] externalProviderArr = {ExternalProviders.A00, ExternalProviders.A01};
        PROVIDERS_TO_REGISTER = externalProviderArr;
        int i2 = 0;
        do {
            i2 |= externalProviderArr[i].A01;
            i++;
        } while (i < 2);
        PROVIDERS_MASK = i2;
    }

    public static native void addLogger(String str, MultiBufferLogger multiBufferLogger);

    public ExternalApiProvider() {
        super("profilo_apiimpl");
        A04();
    }

    public int getTracingProviders() {
        return PROVIDERS_MASK & TraceEvents.sProviders;
    }

    public void onTraceStarted(TraceContext traceContext, C08000cZ r9) {
        for (ExternalProvider externalProvider : PROVIDERS_TO_REGISTER) {
            if ((traceContext.A02 & externalProvider.A01) != 0) {
                MultiBufferLogger multiBufferLogger = externalProvider.A08().A00;
                if (multiBufferLogger == null) {
                    Log.w("Profilo/ExternalApi", AnonymousClass00U.A0V("logger for ", externalProvider.A02, " is null, is that provider initialized before ExternalApiProvider?"));
                } else {
                    addLogger(externalProvider.A02, multiBufferLogger);
                }
            }
        }
    }

    public void disable() {
        C14030oh.A0A(-454096347, C14030oh.A03(-2142347049));
    }

    public void enable() {
        C14030oh.A0A(-1163784042, C14030oh.A03(-1353531035));
    }

    public int getSupportedProviders() {
        return PROVIDERS_MASK;
    }
}
