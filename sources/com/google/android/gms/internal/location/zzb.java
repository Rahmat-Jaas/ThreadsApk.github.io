package com.google.android.gms.internal.location;

import X.C14030oh;
import android.os.IBinder;
import android.os.IInterface;

public class zzb implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzb(String str, IBinder iBinder) {
        int A03 = C14030oh.A03(335478558);
        this.A00 = iBinder;
        this.A01 = str;
        C14030oh.A0A(658887038, A03);
    }

    public final IBinder asBinder() {
        int A03 = C14030oh.A03(-856015257);
        IBinder iBinder = this.A00;
        C14030oh.A0A(440586488, A03);
        return iBinder;
    }
}
