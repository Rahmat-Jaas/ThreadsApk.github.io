package com.google.common.util.concurrent;

import X.IYr;

public final class SettableFuture extends IYr {
    public static SettableFuture create() {
        return new SettableFuture();
    }

    public boolean set(Object obj) {
        return super.set(obj);
    }

    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
