package com.facebook.msys.util;

import X.AnonymousClass737;
import com.facebook.simplejni.NativeHolder;

public final class NativeRunnable implements Runnable {
    public NativeHolder mNativeHolder;

    public native void run();

    static {
        AnonymousClass737.A00();
    }

    public NativeRunnable(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
