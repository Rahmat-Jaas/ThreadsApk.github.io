package com.facebook.cameracore.mediapipeline.services.calllayout;

import X.C18200wM;
import X.C18210wN;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.Set;

public class CallLayoutServiceDelegateManager {
    public final Set mDelegates = C18200wM.A0u();
    public HybridData mHybridData;

    private native HybridData initHybrid();

    private void onComposedLocallyChanged(boolean z) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onComposedLocallyChanged");
            }
        }
    }

    public void onEnforceSharedByAllChanged(boolean z) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onEnforceSharedByAllChanged");
            }
        }
    }

    public void onMaximumParticipantCountChanged(int i) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("onMaximumParticipantCountChanged");
            }
        }
    }
}
