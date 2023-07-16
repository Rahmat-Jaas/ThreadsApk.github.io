package com.google.android.gms.common.internal;

import X.AnonymousClass5om;
import X.C121837Ij;
import X.C13320nQ;
import X.C14030oh;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

public final class zzd extends zzab {
    public C121837Ij A00;
    public final int A01;

    public zzd(C121837Ij r3, int i) {
        int A03 = C14030oh.A03(1789541247);
        this.A00 = r3;
        this.A01 = i;
        C14030oh.A0A(986536137, A03);
    }

    public final void CBo(int i, IBinder iBinder, Bundle bundle) {
        int A03 = C14030oh.A03(-2065250662);
        C13320nQ.A02(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        C121837Ij r0 = this.A00;
        int i2 = this.A01;
        Handler handler = r0.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new AnonymousClass5om(bundle, iBinder, r0, i)));
        this.A00 = null;
        C14030oh.A0A(1797520623, A03);
    }
}
