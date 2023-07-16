package com.facebook.jni;

import X.AnonymousClass0qM;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        AnonymousClass0qM.A02("fb");
    }

    public void finalize() {
        dispose();
        super.finalize();
    }
}
