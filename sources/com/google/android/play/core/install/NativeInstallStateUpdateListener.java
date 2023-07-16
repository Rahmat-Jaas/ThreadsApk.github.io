package com.google.android.play.core.install;

import X.C143938hY;

public final class NativeInstallStateUpdateListener implements C143938hY {
    public final /* bridge */ /* synthetic */ void CMM(Object obj) {
        onStateUpdate((InstallState) null);
    }

    public native void onStateUpdate(InstallState installState);
}
