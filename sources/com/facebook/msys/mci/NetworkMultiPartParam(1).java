package com.facebook.msys.mci;

import X.AnonymousClass737;
import com.facebook.simplejni.NativeHolder;

public class NetworkMultiPartParam {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, String str2, byte[] bArr);

    private native boolean nativeEquals(Object obj);

    public native byte[] getData();

    public native String getFileName();

    public native String getMimeType();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NetworkMultiPartParam)) {
            return false;
        }
        return nativeEquals(obj);
    }

    static {
        AnonymousClass737.A00();
    }

    public NetworkMultiPartParam(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
