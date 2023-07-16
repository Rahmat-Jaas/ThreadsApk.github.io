package com.facebook.msys.mci;

import X.AnonymousClass737;
import com.facebook.simplejni.NativeHolder;

public class TranscodeGifCompletionCallback {
    public NativeHolder mNativeHolder;

    private native void failureNative(Throwable th);

    private native void successNative(String str);

    static {
        AnonymousClass737.A00();
    }

    public TranscodeGifCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
