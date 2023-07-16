package com.google.android.gms.clearcut;

import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(98);
    public final long A00;
    public final long A01;
    public final boolean A02;

    public zzc(boolean z, long j, long j2) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzc) {
                zzc zzc = (zzc) obj;
                if (!(this.A02 == zzc.A02 && this.A00 == zzc.A00 && this.A01 == zzc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(Boolean.valueOf(this.A02), Long.valueOf(this.A00), Long.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CollectForDebugParcelable[skipPersistentStorage: ");
        A0s.append(this.A02);
        A0s.append(",collectForDebugStartTimeMillis: ");
        A0s.append(this.A00);
        A0s.append(",collectForDebugExpiryTimeMillis: ");
        A0s.append(this.A01);
        return C18180wK.A0i("]", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0B(parcel, 1, this.A02);
        C122167Ky.A09(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
