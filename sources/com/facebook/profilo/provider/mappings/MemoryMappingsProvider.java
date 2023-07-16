package com.facebook.profilo.provider.mappings;

import X.AnonymousClass0Uk;
import X.C14030oh;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class MemoryMappingsProvider extends AnonymousClass0Uk {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mappings");

    public static native void nativeLogMappings(MultiBufferLogger multiBufferLogger);

    public MemoryMappingsProvider() {
        super("profilo_mappings");
    }

    public void disable() {
        int A03 = C14030oh.A03(-885041157);
        nativeLogMappings(A03());
        C14030oh.A0A(2064528385, A03);
    }

    public void enable() {
        C14030oh.A0A(-704850538, C14030oh.A03(-1170798414));
    }

    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    public int getTracingProviders() {
        return PROVIDER_MAPPINGS;
    }
}
