package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(36);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        return this.A00.equals(((zzad) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public zzad(String str) {
        C13320nQ.A01(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A00, 1, false);
        C122167Ky.A05(parcel, A002);
    }
}
