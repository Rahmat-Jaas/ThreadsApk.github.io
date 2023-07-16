package com.facebook.papaya.store;

import X.C15020qa;
import com.facebook.jni.HybridData;
import java.util.Set;

public final class Query {
    public final HybridData mHybridData;

    public class Builder {
        public final HybridData mHybridData;

        public static native HybridData initHybrid(long j);

        public native Query nativeBuild();

        public native void nativeSetEndRecordName(String str);

        public native void nativeSetEndTime(long j);

        public native void nativeSetLimit(long j);

        public native void nativeSetOrder(int i);

        public native void nativeSetPropertyComplete(boolean z);

        public native void nativeSetPropertyIds(Set set);

        public native void nativeSetRecordNames(Set set);

        public native void nativeSetStartRecordName(String str);

        public native void nativeSetStartTime(long j);

        public native void nativeSetTimeMode(int i);

        static {
            C15020qa.A0A("papaya-store");
        }

        public Builder(long j) {
            this.mHybridData = initHybrid(j);
        }
    }

    static {
        C15020qa.A0A("papaya-store-interface");
    }

    public Query(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
