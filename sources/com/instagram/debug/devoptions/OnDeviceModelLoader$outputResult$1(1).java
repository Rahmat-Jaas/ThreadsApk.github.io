package com.instagram.debug.devoptions;

import X.C04220Ms;
import com.instagram.common.ui.base.IgTextView;

public final class OnDeviceModelLoader$outputResult$1 implements Runnable {
    public final /* synthetic */ String $result;
    public final /* synthetic */ OnDeviceModelLoader this$0;

    public OnDeviceModelLoader$outputResult$1(OnDeviceModelLoader onDeviceModelLoader, String str) {
        this.this$0 = onDeviceModelLoader;
        this.$result = str;
    }

    public final void run() {
        IgTextView igTextView = this.this$0.resultView;
        if (igTextView == null) {
            C04220Ms.A0E("resultView");
            throw null;
        } else {
            igTextView.setText(this.$result);
        }
    }
}
