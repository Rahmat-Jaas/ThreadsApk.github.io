package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark;

/* renamed from: X.7z8  reason: invalid class name and case insensitive filesystem */
public final class C135257z8 implements Runnable {
    public final /* synthetic */ ARClassBenchmark A00;

    public C135257z8(ARClassBenchmark aRClassBenchmark) {
        this.A00 = aRClassBenchmark;
    }

    public final void run() {
        ARClassBenchmark aRClassBenchmark = this.A00;
        if (aRClassBenchmark.runBenchmarks(aRClassBenchmark.mBenchmarkTotalTime)) {
            aRClassBenchmark.logBenchmarkResults();
        }
    }
}
