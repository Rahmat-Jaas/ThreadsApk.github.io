package com.facebook.profilo.provider.systemcounters;

import X.AnonymousClass0Uk;
import X.AnonymousClass0Vm;
import X.C05630Un;
import X.C05730Vn;
import X.C13820oM;
import X.C14030oh;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

public final class SystemCounterThread extends AnonymousClass0Uk {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public AnonymousClass0Vm mSystemCounterLogger = new AnonymousClass0Vm(A03());

    private native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    public synchronized void disable() {
        int A03 = C14030oh.A03(493192633);
        if (this.mEnabled) {
            this.mSystemCounterLogger.A02();
            if (this.mAllThreadsMode) {
                logCounters();
                logExpensiveCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
        C14030oh.A0A(1054018765, A03);
    }

    public synchronized void enable() {
        synchronized (this) {
            int A03 = C14030oh.A03(-158531286);
            this.mHybridData = initHybrid(A03());
            this.mEnabled = true;
            if (this.mHandler == null) {
                HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
                C13820oM.A00(handlerThread);
                this.mHandlerThread = handlerThread;
                handlerThread.start();
                this.mHandler = new C05730Vn(this.mHandlerThread.getLooper(), this);
            }
            TraceContext traceContext = this.A00;
            if (TraceEvents.isEnabled(PROVIDER_SYSTEM_COUNTERS)) {
                this.mHighFrequencyMode = false;
                nativeSetHighFrequencyMode(false);
                this.mAllThreadsMode = true;
                Debug.startAllocCounting();
                AnonymousClass0Vm r2 = this.mSystemCounterLogger;
                r2.A00 = 0;
                r2.A01 = 0;
                r2.A04 = 0;
                r2.A05 = 0;
                r2.A02 = 0;
                r2.A03 = 0;
                r2.A06 = 0;
                r2.A07 = 0;
                r2.A08 = 0;
                r2.A09 = 0;
                int i = 50;
                if (traceContext != null) {
                    i = traceContext.A08.A00("provider.system_counters.sampling_rate_ms", 50);
                }
                this.mHandler.obtainMessage(1, i, 0).sendToTarget();
                int i2 = 1000;
                if (traceContext != null) {
                    i2 = traceContext.A08.A00("provider.system_counters.expensive_sampling_rate_ms", 1000);
                }
                this.mHandler.obtainMessage(3, i2, 0).sendToTarget();
            }
            if (TraceEvents.isEnabled(PROVIDER_HIGH_FREQ_THREAD_COUNTERS)) {
                nativeAddToWhitelist(Process.myPid());
                this.mHighFrequencyMode = true;
                nativeSetHighFrequencyMode(true);
                int i3 = 7;
                if (traceContext != null) {
                    i3 = traceContext.A08.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
                }
                this.mHandler.obtainMessage(2, i3, 0).sendToTarget();
            }
            C14030oh.A0A(-1242989419, A03);
        }
    }

    public native void logCounters();

    public native void logExpensiveCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);

    static {
        C05630Un r1 = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = r1.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = r1.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        super("profilo_systemcounters");
    }

    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    public int getTracingProviders() {
        int i = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        if (this.mHighFrequencyMode) {
            return i | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
        }
        return i;
    }
}
