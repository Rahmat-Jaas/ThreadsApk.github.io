package com.google.android.gms.flags;

import X.C14030oh;
import X.C86104wH;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zzb;

public abstract class zzd extends zzb implements zzc {
    public zzd() {
        C14030oh.A0A(908346635, C14030oh.A03(2060808163));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C14030oh.A03(-1546929479);
        if (i != 1) {
            if (i == 2) {
                i3 = getBooleanFlagValue(parcel.readString(), C86104wH.A1W(parcel), parcel.readInt());
            } else if (i == 3) {
                i3 = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i == 4) {
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
            } else if (i != 5) {
                C14030oh.A0A(-1291390846, A03);
                return false;
            } else {
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            init(IObjectWrapper.Stub.A02(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        C14030oh.A0A(-1492930898, A03);
        return true;
    }
}
