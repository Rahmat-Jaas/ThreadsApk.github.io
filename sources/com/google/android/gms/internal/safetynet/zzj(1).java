package com.google.android.gms.internal.safetynet;

import X.C14030oh;
import android.os.IBinder;
import android.os.IInterface;

public final class zzj implements IInterface, zzi {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(240949633);
        IBinder iBinder = this.A00;
        C14030oh.A0A(625063383, A03);
        return iBinder;
    }

    public zzj(IBinder iBinder) {
        int A03 = C14030oh.A03(761763215);
        this.A00 = iBinder;
        C14030oh.A0A(219535784, A03);
        C14030oh.A0A(-1621362217, C14030oh.A03(-113475116));
    }
}
