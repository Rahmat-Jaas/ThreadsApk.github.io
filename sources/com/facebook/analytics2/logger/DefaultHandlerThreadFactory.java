package com.facebook.analytics2.logger;

import X.C13820oM;
import android.content.Context;
import android.os.HandlerThread;

public class DefaultHandlerThreadFactory implements HandlerThreadFactory {
    public final boolean CYs() {
        return true;
    }

    public final HandlerThread AFM(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        C13820oM.A00(handlerThread);
        handlerThread.start();
        return handlerThread;
    }

    public DefaultHandlerThreadFactory(Context context) {
    }
}
