package com.google.android.gms.location;

import X.C122167Ky;
import X.C18190wL;
import X.C86134wK;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(18);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzbd zzbd = (zzbd) obj;
                if (!(this.A00 == zzbd.A00 && this.A01 == zzbd.A01 && this.A02 == zzbd.A02 && this.A03 == zzbd.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A03), Long.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("NetworkLocationStatus:");
        A0s.append(" Wifi status: ");
        A0s.append(this.A00);
        A0s.append(" Cell status: ");
        A0s.append(this.A01);
        A0s.append(" elapsed time NS: ");
        A0s.append(this.A03);
        A0s.append(" system time ms: ");
        return C86154wM.A0n(A0s, this.A02);
    }

    public zzbd(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A02);
        C122167Ky.A09(parcel, 4, this.A03);
        C122167Ky.A05(parcel, A002);
    }
}
