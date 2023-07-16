package com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base;

import X.C135257z8;
import X.C142018df;
import X.C15020qa;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.jni.HybridData;
import java.io.IOException;
import java.util.concurrent.Executor;

public class ARClassBenchmark implements IARClassBenchmark {
    public final float mBenchmarkTotalTime;
    public Executor mExecutor;
    public HybridData mHybridData;
    public C142018df mStateListener;

    public static native HybridData initHybrid(AnalyticsLogger analyticsLogger, String str, float f);

    /* access modifiers changed from: private */
    public native void logBenchmarkResults();

    /* access modifiers changed from: private */
    public native boolean runBenchmarks(float f);

    public native int getBenchmarkVersion();

    static {
        C15020qa.A0A("arclassBenchmark");
    }

    public void startBenchmarks() {
        this.mExecutor.execute(new C135257z8(this));
    }

    public ARClassBenchmark(Executor executor, AnalyticsLogger analyticsLogger, Context context, float f, C142018df r6) {
        this.mExecutor = executor;
        this.mBenchmarkTotalTime = f;
        this.mStateListener = r6;
        try {
            this.mHybridData = initHybrid(analyticsLogger, context.getCacheDir().getCanonicalPath(), f);
        } catch (IOException unused) {
            this.mHybridData = initHybrid(analyticsLogger, "", f);
        }
    }
}
