package com.google.android.play.core.internal;

import X.C14030oh;
import X.C86144wL;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzl extends Binder implements IInterface {
    public abstract boolean A01(int i, Parcel parcel, Parcel parcel2, int i2);

    public final IBinder asBinder() {
        C14030oh.A0A(-1748356292, C14030oh.A03(79689844));
        return this;
    }

    public zzl() {
        int A03 = C14030oh.A03(-192352412);
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        C14030oh.A0A(-2142501975, A03);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A01;
        int i3;
        int A03 = C14030oh.A03(-1649714248);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A01 = true;
                i3 = 685674373;
            }
            A01 = A01(i, parcel, parcel2, i2);
            i3 = 334970955;
        } else {
            C86144wL.A1A(this, parcel);
            A01 = A01(i, parcel, parcel2, i2);
            i3 = 334970955;
        }
        C14030oh.A0A(i3, A03);
        return A01;
    }
}
