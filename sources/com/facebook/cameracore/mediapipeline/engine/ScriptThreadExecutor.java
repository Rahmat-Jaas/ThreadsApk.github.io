package com.facebook.cameracore.mediapipeline.engine;

import X.C13820oM;
import X.C28174Ezk;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public class ScriptThreadExecutor implements Executor {
    public Handler mHandler = new Handler(this.mThread.getLooper());
    public HandlerThread mThread;

    public ScriptThreadExecutor(String str) {
        HandlerThread handlerThread = new HandlerThread(C28174Ezk.A00(312));
        C13820oM.A00(handlerThread);
        this.mThread = handlerThread;
        handlerThread.start();
    }

    public void execute(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void quit() {
        this.mThread.quit();
    }
}
