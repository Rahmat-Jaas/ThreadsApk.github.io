package com.facebook.xplat.fbglog;

import X.AnonymousClass0LU;
import X.AnonymousClass0LV;
import X.AnonymousClass0qM;
import X.C16180sc;

public class FbGlog {
    public static AnonymousClass0LV sCallback;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    static {
        AnonymousClass0qM.A02("fb");
    }

    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                C16180sc r2 = new C16180sc();
                sCallback = r2;
                synchronized (AnonymousClass0LU.class) {
                    AnonymousClass0LU.A00.add(r2);
                }
                setLogLevel(AnonymousClass0LU.A01.getMinimumLoggingLevel());
            }
        }
    }
}
