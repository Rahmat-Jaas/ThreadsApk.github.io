package com.facebook.papaya.fb.instagram;

import X.C04220Ms;
import X.C15020qa;
import android.content.Context;
import com.facebook.papaya.client.engine.IEngineFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public final class VoltronizedEngineFactory extends IEngineFactory {
    public final Context context;
    public final Callable factory;
    public final ReentrantLock lock = new ReentrantLock();

    private final native void initHybridEngineFactory(String str);

    private final IEngineFactory getActualEngineFactory() {
        IEngineFactory iEngineFactory;
        synchronized (this.lock) {
            iEngineFactory = (IEngineFactory) this.factory.call();
        }
        C04220Ms.A04(iEngineFactory);
        return iEngineFactory;
    }

    public VoltronizedEngineFactory(Context context2, Callable callable) {
        super(context2);
        this.context = context2;
        this.factory = callable;
        C15020qa.A0A("papaya-ig4a-jni-engine-factory");
        initHybridEngineFactory("getActualEngineFactory");
    }
}
