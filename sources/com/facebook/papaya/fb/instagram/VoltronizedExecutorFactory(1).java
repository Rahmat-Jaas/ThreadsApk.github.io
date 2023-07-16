package com.facebook.papaya.fb.instagram;

import X.AnonymousClass6HY;
import X.C18210wN;
import com.facebook.papaya.client.executor.IExecutorFactory;

public final class VoltronizedExecutorFactory extends IExecutorFactory {
    public static final AnonymousClass6HY Companion = new AnonymousClass6HY();

    private final native void initHybridExecutorFactory(String str);

    private final IExecutorFactory getActualExecutorFactory() {
        throw C18210wN.A0W("getValue");
    }
}
