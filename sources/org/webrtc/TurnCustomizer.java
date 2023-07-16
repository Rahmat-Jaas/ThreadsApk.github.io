package org.webrtc;

import X.C18180wK;

public class TurnCustomizer {
    public long nativeTurnCustomizer;

    public static native void nativeFreeTurnCustomizer(long j);

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer == 0) {
            throw C18180wK.A0a("TurnCustomizer has been disposed.");
        }
    }

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
