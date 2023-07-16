package com.google.android.gms.common.internal;

import X.C117046y2;
import X.C122167Ky;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(5);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ClientIdentity) {
                ClientIdentity clientIdentity = (ClientIdentity) obj;
                if (clientIdentity.A00 != this.A00 || !C117046y2.A01(clientIdentity.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 12);
        A0s.append(i);
        A0s.append(":");
        return C18180wK.A0i(str, A0s);
    }

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0E(parcel, this.A01, A002);
    }
}
