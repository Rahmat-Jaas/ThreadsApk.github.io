package com.facebook.profilo.provider.perfevents;

import X.AnonymousClass0Vd;
import com.facebook.profilo.logger.MultiBufferLogger;

public class PerfEventsSession {
    public long mNativeHandle;
    public final Runnable mSessionRunnable = new AnonymousClass0Vd(this);
    public Thread mThread;

    public static native long nativeAttach(boolean z, int i, int i2, float f, MultiBufferLogger multiBufferLogger);

    public static native void nativeDetach(long j);

    public static native void nativeRun(long j);

    public static native void nativeStop(long j);

    public synchronized void stop() {
        Throwable runtimeException;
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeStop(j);
            try {
                this.mThread.join();
                this.mThread = null;
            } catch (InterruptedException e) {
                runtimeException = new RuntimeException(e);
            }
        } else if (this.mThread != null) {
            runtimeException = new IllegalStateException("Inconsistent state: have thread but no handle");
        }
        throw runtimeException;
    }

    public void finalize() {
        stop();
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeDetach(j);
            }
        }
        super.finalize();
    }
}
