package com.facebook.profilo.provider.constants;

import X.AnonymousClass0Uk;
import X.C14030oh;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class ExternalProvider extends AnonymousClass0Uk {
    public MultiBufferLoggerLike A00;
    public final int A01;
    public final String A02;
    public volatile int A03;

    public final class MultiBufferLoggerLike {
        public MultiBufferLogger A00;

        public final int A00(int i, int i2, int i3, int i4, long j) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeStandardEntry(i, i2, 0, 0, i3, i4, j);
        }

        public final int A01(int i, int i2, int i3, String str) {
            MultiBufferLogger multiBufferLogger = this.A00;
            if (multiBufferLogger == null) {
                return 0;
            }
            return multiBufferLogger.writeBytesEntry(i, i2, i3, str);
        }

        public MultiBufferLoggerLike(MultiBufferLogger multiBufferLogger) {
            this.A00 = multiBufferLogger;
        }
    }

    public ExternalProvider(String str) {
        super((String) null);
        this.A01 = ProvidersRegistry.A00.A02(str);
        this.A02 = str;
    }

    public final boolean A07() {
        return true;
    }

    public final MultiBufferLoggerLike A08() {
        if (this.A03 != 2) {
            if (this.A05) {
                this.A00 = new MultiBufferLoggerLike(A03());
                this.A03 = 2;
            } else if (this.A03 == 0) {
                this.A00 = new MultiBufferLoggerLike((MultiBufferLogger) null);
                this.A03 = 1;
            }
        }
        return this.A00;
    }

    public final int getTracingProviders() {
        return this.A01 & TraceEvents.sProviders;
    }

    public final void disable() {
        C14030oh.A0A(1916978890, C14030oh.A03(1185053069));
    }

    public final void enable() {
        C14030oh.A0A(863822343, C14030oh.A03(-1882151981));
    }

    public final int getSupportedProviders() {
        return this.A01;
    }
}
