package com.google.android.gms.internal.base;

import X.C14030oh;
import X.C86104wH;
import X.C86144wL;
import X.C93255lG;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.internal.auth.zzab;

public abstract class zab extends Binder implements IInterface {
    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IStatusCallback.Stub stub = (IStatusCallback.Stub) this;
        int A03 = C14030oh.A03(409316828);
        boolean z = true;
        if (i == 1) {
            int A032 = C14030oh.A03(1586655442);
            C93255lG.A00((Status) C86104wH.A0F(parcel, Status.CREATOR), ((zzab) stub).A00, (Object) null);
            C14030oh.A0A(946165390, A032);
            i3 = -1572063994;
        } else {
            z = false;
            i3 = -1889013388;
        }
        C14030oh.A0A(i3, A03);
        return z;
    }

    public final IBinder asBinder() {
        C14030oh.A0A(-75446214, C14030oh.A03(-1937372195));
        return this;
    }

    public zab(String str) {
        int A03 = C14030oh.A03(1502747780);
        attachInterface(this, str);
        C14030oh.A0A(1912880798, A03);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A00;
        int i3;
        int A03 = C14030oh.A03(-187010873);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A00 = true;
                i3 = 984591939;
            }
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 714703134;
        } else {
            C86144wL.A1A(this, parcel);
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 714703134;
        }
        C14030oh.A0A(i3, A03);
        return A00;
    }
}
