package com.google.android.gms.location;

import X.C122167Ky;
import X.C18180wK;
import X.C18230wP;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(11);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public zzbd[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                LocationAvailability locationAvailability = (LocationAvailability) obj;
                if (!(this.A01 == locationAvailability.A01 && this.A02 == locationAvailability.A02 && this.A03 == locationAvailability.A03 && this.A00 == locationAvailability.A00 && Arrays.equals(this.A04, locationAvailability.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Long.valueOf(this.A03), this.A04);
    }

    public final String toString() {
        boolean A1W = C18230wP.A1W(this.A00, 1000);
        StringBuilder A0s = C86114wI.A0s(48);
        A0s.append("LocationAvailability[isLocationAvailable: ");
        A0s.append(A1W);
        return C18180wK.A0i("]", A0s);
    }

    public LocationAvailability(zzbd[] zzbdArr, int i, int i2, int i3, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = zzbdArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        C122167Ky.A08(parcel, 2, this.A02);
        C122167Ky.A09(parcel, 3, this.A03);
        C122167Ky.A08(parcel, 4, this.A00);
        C122167Ky.A0M(parcel, this.A04, 5, i);
        C122167Ky.A05(parcel, A002);
    }
}
