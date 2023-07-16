package com.facebook.papaya.client;

import X.AnonymousClass0wJ;
import X.AnonymousClass236;
import X.C04220Ms;
import X.C15020qa;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C86144wL;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class PapayaJNI extends HybridClassBase {
    public static final PapayaJNI INSTANCE = new PapayaJNI();

    public static final native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static final native void nativeCancelAllExecutors();

    public static final native void nativeCancelExecutor(String str, String str2);

    public static final native void nativeInitialize(String str, Context context, ComponentName componentName, String str2, String str3, Map map);

    public static final native void nativeRegisterEngine(String str, IEngineFactory iEngineFactory);

    public static final native void nativeRun(Map map);

    public static final native void nativeSetCallback(ICallback iCallback);

    public static final native void nativeStop();

    public static final native void nativeSubmitExecutor(String str, String str2);

    public static final native void nativeUninitialize();

    public static final void run(PapayaRestrictions papayaRestrictions) {
        C04220Ms.A0B(papayaRestrictions, 0);
        if (C86144wL.A1X(Looper.myLooper(), Looper.getMainLooper())) {
            nativeRun(papayaRestrictions.A00());
            return;
        }
        throw C18180wK.A0a("Papaya.run() may only be invoked from background thread!");
    }

    public static final void setCallback(ICallback iCallback) {
        C04220Ms.A0B(iCallback, 0);
        nativeSetCallback(iCallback);
    }

    static {
        C15020qa.A0A("papaya");
    }

    public static final synchronized void initialize(String str, Context context, ComponentName componentName, String str2, String str3, ImmutableMap immutableMap) {
        synchronized (PapayaJNI.class) {
            AnonymousClass0wJ.A1N(str, context);
            C18190wL.A1S(componentName, 2, immutableMap);
            nativeInitialize(str, C18230wP.A09(context), componentName, str2, str3, immutableMap);
        }
    }

    public static final void addLogSink(String str, AnonymousClass236 r2, LogSink logSink) {
        AnonymousClass0wJ.A1N(str, r2);
        C04220Ms.A0B(logSink, 2);
        nativeAddLogSink(str, r2.A00, logSink);
    }

    public static final void cancelAllExecutors() {
        nativeCancelAllExecutors();
    }

    public static final void cancelExecutor(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        nativeCancelExecutor(str, str2);
    }

    public static final void registerEngine(String str, IEngineFactory iEngineFactory) {
        AnonymousClass0wJ.A1N(str, iEngineFactory);
        nativeRegisterEngine(str, iEngineFactory);
    }

    public static final void stop() {
        if (C86144wL.A1X(Looper.myLooper(), Looper.getMainLooper())) {
            nativeStop();
            return;
        }
        throw C18180wK.A0a("Papaya.stop() may only be invoked from background thread!");
    }

    public static final void submitExecutor(String str, String str2) {
        AnonymousClass0wJ.A1N(str, str2);
        nativeSubmitExecutor(str, str2);
    }

    public static final void uninitialize() {
        nativeUninitialize();
    }
}
