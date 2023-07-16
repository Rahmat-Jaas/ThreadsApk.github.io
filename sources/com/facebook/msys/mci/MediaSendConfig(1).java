package com.facebook.msys.mci;

import X.AnonymousClass737;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class MediaSendConfig {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Map map, Map map2);

    private native boolean nativeEquals(Object obj);

    public native Map getExtraLoggingData();

    public native boolean getIsPostingStory();

    public native boolean getIsSecure();

    public native String getJobId();

    public native Map getOptionalConfig();

    public native boolean getSendByServer();

    public native boolean getShouldDedupe();

    public native boolean getShouldTranscode();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSendConfig)) {
            return false;
        }
        return nativeEquals(obj);
    }

    static {
        AnonymousClass737.A00();
    }

    public MediaSendConfig(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
