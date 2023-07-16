package com.facebook.redex;

import X.C18180wK;
import X.C39690KyC;
import X.LWN;
import com.google.common.util.concurrent.SettableFuture;

public class IDxCCallbackShape584S0100000_2_I2 implements C39690KyC {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape584S0100000_2_I2(SettableFuture settableFuture, int i) {
        this.A01 = i;
        this.A00 = settableFuture;
    }

    public final void onFailure(String str) {
        ((LWN) this.A00).set(C18180wK.A0X());
    }

    public final void onSuccess() {
        ((LWN) this.A00).set(C18180wK.A0Y());
    }
}
