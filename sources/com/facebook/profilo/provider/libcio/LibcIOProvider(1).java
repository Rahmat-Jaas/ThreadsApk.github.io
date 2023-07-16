package com.facebook.profilo.provider.libcio;

import X.AnonymousClass0Uk;
import X.C14030oh;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class LibcIOProvider extends AnonymousClass0Uk {
    public static final int PROVIDER_LIBC_IO = ProvidersRegistry.A00.A02("libc_io");

    public native void nativeCleanup();

    public native void nativeInitialize(MultiBufferLogger multiBufferLogger);

    public native boolean nativeIsTracingEnabled();

    public LibcIOProvider() {
        super("profilo_libcio");
    }

    public void disable() {
        int A03 = C14030oh.A03(-50977711);
        nativeCleanup();
        C14030oh.A0A(-1560096535, A03);
    }

    public void enable() {
        int A03 = C14030oh.A03(1483191554);
        nativeInitialize(A03());
        C14030oh.A0A(25905291, A03);
    }

    public int getSupportedProviders() {
        return PROVIDER_LIBC_IO;
    }

    public int getTracingProviders() {
        if (nativeIsTracingEnabled()) {
            return PROVIDER_LIBC_IO;
        }
        return 0;
    }
}
