package com.google.android.play.core.splitinstall;

import X.AnonymousClass75s;
import X.C111836oV;
import X.C1202579k;
import X.C14030oh;
import android.os.Bundle;

public final class zzbc extends zzbh {
    public zzbc(AnonymousClass75s r3, C111836oV r4) {
        super(r3, r4);
        C14030oh.A0A(-1441265788, C14030oh.A03(-2016203747));
    }

    public final void DC8(Bundle bundle) {
        int A03 = C14030oh.A03(-1008170064);
        super.DC8(bundle);
        C1202579k r2 = this.A00.A00;
        synchronized (r2.A03) {
            if (!r2.A01) {
                r2.A01 = true;
                r2.A02.A01(r2);
            }
        }
        C14030oh.A0A(-1575044924, A03);
    }
}
