package com.google.android.gms.common.internal;

import X.C14030oh;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;

public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
        C14030oh.A0A(-770457584, C14030oh.A03(-1997495347));
    }

    public final boolean A03(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IBinder asBinder;
        int A03 = C14030oh.A03(311473016);
        boolean z = true;
        if (i == 1) {
            IObjectWrapper DC2 = DC2();
            parcel2.writeNoException();
            if (DC2 == null) {
                asBinder = null;
            } else {
                asBinder = DC2.asBinder();
            }
            parcel2.writeStrongBinder(asBinder);
            i3 = 908880662;
        } else if (i != 2) {
            z = false;
            i3 = 1647239017;
        } else {
            int DBz = DBz();
            parcel2.writeNoException();
            parcel2.writeInt(DBz);
            i3 = 908880662;
        }
        C14030oh.A0A(i3, A03);
        return z;
    }
}
