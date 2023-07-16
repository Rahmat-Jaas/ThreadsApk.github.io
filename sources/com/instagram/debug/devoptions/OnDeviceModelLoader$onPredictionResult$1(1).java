package com.instagram.debug.devoptions;

import X.C04220Ms;
import com.instagram.common.ui.base.IgTextView;

public final class OnDeviceModelLoader$onPredictionResult$1 implements Runnable {
    public final /* synthetic */ Object $result;
    public final /* synthetic */ OnDeviceModelLoader this$0;

    public OnDeviceModelLoader$onPredictionResult$1(OnDeviceModelLoader onDeviceModelLoader, Object obj) {
        this.this$0 = onDeviceModelLoader;
        this.$result = obj;
    }

    public final void run() {
        IgTextView igTextView = this.this$0.resultView;
        if (igTextView == null) {
            C04220Ms.A0E("resultView");
            throw null;
        } else {
            igTextView.setText(this.$result.toString());
        }
    }
}
