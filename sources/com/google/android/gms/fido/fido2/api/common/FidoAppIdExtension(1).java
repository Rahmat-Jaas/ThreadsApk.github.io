package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(67);
    public final String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoAppIdExtension)) {
            return false;
        }
        return this.A00.equals(((FidoAppIdExtension) obj).A00);
    }

    public final int hashCode() {
        return C86124wJ.A0F(this.A00);
    }

    public FidoAppIdExtension(String str) {
        C13320nQ.A01(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0E(parcel, this.A00, C122167Ky.A00(parcel));
    }
}
