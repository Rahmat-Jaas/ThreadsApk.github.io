package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(53);
    public final UvmEntries A00;
    public final zze A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (C117046y2.A01(this.A00, authenticationExtensionsClientOutputs.A00)) {
            return C117046y2.A00(this.A01, authenticationExtensionsClientOutputs.A01);
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A01);
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zze zze) {
        this.A00 = uvmEntries;
        this.A01 = zze;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0D(parcel, this.A01, 2, i, C122167Ky.A0P(parcel, this.A00, i));
        C122167Ky.A05(parcel, A002);
    }
}
