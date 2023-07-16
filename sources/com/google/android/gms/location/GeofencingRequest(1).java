package com.google.android.gms.location;

import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(10);
    public final int A00;
    public final String A01;
    public final List A02;

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("GeofencingRequest[");
        A0s.append("geofences=");
        A0s.append(this.A02);
        int i = this.A00;
        StringBuilder A0s2 = C86114wI.A0s(30);
        A0s2.append(", initialTrigger=");
        A0s2.append(i);
        A0s.append(C18180wK.A0i(", ", A0s2));
        String valueOf = String.valueOf(this.A01);
        if (valueOf.length() != 0) {
            str = "tag=".concat(valueOf);
        } else {
            str = new String("tag=");
        }
        A0s.append(str);
        return C18180wK.A0i("]", A0s);
    }

    public GeofencingRequest(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0K(parcel, this.A02, 1, false);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0F(parcel, this.A01, A002, false);
    }
}
