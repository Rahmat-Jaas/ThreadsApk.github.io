package com.facebook.jni;

import X.AnonymousClass0SR;
import X.AnonymousClass0qM;

public class HybridData {
    public final Destructor mDestructor = new Destructor(this);

    public class Destructor extends AnonymousClass0SR {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        AnonymousClass0qM.A02("fbjni");
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }
}
